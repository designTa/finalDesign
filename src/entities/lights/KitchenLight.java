package entities.lights;

import java.util.ArrayList;

/**
 * Created by hackeru on 15/02/2018.
 */
public class KitchenLight extends Light implements Observable {

    ArrayList<Observer> observers;

    public KitchenLight(){
        observers = new ArrayList<Observer>();
    }


    @Override
    public void addObserver(Observer observer) {

       observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer: observers) {
           observer.update(this.isOpen());
        }
    }

}
