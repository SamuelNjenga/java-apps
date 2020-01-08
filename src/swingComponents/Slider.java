package swingComponents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Slider extends JFrame {

    JFrame frame = new JFrame();
    JPanel p1 = new JPanel();

    public Slider() {

        JButton button = new JButton("Click");


p1.add(button);


JSpinner bar = new JSpinner();
        JSlider s = new JSlider();
        System.out.println(s.getX());
        p1.add(s);
        p1.add(bar);


        button.addActionListener(new ActionListener(){
            public  void  actionPerformed(ActionEvent e){
                System.out.println(s.getValue());

                System.out.println(bar.getValue());
            }
        });


        frame.add(p1, BorderLayout.NORTH);
        frame.setTitle("My Frame");
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Slider obj = new Slider();
    }
}
