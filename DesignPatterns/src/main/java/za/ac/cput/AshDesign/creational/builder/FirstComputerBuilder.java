package za.ac.cput.AshDesign.creational.builder;

/**
 * Created by student on 2015/03/09.
 */
public class FirstComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public FirstComputerBuilder()
    {
        computer = new Computer();

    }

    @Override
    public void buildComputerCase()
    {
        computer.setComputerCase("FirstComputer Computer Case");
    }

    @Override
    public void buildMotherBoard()
    {
        computer.setMotherBoard("FirstComputer Motherboard");
    }

    @Override
    public void buildProcessor()
    {
        computer.setProcessor("FirstComputer Processor");
    }

    @Override
    public void buildRam()
    {
        computer.setRam("FirstComputer Ram");
    }

    @Override
    public Computer getComputer()
    {

        return computer;
    }




}
