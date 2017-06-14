import javax.swing.*;

/**
 * Created by Rene on 13.06.2017.
 */

public class test extends JFrame{

    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setContentPane(new test().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JPanel panelMain;
    private JCheckBox checkBox1;
    private JButton button1;
}
