/**
 * Created by Rene on 18.04.2017.
 */
public class Kinosaal {
    public Kinosaal() {
        anzahlKinosaele++;
        this.saalNummer = anzahlKinosaele;
    }

    private int saalNummer;
    private int anzahlSitzPlaetzeSaal;

    private static int anzahlSitzplaetzeKino = 0;
    private static int anzahlKinosaele = 0;

    public int getSaalNummer() {
        return saalNummer;
    }

    public void setSaalNummer(int saalNummer) {
        this.saalNummer = saalNummer;
    }

    public int getAnzahlSitzPlaetze() {
        return anzahlSitzPlaetzeSaal;
    }

    public void setAnzahlSitzplaetzeSaal(int anzahlSitzPlaetze) {
        if(this.anzahlSitzPlaetzeSaal != 0) {
            anzahlSitzplaetzeKino -= this.anzahlSitzPlaetzeSaal;
        }
        this.anzahlSitzPlaetzeSaal = anzahlSitzPlaetze;
        anzahlSitzplaetzeKino += anzahlSitzPlaetze;
    }

    public int getAnzahlSitzplaetzeKino(){
        return anzahlSitzplaetzeKino;
    }

    public int getAnzahlKinosaele(){
        return anzahlKinosaele;
    }
}
