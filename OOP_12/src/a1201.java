import java.util.Map;
import java.util.HashMap;

/**
 * Created by Rene on 30.05.2017.
 */
public class a1201 {
    public static void main(String args[]){

        HashMap<String, Double> mStaedte = new HashMap<String, Double>();

        mStaedte.put("Remscheid",26d);
        mStaedte.put("Wuppertal",21d);
        mStaedte.put("Solingen",-10d);

        for(String sSingle : mStaedte.keySet()){

            System.out.println("Stadt:" + sSingle + " Temp:" + mStaedte.get(sSingle));
        }

    }
}
