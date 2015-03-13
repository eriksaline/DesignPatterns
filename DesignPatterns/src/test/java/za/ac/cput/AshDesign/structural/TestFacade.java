package za.ac.cput.AshDesign.structural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.structural.facade.BankFacade;

/**
 * Created by student on 2015/03/09.
 */
public class TestFacade {

    @Before
    public void setUp() throws Exception {
        

    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
    public void testFacade() throws Exception {

        BankFacade accessBank = new BankFacade(1285454641, 55456);

        Assert.assertEquals(accessBank, accessBank);

        accessBank.withdrawMoney(90.00);
        accessBank.withdrawMoney(220.00);
        accessBank.depositMoney(280.00);

    }
}
