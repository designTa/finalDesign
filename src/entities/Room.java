package entities;

import entities.itemEntities.Door;
import entities.itemEntities.LightBulb;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Room {

    protected LightBulb lightBulb;
    protected Door door;
    protected Tv tv;

   public Room(){
       this.lightBulb = lightBulb;
       this.door = door;
       this.tv = tv;
   }

}
