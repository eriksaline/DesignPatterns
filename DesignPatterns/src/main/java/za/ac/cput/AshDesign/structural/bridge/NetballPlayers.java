package za.ac.cput.AshDesign.structural.bridge;

/**
 * Created by student on 2015/03/10.
 */
public class NetballPlayers implements TypeOfSport {

    int numOfPlayers ;

    public NetballPlayers()
    {
        numOfPlayers = 7;
    }

    @Override
    public int playersInSport()
    {
        System.out.println("Number of Players in Netball is");
        return numOfPlayers;
    }

}
