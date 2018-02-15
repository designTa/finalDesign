import entities.Room;
import entities.RoomEnum;
import entities.roomTypes.Kitchen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hackeru on 15/02/2018.
 */
public class HouseManager {

    List<Room> roomList;

    public HouseManager() {
        createRoomList();
        showHouseStatus();
    }

    private void showHouseStatus() {
        System.out.println("The house status is:");

        for (Room room :
                this.roomList) {
            room.toString();
        }

    }

    private void showRoomsMenu() {
        System.out.println("Your room options are: \n 1. Room 1 \n 2. Room 2 \n 3. Room 3 \n 4. Room 4 \n 5. Kitchen \n 6. LivingRoom \n Choose a room by it's number:");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            switch (scanner.nextInt()){
                case 1:case 2:case 3:case 4: break;
                case 5: break;
                case 6: break;
            }
        }
    }

    private void showRoomOptions(Room room){
        if (room instanceof Kitchen){

        }
    }

    private void createRoomList() {
        List<Room> roomList = new ArrayList<>();
        for (RoomEnum roomEnum:
        RoomEnum.values()) {
            Room room = RoomFactory.createRoom(roomEnum);
            roomList.add(room);
        }
        this.roomList = roomList;
    }

}
