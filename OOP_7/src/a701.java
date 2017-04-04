/**
 * Created by Rene on 04.04.2017.
 */
public class a701 {
    public static void main(String args[]){

        Film hdr = new Film("Herr der Ringe","Gandalf",2001);
        Film st = new Film("STar Trek","Mr. Spock",1966);
        Film nix = new Film();

        hdr.print();
        st.print();
        nix.print();
    }
}
