package revisionOnSwing;
import javax.jws.soap.SOAPBinding;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserName extends JFrame {
    public UserName(){


        JFrame frame = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l1 = new JLabel("UserName");
        JTextField f1 = new JTextField(20);
        JButton b1 = new JButton("PressMe");
        p1.add(l1);
        p1.add(f1);
        p1.add(b1);
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        p2.add(textArea);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "";
                s += f1.getText();
                textArea.setText(s);
            }
        });

        frame.add(p1, BorderLayout.NORTH);
        frame.add(p2,BorderLayout.CENTER);


        frame.setSize(600,600);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new UserName();
    }
}
