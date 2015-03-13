package za.ac.cput.AshDesign.structural.composite;

/**
 * Created by student on 2015/03/09.
 */
public class Cat implements Animal {

    String name;

    public Cat (String name)
    {

        this.name = name;
    }

    @Override
    public void eat()
    {
        System.out.println(name + "Cat is eating");
    }

    @Override
    public void run()
    {
        System.out.println(name + "Cat is runnig");
    }
}
