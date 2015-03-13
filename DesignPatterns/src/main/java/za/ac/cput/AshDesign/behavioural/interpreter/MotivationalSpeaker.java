package za.ac.cput.AshDesign.behavioural.interpreter;

/**
 * Created by student on 2015/03/12.
 */
public class MotivationalSpeaker implements Speaker {

    private Speaker spk1 = null;
    private Speaker spk2 = null;

    public MotivationalSpeaker(Speaker spk1, Speaker spk2){
        this.spk1 = spk1;
        this.spk2 = spk2;
    }
    @Override
    public boolean speaker(String context) {
        return spk1.speaker(context) && spk2.speaker(context);
    }
}
