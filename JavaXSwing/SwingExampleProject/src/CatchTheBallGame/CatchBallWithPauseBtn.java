package CatchTheBallGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CatchBallWithPauseBtn extends JPanel implements ActionListener, KeyListener {
    private int paddleX = 250; // Paddle position
    private int ballX = 300, ballY = 0; // Ball position
    private int ballSpeed = 5; // Ball falling speed
    private int score = 0; // Player score
    private Timer timer;
    private boolean isPaused = false; // Pause state

    public CatchBallWithPauseBtn() {
        // Set up the game panel
        this.setPreferredSize(new Dimension(600, 400));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);

        // Timer to update the game state
        timer = new Timer(30, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw paddle
        g.setColor(Color.BLUE);
        g.fillRect(paddleX, 350, 100, 10);

        // Draw ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, 20, 20);

        // Draw score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score: " + score, 10, 20);

        // Draw pause message if the game is paused
        if (isPaused) {
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.setColor(Color.YELLOW);
            g.drawString("PAUSED", 240, 200);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isPaused) { // Only update game state if not paused
            // Move the ball
            ballY += ballSpeed;

            // Check if the ball hits the paddle
            if (ballY >= 340 && ballX >= paddleX && ballX <= paddleX + 100) {
                score++;
                resetBall();
            }

            // Check if the ball falls out of bounds
            if (ballY > 400) {
                JOptionPane.showMessageDialog(this, "Game Over! Your score: " + score);
                System.exit(0);
            }

            // Repaint the panel
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0) {
            paddleX -= 20;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < 500) {
            paddleX += 20;
        }

        // Toggle pause state with the spacebar
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            isPaused = !isPaused;
            repaint(); // Repaint to show "PAUSED" message
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    private void resetBall() {
        ballX = (int) (Math.random() * 580); // Random horizontal position
        ballY = 0; // Reset ball to the top
    }

    public static void main(String[] args) {
        // Set up the game window
        JFrame frame = new JFrame("Catch the Ball Game with Pause");
        CatchTheBallGame game = new CatchTheBallGame();

        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
