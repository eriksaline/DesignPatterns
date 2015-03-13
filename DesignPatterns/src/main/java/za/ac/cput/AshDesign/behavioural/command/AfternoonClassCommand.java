package za.ac.cput.AshDesign.behavioural.command;

/**
 * Created by student on 2015/03/11.
 */
public class AfternoonClassCommand implements Command {

    AfternoonClass afternoon;

    public AfternoonClassCommand(AfternoonClass afternoon) {
        this.afternoon = afternoon ;
    }

    @Override
    public void execute() {
        afternoon.attendAfternoon();
    }
}
