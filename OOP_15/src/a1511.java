import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by Rene on 11.07.2017.
 */
public class a1511 {
    public static void main(String args[]){
        String[] options ={"gut","mittel","schlecht"};

        int n = JOptionPane.showOptionDialog(
                null,
                "Wie fühlen Sie sich?",
                "Eine kleine Frage",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);

        if(n == 0){
            JOptionPane.showMessageDialog(null,"es kommen auch wieder schlechetere Zeiten!");
        }else if(n == 1){
            JOptionPane.showMessageDialog(null,
                    "Da kann man ja mit leben!",
                    "Info-Meldung",
                    JOptionPane.WARNING_MESSAGE);
        }else if(n == 2){
            JOptionPane.showMessageDialog(null,
                    "Kopf hoch, gleich ist Feierabend!",
                    "Fehlermeldung",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
