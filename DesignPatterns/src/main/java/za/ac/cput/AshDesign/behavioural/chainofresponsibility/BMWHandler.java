package za.ac.cput.AshDesign.behavioural.chainofresponsibility;

/**
 * Created by student on 2015/03/10.
 */
public class BMWHandler extends VehicleHandler {


    @Override
    public void handleRequest(VehicleEnum request) {
        if(request == VehicleEnum.BMW)
        {
            System.out.println("BWM Handler handles" + request);
            System.out.println("BWM is an Awesome car");
        }else
        {
            System.out.println("BWM Handler doesn't handle" + request);
            if(type != null)
                type.handleRequest(request);
        }
    }
}
