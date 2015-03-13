package za.ac.cput.AshDesign.behavioural.templatemethod;

/**
 * Created by student on 2015/03/10.
 */
public abstract class Work {

    public final void doWork()
    {
     collectTools();
     dig();
     wash();
     clean();
    }

    public abstract void collectTools();
    public abstract void dig();

    public void wash()
    {
        System.out.println("Wash work tools");
    }

    public abstract void clean();

}
