/**
 * Created by Rene on 23.03.2017.
 */
public class a303 {
    public static void main (String args[]){
        StringBuffer[] zketten = new StringBuffer[3];

        zketten[0] = new StringBuffer("Rene");
        zketten[1] = new StringBuffer("Timo");
        zketten[2] = new StringBuffer("Max");

        for(int i = 0; i<3; i++){
            System.out.println("Erstes Zeichen: " + zketten[i].substring(0,1));
            System.out.println("Länge: " + zketten[i].length());
            System.out.println("Alles Groß: " + zketten[i].toString().toUpperCase());
        }
    }
}
