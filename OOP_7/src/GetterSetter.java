/**
 * Created by Rene on 04.04.2017.
 */
public class GetterSetter {
    private String name;
    private int zahl;

    private static  int wert;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public static int getWert() {
        return wert;
    }

    public static void setWert(int wert) {
        GetterSetter.wert = wert;
    }
}
