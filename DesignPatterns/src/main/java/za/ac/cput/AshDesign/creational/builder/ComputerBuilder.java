package za.ac.cput.AshDesign.creational.builder;

/**
 * Created by student on 2015/03/09.
 */
public interface ComputerBuilder {

    public void buildComputerCase();
    public void buildMotherBoard();
    public void buildProcessor();
    public void buildRam();
    public Computer getComputer();

}
