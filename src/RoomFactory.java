import entities.Room;
import entities.RoomEnum;
import entities.roomTypes.Kitchen;
import entities.roomTypes.RegularRoom;

import java.util.Scanner;

import static entities.RoomEnum.FirstRoom;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RoomFactory {
    public static Room createRoom(RoomEnum roomEnum){
        switch (roomEnum){
            case Kitchen:
                return new Kitchen();

            case SecondRoom:
                return new RegularRoom();

            case ThirdRoom:
                return new RegularRoom();

            case FirstRoom:
                return new RegularRoom();

            case ForthRoom:
                return new RegularRoom();

            case LivingRoom:
                return null

            default:
                System.out.println("Wrong input");
                return null;
        }
    }


}
