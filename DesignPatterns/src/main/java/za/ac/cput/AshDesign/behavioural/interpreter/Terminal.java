package za.ac.cput.AshDesign.behavioural.interpreter;

/**
 * Created by student on 2015/03/12.
 */
public class Terminal implements Speaker {


    private String data;
    public Terminal(String data)
    {
        this.data = data;
    }
    @Override
    public boolean speaker(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }


}
