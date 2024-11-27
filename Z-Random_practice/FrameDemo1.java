package Random_practice;

/*import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FrameDemo1 extends JFrame implements ActionListener{
    JButton b1;
    JTextArea t1;
    FrameDemo1(){
        setVisible(true);
        setSize(300, 300);
        b1=new JButton("Ok");
        b1.setBounds(100, 100, 50, 50);

       t1=new JTextField(20);
        t1.setBounds(100, 100, 50, 50);

        setLayout(null);
        add(b1);
        add(t1);

        b1.addActionListener(this);
    }
    public static void main(String[] args) {
        FrameDemo1 ob = new FrameDemo1();
    }

    public void actionPerformed(ActionEvent e){
        setBackground(Color.RED);
        JFrame f = new JFrame("New Frame");
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
*/

//=====================================================================================


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FrameDemo1 extends JFrame implements ActionListener {
JButton b1;
JTextField t1;
FrameDemo1() {
    // Setting up the frame
    setVisible(true);
    setSize(300, 300);

    // Creating and positioning the "Ok" button
    b1 = new JButton("Ok");
    b1.setBounds(100, 100, 50, 50);

    // Creating and positioning the text field
    t1 = new JTextField(20);
    t1.setBounds(100, 100, 50, 50);

    setLayout(null); // Disabling layout manager
    add(b1); // Adding the button to the frame
    add(t1); // Adding the text field to the frame

    b1.addActionListener(this); // Adding an ActionListener to the button
}
public static void main(String[] args) {
    FrameDemo1 ob = new FrameDemo1();
}
public void actionPerformed(ActionEvent e) {
    setBackground(Color.RED); // Setting the background color of the frame to red

    // Creating a new JFrame with the title "New Frame"


     JFrame f = new JFrame("New Frame");
    f.setSize(400, 400);
    f.setVisible(true);

    //Creating Radio BUtton
    JRadioButton jr = new JRadioButton("Male");
    ButtonGroup b = new ButtonGroup();
    b.add(jr);
    add(jr);
}
}