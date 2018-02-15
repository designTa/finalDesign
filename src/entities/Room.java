package entities;

import entities.itemEntities.Door;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Room {
    
    protected RoomEnum name;
    protected Door door;
    protected Tv tv;

   public Room(RoomEnum name){
       this.door = door;
       this.tv = tv;
       this.name = name;
   }

    public Door getDoor(){
        return this.door;
    }

    public Tv getTv(){
        return this.tv;
    }

   public RoomEnum getName(){
        return this.name;
   }

}
