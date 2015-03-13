package za.ac.cput.AshDesign.structural;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.structural.bridge.*;

/**
 * Created by student on 2015/03/09.
 */
public class TestBridge {

    @Before
    public void setUp() throws Exception {
        

    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
    public void testBridge() throws Exception {

        Sport sport = new Netball(new NetballPlayers());
        sport.play();
        sport.setSport(new SoccerPlayers());
        sport.play();

        sport = new Soccer(new SoccerPlayers());
        sport.play();
        sport.setSport(new NetballPlayers());
        sport.play();

    }
}
