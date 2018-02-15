package entities;

import entities.Lightes.Light;
import entities.itemEntities.Door;
import entities.itemEntities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Room {

    private RoomEnum name;
    private Door door;
    private Tv tv;
    private Light light;

    public Room(RoomEnum name) {
        this.door = door;
        this.light = light;
        this.tv = tv;
        this.name = name;
    }

    public Door getDoor() {
        return this.door;
    }

    public Tv getTv() {
        return this.tv;
    }

    public Light getLight() {
        return this.light;
    }

    public RoomEnum getName() {
        return this.name;
    }

}
