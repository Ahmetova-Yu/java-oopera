package Theatre;

import Entity.Actor;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private String director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }
}
