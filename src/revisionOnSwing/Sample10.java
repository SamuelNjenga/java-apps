package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample10 extends JFrame {
    public Sample10(){

        JPanel p1 = new JPanel();
        JButton b1 = new JButton("OKAY");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Thank You");
            }
        });
        p1.add(b1);
        JFrame frame = new JFrame();
        frame.add(p1, BorderLayout.NORTH);
        frame.setSize(400,500);
        frame.setTitle("My Frame");
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

     Sample10 obj = new Sample10();

    }
}
