package za.ac.cput.AshDesign.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.observer.WorkStation;
import za.ac.cput.AshDesign.behavioural.observer.Worker;
import za.ac.cput.AshDesign.behavioural.observer.Worker2;

/**
 * Created by student on 2015/03/10.
 */
public class TestObserver {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testObserver() throws Exception {

        WorkStation workStation = new WorkStation(50);

        Worker wk1 = new Worker();
        Worker2 wk2 = new Worker2();
        workStation.addObserver(wk1);
        workStation.addObserver(wk2);

        workStation.setWorkRate(25);

        workStation.removeObserver(wk1);

        workStation.setWorkRate(23);

        Assert.assertNotEquals(wk1, wk2);
    }

}
