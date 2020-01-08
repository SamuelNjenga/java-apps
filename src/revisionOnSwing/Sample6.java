package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample6 extends JFrame {

    public Sample6(){
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JCheckBox box1 = new JCheckBox("Beef");
        JCheckBox box2 = new JCheckBox("Maize");
        JCheckBox box3 = new JCheckBox("Beans");
        JCheckBox box4 = new JCheckBox("Cakes");

        String array[] = {"Football","BasketBall","Hockey","Dice"};
        JComboBox box = new JComboBox(array);
        JButton b1 = new JButton("ClickMe");
        JTextArea area = new JTextArea();
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String p = "";

                if(box1.isSelected()){
                    p = p+box1.getText();
                }
                area.setText(p);

            }
        });

        panel1.add(box1);
        panel1.add(box2);
        panel1.add(box3);
        panel1.add(box4);
        panel1.add(box);
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
        Sample6 obj = new Sample6();
    }
}
