package entities;

import entities.itemEntities.Door;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Room {


    protected String name;
    protected Door door;
    protected Tv tv;

   public Room(){
       this.door = door;
       this.tv = tv;
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
