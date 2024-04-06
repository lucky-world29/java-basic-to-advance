import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventHandlingExample extends JFrame {
    private JLabel mouseLabel;
    private JLabel keyLabel;
    
    public EventHandlingExample() {
        setTitle("Event Handling Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        mouseLabel = new JLabel("Mouse events will be displayed here.");
        keyLabel = new JLabel("Key events will be displayed here.");

        // Add components to the frame
        setLayout(new GridLayout(2, 1));
        add(mouseLabel);
        add(keyLabel);

        // Mouse event handling
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        // Keyboard event handling
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyLabel.setText("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                keyLabel.setText("Key Pressed: " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                keyLabel.setText("Key Released: " + e.getKeyChar());
            }
        });

        // Set the frame focusable to receive keyboard events
        setFocusable(true);
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        EventHandlingExample frame = new EventHandlingExample();
        frame.setVisible(true);
    }
}
