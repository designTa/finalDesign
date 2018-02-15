package entities.Lightes;

import entities.itemEntities.Power;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Light implements Power {

    private Boolean status = false;

    @Override
    public void open() {
        System.out.println("\n Opened the light \n");
        status = true;
    }

    @Override
    public void close() {
        System.out.println("\n Closed the light \n");
        status = false;
    }

    @Override
    public Boolean isOpen() {
        return status;
    }
}
