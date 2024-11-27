
import javax.swing.*;
class FrameDemo extends JFrame{
    JButton b1;
    JTextField t1;
    FrameDemo(){
        setVisible(true);
        setSize(300,300);
        b1=new JButton("ok");
        b1.setBounds(100, 100, 50, 50);

        t1=new JTextField(20);
        t1.setBounds(100, 100, 50, 50);

        setLayout(null);
        add(b1);
        add(t1);
    }
    public static void main(String[] args) {
        FrameDemo ob = new FrameDemo();
    }
}
