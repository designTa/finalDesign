package entities;

import entities.itemEntities.Door;
import entities.itemEntities.Tv;
import entities.itemEntities.WaterHeater;
import entities.lights.Light;
import entities.roomTypes.Kitchen;
import entities.roomTypes.LivingRoom;

import java.util.List;
import java.util.Scanner;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Menu {

    private List<Room> roomList;
    private LivingRoom livingRoom;
    private Kitchen kitchenRoom;
    private Room firstRoom, secondRoom, thirdRoom, forthRoom;

    public Menu(List<Room> roomList) {
        this.roomList = roomList;
        showHouseStatus();
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

    private void showHouseStatus() {
        System.out.println("The house status is:");
        for (Room room :
                this.roomList) {
            switch (room.getName()) {
                case FirstRoom:
                case SecondRoom:
                case ThirdRoom:
                case ForthRoom:
                case LivingRoom:
                    System.out.println(room.toString());
                    break;
                case Kitchen:
                    System.out.println(((Kitchen) room).toString());
                    break;
                default:
                    System.out.println("There isn't any status for the room " + room.getName().name());
            }
        }
    }

    private void showRoomsMenu() {
        System.out.println("The rooms in your house are: \n 1. Room 1 \n 2. Room 2 \n 3. Room 3 \n 4. Room 4 \n 5. Kitchen \n 6. LivingRoom \n 7. Or you can show status  \n Choose a room by it's number:");
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
                case 7:
                    showHouseStatus();
                    scanner.close();
                    break;
                default:
                    System.out.println("Wrong choice");
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
                showOptionsByKitchenRoom((Kitchen) (room));
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }

    }

    private void showOptionsByRegularRoom(Room room) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an object to change it's status: \n 1. Light \n 2. Door \n 3. TV \n 4. Back to rooms menu \n Choose an object by it's number:");
        switch (scanner.nextInt()) {
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
                showRoomsMenu();
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    private void showOptionsByKitchenRoom(Kitchen room) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an object to change it's status: \n 1. Light \n 2. Door \n 3. TV \n 4. WaterHeater \n  5. Back to rooms menu \n Choose an object by it's number:");
        switch (scanner.nextInt()) {
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
            case 5:
                showRoomsMenu();
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    private void showLightOptions(Room room) {
        isOpenNotification(room, "light");
        System.out.println("1. Light the room 1 \n 2. Darken the room \n 3. Back to main menu \n Choose an option by it's number:");

        Light light = room.getLight();

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    if (!light.isOpen()) {
                        light.open();
                    }
                    showRoomsMenu();
                    break;
                case 2:
                    if (!room.getDoor().isOpen()) {
                        light.close();
                    } else {
                        System.out.println("\n The door is open, you cannot close the light \n");
                    }
                    showRoomsMenu();
                    break;
                case 3:
                    showRoomsMenu();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }

    private void showDoorOptions(Room room) {
       isOpenNotification(room, "door");
        System.out.println("1. Open door 1 \n 2. Close door \n 3. Back to main menu \n Choose an option by it's number:");

        Door door = room.getDoor();

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    if (!door.isOpen()) {
                        door.open();
                    }
                    showRoomsMenu();
                    break;
                case 2:
                    door.close();
                    showRoomsMenu();
                    break;
                case 3:
                    showRoomsMenu();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }


    private void showTVOptions(Room room) {
        isOpenNotification(room, "tv");
        System.out.println("1. Open TV 1 \n 2. Close TV \n 3. Order vod \n 4. Back to main menu \n Choose an option by it's number:");

        Tv tv = room.getTv();

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!tv.isOpen()) {
                        tv.open();
                    }
                    showRoomsMenu();
                    break;
                case 2:
                    tv.close();
                    showRoomsMenu();
                    break;
                case 3:
                    tv.orderVOD();
                    showRoomsMenu();
                case 4:
                    showRoomsMenu();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }

    private void showWaterHeatherOptions(Kitchen room) {
        isOpenNotification(room, "waterheater");
        System.out.println("1. Open WaterHeater 1 \n 2. Close WaterHeater \n 3. Back to main menu \n Choose an option by it's number:");

        WaterHeater waterHeater = room.getWaterHeater();

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if (!waterHeater.isOpen()) {
                        waterHeater.open();
                    }
                    showRoomsMenu();
                    break;
                case 2:
                    waterHeater.close();
                    showRoomsMenu();
                    break;
                case 3:
                    showRoomsMenu();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }

    private void isOpenNotification(Room room, String type) {
        switch (type.toLowerCase()) {
            case "light":
                if (room.getLight().isOpen()) {
                    System.out.println("Light is open");
                } else {
                    System.out.println("Light is closed");
                }
                break;
            case "waterheater":
                if (((Kitchen) room).getWaterHeater().isOpen()) {
                    System.out.println("Water heater is open");
                } else {
                    System.out.println("Water heater is closed");
                }
                break;
            case "tv":
                if (room.getTv().isOpen()) {
                    System.out.println("Tv is open");
                } else {
                    System.out.println("Tv is closed");
                }
                break;
            case "door":
                if (room.getDoor().isOpen()) {
                    System.out.println("Door is open");
                } else {
                    System.out.println("Door is closed");
                }
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
