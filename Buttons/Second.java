package Buttons;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Second extends JFrame implements ActionListener{
    JButton b;
    public Second(){
        b = new JButton("Click here!");
        b.setBounds(100,50,150,150);
        this.add(b); this.setLayout(null); this.getContentPane().setBackground(Color.blue);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setTitle("Sagnik Metiya");
        this.setVisible(true);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(this.getTitle() == "After click"){
            b.setText("Click Here!");
            this.setTitle("Sagnik Metiya");
            this.getContentPane().setBackground(Color.blue);
        }
        else if(this.getTitle() == "Sagnik Metiya"){
            b.setText("Clicked!");
            this.setTitle("After click");
            this.getContentPane().setBackground(Color.red);
        }
    }
}
