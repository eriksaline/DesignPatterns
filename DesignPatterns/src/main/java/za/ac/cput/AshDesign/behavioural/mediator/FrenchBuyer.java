package za.ac.cput.AshDesign.behavioural.mediator;

/**
 * Created by student on 2015/03/12.
 */
public class FrenchBuyer extends Buyer {

    public FrenchBuyer(Mediator mediator) {
        super(mediator, "euro");
        this.mediator.registerFrenchBuyer(this);
    }
}
