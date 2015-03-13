package za.ac.cput.AshDesign.structural.proxy;

/**
 * Created by student on 2015/03/09.
 */
public class Proxy {

    Referee ref;

    public Proxy()
    {
        System.out.println("Blows whistle whenever a foul occurs");
    }

    public void fairPlay()
    {
        if (ref == null)
        {
            ref = new Referee();
        }

        ref.fairPlay();

    }
}
