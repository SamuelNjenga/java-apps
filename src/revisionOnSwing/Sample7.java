package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample7 {


    public  Sample7(){

        JFrame frame = new JFrame();
        JButton b1 = new JButton("Press");
        JTextField t1 = new JTextField(10);
        JTextArea a1 = new JTextArea();
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                int radius = Integer.parseInt(t1.getText());
                double area = Math.PI * radius * radius;
                String p = ""+area;
                a1.setText(p);
                }
        });

        JPanel p1 = new JPanel();
        p1.add(b1);
        p1.add(t1);
        p1.add(a1);

        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);

        frame.add(p1, BorderLayout.NORTH);

    }
    public static void main(String[] args) {
        Sample7 obj = new Sample7();
    }
}
