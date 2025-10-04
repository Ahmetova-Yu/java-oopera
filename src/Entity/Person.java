package Entity;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected final Genre genre;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
