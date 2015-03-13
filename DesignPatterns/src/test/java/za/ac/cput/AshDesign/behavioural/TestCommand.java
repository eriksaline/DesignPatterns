package za.ac.cput.AshDesign.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.command.*;

/**
 * Created by student on 2015/03/10.
 */
public class TestCommand {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCommand() throws Exception {

        MorningClass morning = new MorningClass();
        Command morningCommand = new MorningClassCommand(morning);

        AfternoonClass afternoon = new AfternoonClass();
        Command afternoonCommand = new AfternoonClassCommand(afternoon);

        ClassInvoker classInvoker = new ClassInvoker(morningCommand);
        classInvoker.invoke();

        Assert.assertEquals(classInvoker, classInvoker);

        classInvoker.setCommand(afternoonCommand);
        classInvoker.invoke();

    }
}
