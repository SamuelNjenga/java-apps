package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rbuttons extends JFrame {
    JFrame frame = new JFrame("Gender");
    JRadioButton b1 = new JRadioButton("Male");
    JRadioButton b2 = new JRadioButton("Female");
    ButtonGroup buttonGroup = new ButtonGroup();
    JTextArea t1 = new JTextArea(2,20);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();

    Rbuttons(){
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String p = "";
                if(b1.isSelected()){
                    p = "habari kijana";
                    t1.setText(p);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String p = "";
                if(b2.isSelected()){
                    p = "habari dada";
                    t1.setText(p);
                }
            }
        });
        buttonGroup.add(b1);
        buttonGroup.add(b2);

        p1.add(b1);
        p1.add(b2);
        p2.add(t1);
        frame.add(p2, BorderLayout.NORTH);
        frame.add(p1, BorderLayout.SOUTH);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Rbuttons obj = new Rbuttons();
    }
}
