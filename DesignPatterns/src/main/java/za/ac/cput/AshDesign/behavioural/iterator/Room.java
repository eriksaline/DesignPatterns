package za.ac.cput.AshDesign.behavioural.iterator;

/**
 * Created by student on 2015/03/12.
 */
public class Room {


        String name;
        float price;

        public Room(String name, float price) {
            this.name = name;
            this.price = price;
        }

        public String toString() {
            return name + ": R" + price;
        }
    }
