package entities.lights;

import entities.itemEntities.Power;

/**
 * Created by hackeru on 15/02/2018.
 */
public abstract class Light implements Power {

    private Boolean status = false;

    @Override
    public void open() {
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
