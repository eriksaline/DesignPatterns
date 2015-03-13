package za.ac.cput.AshDesign.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/10.
 */
public class MERCEDESHandler extends VehicleHandler {

    @Override
    public void handleRequest(VehicleEnum request) {
        if(request == VehicleEnum.MERCEDES)
        {
            System.out.println("MERCEDES Handler handles" + request);
            System.out.println("MERCEDES is class");
        }else
        {
            System.out.println("MERCEDES Handler doesn't handle" + request);
            if(type != null)
                type.handleRequest(request);
        }
    }
}
