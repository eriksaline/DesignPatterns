package za.ac.cput.AshDesign.creational.abstractfactory;

/**
 * Created by student on 2015/03/08.
 */
public class AbstractFactory {

    public VehicleFactory getVehicleFactory(String type)
    {
        if ("trucks".equals(type))
        {
            return new TruckFactory();
        }
        else
        {
            return new SmallCarFactory();

        }
    }
}
