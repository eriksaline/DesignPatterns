package za.ac.cput.AshDesign.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.state.BadState;
import za.ac.cput.AshDesign.behavioural.state.ExcitedState;
import za.ac.cput.AshDesign.behavioural.state.Person;

/**
 * Created by student on 2015/03/10.
 */
public class TestState {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testState() throws Exception {

        Person person = new Person(new ExcitedState());
        System.out.println("excited state: " + person.sayGreetings());


        person.setMoodState(new BadState());
        System.out.println("bad state: " + person.sayGreetingsBad());

        Assert.assertEquals(person.sayGreetings(), "Hey! Hey! :D");
       Assert.assertEquals(person.sayGreetingsBad(), "Hi :----(");



    }
}
