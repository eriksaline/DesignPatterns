package za.ac.cput.AshDesign.creational.builder;

/**
 * Created by student on 2015/03/09.
 */
public class ComputerDirector {

    private ComputerBuilder computerBuilder = null;

    public ComputerDirector(ComputerBuilder computerBuilder)
    {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer()
    {
        computerBuilder.buildComputerCase();
        computerBuilder.buildMotherBoard();
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();

    }

    public Computer getComputer()
    {

        return computerBuilder.getComputer();
    }
}
