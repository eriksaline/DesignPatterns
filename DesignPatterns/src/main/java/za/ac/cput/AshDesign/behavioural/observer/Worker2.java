package za.ac.cput.AshDesign.behavioural.observer;

/**
 * Created by student on 2015/03/11.
 */
public class Worker2 implements WorkObserver {

    @Override
    public void doUpdate(int workRate)
    {
        System.out.println("Worker 2 work rate is " + workRate);
    }
}
