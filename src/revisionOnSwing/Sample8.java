package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample8 {

    public Sample8(){

        JFrame frame = new JFrame();

        JMenuBar bar = new JMenuBar();
        bar.setBounds(0,0,0,0);

        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("View");
        JMenu m4 = new JMenu("Navigate");
        JMenu m5 = new JMenu("Code");

        JMenuItem j1 = new JMenuItem("Save");
        JMenuItem j2 = new JMenuItem("SaveAs");
        JMenuItem j3 = new JMenuItem("EdiA");
        JMenuItem j4 = new JMenuItem("EditB");
        JMenuItem j5 = new JMenuItem("Viewer");
        JMenuItem j6 = new JMenuItem("Viewee");

        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Sample7 obj = new Sample7();

            }
        });

        m1.add(j1);
        m1.add(j2);
        m2.add(j3);
        m2.add(j4);
        m3.add(j5);
        m3.add(j6);

        bar.add(m1);
        bar.add(m2);
        bar.add(m3);
        bar.add(m4);
        bar.add(m5);



//        JPanel p1 = new JPanel();
//        p1.add(bar);

       // frame.add(p1, BorderLayout.CENTER);
        frame.add(bar,BorderLayout.NORTH);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);


    }
    public static void main(String[] args) {

        new Sample8();
    }
}
