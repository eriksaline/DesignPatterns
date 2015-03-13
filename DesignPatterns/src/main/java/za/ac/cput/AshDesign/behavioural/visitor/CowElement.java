package za.ac.cput.AshDesign.behavioural.visitor;

/**
 * Created by student on 2015/03/11.
 */
public class CowElement implements AnimalElement {

    int cow;
    int cow1;

    public CowElement(int cow, int cow1) {
        this.cow = cow;
        this.cow1 = cow1;
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
