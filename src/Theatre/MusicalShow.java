package Theatre;

import Entity.Actor;
import Entity.Person;
import Entity.Director;

import javax.swing.*;
import java.util.ArrayList;

public class MusicalShow extends Show{
    protected final Person musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {

        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }
}
