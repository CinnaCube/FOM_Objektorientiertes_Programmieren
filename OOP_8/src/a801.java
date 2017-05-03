// Datei: FahrzeugTest.java

public class a801{
	
   public static void main (String args[]){

      // Einen PKW erzeugen
      System.out.println ("Pkw");

      Pkw auto1 = new Pkw();

      // Ein Motorrad erzeugen
      System.out.println ("Motorrad");

      Motorrad zweirad1 = new Motorrad();

      //Rufen Sie die print-Methoden der beiden Fahrzeuge auf

      auto1.print();
      zweirad1.print();


   }
}
