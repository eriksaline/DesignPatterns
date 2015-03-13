package za.ac.cput.AshDesign.behavioural.strategy;

/**
 * Created by student on 2015/03/11.
 */
public class Context {

    int age;
    Strategy strategy;

    public Context(int age, Strategy strategy) {
        this.age = age;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getAge() {
        return age;
    }

    public boolean getResult() {
        return strategy.checkAge(age);
    }

}
