package za.ac.cput.AshDesign.behavioural.observer;

/**
 * Created by student on 2015/03/11.
 */
public interface WorkSubject {

    public void addObserver ( WorkObserver workObserver );
    public void removeObserver ( WorkObserver workObserver);
    public void doNotify ();
}

