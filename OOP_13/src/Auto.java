import java.io.Serializable;

/**
 * Created by Rene on 30.05.2017.
 */
public class Auto implements Serializable{
    public Integer ps;
    public String Hersteller;

    public Auto (Integer ps, String hersteller){
        this.ps = ps;
        this.Hersteller = hersteller;
    }

    public Integer getPs() {
        return ps;
    }

    public String getHersteller() {
        return Hersteller;
    }
}
