package za.ac.cput.AshDesign.creational.prototype;

/**
 * Created by student on 2015/03/09.
 */
public class Toyota implements Prototype {

    String color;

    public Toyota(String color)
    {
        this.color = color;
    }

    @Override
    public Prototype doClone() {
        return new Toyota(color);
    }

    public String toString()
    {
        return "Toyota color is: " + color;
    }
}
