package za.ac.cput.AshDesign.structural.bridge;

/**
 * Created by student on 2015/03/10.
 */
public class Soccer extends Sport
{

        public Soccer (TypeOfSport type)
        {
            this.type = type;
        }

        @Override
        public void play()
        {
            System.out.println("This Sport is soccer");
        }
}
