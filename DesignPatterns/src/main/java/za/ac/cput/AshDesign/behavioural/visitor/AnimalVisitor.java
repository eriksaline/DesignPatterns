package za.ac.cput.AshDesign.behavioural.visitor;

/**
 * Created by student on 2015/03/11.
 */

import java.util.List;

public interface AnimalVisitor {

    public void visit(CowElement cowElement);

    public void visit(CatElement catElement);

    public void visit(List<AnimalElement> elementList);
}
