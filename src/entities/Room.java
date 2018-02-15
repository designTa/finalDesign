package entities;

import entities.lights.Light;
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
        this.door = new Door();
        this.tv = new Tv();
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

    @Override
    public String toString() {
        return "Room{" +
                "name=" + name +
                ", door=" + door +
                ", tv=" + tv +
                ", light=" + light +
                '}';
    }
}
