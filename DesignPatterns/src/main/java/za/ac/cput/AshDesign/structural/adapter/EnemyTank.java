package za.ac.cput.AshDesign.structural.adapter;

import java.util.Random;

/**
 * Created by student on 2015/03/10.
 */

public class EnemyTank implements EnemyAttacker {


    Random generator = new Random();

    @Override
    public void fireWeapon()
    {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank does" + attackDamage + "Damage");

    }

    @Override
    public void driveForward()
    {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    @Override
    public void assignDriver(String driverName)
    {
        System.out.println(driverName + " is driving the tank");
    }

}
