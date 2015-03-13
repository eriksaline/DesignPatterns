package za.ac.cput.AshDesign.creational.factorymethod;

/**
 * Created by student on 2015/03/07.
 */
public class Subtract extends Calculator {

    @Override
    public int calculate(int n1, int n2) {
        int sum;

        sum = n1 - n2;
        return sum;
    }
}