package SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private static final int TILE_SIZE = 25; // Size of each tile
    private static final int DELAY = 100; // Speed of the game in ms
    private int screenWidth, screenHeight; // Dimensions of the screen
    private ArrayList<Point> snake; // Snake body parts
    private Point food; // Position of the food
    private char direction = 'R'; // Snake's current direction (R: Right, L: Left, U: Up, D: Down)
    private boolean running = true; // Game state
    private Timer timer;
    private int score = 0;

    public SnakeGame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = screenSize.width;
        screenHeight = screenSize.height;

        // Initialize game
        snake = new ArrayList<>();
        snake.add(new Point(5, 5)); // Starting point
        spawnFood();

        // Configure game panel
        this.setFocusable(true);
        this.addKeyListener(this);

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, screenWidth, screenHeight);

        // Draw food
        g.setColor(Color.RED);
        g.fillRect(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Draw snake
        g.setColor(Color.GREEN);
        for (Point part : snake) {
            g.fillRect(part.x * TILE_SIZE, part.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }

        // Display score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Score: " + score, 20, 30);

        // Game over message
        if (!running) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 50));
            g.drawString("Game Over!", screenWidth / 2 - 150, screenHeight / 2 - 25);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Press ENTER to Restart", screenWidth / 2 - 100, screenHeight / 2 + 25);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkFood();
            checkCollision();
        }
        repaint();
    }

    private void move() {
        // Get current head position
        Point head = snake.get(0);
        Point newHead = new Point(head);

        // Move in the current direction
        switch (direction) {
            case 'U' -> newHead.y -= 1;
            case 'D' -> newHead.y += 1;
            case 'L' -> newHead.x -= 1;
            case 'R' -> newHead.x += 1;
        }

        // Add the new head position to the snake
        snake.add(0, newHead);

        // If the snake has eaten food, it grows and does not remove the tail
        if (!newHead.equals(food)) {
            snake.remove(snake.size() - 1); // Remove the last part of the snake
        }
    }

    private void checkFood() {
        // If snake eats the food
        if (snake.get(0).equals(food)) {
            score++;
            spawnFood();
        }
    }

    private void checkCollision() {
        Point head = snake.get(0);

        // Check if the snake hits itself
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
                break;
            }
        }

        // Check if the snake hits the wall
        if (head.x < 0 || head.x >= screenWidth / TILE_SIZE || head.y < 0 || head.y >= screenHeight / TILE_SIZE) {
            running = false;
        }
    }

    private void spawnFood() {
        Random rand = new Random();
        int x, y;
        do {
            x = rand.nextInt(screenWidth / TILE_SIZE);
            y = rand.nextInt(screenHeight / TILE_SIZE);
            food = new Point(x, y);
        } while (snake.contains(food)); // Ensure food doesn't spawn inside the snake
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && direction != 'D') {
            direction = 'U';
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && direction != 'U') {
            direction = 'D';
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && direction != 'R') {
            direction = 'L';
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && direction != 'L') {
            direction = 'R';
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER && !running) {
            restartGame();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    private void restartGame() {
        running = true;
        score = 0;
        snake.clear();
        snake.add(new Point(5, 5));
        direction = 'R';
        spawnFood();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Fullscreen mode
        frame.setUndecorated(true); // Remove borders
        frame.add(game);
        frame.setVisible(true);
    }
}
