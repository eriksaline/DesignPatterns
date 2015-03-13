package za.ac.cput.AshDesign.behavioural.observer;

/**
 * Created by student on 2015/03/11.
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorkStation implements WorkSubject {

    Set<WorkObserver> workObservers;
    int workRate;

    public WorkStation(int workRate) {
        workObservers = new HashSet<WorkObserver>();
        this.workRate = workRate;
    }

    @Override
    public void addObserver(WorkObserver workObserver) {
        workObservers.add(workObserver);
    }

    @Override
    public void removeObserver(WorkObserver workObserver) {
        workObservers.remove(workObserver);
    }

    @Override
    public void doNotify() {
        Iterator<WorkObserver> it = workObservers.iterator();
        while (it.hasNext()) {
            WorkObserver workObserver = it.next();
            workObserver.doUpdate(workRate);
        }
    }

    public void setWorkRate(int newWorkRate) {
        System.out.println("\nWork station workRate " + newWorkRate);
        workRate = newWorkRate;
        doNotify();
    }


}
