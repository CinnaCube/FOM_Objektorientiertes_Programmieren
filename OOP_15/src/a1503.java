import javax.swing.*;
import java.awt.*;

/**
 * Created by Rene on 13.06.2017.
 */
public class a1503 extends JFrame{
    public static void main (String[] args){
        new a1503();
    }

    public a1503(){
        super("Hauptfenster");

        this.setLayout(new FlowLayout());

        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(4,3));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));
        jp1.add(new JButton("hallo"));

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(1,2));
        jp2.add(new JLabel("FOM"));
        jp2.add(new Button("Klick me!"));
        add(jp1);
        add(jp2);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
