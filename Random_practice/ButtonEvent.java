/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class ActionEventDemo {
    JFrame frame=new JFrame();//creating object of JFrame class
 
    ActionEventDemo(){
        prepareGUI();//calling prepareGUI() method
    }
 
    public void prepareGUI(){
        frame.setTitle("My Window");//Setting title of JFrame
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.setVisible(true);//Setting visibility
        frame.setBounds(200,200,400,400);//Setting Location and Size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
    }
 
}
 
public class ButtonEvent {
    public static void main(String[] args)
    {
 
    }
}*/

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventDemo {
    JFrame frame = new JFrame();//creating object of JFrame class
    JButton button = new JButton("Click Me");//creating a JButton

    ActionEventDemo() {
        prepareGUI();//calling prepareGUI() method
        addButton();//adding the button to the frame
        addListeners();//adding the action event listener
    }

    public void prepareGUI() {
        frame.setTitle("My Window");//Setting title of JFrame
        frame.getContentPane().setLayout(null);//Setting Layout
        frame.setVisible(true);//Setting visibility
        frame.setBounds(200, 200, 400, 400);//Setting Location and Size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Setting default close operation
    }

    public void addButton() {
        button.setBounds(150, 150, 100, 50);//Setting button size and position
        frame.add(button);//Adding the button to the frame
    }

    public void addListeners() {
        // Adding an ActionListener to handle button clicks
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to execute when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });
    }
}

public class ButtonEvent {
    public static void main(String[] args) {
        new ActionEventDemo(); // Create an instance of ActionEventDemo
    }
}

