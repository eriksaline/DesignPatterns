package za.ac.cput.AshDesign.structural.decorator;

/**
 * Created by student on 2015/03/10.
 */
public abstract class VehicleDecorater implements Vehicle{

    Vehicle vehicle;

    public VehicleDecorater (Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }


}
