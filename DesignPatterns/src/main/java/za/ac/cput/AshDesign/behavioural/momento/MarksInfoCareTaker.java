package za.ac.cput.AshDesign.behavioural.momento;

/**
 * Created by student on 2015/03/12.
 */
public class MarksInfoCareTaker {


        Object objMemento;

        public void saveState(MarksInfo marksInfo) {
            objMemento = marksInfo.save();
        }

        public void restoreState(MarksInfo marksInfo) {
            marksInfo.restore(objMemento);
        }

}
