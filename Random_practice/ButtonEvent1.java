/*import java.awt.Button;
import java.awt.Frame;
import java.awt.event.*;
public class ButtonEvent1 extends Frame implements ActionListener {
    Button b1;
    Button Event(){
       b1 = new Button("Red");
       add(b1);

       b1.addActionListener(this);
       setSize(400,400);
       setVisible(true);
       setLayout(null);

    }
   public void ActionPerformed(ActionEvent e){
        setbackground(colour.RED);
    }

    public static void main(String[] args) {
        ButtonEvent1 ob = new ButtonEvent1();
    }
}*/

 import java.awt.Button;
import java.awt.Frame;
import java.awt.Color;
import java.awt.event.*;

public class ButtonEvent1 extends Frame implements ActionListener {
    Button b1;

    public ButtonEvent1() {
        b1 = new Button("Red");
        add(b1);

        b1.addActionListener(this);
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        setBackground(Color.RED);
    }

    public static void main(String[] args) {
        ButtonEvent1 ob = new ButtonEvent1();
    }
}

 