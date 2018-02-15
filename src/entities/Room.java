package entities;

import entities.itemEntities.Door;
import entities.itemEntities.LightBolb;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Room {

    protected String name;
    protected LightBolb lightBolb;
    protected Door door;
    protected Tv tv;

   public Room(String name){

       this.name = name;
       this.lightBolb = lightBolb;
       this.door = door;
       this.tv = tv;
   }

   public LightBolb getLightBolb(){
       return this.lightBolb;
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
