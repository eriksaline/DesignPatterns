package za.ac.cput.AshDesign.structural;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.structural.adapter.EnemyAdapteeRobot;
import za.ac.cput.AshDesign.structural.adapter.EnemyAttacker;
import za.ac.cput.AshDesign.structural.adapter.EnemyRobotAdapter;
import za.ac.cput.AshDesign.structural.adapter.EnemyTank;

/**
 * Created by student on 2015/03/09.
 */
public class TestAdapter extends TestCase {

    @Before
    public void setUp() throws Exception {
        

    }

    @After
    public void tearDown() throws Exception {
        

    }

    @Test
    public void testAdapter() throws Exception {

        EnemyTank enemyTank = new EnemyTank();
        EnemyAdapteeRobot GibRobot = new EnemyAdapteeRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(GibRobot);

        System.out.println("The Robot");

        GibRobot.reactToHuman("Candy");
        GibRobot.walkForward();
        GibRobot.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        enemyTank.assignDriver("Carl");
        enemyTank.driveForward();
        enemyTank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Gibson");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();


    }
}
