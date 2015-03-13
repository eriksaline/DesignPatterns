package za.ac.cput.AshDesign.behavioural;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.interpreter.InterpreterSpeaker;
import za.ac.cput.AshDesign.behavioural.interpreter.Speaker;
import za.ac.cput.AshDesign.behavioural.interpreter.Terminal;

/**
 * Created by student on 2015/03/10.
 */
public class TestInterpreter extends TestCase{

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testInterpreter() throws Exception {


        InterpreterSpeaker speaker = new InterpreterSpeaker();
        Speaker zippy = new Terminal("Zippy");
        Speaker ash = new Terminal("Ash");
        Speaker isMale = speaker.getMaleSpeaker(ash, zippy);
        Speaker noluntu = new Terminal("Luntu");
        Speaker kate = new Terminal("Woman");
        Speaker isWoman = speaker.getWomanSpeaker(noluntu, kate);
        Assert.assertEquals(isMale.speaker("Luntu"), false);

        Assert.assertEquals(isWoman.speaker("Zippy"), false);



    }
}


