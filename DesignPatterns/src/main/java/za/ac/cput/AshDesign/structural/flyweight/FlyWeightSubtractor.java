package za.ac.cput.AshDesign.structural.flyweight;

/**
 * Created by student on 2015/03/09.
 */
public class FlyWeightSubtractor implements FlyWeight {

    String calculation;

    public FlyWeightSubtractor()
    {
        calculation = "subtraction";

        try
        {
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void calculate(int x, int y)
    {
        System.out.println(calculation + " " +x+" and" + y + ":" + (x - y));
    }
}
