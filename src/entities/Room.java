package entities;

import entities.itemEntities.Door;
import entities.itemEntities.LightBulb;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Room {


    protected String name;
    protected LightBulb lightBulb;
    protected Door door;
    protected Tv tv;

   public Room(){
       this.lightBulb = lightBulb;
       this.door = door;
       this.tv = tv;
   }


    public LightBulb getLightBolb(){
       return this.lightBulb;
   }

    public Door getDoor(){
        return this.door;
    }

    public Tv getTv(){
        return this.tv;
    }

   public String getName(){
        return this.name;
   }

}
