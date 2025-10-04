package Theatre;

import Entity.Actor;

import java.util.ArrayList;

public class MusicalShow extends Show{
    protected final String musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, int duration, String director,
                       ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {

        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }
}
