package za.ac.cput.AshDesign.creational.singleton;

/**
 * Created by student on 2015/03/07.
 */
public class MySingleton {

    public static MySingleton mysingleton = null;

    private MySingleton ()
    {}

    public static MySingleton getInstance()
    {
        if (mysingleton == null)
        {
            mysingleton = new MySingleton();

        }

        return mysingleton;

    }

    public void welcomeMsg()
    {

        System.out.println("Welcome to my design pattern");
    }
}
