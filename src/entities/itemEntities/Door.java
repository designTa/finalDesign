package entities.itemEntities;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Door implements Power {
    private Boolean status = false;

    @Override
    public void open() {
        System.out.println("\n Opened the door \n");
        status = true;
    }

    @Override
    public void close() {
        System.out.println("\n Closed the door \n");
        status = false;
    }

    @Override
    public Boolean isOpen() {
        return status;
    }

}
