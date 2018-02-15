package entities.Lightes;

import entities.itemEntities.Power;

/**
 * Created by hackeru on 15/02/2018.
 */
public class KitchenLight implements Observable, Power {

    Boolean status = false;

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void deleteObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

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
