package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jlabel extends JFrame {

    public  Jlabel(){
        JFrame frame = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l1 = new JLabel("Enter your name");
        JTextField f1 = new JTextField(10);
        JLabel l2 = new JLabel("Enter your first number");
        JTextField f2 = new JTextField(10);
        JLabel l3 = new JLabel("Enter your second number");
        JTextField f3 = new JTextField(10);
        JTextArea a1 = new JTextArea();
        JButton b1 = new JButton("Click");
        JButton b2 = new JButton("Sum");
        JTextArea a2 = new JTextArea();
        p1.add(l1);

        p1.add(f1);
        p1.add(b1);
        p1.add(a1);
        p2.add(l2);
        p2.add(f2);
        p2.add(l3);
        p2.add(f3);
      p2.add(b2);
      p2.add(a2);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
//               String s = "";
//               s += f1.getText();
//                a1.setText(s);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
//int num1 = Integer.parseInt(f2.getText());
//                int num2 = Integer.parseInt(f3.getText());
//                int sum  = num1 + num2;
                int radius = Integer.parseInt(f2.getText());
                double area = Math.PI * radius * radius;
                String h = area +"";
                a2.setText(h);
            }
        });
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
       Jlabel obj = new Jlabel();
    }
}
