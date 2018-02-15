import entities.Room;
import entities.RoomEnum;
import entities.roomTypes.Kitchen;
import entities.roomTypes.LivingRoom;
import entities.roomTypes.RegularRoom;

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
                return new Kitchen();

            case FirstRoom:
            case SecondRoom:
            case ThirdRoom:
            case ForthRoom:
                return new RegularRoom();

            case LivingRoom:
                return LivingRoom.getInstance();

            default:
                System.out.println("Wrong input");
                return null;
        }
    }


}
