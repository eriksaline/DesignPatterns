package za.ac.cput.AshDesign.creational.abstractfactory;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by student on 2015/03/07.
 */
public class TestAbstractFactory extends TestCase {

    AbstractFactory abstractFactory = new AbstractFactory();

    public void testAbstractFactory()
    {

        VehicleFactory vfactory1 = abstractFactory.getVehicleFactory("trucks");
        Vehicle v1 = vfactory1.getVehicle("dump");
        Assert.assertEquals(v1.vehicleFunction(), "dump trash");
        System.out.println("v1 function : " + v1.vehicleFunction());

        Vehicle v2 = vfactory1.getVehicle("garbage");
        Assert.assertEquals(v2.vehicleFunction(), "collects Garbage");
        System.out.println("v2 function : " + v2.vehicleFunction());

        VehicleFactory vfactory2 = abstractFactory.getVehicleFactory("smallcars");
        Vehicle v3 = vfactory2.getVehicle("polo");
        Assert.assertEquals(v3.vehicleFunction(), "Polo drive...");

        System.out.println("v3 function : " + v3.vehicleFunction());
        Vehicle v4 = vfactory2.getVehicle("mazda");
        Assert.assertEquals(v4.vehicleFunction(), "Mazda drive...");
        System.out.println("v4 function : " + v4.vehicleFunction());



    }
}
