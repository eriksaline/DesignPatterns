package za.ac.cput.AshDesign.behavioural.state;

/**
 * Created by student on 2015/03/11.
 */
public class BadState implements MoodState {

    @Override
    public String sayGreetings() {
        return "Hey! Hey! :D";
    }

    @Override
    public String sayGreetingsBad() {
        return "Hi :----(";
    }
}
