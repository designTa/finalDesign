package entities;

import entities.roomTypes.Kitchen;
import entities.roomTypes.LivingRoom;

import java.util.List;
import java.util.Scanner;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Menu {

    LivingRoom livingRoom;
    Kitchen kitchenRoom;
    Room firstRoom, secondRoom, thirdRoom, forthRoom;

    public Menu(List<Room> roomList){
        initMenuRooms(roomList);
        showRoomsMenu();
    }

    private void initMenuRooms(List<Room> roomList){
        for (Room room:
                roomList) {
            switch (room.getName()){
                case LivingRoom:
                    livingRoom = (LivingRoom) room;
                    break;
                case Kitchen:
                    kitchenRoom = (Kitchen) room;
                    break;
                case FirstRoom:
                    firstRoom = room;
                    break;
                case SecondRoom:
                    secondRoom = room;
                    break;
                case ThirdRoom:
                    thirdRoom = room;
                    break;
                case ForthRoom:
                    forthRoom = room;
                    break;
            }
        }
    }

    private void showRoomsMenu() {
        System.out.println("The rooms in your house are: \n 1. Room 1 \n 2. Room 2 \n 3. Room 3 \n 4. Room 4 \n 5. Kitchen \n 6. LivingRoom \n Choose a room by it's number:");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    showRoomOptions(firstRoom);
                    scanner.close();
                    break;
                case 2:
                    showRoomOptions(secondRoom);
                    scanner.close();
                    break;
                case 3:
                    showRoomOptions(thirdRoom);
                    scanner.close();
                    break;
                case 4:
                    showRoomOptions(forthRoom);
                    scanner.close();
                    break;
                case 6:
                    showRoomOptions(livingRoom);
                    scanner.close();
                    break;
                case 5:
                    showRoomOptions(kitchenRoom);
                    scanner.close();
                    break;
            }
        }
    }

    private void showRoomOptions(Room room) {
        switch (room.getName()) {
            case FirstRoom:
            case SecondRoom:
            case ThirdRoom:
            case ForthRoom:
                System.out.println("Choose an object to change it's status or order VOD: \n 1. Light \n 2. Door \n 3. TV \n Choose an object by it's number:");
                break;
            case LivingRoom:
                System.out.println("Choose an object to change it's status or order VOD: \n 1. Light \n 2. Door \n 3. TV \n Choose an object by it's number:");
                break;
            case Kitchen:
                break;
        }

    }

    private void showLightOptions(Room room){
        System.out.println("1. Light the room 1 \n 2. Darken the room \n Choose an option by it's number:");
        
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            switch (scanner.nextInt()){
                case 1:
                    room.getName
            }
        }
    }

}
