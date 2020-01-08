package revisionOnSwing;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample9 extends JFrame {

    public Sample9(){
        JFrame frame = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JLabel l1 = new JLabel("First Name");
        JTextField t1 = new JTextField(10);
        JLabel l2 = new JLabel("Last Name");
        JTextField t2 = new JTextField(10);
        JButton b1 = new JButton("EnterHere");
        JTextArea t3 = new JTextArea();
        b1.addActionListener(new ActionListener(){


            public void actionPerformed(ActionEvent e){
                String d = "";
                d += t1.getText() +" ";
                d += t2.getText() + " ";
                t3.setText(d);

            }}
        );

        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(l2);
        p1.add(t2);
        p1.add(t3);

        frame.add(p1,BorderLayout.NORTH);
        frame.setSize(400,500);
        frame.setTitle("My Frame");
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Sample9 obj = new Sample9();

    }
}
