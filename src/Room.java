import entities.Door;
import entities.LightBolb;
import entities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Room {

    protected LightBolb lightBolb;
    protected Door door;
    protected Tv tv;

   public Room(LightBolb lightBolb, Door door, Tv tv){

       this.lightBolb = lightBolb;
       this.door = door;
       this.tv = tv;
   }

}
