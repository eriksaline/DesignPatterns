package za.ac.cput.AshDesign.structural.adapter;

/**
 * Created by student on 2015/03/10.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyAdapteeRobot enemyAdapteeRobot;

    public EnemyRobotAdapter(EnemyAdapteeRobot newRobot)
    {
        enemyAdapteeRobot = newRobot;
    }

    @Override
    public void fireWeapon()
    {
        enemyAdapteeRobot.smashWithHands();
    }

    @Override
    public void driveForward()
    {
        enemyAdapteeRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName)
    {
        enemyAdapteeRobot.reactToHuman(driverName);
    }

}
