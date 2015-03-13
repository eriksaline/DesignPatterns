package za.ac.cput.AshDesign.structural.bridge;

/**
 * Created by student on 2015/03/10.
 */
public class Netball extends Sport{

    public Netball (TypeOfSport type)
    {
        this.type = type;
    }

    @Override
    public void play()
    {
        System.out.println("This Sport is netball");
    }

}
