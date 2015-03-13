package za.ac.cput.AshDesign.behavioural.interpreter;

/**
 * Created by student on 2015/03/12.
 */
public class InterpreterSpeaker {


        public Speaker getMaleSpeaker(Speaker spk1, Speaker spk2) {
            return new ORMotivationalSpeaker(spk1, spk2);
        }

        public Speaker getWomanSpeaker(Speaker spk1, Speaker spk2) {
            return new MotivationalSpeaker(spk1, spk2);
        }
    }

