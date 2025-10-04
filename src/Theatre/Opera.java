package Theatre;

import Entity.Actor;

import java.util.ArrayList;

public class Opera extends MusicalShow{
    private final int choirSize;

    public Opera(String title, int duration, String director,
                 ArrayList<Actor> listOfActors, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
