package za.ac.cput.AshDesign.behavioural;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.templatemethod.ConstructionSupervisor;
import za.ac.cput.AshDesign.behavioural.templatemethod.ConstructionWorker;
import za.ac.cput.AshDesign.behavioural.templatemethod.Work;

/**
 * Created by student on 2015/03/10.
 */
public class TestTemplateMethod extends TestCase {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testTemplateMethod() throws Exception {

        Work work = new ConstructionWorker();
        work.doWork();

        System.out.println("-------");

        Work work1 = new ConstructionSupervisor();
        work1.doWork();

        Assert.assertNotEquals(work, work1);

    }
}
