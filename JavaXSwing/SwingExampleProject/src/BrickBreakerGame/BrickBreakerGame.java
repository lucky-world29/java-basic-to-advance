package BrickBreakerGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrickBreakerGame extends JPanel implements KeyListener, ActionListener {
    private boolean play = false; // Game state
    private int score = 0; // Player score
    private int totalBricks = 21; // Total number of bricks

    private Timer timer;
    private int delay = 8; // Speed of the ball

    private int playerX = 310; // Paddle position

    private int ballPosX = 120; // Ball position
    private int ballPosY = 350;
    private int ballDirX = -1; // Ball direction
    private int ballDirY = -2;

    private BrickGenerator map; // Bricks

    public BrickBreakerGame() {
        map = new BrickGenerator(3, 7); // 3 rows and 7 columns of bricks
        this.setFocusable(true);
        this.addKeyListener(this);
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        // Background
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);

        // Drawing bricks
        map.draw((Graphics2D) g);

        // Borders
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 3, 592); // Left
        g.fillRect(0, 0, 692, 3); // Top
        g.fillRect(691, 0, 3, 592); // Right

        // Paddle
        g.setColor(Color.GREEN);
        g.fillRect(playerX, 550, 100, 8);

        // Ball
        g.setColor(Color.RED);
        g.fillOval(ballPosX, ballPosY, 20, 20);

        // Score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score: " + score, 560, 30);

        // Win condition
        if (totalBricks <= 0) {
            play = false;
            ballDirX = 0;
            ballDirY = 0;
            g.setColor(Color.GREEN);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("You Won! Score: " + score, 200, 300);

            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Press Enter to Restart", 230, 350);
        }

        // Game over condition
        if (ballPosY > 570) {
            play = false;
            ballDirX = 0;
            ballDirY = 0;
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over! Score: " + score, 200, 300);

            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Press Enter to Restart", 230, 350);
        }

        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (play) {
            // Ball and paddle collision
            if (new Rectangle(ballPosX, ballPosY, 20, 20)
                    .intersects(new Rectangle(playerX, 550, 100, 8))) {
                ballDirY = -ballDirY;
            }

            // Ball and brick collision
            A:
            for (int i = 0; i < map.map.length; i++) {
                for (int j = 0; j < map.map[0].length; j++) {
                    if (map.map[i][j] > 0) {
                        int brickX = j * map.brickWidth + 80;
                        int brickY = i * map.brickHeight + 50;
                        int brickWidth = map.brickWidth;
                        int brickHeight = map.brickHeight;

                        Rectangle brickRect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                        Rectangle ballRect = new Rectangle(ballPosX, ballPosY, 20, 20);

                        if (ballRect.intersects(brickRect)) {
                            map.setBrickValue(0, i, j);
                            totalBricks--;
                            score += 5;

                            if (ballPosX + 19 <= brickRect.x || ballPosX + 1 >= brickRect.x + brickWidth) {
                                ballDirX = -ballDirX;
                            } else {
                                ballDirY = -ballDirY;
                            }

                            break A;
                        }
                    }
                }
            }

            // Move the ball
            ballPosX += ballDirX;
            ballPosY += ballDirY;

            // Ball collision with walls
            if (ballPosX < 0) { // Left wall
                ballDirX = -ballDirX;
            }
            if (ballPosY < 0) { // Top wall
                ballDirY = -ballDirY;
            }
            if (ballPosX > 670) { // Right wall
                ballDirX = -ballDirX;
            }
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX <= 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!play) {
                play = true;
                ballPosX = 120;
                ballPosY = 350;
                ballDirX = -1;
                ballDirY = -2;
                playerX = 310;
                score = 0;
                totalBricks = 21;
                map = new BrickGenerator(3, 7);

                repaint();
            }
        }
    }

    public void moveRight() {
        play = true;
        playerX += 20;
    }

    public void moveLeft() {
        play = true;
        playerX -= 20;
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Brick Breaker Game");
        BrickBreakerGame game = new BrickBreakerGame();
        frame.setBounds(10, 10, 700, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.setVisible(true);
    }
}

class BrickGenerator {
    public int[][] map;
    public int brickWidth;
    public int brickHeight;

    public BrickGenerator(int row, int col) {
        map = new int[row][col];
        for (int[] rowArray : map) {
            for (int j = 0; j < col; j++) {
                rowArray[j] = 1; // 1 means brick is visible
            }
        }
        brickWidth = 540 / col;
        brickHeight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(Color.WHITE);
                    g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col) {
        map[row][col] = value;
    }
}

