/**
 * Created by Rene on 16.03.2017.
 */
public class main {
    public static void main(String[] args){
        auto fahrzeug1 = new auto();
        auto fahrzeug2 = new auto();

        fahrzeug1.ps = 120;
        fahrzeug1.hersteller = "Ford";
        auto.anzahl++;

        fahrzeug2.ps = 80;
        fahrzeug2.hersteller = "VW";
        auto.anzahl++;

        System.out.println("Auto: " + fahrzeug1.hersteller + " mit ps:" + fahrzeug1.ps);
        System.out.println("Auto: " + fahrzeug2.hersteller + " mit ps:" + fahrzeug2.ps);

    }
}

