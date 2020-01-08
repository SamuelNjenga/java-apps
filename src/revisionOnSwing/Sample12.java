package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample12  extends JFrame {

    JFrame frame = new JFrame();
    JPanel p1 = new JPanel();
    JButton b1 = new JButton("Addition");
    JButton b2 = new JButton("Subtraction");
    JButton b3 = new JButton("Division");
    JButton b4 = new JButton("Multiplication");



    public Sample12(){

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l1 = new JLabel("Enter the first number");
        JTextField f1 = new JTextField(5);
        JLabel l2 = new JLabel("Enter the second number");
        JTextField f2 = new JTextField(5);
        JTextArea a1 = new JTextArea();
        JButton b1 = new JButton("Addition");
        JButton b2 = new JButton("Subtraction");
        JButton b3 = new JButton("Division");
        JButton b4 = new JButton("Multiplication");

        p1.add(l1);
        p1.add(f1);
        p1.add(l2);
        p1.add(f2);
        p1.add(a1);

        b1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(f1.getText());
                int num2 = Integer.parseInt(f2.getText());
                int sum = num1 + num2;
                String s = sum +"";
                a1.setText(s);
            }
        });
        b2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                int num1 = Integer.parseInt(f1.getText());
                int num2 = Integer.parseInt(f2.getText());
                int diff = num1 - num2;
                String s = diff +"";
                a1.setText(s);
            }
        });
        b3.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                double num1 = Double.parseDouble(f1.getText());
                double num2 = Double.parseDouble(f2.getText());
                double diff = num1 / num2;
                String s = diff +"";
                a1.setText(s);
            }
        });
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.CENTER);
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
    }


    public static void main(String[] args) {
        Sample12 obj = new Sample12();
    }
}
