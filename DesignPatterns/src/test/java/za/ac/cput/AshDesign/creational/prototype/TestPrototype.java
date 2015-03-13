package za.ac.cput.AshDesign.creational.prototype;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/07.
 */
public class TestPrototype {


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testPrototype() throws Exception {

        Car ctype = new Car("BMW");
        System.out.println("car 1 :" + ctype);
        Car ctype2 = (Car) ctype.doClone();
        System.out.println("car 2 :" + ctype2);

        Toyota ty1 = new Toyota("Red");
        System.out.println("toyota 1 color is:" + ty1);
        Toyota ty2 = (Toyota) ty1.doClone();
        System.out.println("toyota 2 color is: " + ty2);

        Assert.assertEquals(ty1.toString(), ty2.toString());


    }
}
