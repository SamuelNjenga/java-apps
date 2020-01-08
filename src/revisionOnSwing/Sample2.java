package revisionOnSwing;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample2 extends JFrame {

    String list[] = {"Arsenal","Barcelona","Chelsea","Dynamo","Bayern"};


    public Sample2(){

        JFrame frame = new JFrame();


        JComboBox box1 = new JComboBox(list);
        JPanel panel1 = new JPanel();
        panel1.add(box1);

        JTextArea textArea1 = new JTextArea();
        panel1.add(textArea1);

        JButton button1 = new JButton("Okay");
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent E){
                String p = "";

                textArea1.setText(p);

            }

        });
        JPanel p2 = new JPanel();
        p2.add(button1);


        frame.add(panel1, BorderLayout.NORTH);
        frame.add(p2, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setTitle("Hello Frame");
        frame.setSize(600,600);

        }

    public static void main(String[] args) {
        Sample2 obj= new Sample2();
    }
}
