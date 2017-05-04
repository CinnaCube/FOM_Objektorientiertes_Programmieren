/**
 * Created by Rene on 04.05.2017.
 */
public class Bankkonto{
    private double Kontostand;

    public void einzahlen(double betrag) throws TransaktionsException{
        if(betrag <= 0){
            throw new TransaktionsException();
        }else {
            Kontostand += betrag;
        }
    }
    public void auszahlen(double betrag) throws TransaktionsException{
        if(betrag <= 0 || betrag > Kontostand){
            throw new TransaktionsException();
        }else {
            Kontostand -= betrag;
        }
    }
    public double getKontostand(){
        return Kontostand;
    }
}
