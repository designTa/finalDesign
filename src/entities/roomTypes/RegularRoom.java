package entities.roomTypes;

import entities.Lightes.RegularLight;
import entities.Room;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RegularRoom extends Room {
    public RegularLight regularLight;

    public RegularRoom() {
        super();
        regularLight = new RegularLight();
    }

    public RegularLight getLight(){
        return this.regularLight;
    }
}
