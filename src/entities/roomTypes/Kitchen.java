package entities.roomTypes;

import entities.lights.KitchenLight;
import entities.Room;
import entities.RoomEnum;
import entities.itemEntities.WaterHeater;
import entities.lights.Light;


/**
 * Created by hackeru on 15/02/2018.
 */
/**
 * Created a Singleton Design Pattern method
 * in order to create one kitchen in the start of the program;
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

    public WaterHeater getWaterHeater(){
        return this.waterHeater;
    }

    @Override
    public Light getLight() {
        return this.kitchenLight;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "kitchenLight=" + kitchenLight +
                ", waterHeater=" + waterHeater +
                '}';
    }
}
