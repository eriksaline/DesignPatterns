package za.ac.cput.AshDesign.structural.decorator;

/**
 * Created by student on 2015/03/10.
 */
public class BrandNewVehicle implements Vehicle{

    @Override
    public void describe()
    {
        System.out.println("I am a brand new vehicle");
    }
}
