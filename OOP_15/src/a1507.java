import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Rene on 29.06.2017.
 */
public class a1507 extends JFrame implements ActionListener {

    private JCheckBox checkbox1, checkbox2, checkbox3;
    private JButton button1;
    private JComboBox<String> combo;

    public static void main(String args[]){
        new a1507();
    }

    public a1507(){
        super("Pizzabestellung");

        String[] lcombos = {"klein","groß","Pizzablech"};



        this.setLayout(new BorderLayout());

        add(new JLabel("Wählen Sie ihren Pizzabelag:"), BorderLayout.NORTH);

        JPanel jpanel = new JPanel();

        checkbox1 = new JCheckBox("Oliven");
        checkbox2 = new JCheckBox("Salami");
        checkbox3 = new JCheckBox("Thunfisch");

        combo = new JComboBox<String>(lcombos);

        button1 = new JButton("bestellen");

        button1.addActionListener(this);

        jpanel.add(checkbox1);
        jpanel.add(checkbox2);
        jpanel.add(checkbox3);

        jpanel.add(combo);

        add(jpanel, BorderLayout.CENTER);

        add(button1, BorderLayout.SOUTH);

        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button1){
            System.out.println("Ihre Bestellung ist:");
            if(checkbox1.isSelected())System.out.println("- Oliven");
            if(checkbox2.isSelected())System.out.println("- Salami");
            if(checkbox3.isSelected())System.out.println("- Thunfisch");
            System.out.println("In der Größe:" + combo.getSelectedItem().toString());
        }
    }
}
