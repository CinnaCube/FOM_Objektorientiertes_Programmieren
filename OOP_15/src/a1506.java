import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rene on 29.06.2017.
 */
public class a1506 extends JFrame implements ActionListener {

    private JButton button1, button2, button3;
    private JLabel label1;

    public static void main(String args[]){
        new a1506();
    }

    public a1506(){
        super("Aufgabe 15");

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new FlowLayout());

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        jpanel.add(button1);
        jpanel.add(button2);
        jpanel.add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        this.setLayout(new BorderLayout());

        label1 = new JLabel();
        add(label1,BorderLayout.SOUTH);
        add(jpanel);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            label1.setText("Button1");
        }
        if(e.getSource() == button2){
            label1.setText("Button2");
        }
        if(e.getSource() == button3){
            label1.setText("Button3");
        }
    }
}
