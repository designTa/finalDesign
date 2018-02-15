package entities.itemEntities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hackeru on 15/02/2018.
 */
public class VOD {

    private List<String> programsAndMoviesList;

    public VOD()
    {
        programsAndMoviesList = new ArrayList<>();
    }

    public List<String> getProgramsAndMoviesList() {
        return this.programsAndMoviesList;
    }

    @Override
    public String toString() {
        return "VOD{" +
                "programsAndMoviesList=" + programsAndMoviesList +
                '}';
    }
}
