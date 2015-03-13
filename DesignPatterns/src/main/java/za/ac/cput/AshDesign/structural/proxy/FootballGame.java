package za.ac.cput.AshDesign.structural.proxy;

/**
 * Created by student on 2015/03/09.
 */
public abstract class FootballGame {

    String foul;

    public void fairPlay()
    {
        System.out.println("Game to be played fairly");
    }

    public void setFoul(String foul)
    {
        this.foul = foul;
    }

    public String getFoul() {
        return foul;
    }
}
