package entities.itemEntities;

import java.util.Scanner;

/**
 * Created by hackeru on 15/02/2018.
 */
public class Tv implements Power {
    private VOD vod;
    private Boolean status = false;

    public Tv(){
        this.vod = new VOD();
    }

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
        if(this.isOpen()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a program or a movie name: ");
            String name = scanner.next();
            vod.getProgramsAndMoviesList().add(name);
            scanner.close();
        }
        else {
            System.out.println("You can't order something from VOD, the TV is closed");
        }

    }

    @Override
    public String toString() {
        return "Tv{" +
                "vod=" + vod +
                ", status=" + status +
                '}';
    }
}
