package entities.itemEntities;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.currentTimeMillis;

/**
 * Created by hackeru on 15/02/2018.
 */

public class WaterHeater implements Power {

    private static WaterHeater waterHeater;
    Boolean status = false;
    SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
    String startTime = "08:00:00";
    String finishTime = "12:00:00";



    Date now = new Date();

    String strTime = sdfTime.format(now);


    public static WaterHeater getInstance() {
        if(waterHeater == null)
            waterHeater = new WaterHeater();
        return waterHeater;
    }

    private WaterHeater() {
    }

    @Override
    public void open() {
        if((strTime.compareTo(startTime) == 1) && (strTime.compareTo(finishTime) == -1))
        status = true;
    }

    @Override
    public void close() {
        status = false;
    }

    @Override
    public Boolean isOpen() {
        return status;
    }
}
