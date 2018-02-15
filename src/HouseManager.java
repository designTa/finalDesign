import entities.Room;
import entities.RoomEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hackeru on 15/02/2018.
 */
public class HouseManager {

    private List<Room> roomsList;

    public HouseManager() {
        createRoomList();
        showHouseStatus();
    }

    private void showHouseStatus() {
        System.out.println("The house status is:");

        for (Room room :
                roomsList) {

        }

    }

    private void showRoomsMenu() {
        System.out.println("Your room options are: \n 1. Room 1 \n 2. Room 2 \n 3. Room 3 \n 4. Room 4 \n 5. Kitchen \n 6. LivingRoom \n Choose a room by it's number:");
        Scanner scanner = new Scanner(System.in);
        for (:
             ) {
            
        }
    }

    private void createRoomList() {
        roomsList = new ArrayList<>();
        for (RoomEnum roomEnum:
        RoomEnum.values()) {
            RoomFactory.createRoom(roomEnum);
        }
    }

}
