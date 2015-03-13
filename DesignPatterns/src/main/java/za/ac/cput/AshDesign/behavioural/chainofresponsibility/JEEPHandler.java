package za.ac.cput.AshDesign.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/10.
 */
public class JEEPHandler extends VehicleHandler{

    @Override
    public void handleRequest(VehicleEnum request) {
        if(request == VehicleEnum.JEEP)
        {
            System.out.println("JEEP Handler handles" + request);
            System.out.println("JEEP is legendary");
        }else
        {
            System.out.println("JEEP Handler doesn't handle" + request);
            if(type != null)
                type.handleRequest(request);
        }
    }
}
