package entities.Lightes;

/**
 * Created by hackeru on 15/02/2018.
 */
public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObserver();

}
