package entities.lights;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RegularLight extends Light implements Observer {

    public RegularLight(Observable kitchenLight){
        kitchenLight.addObserver(this);
    }

    @Override
    public void update(Boolean status) {
        if(status){
            this.close();
        } else {
            this.open();
        }
    }

}
