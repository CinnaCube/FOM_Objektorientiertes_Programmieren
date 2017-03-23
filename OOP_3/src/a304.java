/**
 * Created by Rene on 23.03.2017.
 */
public class a304 {
    public static void main(String args[]){
        String spfad = "C:\\Eigene Dateien\\Javatest\\Beispiel.java";

        System.out.println("Extension: " + spfad.substring(spfad.lastIndexOf(".")+1,spfad.length()));
        System.out.println("Dateiname: " + spfad.substring(spfad.lastIndexOf("\\")+1,spfad.lastIndexOf(".")));
        System.out.println("Verzeichnis: " + spfad.substring(0, spfad.lastIndexOf("\\")));
    }
}
