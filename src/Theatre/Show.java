package Theatre;

import Entity.Actor;

import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final String director;
    protected final ArrayList<Actor> listOfActors;

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

    public void getInfoActors() {
        for (Actor actor : listOfActors) {
            //System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
            System.out.println(actor);
        }
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println(actor + " уже существует в спектакле");
                return;
            }
        }

        listOfActors.add(newActor);
        System.out.println(newActor + "добавлен в спектакль!");
    }

    @Override
    public String toString() {
        return "Show{" +
                "listOfActors=" + listOfActors +
                '}';
    }

    public void replaceActor(Actor newActor, Actor oldActor) {
        int indx = listOfActors.indexOf(oldActor);

        if (indx == -1) return;

        listOfActors.set(indx, newActor);
    }
}
