package entities.roomTypes;

import entities.Lightes.RegularLight;
import entities.Room;
import entities.RoomEnum;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RegularRoom extends Room {

    public RegularLight regularLight;

    public RegularRoom(RoomEnum roomEnum) {
        super(roomEnum);
        regularLight = new RegularLight();
    }

    public RegularLight getRegularLight(){
        return this.regularLight;
    }
}
