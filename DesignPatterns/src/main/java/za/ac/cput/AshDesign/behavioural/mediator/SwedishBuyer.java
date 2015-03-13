package za.ac.cput.AshDesign.behavioural.mediator;

/**
 * Created by student on 2015/03/12.
 */
public class SwedishBuyer extends Buyer{

    public SwedishBuyer(Mediator mediator) {

        super(mediator, "krona");
        this.mediator.registerSwedishBuyer(this);
    }
}
