package za.ac.cput.AshDesign.structural;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.structural.composite.Cat;
import za.ac.cput.AshDesign.structural.composite.CompositeA;

/**
 * Created by student on 2015/03/09.
 */
public class TestComposite extends TestCase {



    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testComposite() throws Exception {


        Cat cat1 = new Cat("Sue");
        Cat cat2 = new Cat("Chun");
        Cat cat3 = new Cat("Phaqa");
        Cat cat4 = new Cat("Zangief");
        Cat cat5 = new Cat("Dhali");

        CompositeA compA1 = new CompositeA();
        compA1.add(cat1);
        compA1.add(cat2);

        CompositeA compA2 = new CompositeA();
        compA2.add(cat3);
        compA2.add(cat4);

        CompositeA compA3 = new CompositeA();
        compA3.add(cat5);

        System.out.println("Calling 'eat()'");
        cat1.eat();

        Assert.assertNotEquals(cat1, cat2);

        compA1.eat();
        compA2.eat();
        compA3.run();

    }
}
