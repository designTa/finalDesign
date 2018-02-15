package factories;

import entities.Room;
import entities.RoomEnum;
import entities.roomTypes.Kitchen;
import entities.roomTypes.LivingRoom;
import entities.roomTypes.RegularRoom;

import static entities.RoomEnum.FirstRoom;
import static entities.RoomEnum.SecondRoom;
import static entities.RoomEnum.ThirdRoom;
import static entities.RoomEnum.ForthRoom;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RoomFactory {

    /**
     * Created a Factory Design Pattern method
     * in order to create rooms in the start of the program;
     */
    public static Room createRoom(RoomEnum roomEnum){
        switch (roomEnum){
            case Kitchen:
                return Kitchen.getInstance();

            case FirstRoom:
                return new RegularRoom(FirstRoom);
            case SecondRoom:
                return new RegularRoom(SecondRoom);
            case ThirdRoom:
                return new RegularRoom(ThirdRoom);
            case ForthRoom:
                return new RegularRoom(ForthRoom);

            case LivingRoom:
                return LivingRoom.getInstance();

            default:
                System.out.println("Wrong input");
                return null;
        }
    }


}
