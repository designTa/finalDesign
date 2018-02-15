package entities;

import entities.itemEntities.Door;
import entities.itemEntities.LightBolb;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Room {

    protected LightBolb lightBolb;
    protected Door door;
    protected Tv tv;

   public Room(){

       this.lightBolb = lightBolb;
       this.door = door;
       this.tv = tv;
   }

}
