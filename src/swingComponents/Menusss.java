package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menusss extends JFrame {


    public Menusss(){

        JFrame frame = new JFrame();
        JPanel p1 = new JPanel();


        JMenuBar bar = new JMenuBar();


        JMenu menu1 = new JMenu("Code");
        JMenuItem menuItem1 = new JMenuItem("Mango");
       menu1.add(new JSeparator());
        JMenuItem menuItem2 = new JMenuItem("Item two");
        menu1.add(new JSeparator());
        JMenuItem menuItem3 = new JMenuItem("Item three");
        menu1.add(menuItem1);
        menu1.add(menuItem2);
        menu1.add(menuItem3);
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RadioButton obj = new RadioButton();
            }
        });
        JMenu menu2 = new JMenu("Analyze");
        JMenuItem menuItem4 = new JMenuItem("Item one");
        JMenuItem menuItem5 = new JMenuItem("Item two");
        JMenuItem menuItem6 = new JMenuItem("Item three");
        menu2.add(menuItem4);
        menu2.add(menuItem5);
        menu2.add(menuItem6);
        JMenu menu3 = new JMenu("Refactor");
        JMenu menu4 = new JMenu("Build");
        JMenu menu5 = new JMenu("Run");


        bar.add(menu1);
        bar.add(menu2);
        bar.add(menu3);
        bar.add(menu4);
        bar.add(menu5);

        p1.add(bar);

        frame.add(p1, BorderLayout.NORTH);
        frame.setTitle("My Frame");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Menusss obj = new Menusss();
    }
}
