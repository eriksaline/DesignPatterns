package za.ac.cput.AshDesign.behavioural.strategy;

/**
 * Created by student on 2015/03/11.
 */
public class TeacherStrategy implements Strategy {

    @Override
    public boolean checkAge(int age) {
        if ((age >= 21) && (age <= 65)) {
            return true;
        } else {
            return false;
        }
    }
}
