package swingComponents;
import javax.swing.*;

public class Radio {
    JFrame f;

    public Radio() {
        f = new JFrame("ComboBox Example");
        String country[] = {"India",  "Aus", "U.S.A","England", "NewZealand","Kenya"};
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(400, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Radio();
    }
}
