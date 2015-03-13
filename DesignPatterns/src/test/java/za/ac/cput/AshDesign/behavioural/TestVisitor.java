package za.ac.cput.AshDesign.behavioural;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.visitor.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/10.
 */
public class TestVisitor {

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testVisitor() throws Exception {


        CatElement cat1 = new CatElement(3, 3);
        CatElement cat2 = new CatElement(2, 7);
        CowElement cow = new CowElement(3, 4);

        List<AnimalElement> animalElements = new ArrayList<AnimalElement>();
        animalElements.add(cat1);
        animalElements.add(cat2);
        animalElements.add(cow);

        System.out.println("Visiting element list with SumVisitor");
        AnimalVisitor sumVisitor = new SumVisitor();
        sumVisitor.visit(animalElements);

        System.out.println("\nVisiting element list with TotalSumVisitor");
        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
        totalSumVisitor.visit(animalElements);
        System.out.println("Total sum:" + totalSumVisitor.getTotalSum());

        Assert.assertNotEquals(cat1, cow);

    }
}
