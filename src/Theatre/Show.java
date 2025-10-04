package Theatre;

import Entity.Actor;
import Entity.Director;
import Entity.Genre;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
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

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void getInfoActors() {
        for (Actor actor : listOfActors) {
            //System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
            System.out.println(actor);
        }
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println(actor + " уже существует в спектакле!");
                return;
            }
        }

        listOfActors.add(newActor);
        String adding = newActor.getGenre() == Genre.MALE ? " добавлен" : " добавлена";
        System.out.println(newActor + adding + " в спектакль!");
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        res = new StringBuilder("Спектакль - " + title + "\n");
        res.append("Режиссер - ").append(director.toString()).append("\n");

        if (listOfActors.isEmpty()) return "В этом спектакле нет актеров!";

        res.append("Список актеров: ").append("\n");
        for (Actor actor : listOfActors) {
            res.append(actor.toString()).append("\n");
        }

        return res.toString();
    }

    public void replaceActor(Actor newActor, Actor oldActor) {
        int indxOldActor = listOfActors.indexOf(oldActor);
        int indxNewActor = listOfActors.indexOf(newActor);

        if (indxOldActor == -1) {
            System.out.println(oldActor + " нет в списках спектакля!");
            return;
        }

        if (indxNewActor != -1) {
            System.out.println(newActor + " уже участвует в " + "'" + title + "'");
            return;
        }

        listOfActors.set(indxOldActor, newActor);
    }
}
