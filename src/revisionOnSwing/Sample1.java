package revisionOnSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample1 extends JFrame {
    String list[] = {"Sam","Isaac","Lionel","Daniel","Phillipe"};

    public Sample1(){

        JFrame frame = new JFrame();
        JLabel label = new JLabel("Name");
        JTextField field = new JTextField(10);
        JTextArea area = new JTextArea();
        JButton button = new JButton("Click");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String p = "";
                p += field.getText();
                area.setText(p);
            }
        });
        JComboBox box = new JComboBox(list);
        JPasswordField passwordField = new JPasswordField(5);
        JPanel panel = new JPanel();

        JCheckBox box1 = new JCheckBox("Beef");
        JCheckBox box2 = new JCheckBox("Ugali");
        JCheckBox box3 = new JCheckBox("Rice");
        JPanel panel1 =  new JPanel();
        panel1.add(box1);
        panel1.add(box2);
        panel1.add(box3);
        panel1.add(area);


        panel.add(label);
        panel.add(field);
        panel.add(passwordField);
        panel.add(button);
        panel.add(box);

        JMenuBar  menuBar = new JMenuBar();
        JMenu item = new JMenu("File");
        JMenuItem menuItem1 = new JMenuItem("New");
        JMenuItem menuItem2 = new JMenuItem("Open");
        item.add(menuItem1);
        item.add(menuItem2);
        JMenu item2 = new JMenu("Edit");
        JMenuItem menuItem3 = new JMenuItem("Cut");
        JMenuItem menuItem4 = new JMenuItem("Copy");
        item2.add(menuItem3);
        item2.add(menuItem4);
        JMenu item3 = new JMenu("View");
        JMenuItem menuItem5 = new JMenuItem("ToolBar");
        JMenuItem menuItem6 = new JMenuItem("Status Bar");

        item3.add(menuItem5);
        item3.add(menuItem6);
        menuBar.add(item);
        menuBar.add(item2);
        menuBar.add(item3);

        JSlider slider = new JSlider();
        JSpinner spinner = new JSpinner();

        JPanel p3 = new JPanel();
        p3.add(spinner);
        p3.add(slider);
        p3.add(menuBar);


        frame.add(panel1,BorderLayout.NORTH);
        frame.add(p3,BorderLayout.SOUTH);

        frame.add(panel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(500,500);
        frame.setTitle("My  Frame");

    }

    public static void main(String[] args) {
        new Sample1();
    }
}
