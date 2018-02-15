package entities.Lightes;

import entities.itemEntities.Power;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RegularLight implements Observer, Power {

    Boolean status = false;

    @Override
    public void update() {

    }

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
