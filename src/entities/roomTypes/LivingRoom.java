package entities.roomTypes;

import entities.Lightes.RegularLight;
import entities.Room;

/**
 * Created by hackeru on 15/02/2018.
 */
public class LivingRoom extends Room {

    private static LivingRoom livingRoom;

    public RegularLight regularLight;

    private LivingRoom() {
        super();
        regularLight = new RegularLight();
    }

    public static LivingRoom getInstance() {
        if(livingRoom == null){
            livingRoom = new LivingRoom();
        }
        return livingRoom;
    }

    public RegularLight getRegularLight(){
        return this.regularLight;
    }
}
