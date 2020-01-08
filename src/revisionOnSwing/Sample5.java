package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample5 extends JFrame {

    public Sample5(){

        JFrame frame = new JFrame();
        JPanel panel1= new JPanel();
        JLabel l1 = new JLabel("FirstNumber");
        JTextField f1 = new JTextField(5);
        JLabel l2 = new JLabel("SecondNumber");
        JTextField f2 = new JTextField(5);
        JTextArea area = new JTextArea();
        JButton b1 = new JButton("Press Me");

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                int sum = 0;

                int num1 = Integer.parseInt(f1.getText());
                int num2 = Integer.parseInt(f2.getText());
                sum = num1 + num2;
                String s  = ""+sum;
               // String s  = String.valueOf(sum);
                area.setText(s);

            }
        });

        panel1.add(l1);
        panel1.add(f1);
        panel1.add(l2);
        panel1.add(f2);
        panel1.add(b1);
        panel1.add(area);

        frame.setSize(600,600);
        frame.setTitle("My Frame");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1, BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        Sample5 obj = new Sample5();
    }
}
