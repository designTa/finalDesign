package entities.roomTypes;

import entities.lights.RegularLight;
import entities.Room;
import entities.RoomEnum;

/**
 * Created by hackeru on 15/02/2018.
 */

/**
 * Created a Singleton Design Pattern method
 * in order to create one living room in the start of the program;
 */
public class LivingRoom extends Room {

    private static LivingRoom livingRoom;
    private RegularLight regularLight;

    private LivingRoom() {
        super(RoomEnum.LivingRoom);
        regularLight = new RegularLight();
    }

    public static LivingRoom getInstance() {
        if(livingRoom == null){
            livingRoom = new LivingRoom();
        }
        return livingRoom;
    }

    public RegularLight getLight(){
        return this.regularLight;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "regularLight=" + regularLight +
                ", TV=" + super.getTv() +
                ", Door=" + super.getDoor() +
                '}';
    }
}
