package za.ac.cput.AshDesign.structural.flyweight;

/**
 * Created by student on 2015/03/10.
 */
public class FlyWeightDivider implements FlyWeight{

    String calculation;

    public FlyWeightDivider()
    {
        calculation = "division";

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
        x = 1;
        y = 1;
        System.out.println(calculation + " " +x+" and" + y + ":" + (x / y));
    }
}
