package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox extends JFrame {

    JFrame frame = new JFrame("CheckBox");

    JCheckBox b1 = new JCheckBox("Student");
    JCheckBox b2 = new JCheckBox("Worker");
    JPanel p1 = new JPanel();

    CheckBox(){

        b1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("I am a student");
            }
        });
        b2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("I am a worker");
            }
        });
        p1.add(b1);
        p1.add(b2);

        frame.add(p1, BorderLayout.NORTH);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CheckBox obj = new CheckBox();
    }
}
