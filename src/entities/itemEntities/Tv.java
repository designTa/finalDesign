package entities.itemEntities;

import java.util.Scanner;

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
        if(this.isOpen()){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a program or a movie name: ");
            vod.programsAndMoviesList.add(scanner.next());
        }
        else {
            System.out.println("You can't order something from VOD, the TV is closed");
        }

    }
}
