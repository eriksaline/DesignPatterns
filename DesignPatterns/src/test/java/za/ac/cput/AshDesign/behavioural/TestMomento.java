package za.ac.cput.AshDesign.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.momento.MarksInfo;
import za.ac.cput.AshDesign.behavioural.momento.MarksInfoCareTaker;

/**
 * Created by student on 2015/03/10.
 */
public class TestMomento {


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testMemento() throws Exception {

        // caretaker
        MarksInfoCareTaker marksInfoCareTaker = new MarksInfoCareTaker();

        // originator
        MarksInfo marksInfo = new MarksInfo("Asiphe", 3000, 78);
        Assert.assertEquals("Asiphe", "Asiphe");
        Assert.assertEquals(3000, 3000);
        Assert.assertEquals(78, 78);


        marksInfo.setSubjectCodeAndMarks(2000, 75);
        Assert.assertEquals(2000, 2000);
        Assert.assertEquals(75, 75);


        System.out.println("Saving state.");
        marksInfoCareTaker.saveState(marksInfo);

        marksInfo.setSubjectCodeAndMarks(1000, 50);
        Assert.assertEquals(1000, 1000);
        Assert.assertEquals(50, 50);



        marksInfo.setSubjectCodeAndMarks(4000, 66);
        Assert.assertEquals(4000, 4000);
        Assert.assertEquals(66, 66);



        System.out.println("Restoring saved state.");
        marksInfoCareTaker.restoreState(marksInfo);
        System.out.println(marksInfo);






    }
}
