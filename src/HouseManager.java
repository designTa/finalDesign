import entities.Menu;
import entities.Room;
import entities.RoomEnum;
import entities.lights.KitchenLight;
import entities.lights.Observable;
import entities.lights.Observer;
import entities.lights.RegularLight;
import entities.roomTypes.Kitchen;
import factories.RoomFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 15/02/2018.
 */
public class HouseManager {

    List<Room> roomList;

    public HouseManager() {
        createRoomList();
        new Menu(roomList);
    }

    private void createRoomList() {

        List<Room> roomList = new ArrayList<>();

        Kitchen kitchen = (Kitchen) RoomFactory.createRoom(RoomEnum.Kitchen);
        roomList.add(kitchen);
        KitchenLight kitchenLight = (KitchenLight) kitchen.getLight();
        RegularLight regularLight = null;

        for (RoomEnum roomEnum :
                RoomEnum.values()) {
            if(!roomEnum.equals(RoomEnum.Kitchen)){
                Room room = RoomFactory.createRoom(roomEnum);
                roomList.add(room);
                regularLight = (RegularLight) room.getLight();
                kitchenLight.addObserver(regularLight);
            }
        }
        this.roomList = roomList;
    }
}
