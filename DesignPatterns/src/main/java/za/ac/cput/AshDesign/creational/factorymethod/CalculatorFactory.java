package za.ac.cput.AshDesign.creational.factorymethod;

/**
 * Created by student on 2015/03/07.
 */
public class CalculatorFactory {

    public Calculator getCalc(String type)
    {
        if ("add".equals(type))
            return new Add();
        else {
            return new Subtract();
        }

    }
}
