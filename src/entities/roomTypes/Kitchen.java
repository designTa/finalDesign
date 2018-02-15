package entities.roomTypes;

import entities.Room;
import entities.itemEntities.WaterHeater;


/**
 * Created by hackeru on 15/02/2018.
 */
public class Kitchen extends Room {

    private static Kitchen kitchen;

    private WaterHeater waterHeater;

    private Kitchen(){
        super();
        this.waterHeater = waterHeater;
    }

    public static Kitchen getInstance() {
        if(kitchen == null){
            kitchen = new Kitchen();
        }
        return kitchen;
    }

}
