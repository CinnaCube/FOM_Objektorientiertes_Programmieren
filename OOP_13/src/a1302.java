import com.oracle.webservices.internal.api.message.PropertySet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Rene on 30.05.2017.
 */
public class a1302 {
    public static void main(String args[]){
        Properties prop = new Properties();
        FileInputStream input = null;

        try{
            input = new FileInputStream("D:"+ File.separator+"Programms"+ File.separator+"Teamspeak"+ File.separator+"config"+ File.separator+"clientquery.ini");

            prop.load(input);

            System.out.println(prop.get("open_remote"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
