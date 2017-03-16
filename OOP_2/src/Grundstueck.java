/**
 * @author Rene
 * Created by Rene on 16.03.2017.
 */
public class Grundstueck {

    /**
     * Quadratmeter des Grundstücks
     */
    int quadratMeter;

    /**
     * Diese Methode berechnet den Grundstückspreis
     * @param quadratMeterPreis die Quadratmeterpreis des zu berechnenden Grundstücks
     * @return den gesamten Preis
     */
    public int getGesamtPreis(int quadratMeterPreis){

        return quadratMeter * quadratMeterPreis;
    }
}
