package Entity;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Genre genre, int height) {
        super(name, surname, genre);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
