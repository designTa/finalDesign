package entities.roomTypes;

import entities.itemEntities.Door;
import entities.itemEntities.LightBolb;
import entities.Room;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RegularRoom extends Room {
    public RegularRoom(LightBolb lightBolb, Door door, Tv tv) {
        super(lightBolb, door, tv);
    }
}
