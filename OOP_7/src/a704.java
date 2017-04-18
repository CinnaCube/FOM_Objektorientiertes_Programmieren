/**
 * Created by Rene on 18.04.2017.
 */
public class a704 {

    public static void main(String args[]){
        Team teamArray[] = new Team[5];

        teamArray[0] = new Team("VFB Stuttgart",50,18);
        teamArray[1] = new Team("Borussia Dortmund",75,48);
        teamArray[2] = new Team("Herne West",58,25);
        teamArray[3] = new Team("FC Bayern München",75,50);
        teamArray[4] = new Team("Borussia Mönchengladbach",56,48);

        Team meister = teamArray[0];

        for (Team erster : teamArray){
            if(erster.getPunkte() > meister.getPunkte()){
                meister = erster;
            }
            if (erster.getPunkte() == meister.getPunkte()){
                if(erster.getTordifferenz() > meister.getTordifferenz()){
                    meister = erster;
                }
            }
        }

        System.out.println("Meister ist:");
        System.out.println(meister.getVerein());
        System.out.println("Punkte:" + meister.getPunkte());
        System.out.println("Tordifferenz:" + meister.getTordifferenz());
    }
}
