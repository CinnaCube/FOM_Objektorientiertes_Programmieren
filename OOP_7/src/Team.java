/**
 * Created by Rene on 18.04.2017.
 */
public class Team {

    private String verein;
    private int punkte;
    private int tordifferenz;

    private static int punkteGesamt = 0;

    public Team (String verein, int punkte, int tordifferenz){
        this.verein = verein;
        this.punkte = punkte;
        this.tordifferenz = tordifferenz;
        punkteGesamt += punkte;
    }

    public static int getPunkteGesamt() {
        return punkteGesamt;
    }

    public int getPunkte() {
        return punkte;
    }

    public int getTordifferenz() {
        return tordifferenz;
    }

    public String getVerein() {
        return verein;
    }
}
