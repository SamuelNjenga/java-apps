package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {

    String array[] = {"Ku","Uon","Dekut","Mku","Kisii"};
    public ComboBox(){


        JFrame frame = new JFrame();


        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JLabel l3 = new JLabel("Enter the password");

        JPasswordField field = new JPasswordField(10);
        JButton b2  = new JButton("Password");
        JButton button = new JButton("OKAY");
        JTextArea a1 = new JTextArea();




        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println(field.getText());
            }
        });
        p2.add(l3);
        p2.add(field);
        p2.add(b2);
        p2.add(button);
        p2.add(a1);



        System.out.println(field.getText());
        JComboBox st = new JComboBox(array);
        p1.add(st);


        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String p = "";

                p += st.getSelectedItem().toString();


                a1.setText(p);
            }
        });

        frame.add(p2, BorderLayout.CENTER);
        frame.add(p1, BorderLayout.NORTH);
        frame.setTitle("My Frame");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        ComboBox obj = new ComboBox();
    }
}
