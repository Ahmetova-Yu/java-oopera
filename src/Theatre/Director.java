package Theatre;

import Entity.Genre;

public class Director {
    private String name;
    private String surname;
    private Genre genre;
    private int numberOfShows;


    public Director(String name, String surname, Genre genre, int numberOfShows) {
        this.name = name;
        this.surname = surname;
        this.genre = genre;
        this.numberOfShows = numberOfShows;
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

    public int getNumberOfShows() {
        return numberOfShows;
    }
}
