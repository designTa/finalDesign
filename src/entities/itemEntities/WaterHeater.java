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
    private Boolean status = false;
    private SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
    private final String startTime = "08:00:00";
    private final String finishTime = "12:00:00";
    private Date now = new Date();
    private String strTime = sdfTime.format(now);


    public static WaterHeater getInstance() {
        if(waterHeater == null)
            waterHeater = new WaterHeater();
        return waterHeater;
    }

    private WaterHeater() {
    }

    @Override
    public void open() {
        System.out.println("\n Opened the water heater \n");
        if((strTime.compareTo(startTime) == 1) && (strTime.compareTo(finishTime) == -1))
        status = true;
    }

    @Override
    public void close() {
        System.out.println("\n Closed the water heater \n");
        status = false;
    }

    @Override
    public Boolean isOpen() {
        return status;
    }
}
