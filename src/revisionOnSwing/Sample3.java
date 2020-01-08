package revisionOnSwing;
import java.awt.*;

import javax.swing.*;

public class Sample3 extends JFrame{

    public Sample3(){

        TextField t1 = new TextField(10);
        JPanel p1 = new JPanel();
        p1.add(t1);

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setTitle("My Frame");
        frame.add(p1,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Sample3();
    }
}
