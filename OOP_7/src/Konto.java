
public class Konto
{
   private Person person;
   private double kontostand;
   
   public Konto (String name,String vorname,double kontostand)
   {
      this.person = new Person(name, vorname);
      this.kontostand = kontostand;
   }

   public String getPersonenInfos(){
      return this.person.getName() + "," + this.person.getVorname();
   }

   public double getKontostand() {
      return kontostand;
   }
}
