package Entity;

public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, Genre genre, int numberOfShows) {
        super(name, surname, genre);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссер{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
