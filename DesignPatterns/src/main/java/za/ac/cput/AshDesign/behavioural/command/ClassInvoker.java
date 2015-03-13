package za.ac.cput.AshDesign.behavioural.command;

/**
 * Created by student on 2015/03/11.
 */
public class ClassInvoker {

    Command command;

    public ClassInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
