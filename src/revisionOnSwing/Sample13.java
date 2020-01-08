package revisionOnSwing;
import javax.swing.*;

public class Sample13 extends JFrame {

    public Sample13(){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton b1 = new JRadioButton("Male");
        buttonGroup.add(b1);
        JRadioButton b2 = new JRadioButton("Female");
        buttonGroup.add(b2);
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
        if(b1.isSelected()){
            System.out.println("Male");
        }
        else{
            System.out.println("Female");
        }
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
    }
    public static void main(String[] args) {
 Sample13 obj = new Sample13();
    }
}
