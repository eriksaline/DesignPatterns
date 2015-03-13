package za.ac.cput.AshDesign.structural.adapter;

import java.util.Random;

/**
 * Created by student on 2015/03/10.
 */
public class EnemyAdapteeRobot {

    Random generator = new Random();

    public void smashWithHands()
    {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");

    }

    public void walkForward()
    {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName)
    {
        System.out.println("Enemy Robot Tramps on " + driverName);

    }





}
