/**
 * Created by rkassebo on 03.05.2017.
 */
import java.lang.Math;

public class Kreis extends GeometrischeFigur{

    protected double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    protected double berechneUmfang() {
        return 2 * Math.PI * radius;
    }

    protected double berechneFlaeche(){
        return 0.0;
    }
}
