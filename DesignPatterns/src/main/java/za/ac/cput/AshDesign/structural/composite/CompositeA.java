package za.ac.cput.AshDesign.structural.composite;

/**
 * Created by student on 2015/03/09.
 */

import java.util.*;
public class CompositeA implements Animal {

    List <Cat> catsAlist = new ArrayList<Cat> ();

    @Override
    public void eat()
    {
        for (Cat cats : catsAlist)
        {
            cats.eat();
        }
    }

    @Override
    public void run()
    {
        for (Cat cats : catsAlist)
        {
            cats.run();
        }
    }

    public void add(Cat cats) {
            catsAlist.add(cats);
    }

    public void remove(Cat cats)
    {
        catsAlist.remove(cats);

    }

    public List <Cat> getCats()
    {
        return catsAlist;
    }

    public Cat get(int index)
    {
        return catsAlist.get(index);
    }
}
