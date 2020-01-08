package swingComponents;
import javax.swing.*;

public class JTable1 {
    JFrame f;

    JTable1() {
        f = new JFrame();
        JButton b1 = new JButton("OKAY");
        b1.setBounds(300,200,100,50);

        String data[][] = {{"Barcelona", "20", "18"},
                {"PSG", "19", "15"},
                {"LIVERPOOL", "11", "12"}};

        String column[] = {"Name", "NumberOfGoals", "Points"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(b1);
        f.add(sp);

        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTable1();
    }
}

