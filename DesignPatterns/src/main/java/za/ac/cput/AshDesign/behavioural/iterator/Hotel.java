package za.ac.cput.AshDesign.behavioural.iterator;

/**
 * Created by student on 2015/03/12.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hotel {


        List<Room> hotelRooms;

        public Hotel() {
            hotelRooms = new ArrayList<Room>();
        }

        public void addRoom(Room room) {
            hotelRooms.add(room);
        }

        public Iterator<Room> iterator() {
            return new RoomIterator();
        }

        class RoomIterator implements Iterator<Room> {
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                if (currentIndex >= hotelRooms.size()) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public Room next() {
                return hotelRooms.get(currentIndex++);
            }

            @Override
            public void remove() {
                hotelRooms.remove(--currentIndex);
            }

        }

    }

