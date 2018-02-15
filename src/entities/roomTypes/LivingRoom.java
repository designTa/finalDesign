package entities.roomTypes;

import entities.Lightes.RegularLight;
import entities.Room;

/**
 * Created by hackeru on 15/02/2018.
 */
public class LivingRoom extends Room {

    public RegularLight regularLight;
    private static LivingRoom ourInstance = new LivingRoom();


    public static LivingRoom getInstance() {
        return ourInstance;
    }

    private LivingRoom() {
        super();
        regularLight = new RegularLight();
    }

    public RegularLight getRegularLight(){
        return this.regularLight;
    }
}
