import entities.Room;

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
                return new Kitchen1();

            case 2:
                return new RegularRoom1();

            case 3:
                return new RegularRoom1();

            default:
                System.out.println("Wrong input");
                return null;
        }
    }


}
