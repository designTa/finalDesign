import entities.Room;
import entities.roomTypes.Kitchen;
import entities.roomTypes.RegularRoom;

import java.util.Scanner;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RoomFactory {
    public static Room createRoom(int typeOfRoom){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of Room:");
        System.out.println("1- for kitchen \n 2- for the living room \n 3. for a regular room ");
        switch (scanner.nextInt()){
            case 1:
                return new Kitchen();

            case 2:
                return new RegularRoom();

            case 3:
                return new RegularRoom();

            default:
                System.out.println("Wrong input");
                return null;
        }
    }


}
