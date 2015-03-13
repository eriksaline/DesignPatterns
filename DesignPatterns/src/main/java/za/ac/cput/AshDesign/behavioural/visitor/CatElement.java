package za.ac.cput.AshDesign.behavioural.visitor;

/**
 * Created by student on 2015/03/11.
 */
public class CatElement implements AnimalElement {

    int cat1;
    int cat2;

    public CatElement(int cat1, int car2) {
        this.cat1 = cat1;
        this.cat2 = cat2;
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
