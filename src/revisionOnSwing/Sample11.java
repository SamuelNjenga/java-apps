package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample11 extends JFrame {


    public Sample11()
    {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0,0,0,0);

        JMenu t1 = new JMenu("Help");
        JMenu t2 = new JMenu("Window");
        JMenu t3 = new JMenu("Tools");
        JMenu t4 = new JMenu("Refactor");
        JMenu t5 = new JMenu("Code");

        JMenuItem j1 = new JMenuItem("License");
        j1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"License");
            }
        });
        JMenuItem j2 = new JMenuItem("Tip Of The Day");

        menuBar.add(t1);
        menuBar.add(t2);
        menuBar.add(t3);
        menuBar.add(t4);
        menuBar.add(t5);

        t1.add(j1);
        t1.add(j2);

        frame.add(menuBar, BorderLayout.NORTH);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Sample11 obj = new Sample11();
    }
}
