package za.ac.cput.AshDesign.creational.abstractfactory;

/**
 * Created by student on 2015/03/08.
 */
public class TruckFactory extends VehicleFactory {

    @Override
    public Vehicle getVehicle(String type)
    {

        if("dump".equals(type))
        {
            return new DumpTruck();
        }
        else {
            return new GarbageTruck();
        }
    }
}
