package za.ac.cput.AshDesign.structural.decorator;

/**
 * Created by student on 2015/03/10.
 */
public class ColourDecorater extends VehicleDecorater {

    public ColourDecorater (Vehicle vehicle)
    {
        super(vehicle);
    }

    @Override
    public void describe()
    {
        vehicle.describe();
        System.out.println("I a have stylish mags");
        colour();

    }

    public void colour()
    {
        System.out.print("I am BLUE BMW");
    }
}
