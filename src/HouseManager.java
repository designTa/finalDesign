import entities.Menu;
import entities.Room;
import entities.RoomEnum;
import entities.roomTypes.Kitchen;
import factories.RoomFactory;

import java.util.List;

/**
 * Created by hackeru on 15/02/2018.
 */
public class HouseManager {

    List<Room> roomList;

    public HouseManager() {
        createRoomList();
        showHouseStatus();
        new Menu(roomList);
    }

    private void showHouseStatus() {
        System.out.println("The house status is:");
        for (Room room:
             roomList) {
            switch (room.getName()){
                case FirstRoom: case SecondRoom: case ThirdRoom: case ForthRoom: case LivingRoom:
                    room.toString();
                    break;
                case Kitchen:
                    ((Kitchen) room).toString();
                    break;
                default:
                    System.out.println("There isn't any status for the room " + room.getName().name());
            }
        }
    }

    private void createRoomList() {
        for (RoomEnum roomEnum :
                RoomEnum.values()) {
            this.roomList.add(RoomFactory.createRoom(roomEnum));
        }
    }
}
