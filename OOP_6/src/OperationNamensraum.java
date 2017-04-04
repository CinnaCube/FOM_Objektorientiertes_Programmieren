import com.sun.corba.se.impl.interceptors.PICurrent;

public class OperationNamensraum
{
   public static void main (String [] args)
   {
      Quadrat quad = new Quadrat();
      quad.setSeitenlaenge(5);
      Kreis kreis = new Kreis();
      kreis.setRadius(5);

      //Flaecheninhalt des Quadrats
      System.out.println ("Flaecheninhalt des Quadrats: " + quad.flaeche());

      //Flaecheninhalt des Kreises
      System.out.println ("Flaecheninhalt des Kreises: " + kreis.flaeche());
   }
}

class Quadrat
{
   private double seitenlaenge;

   public void setSeitenlaenge (double seitenlaenge)
   {
      this.seitenlaenge = seitenlaenge;
   }

   public double flaeche(){
      return seitenlaenge * seitenlaenge;
   }
}

class Kreis
{
   private double radius;

   public void setRadius (double radius)
   {
      this.radius = radius;
   }

   public double flaeche(){
      return Math.PI * Math.pow(radius,2);
   }
}
