package za.ac.cput.AshDesign.structural.decorator;

/**
 * Created by student on 2015/03/10.
 */
public class TypeDecorater extends VehicleDecorater {

    public TypeDecorater (Vehicle vehicle)
    {
        super(vehicle);
    }

    @Override
    public void describe()
    {
        vehicle.describe();
        System.out.println("I a BMW vehicle");
        speed();

    }

    public void speed()
    {
        System.out.print("I am very fast");
    }

}
