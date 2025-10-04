package Entity;

public class Person {
    private String name;
    private String surname;
    private Genre genre;

    public Person(String name, String surname, Genre genre) {
        this.name = name;
        this.surname = surname;
        this.genre = genre;
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
}
