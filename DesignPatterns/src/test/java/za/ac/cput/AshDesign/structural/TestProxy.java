package za.ac.cput.AshDesign.structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.structural.proxy.Player;
import za.ac.cput.AshDesign.structural.proxy.Proxy;

/**
 * Created by student on 2015/03/09.
 */
public class TestProxy {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testProxy() throws Exception {

        Proxy proxy = new Proxy();
        Player player = new Player();
        Assert.assertNotNull(proxy);
        player.fairPlay();
        proxy.fairPlay();

    }
}
