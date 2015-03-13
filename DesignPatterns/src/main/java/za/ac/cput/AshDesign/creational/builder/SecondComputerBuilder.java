package za.ac.cput.AshDesign.creational.builder;

/**
 * Created by student on 2015/03/09.
 */
public class SecondComputerBuilder implements ComputerBuilder{

    Computer computer;

    public SecondComputerBuilder ()
    {

        computer = new Computer();
    }

    @Override
    public void buildComputerCase()
    {
        computer.setComputerCase("SecondComputer Computer Case");
    }

    @Override
    public void buildMotherBoard()
    {
        computer.setMotherBoard("SecondComputer MotherBoard");
    }

    @Override
    public void buildProcessor()
    {
        computer.setProcessor("SecondComputer Processor");
    }

    @Override
    public void buildRam()
    {
        computer.setRam("SecondComputer Ram");

    }

    @Override
    public Computer getComputer()
    {
        return computer;

    }
}
