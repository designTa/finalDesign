import entities.Menu;
import entities.Room;
import entities.RoomEnum;
import entities.lights.KitchenLight;
import entities.lights.Observable;
import entities.lights.Observer;
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
        for (Room room :
                roomList) {
            switch (room.getName()) {
                case FirstRoom:
                case SecondRoom:
                case ThirdRoom:
                case ForthRoom:
                case LivingRoom:
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
        Observable observable = null;
        Observer observer = null;
        for (RoomEnum roomEnum :
                RoomEnum.values()) {
            Room room = RoomFactory.createRoom(roomEnum);
            this.roomList.add(room);
            if (roomEnum.equals(RoomEnum.Kitchen)) {
                observable = (KitchenLight) room.getLight();
            } else {
                observable.addObserver(observer);
            }
        }
    }
}
