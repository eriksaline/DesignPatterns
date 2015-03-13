package za.ac.cput.AshDesign.behavioural.visitor;

import java.util.List;

/**
 * Created by student on 2015/03/11.
 */
public class SumVisitor implements AnimalVisitor {

    @Override
    public void visit(CatElement catElement) {
        int sum = catElement.cat1 + catElement.cat2;
        System.out.println(catElement.cat1 + "+" + catElement.cat2 + "=" + sum);
    }

    @Override
    public void visit(CowElement cowElement) {
        int sum = cowElement.cow + cowElement.cow1;
        System.out.println(cowElement.cow + "+" + cowElement.cow1 + "+" + "=" + sum);
    }

    @Override
    public void visit(List<AnimalElement> elementList) {
        for (AnimalElement ne : elementList) {
            ne.accept(this);
        }
    }
}
