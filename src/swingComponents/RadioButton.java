package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame {


    public RadioButton(){

        JFrame frame = new JFrame();
        JPanel p1 = new JPanel();
        JRadioButton b1 = new JRadioButton("Male");
        JRadioButton b2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        JButton button = new JButton("Click");
        bg.add(b1);
        bg.add(b2);
        p1.add(b1);
        p1.add(b2);
        p1.add(button);

        button.addActionListener(new ActionListener(){
            public  void  actionPerformed(ActionEvent e){


                if(b1.isSelected()){
                    System.out.println("I am a male");
                }

                if(b2.isSelected()){
                    System.out.println(b2.getText());
                }
            }
        });


        frame.add(p1, BorderLayout.NORTH);
        frame.setTitle("My Frame");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        RadioButton obj = new RadioButton();
    }
}
