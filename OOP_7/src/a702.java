// Datei: KontoTest_Vorlage.java

public class a702
{
    public static void kontoVergleich ( Konto k1, Konto k2 )
    {
        if (k1.getKontostand() > k2.getKontostand())
        {
            System.out.println (k1.getPersonenInfos()
                    + " hat mehr Geld auf dem Konto als "
                    + k2.getPersonenInfos());
        }
        else
        {
            System.out.println (k2.getPersonenInfos()
                    + " hat mehr Geld auf dem Konto als "
                    + k1.getPersonenInfos());
        }
    }

    public static void main (String[] args)
    {
        Konto konto1 = new Konto ("Mueller", "Hans", 500);
        Konto konto2 = new Konto ("Krause", "Peter", 1500);
        Konto konto3 = new Konto ("Boehm", "Harald", 330);
        kontoVergleich (konto1, konto2);
        kontoVergleich (konto2, konto3);
        kontoVergleich (konto1, konto3);
    }
}
