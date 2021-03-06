package entities.itemEntities;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.currentTimeMillis;

/**
 * Created by hackeru on 15/02/2018.
 */

/**
 * Created a Singleton Design Pattern method
 * in order to create one WaterHeater in the Kitchen start of the program;
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
        if((strTime.compareTo(startTime) == 1) && (strTime.compareTo(finishTime) == -1)){
            status = true;
            System.out.println("\n Opened the water heater \n");
        } else {
            System.out.println("\n You can't open the water heater at the current time \n");
        }
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

    @Override
    public String toString() {
        return "WaterHeater{" +
                "status=" + status +
                ", time now='" + strTime + '\'' +
                '}';
    }
}
