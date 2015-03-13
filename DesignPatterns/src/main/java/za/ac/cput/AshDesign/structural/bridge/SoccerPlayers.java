package za.ac.cput.AshDesign.structural.bridge;

/**
 * Created by student on 2015/03/10.
 */
public class SoccerPlayers implements TypeOfSport {

    int numOfPlayers ;

    public SoccerPlayers()
    {
        numOfPlayers = 11;
    }

    @Override
    public int playersInSport()
    {
        System.out.println("Number of Players in Soccer is: ");
        return numOfPlayers;
    }

}
