package entities.roomTypes;

import entities.Room;

/**
 * Created by hackeru on 15/02/2018.
 */
public class LivingRoom extends Room {
    String name = ;
    private static LivingRoom ourInstance = new LivingRoom();

    public LivingRoom(String name) {
        super();
    }

    public static LivingRoom getInstance() {
        return ourInstance;
    }

    private LivingRoom() {
        super();
    }
}
