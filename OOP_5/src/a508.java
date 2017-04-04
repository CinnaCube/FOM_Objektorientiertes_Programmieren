/**
 * Created by Rene on 04.04.2017.
 */

//Simple variante
public class a508 {
    public static void main(String args[]){
        String namen[] = new String[5];

        for(int i=0;i<namen.length;i++){
            namen[i] = Tools.stringEingabe();
        }
        for (String name : namen){
            if(name.length() > 4 && name.toUpperCase().contains("E")) {
                System.out.println("name: " + name);
            }
        }
    }
}
