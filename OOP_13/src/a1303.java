import java.io.*;

/**
 * Created by Rene on 30.05.2017.
 */
public class a1303 {
    public static void main(String args[]) {

        Auto auto1 = new Auto(100, "Ford");

        try {
            ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("." + File.separator + "auto.dat"));
            objOut.writeObject(auto1);

            objOut.close();

            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("." + File.separator + "auto.dat"));

            Auto auto1neu = (Auto) objIn.readObject();
            System.out.println("ps:" + auto1neu.getPs() + " Hersteller:" + auto1neu.getHersteller());
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
