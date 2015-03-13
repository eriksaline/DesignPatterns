package za.ac.cput.AshDesign.behavioural.command;

/**
 * Created by student on 2015/03/11.
 */
public class MorningClassCommand implements Command {

    MorningClass morning;

    public MorningClassCommand(MorningClass morning) {
        this.morning = morning;
    }

    @Override
    public void execute() {
        morning.attendMorning();
    }
}
