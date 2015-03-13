package za.ac.cput.AshDesign.behavioural.templatemethod;

/**
 * Created by student on 2015/03/10.
 */
public class ConstructionWorker extends Work {

    @Override
    public void collectTools()
    {
        System.out.println("collect work tools");
    }

    @Override
    public void dig()
    {
        System.out.println("dig foundation");
    }

    @Override
    public void clean()
    {
        System.out.println("clean working space");
    }
}
