package za.ac.cput.AshDesign.creational.builder;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/07.
 */
public class TestBuilder extends TestCase {

    public void testBuilder() throws Exception {
        ComputerBuilder firstComputerBuilder = new FirstComputerBuilder();
        ComputerDirector firstComputerDirector = new ComputerDirector(firstComputerBuilder);
        firstComputerDirector.constructComputer();
        Computer computer = firstComputerDirector.getComputer();
       System.out.println("First Computer is : " + computer );


        ComputerBuilder secondComputerBuilder = new SecondComputerBuilder();
        ComputerDirector secondComputerDirector = new ComputerDirector(secondComputerBuilder);
        secondComputerDirector.constructComputer();
        Computer computer1 = secondComputerBuilder.getComputer();
        System.out.println("Second Computer is : " + computer1 );

    }
}
