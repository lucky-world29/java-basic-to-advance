import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FramePanel extends JFrame{
    JButton bt1,bt2;
    FramePanel(){
        JPanel p = new JPanel( );
        p.setSize(100,100);
        p.setLayout(new FlowLayout());
        p.setBackground(Color.gray);

        bt1=new JButton("OK");
        bt2=new JButton("cancel");

        p.add(bt1);
        p.add(bt2);

       add(p);
       
       setLayout(null);
       setSize(500, 500);
       setVisible(true);

       public static void main(String[] args) {
        FramePanel ob = new FramePanel();

       }



    }
} 

/*
 import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FramePanel extends JFrame {
    JButton bt1, bt2;

    FramePanel() {
        JPanel p = new JPanel();
        p.setSize(100, 100);
        p.setLayout(new FlowLayout());
        p.setBackground(Color.gray);

        bt1 = new JButton("OK"); // Corrected the assignment operator '='
        bt2 = new JButton("cancel"); // Corrected the assignment operator '='

        p.add(bt1);
        p.add(bt2);

        add(p);

        // Removed setLayout(null); - using layout manager for JPanel
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        FramePanel ob = new FramePanel();
    }
}

 */