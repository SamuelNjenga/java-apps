package swingComponents;
import javax.swing.*;
import java.awt.*;

public class OptionPane extends JFrame{


    JFrame frame = new JFrame();
    JPanel p1 = new JPanel();
    String p = JOptionPane.showInputDialog("Enter a number");
    int i = 34;
    int j = 44;
    int k = i + j;


    OptionPane(){
        frame.add(p1, BorderLayout.NORTH);
        frame.setTitle("My Frame");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        OptionPane obj = new OptionPane();
    }
}
