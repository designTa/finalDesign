package entities.roomTypes;

import entities.Lightes.RegularLight;
import entities.Room;
import entities.RoomEnum;

/**
 * Created by hackeru on 15/02/2018.
 */
public class LivingRoom extends Room {

    private static LivingRoom livingRoom;

    public RegularLight regularLight;

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

    public RegularLight getRegularLight(){
        return this.regularLight;
    }
}
