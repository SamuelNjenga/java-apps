package swingComponents;
import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bucky extends Applet {
    String p ="";
    TextField f1 = new TextField(10);
    Button b1 = new Button("Press Me");
    public Bucky(){
//        Label l1 = new Label("Enter your name");
//
//
//        add(l1);
//        add(f1);
//        add(b1);
    }
    public void paint(Graphics g){


 g.drawString("Iam very late",24,20);


    }
}
