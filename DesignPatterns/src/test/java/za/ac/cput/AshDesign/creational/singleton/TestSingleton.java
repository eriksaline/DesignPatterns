package za.ac.cput.AshDesign.creational.singleton;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by student on 2015/03/07.
 */
public class TestSingleton extends TestCase {

    public void testMySingleton() throws Exception
    {

        MySingleton single1 = MySingleton.getInstance();
        MySingleton single2 = MySingleton.getInstance();
        Assert.assertEquals(single1, single2);

    }
}
