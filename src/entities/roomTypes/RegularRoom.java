package entities.roomTypes;

import entities.lights.Observable;
import entities.lights.RegularLight;
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

    public RegularLight getLight(){
        return this.regularLight;
    }

    @Override
    public String toString() {
        return "RegularRoom{" +
                "regularLight=" + regularLight +
                '}';
    }
}
