package za.ac.cput.AshDesign.creational.builder;

/**
 * Created by student on 2015/03/09.
 */
public class Computer {

    private String ComputerCase;
    private String MotherBoard;
    private String Processor;
    private String Ram;

    public void setComputerCase(String computerCase) {
        ComputerCase = computerCase;
    }

    public void setMotherBoard(String motherBoard) {
        MotherBoard = motherBoard;
    }

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getComputerCase() {
        return ComputerCase;
    }

    public String getMotherBoard() {
        return MotherBoard;
    }

    public String getProcessor() {
        return Processor;
    }

    public String getRam() {
        return Ram;
    }

}

