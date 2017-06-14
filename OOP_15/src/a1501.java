import javax.swing.*;
import java.awt.FlowLayout;
public class a1501 extends JFrame{
    public static void main (String[] args){
        // Hauptfenster erzeugen
        new a1501("Hauptfenster");
    }
    public a1501(String titel){
        super(titel);
        setLayout (new FlowLayout());
        // Label erzeugen
        JLabel label1 = new JLabel ("Hallo Welt!");
        // Label dem Hauptfenster hinzufuegen.
        add (label1);
        // Größe des Fensters
        setSize (400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // sichtbar machen
        setVisible (true);
    }
}