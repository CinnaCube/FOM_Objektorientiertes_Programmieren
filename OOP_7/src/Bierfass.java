/**
 * Created by Rene on 18.04.2017.
 */
public class Bierfass {
    private String sorte;
    private int liter;
    private int fassId;

    private static int anzahlFaesser = 0;
    private static int literGesamt = 0;

    public Bierfass(String sorte, int liter){
        anzahlFaesser++;
        this.fassId = anzahlFaesser;
        literGesamt += liter;
        this.sorte = sorte;
        this.liter = liter;
    }

    public void zapfen(int liter){
        if(literGesamt>liter){
            literGesamt -= liter;
        }else{
            literGesamt = 0;
        }
        if(this.liter>liter){
            this.liter -= liter;
        }else{
            this.liter = 0;
        }
    }

    public void print(){
        System.out.println("Sorte: "+this.sorte);
        System.out.println("Liter: "+this.liter);
    }

    public static int getAnzahlFaesser() {
        return anzahlFaesser;
    }

    public static int getLiterGesamt() {
        return literGesamt;
    }
}
