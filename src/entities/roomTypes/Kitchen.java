package entities.roomTypes;

import entities.*;
import entities.itemEntities.Door;
import entities.itemEntities.LightBolb;
import entities.itemEntities.Tv;
import entities.itemEntities.WaterHeater;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Kitchen extends Room {

   private WaterHeater waterHeater;

   public Kitchen(LightBolb lightBolb, Door door, Tv tv, WaterHeater waterHeater ){

       super(lightBolb, door, tv);
       this.waterHeater = waterHeater;
   }
}
