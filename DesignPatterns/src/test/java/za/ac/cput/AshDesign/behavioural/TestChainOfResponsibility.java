package za.ac.cput.AshDesign.behavioural;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.chainofresponsibility.*;

/**
 * Created by student on 2015/03/10.
 */
public class TestChainOfResponsibility extends TestCase{

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testChainOfResponsibility() throws Exception {

        VehicleHandler chain = setUpChain();

        chain.handleRequest(VehicleEnum.BMW);
        chain.handleRequest(VehicleEnum.MERCEDES);
        chain.handleRequest(VehicleEnum.JEEP);

        Assert.assertEquals(chain, chain);

    }

    public static VehicleHandler setUpChain()
    {
        VehicleHandler bwmhandler = new BMWHandler();
        VehicleHandler mcdz = new MERCEDESHandler();
        VehicleHandler jeeph = new JEEPHandler();

        bwmhandler.setTypes(mcdz);
        mcdz.setTypes(jeeph);

        return bwmhandler;



    }
}
