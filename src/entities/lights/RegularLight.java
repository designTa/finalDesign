package entities.lights;

/**
 * Created by hackeru on 15/02/2018.
 */
public class RegularLight extends Light implements Observer {

    @Override
    public void update(Boolean status) {
        if(status){
            this.open();
        } else {
            this.close();
        }
    }

}
