import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyColor extends JFrame implements ActionListener {
    JButton b, b1, b2;

    MyColor() {
        JLabel l = new JLabel("My Label:");
        b  = new JButton("Green");
        b1 = new JButton("Blue");
        b2 = new JButton("Red");

        // absolute positions
        l.setBounds(10, 20, 100, 30);
        b.setBounds(50, 70, 100, 40);
        b1.setBounds(50, 120, 100, 40);
        b2.setBounds(50, 170, 100, 40);

        setLayout(null);
        add(l);
        add(b);
        add(b1);
        add(b2);

        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Color Changer");
        setLocationRelativeTo(null); // center on screen (optional)
    }

    public void actionPerformed(ActionEvent ob) {
        Object src = ob.getSource();
        if (src == b) {
            getContentPane().setBackground(Color.GREEN);
        } else if (src == b1) {
            getContentPane().setBackground(Color.BLUE);
        } else if (src == b2) {
            getContentPane().setBackground(Color.RED);
        }
    }

    public static void main(String[] args) {
        MyColor m1 = new MyColor();
        m1.setVisible(true);
    }
}
