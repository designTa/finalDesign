package entities.itemEntities;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Tv implements Power {
    private VOD vod;
    private Boolean status = false;

    @Override
    public void open() {
        System.out.println("\n Opened the TV \n");
        status = true;
    }

    @Override
    public void close() {
        System.out.println("\n Closed the TV \n");
        status = false;
    }

    @Override
    public Boolean isOpen() {
        return status;
    }

    public void orderVOD(){

    }
}
