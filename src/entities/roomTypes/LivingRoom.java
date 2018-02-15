package entities.roomTypes;

import entities.Room;

/**
 * Created by hackeru on 15/02/2018.
 */
public class LivingRoom extends Room {

    private static LivingRoom ourInstance = new LivingRoom();

    public static LivingRoom getInstance() {
        return ourInstance;
    }

    private LivingRoom() {
        super();
    }
}
