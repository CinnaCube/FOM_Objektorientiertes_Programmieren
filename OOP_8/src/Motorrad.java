// Datei: Motorrad.java

class Motorrad extends Fahrzeug{
	
   private int spassFaktor;

   public Motorrad(){
       // Aufruf des Konstruktors der Basisklasse mit der Farbe Gelb
       super("Gelb");

       System.out.print("Geben Sie den Spa�faktor ein: ");
       spassFaktor = Tools.intEingabe();
   }
   
   public void print(){
	   
      super.print();
      System.out.print("Spassfaktor:   " + spassFaktor);
   }
}
