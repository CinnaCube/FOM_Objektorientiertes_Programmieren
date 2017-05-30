import java.io.File;

/**
 * Created by Rene on 30.05.2017.
 */
public class a1301 {
    public static void main(String args[]){
        listAllFiles(new File("."+File.separator));
    }

    private static void listAllFiles(File dir){
        if(dir.isDirectory()) {
            for (File dirsingle : dir.listFiles()) {
                if (dirsingle.isFile()) {
                    System.out.println("- " + dirsingle.getAbsolutePath());
                }
                else if (dirsingle.isDirectory()) {
                    System.out.println("+ " + dirsingle.getAbsolutePath());
                    listAllFiles(dirsingle);
                }
            }
        }else{
            System.out.println("Das ist kein Verzeichnis!");
        }
    }
}
