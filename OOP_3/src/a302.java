/**
 * Created by Rene on 23.03.2017.
 */
public class a302 {
    public static  void main (String args[]){

        /** Aufgabe 302 */

        byte[] aZahlen = new byte[3];

        aZahlen[0] = 1;
        aZahlen[1] = 2;
        aZahlen[2] = 3;

        System.out.println("Zahlen:" + aZahlen[0] +","+ aZahlen[1] +","+ aZahlen[2]);


        auto[] aAutos = new auto[3];

        aAutos[0] = new auto();
        aAutos[1] = new auto();
        aAutos[2] = new auto();

        aAutos[0].hersteller = "Audi";
        aAutos[0].ps    = 120;
        aAutos[1].hersteller = "Ford";
        aAutos[1].ps    = 500;
        aAutos[2].hersteller = "BMW";
        aAutos[2].ps    = 20;

        System.out.println("Hersteller:" + aAutos[0].hersteller + ",PS:" + aAutos[0].ps);
        System.out.println("Hersteller:" + aAutos[1].hersteller + ",PS:" + aAutos[1].ps);
        System.out.println("Hersteller:" + aAutos[2].hersteller + ",PS:" + aAutos[2].ps);
    }
}
