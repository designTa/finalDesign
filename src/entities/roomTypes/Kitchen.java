package entities.roomTypes;

import entities.Room;
import entities.itemEntities.WaterHeater;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Kitchen extends Room {
    private static Kitchen ourInstance = new Kitchen();

    public static Kitchen getInstance() {
        return ourInstance;
    }

    private WaterHeater waterHeater;

    public Kitchen(){

        super();
        this.waterHeater = waterHeater;
    }

}
