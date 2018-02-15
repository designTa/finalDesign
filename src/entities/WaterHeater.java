package entities;

/**
 * Created by hackeru on 15/02/2018.
 */

public class WaterHeater {
    private static WaterHeater ourInstance = new WaterHeater();

    public static WaterHeater getInstance() {
        return ourInstance;
    }

    private WaterHeater() {
    }
}
