package za.ac.cput.AshDesign.creational.factorymethod;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/07.
 */
public class TestFactoryMethod extends TestCase{

    CalculatorFactory calcfactory = new CalculatorFactory();

        public void testFactoryMethod () throws Exception

        {


            Calculator calc1 = calcfactory.getCalc("subtract");
            System.out.println("calculator 1 sum is " + calc1.calculate(2, 2));

            Calculator calc2 = calcfactory.getCalc("add");
            System.out.println("calculator 2 sum is " + calc2.calculate(2, 2));


        }
}
