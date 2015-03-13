package za.ac.cput.AshDesign.structural;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.structural.flyweight.FlyWeight;
import za.ac.cput.AshDesign.structural.flyweight.FlyWeightFactory;

/**
 * Created by student on 2015/03/09.
 */
public class TestFlyWeight extends TestCase {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testFlyWeight() throws Exception {

        FlyWeightFactory factory = FlyWeightFactory.getInstance();
        Assert.assertEquals(factory, factory);

        for (int i = 0; i < 5; i++) {
            FlyWeight flyWeightSubtractor = factory.getFlyWeight("subtract");
            flyWeightSubtractor.calculate(i, i);

            FlyWeight flyWeightDivider = factory.getFlyWeight("divide");
            flyWeightDivider.calculate(i, i);
        }
    }
}