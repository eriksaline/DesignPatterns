package za.ac.cput.AshDesign.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.strategy.Context;
import za.ac.cput.AshDesign.behavioural.strategy.Strategy;
import za.ac.cput.AshDesign.behavioural.strategy.StudentStrategy;
import za.ac.cput.AshDesign.behavioural.strategy.TeacherStrategy;

/**
 * Created by student on 2015/03/10.
 */
public class TestStrategy {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testStrategy() throws Exception {

        int age = 22;

        Strategy studentStrategy = new StudentStrategy();
        Context context = new Context(age, studentStrategy);

        System.out.println("Is the age (" + context.getAge() + "yrs) good for starting school? " + context.getResult());

        Strategy teacherStrategy = new TeacherStrategy();
        context.setStrategy(teacherStrategy);

        System.out.println("Is the age (" + context.getAge() + "yrs) good for starting to teach? " + context.getResult());

        Assert.assertNotEquals(teacherStrategy, studentStrategy);

    }


}
