package entities.roomTypes;

import entities.Lightes.KitchenLight;
import entities.Lightes.RegularLight;
import entities.Room;
import entities.RoomEnum;
import entities.itemEntities.WaterHeater;


/**
 * Created by hackeru on 15/02/2018.
 */
public class Kitchen extends Room {

    private static Kitchen kitchen;
    private KitchenLight kitchenLight;

    private WaterHeater waterHeater;

    private Kitchen(){
        super(RoomEnum.Kitchen);
        this.waterHeater = waterHeater;
    }

    public static Kitchen getInstance() {
        if(kitchen == null){
            kitchen = new Kitchen();
        }
        return kitchen;
    }


    public KitchenLight getLight(){
        return this.kitchenLight;
    }

}
