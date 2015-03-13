package za.ac.cput.AshDesign.behavioural.strategy;

/**
 * Created by student on 2015/03/11.
 */
public class StudentStrategy implements Strategy {

    @Override
    public boolean checkAge(int age) {
        if ((age >= 6) && (age <= 8)) {
            return true;
        } else {
            return false;
        }
    }

}
