import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by Rene on 29.06.2017.
 *
 * Ohne Null LAyout
 */
public class a1505 extends JFrame{
    public static void main(String args[]){
        new a1505();
    }

    public a1505 (){
        super("Hauptfenster");

        JPanel j = new JPanel();
        this.setLayout(new BorderLayout());
        add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("East"), BorderLayout.EAST);
        j.add(new JLabel("Hello"));
        add(j, BorderLayout.CENTER);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
