/**
 * Created by Rene on 04.05.2017.
 */
public class a1001 {
    public static void main(String args[]){
        int zaehler;
        int nenner;

        zaehler = 35;
        nenner = 0;

        try{
            System.out.println(zaehler/nenner);
        }catch (ArithmeticException ex){
            ex.printStackTrace();
            System.err.println("Divided by zero and destroyed the whole universe!!!");
        }
    }
}