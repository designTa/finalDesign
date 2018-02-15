import entities.Door;
import entities.LightBolb;
import entities.Tv;
import entities.WaterHeater;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Kitchen extends Room {

   private WaterHeater waterHeater;

   public Kitchen(LightBolb lightBolb, Door door, Tv tv, WaterHeater waterHeater ){

       super(lightBolb, door, tv);
       this.waterHeater = waterHeater;
   }
}
