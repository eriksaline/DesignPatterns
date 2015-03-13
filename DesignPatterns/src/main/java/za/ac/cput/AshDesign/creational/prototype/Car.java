package za.ac.cput.AshDesign.creational.prototype;

/**
 * Created by student on 2015/03/09.
 */
public class Car implements Prototype {

    public String type;

    public Car (String type)
    {
        this.type = type;
    }

    @Override
    public Prototype doClone() {
        return new Car(type);
    }

    public String toString()
    {

        return "This car type is: " + type;
    }
}
