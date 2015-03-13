package za.ac.cput.AshDesign.behavioural.state;

/**
 * Created by student on 2015/03/11.
 */
public class Person implements MoodState {

    MoodState moodState;

    public Person(MoodState moodState) {
        this.moodState = moodState;
    }

    public void setMoodState(MoodState moodState) {
        this.moodState = moodState;
    }

    @Override
    public String sayGreetings() {
        return moodState.sayGreetings();
    }

    @Override
    public String sayGreetingsBad() {

       return moodState.sayGreetingsBad();
    }
}
