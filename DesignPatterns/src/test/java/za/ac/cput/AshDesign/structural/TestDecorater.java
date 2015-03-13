package za.ac.cput.AshDesign.structural;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.structural.decorator.*;

/**
 * Created by student on 2015/03/09.
 */
public class TestDecorater extends TestCase{

    @Before
    public void setUp() throws Exception {
        

    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
        public void testDecorater() throws Exception {

        Vehicle vehicle = new BrandNewVehicle();
        vehicle.describe();

        Assert.assertEquals(vehicle, vehicle);

        vehicle = new TypeDecorater(vehicle);
        vehicle.describe();

        vehicle = new ColourDecorater(vehicle);
        vehicle.describe();

        vehicle = new VersionDecorater(vehicle);
        vehicle.describe();




        }
}
