package entities;

import entities.lights.Light;
import entities.itemEntities.Door;
import entities.itemEntities.Tv;
import entities.itemEntities.WaterHeater;
import entities.roomTypes.Kitchen;
import entities.roomTypes.LivingRoom;

import java.util.List;
import java.util.Scanner;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Menu {

    private LivingRoom livingRoom;
    private Kitchen kitchenRoom;
    private Room firstRoom, secondRoom, thirdRoom, forthRoom;

    public Menu(List<Room> roomList) {
        initMenuRooms(roomList);
        showRoomsMenu();
    }

    private void initMenuRooms(List<Room> roomList) {
        for (Room room :
                roomList) {
            switch (room.getName()) {
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
            case LivingRoom:
                showOptionsByRegularRoom(room);
                break;

            case Kitchen:
                System.out.println("Choose an object to change it's status: \n 1. Light \n 2. Door \n 3. TV 4. WaterHeater \n Choose an object by it's number:");
                showOptionsByKitchenRoom((Kitchen)(room));
                break;
        }

    }

    private void showOptionsByRegularRoom(Room room) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an object to change it's status: \n 1. Light \n 2. Door \n 3. TV \n Choose an object by it's number:");
        switch (scanner.nextInt()){
            case 1:
                showLightOptions(room);
                scanner.close();
                break;
            case 2:
                showDoorOptions(room);
                scanner.close();
                break;
            case 3:
                showTVOptions(room);
                scanner.close();
                break;
            default:
                break;
        }
    }

    private void showOptionsByKitchenRoom(Kitchen room) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an object to change it's status: \n 1. Light \n 2. Door \n 3. TV \n 4. WaterHeater \n Choose an object by it's number:");
        switch (scanner.nextInt()){
            case 1:
                showLightOptions(room);
                scanner.close();
                break;
            case 2:
                showDoorOptions(room);
                scanner.close();
                break;
            case 3:
                showTVOptions(room);
                scanner.close();
                break;
            case 4:
                showWaterHeatherOptions(room);
                scanner.close();
                break;
            default:
                break;
        }
    }

    private void showLightOptions(Room room) {
        System.out.println("1. Light the room 1 \n 2. Darken the room \n Choose an option by it's number:");

        Light light = room.getLight();

      /*  if (room.getName() == RoomEnum.Kitchen) {
            KitchenLight kitchenLight = (KitchenLight) light;
        } else {
            RegularLight regularLight = (RegularLight) light;
        }*/

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    if (!light.isOpen()) {
                        light.open();
                    }
                    break;
                case 2:
                    if(!room.getDoor().isOpen()){
                        light.close();
                    } else {
                        System.out.println("\n The door is open, you cannot close the light \n");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private void showDoorOptions(Room room) {
        System.out.println("1. Open door 1 \n 2. Close door \n Choose an option by it's number:");

        Door door = room.getDoor();

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    if (!door.isOpen()) {
                        door.open();
                    }
                    break;
                case 2:
                    door.close();
                    break;
                default:
                    break;
            }
        }
    }


    private void showTVOptions(Room room) {
        System.out.println("1. Open TV 1 \n 2. Close TV \n 3. Order vod \n Choose an option by it's number:");

        Tv tv = room.getTv();

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!tv.isOpen()) {
                        tv.open();
                    }
                    break;
                case 2:
                    tv.close();
                    break;
                case 3:
                    tv.orderVOD();
                default:
                    break;
            }
        }
    }

    private void showWaterHeatherOptions(Kitchen room) {
        System.out.println("1. Open WaterHeater 1 \n 2. Close WaterHeater \n Choose an option by it's number:");

        WaterHeater waterHeater = room.getWaterHeater();

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!waterHeater.isOpen()) {
                        waterHeater.open();
                    }
                    break;
                case 2:
                    waterHeater.close();
                    break;
                default:
                    break;
            }
        }
    }

}
