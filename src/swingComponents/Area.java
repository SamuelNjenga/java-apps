package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area extends JFrame {
    JFrame frame = new JFrame("My frame");
    JLabel l1 = new JLabel("Radius");
    JTextField t1 = new JTextField(6);
    JPanel p1 = new JPanel();
    JLabel l2 = new JLabel("Area");
    JTextField t2 = new JTextField();
    JButton b1 = new JButton("Click");

    public Area(){
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(l2);
        p1.add(t2);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int radius = Integer.parseInt(t1.getText());
                double area = Math.PI * radius * radius;
                String p = ""+area+" cm squared";
                t2.setText(p);
            }
        });
        frame.add(p1, BorderLayout.CENTER);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Area obj = new Area();
    }
}
