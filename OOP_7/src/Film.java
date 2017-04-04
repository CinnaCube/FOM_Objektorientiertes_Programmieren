/**
 * Created by Rene on 04.04.2017.
 */
public class Film {
    private String titel;
    private String figure;
    private int jahr;

    public Film(){
        new Film("kein Titel","keine Figur",0);
    }

    public Film(String titel, String figure, int jahr) {
        this.titel = titel;
        this.figure = figure;
        this.jahr = jahr;
    }

    public void print(){
        System.out.println("Titel: " + titel);
        System.out.println("Figur: " + figure);
        System.out.println("Jahr: " + jahr);
    }
}
