package za.ac.cput.AshDesign.behavioural.templatemethod;

/**
 * Created by student on 2015/03/10.
 */
public class ConstructionSupervisor extends Work{

    @Override
    public void collectTools()
    {
        System.out.println("approves working tools are collected");
    }

    @Override
    public void dig()
    {
        System.out.println("approves foundation ia dug");
    }

    @Override
    public void clean()
    {
        System.out.println("approves working space is clean");
    }
}
