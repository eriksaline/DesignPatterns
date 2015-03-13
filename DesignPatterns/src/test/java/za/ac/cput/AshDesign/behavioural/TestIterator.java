package za.ac.cput.AshDesign.behavioural;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.AshDesign.behavioural.iterator.Hotel;
import za.ac.cput.AshDesign.behavioural.iterator.Room;

import java.util.Iterator;

/**
 * Created by student on 2015/03/10.
 */
public class TestIterator extends TestCase {


    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testIterator() throws Exception {

        Room r1 = new Room("single room", 500);
        Room r2 = new Room("double room", 650);
        Room r3 = new Room("suite", 1000);

        Hotel hotel = new Hotel();
        hotel.addRoom(r1);
        hotel.addRoom(r2);
        hotel.addRoom(r3);

        System.out.println("Displaying Hotel Rooms:");
        Iterator<Room> iterator = hotel.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.println(room);
        }

        System.out.println("\nRemoving last room returned");
        iterator.remove();

        System.out.println("\nDisplaying Hotel Rooms:");
        iterator = hotel.iterator();
        while (iterator.hasNext()) {
            Room room = iterator.next();
            System.out.println(room);


        }

        Assert.assertEquals(hotel, hotel);
        Assert.assertNotEquals(hotel,iterator);
    }
}