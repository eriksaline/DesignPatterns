package za.ac.cput.AshDesign.structural.decorator;

/**
 * Created by student on 2015/03/10.
 */
public class VersionDecorater extends VehicleDecorater {

    public VersionDecorater (Vehicle vehicle)
    {
        super(vehicle);
    }

    @Override
    public void describe()
    {
        vehicle.describe();
        version();

    }

    public void version()
    {
        System.out.print("I am BMW 3-SERIES 328");
    }
}
