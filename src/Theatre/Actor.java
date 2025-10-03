package Theatre;

import Entity.Genre;

public class Actor {
    private String name;
    private String surname;
    private Genre genre;
    private int height;


    public Actor(String name, String surname, Genre genre, int height) {
        this.name = name;
        this.surname = surname;
        this.genre = genre;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getHeight() {
        return height;
    }
}
