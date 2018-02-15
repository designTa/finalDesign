import entities.Door;
import entities.LightBolb;
import entities.Tv;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RegularRoom extends Room {
    public RegularRoom(LightBolb lightBolb, Door door, Tv tv) {
        super(lightBolb, door, tv);
    }
}
