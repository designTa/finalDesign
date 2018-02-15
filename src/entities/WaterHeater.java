package entities;

/**
 * Created by hackeru on 15/02/2018.
 */

public class WaterHeater implements Power {
    private static WaterHeater waterHeater;

    public static WaterHeater getInstance() {
        if(waterHeater == null)
            waterHeater = new WaterHeater();
        return waterHeater;
    }

    private WaterHeater() {
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void isClosed() {

    }
}
