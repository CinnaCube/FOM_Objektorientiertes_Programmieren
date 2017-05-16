/**
 * Created by Rene on 16.05.2017.
 */
public class Laserdrucker implements Drucker, Cloneable {
    private int seiten;

    public Laserdrucker(){
        seiten = 100;
    }

    @Override
    public void drucke(String s) {
        this.seiten--;
        System.out.println(s);
    }

    @Override
    public int getSeiten() {
        return seiten;
    }

    public Laserdrucker clone() throws CloneNotSupportedException{
        return (Laserdrucker) super.clone();
    }

}


