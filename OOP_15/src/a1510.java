import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rene on 11.07.2017.
 */
public class a1510 extends JFrame implements ActionListener {

    private JMenu menu;
    private JMenuBar menubar;
    private JMenuItem menuitem, menuitem2, menuitem3;
    private JLabel label;

    public static void main(String args[]) {
        new a1510();
    }

    public a1510(){
        super("Menutest");

        this.setLayout(new BorderLayout());

        this.menubar = new JMenuBar();

        setJMenuBar(this.menubar);

        this.menu = new JMenu("Karten");

        menubar.add(menu);

        this.menuitem = new JMenuItem("Karte 1");
        this.menuitem2 = new JMenuItem("Karte 2");
        this.menuitem3 = new JMenuItem("Karte 3");
        menuitem.addActionListener(this);
        menuitem2.addActionListener(this);
        menuitem3.addActionListener(this);
        menu.add(this.menuitem);
        menu.add(this.menuitem2);
        menu.add(this.menuitem3);

        JPanel panel = new JPanel();

        add(panel);

        label = new JLabel();

        panel.add(label);

        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == menuitem) {
            System.out.println("Karte gewaehlt");
            label.setText("Menu 1 ausgewaehlt");
        }else if(e.getSource() == menuitem2){
            System.out.println("Karte gewaehlt");
            label.setText("Menu 2 ausgewaehlt");

        }else if(e.getSource() == menuitem3){
            System.out.println("Karte gewaehlt");
            label.setText("Menu 3 ausgewaehlt");
        }

    }
}
