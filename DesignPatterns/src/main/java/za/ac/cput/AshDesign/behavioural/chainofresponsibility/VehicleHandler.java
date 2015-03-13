package za.ac.cput.AshDesign.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/10.
 */
 public abstract class VehicleHandler {

    VehicleHandler type;

    public void setTypes ( VehicleHandler type)
    {

        this.type = type;
    }

    public abstract void handleRequest(VehicleEnum request);
}
