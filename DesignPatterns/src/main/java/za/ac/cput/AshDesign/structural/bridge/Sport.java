package za.ac.cput.AshDesign.structural.bridge;

/**
 * Created by student on 2015/03/10.
 */
public abstract class Sport {

    TypeOfSport type;

    public abstract void play();

    public void setSport(TypeOfSport type)
    {
        this.type = type;
    }

    public boolean numOfPlayers()
    {
        int numOfPlayers = 0;
        if (numOfPlayers == 13)
        {
            System.out.println("Players in netball is 13");
            return numOfPlayers();
        }
        else{
            System.out.println("Players in soccer is 11");
            return numOfPlayers();
        }
    }
}
