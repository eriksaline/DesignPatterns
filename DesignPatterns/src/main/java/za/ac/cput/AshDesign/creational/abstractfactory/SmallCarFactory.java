package za.ac.cput.AshDesign.creational.abstractfactory;

/**
 * Created by student on 2015/03/08.
 */
public class SmallCarFactory extends VehicleFactory {

    @Override
    public Vehicle getVehicle(String type)
    {

        if ("polo".equals(type))
        {

            return new Polo();

        }
        else {

            return new Mazda();
        }

    }
}
