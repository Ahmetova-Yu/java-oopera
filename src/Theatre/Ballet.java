package Theatre;

public class Ballet extends MusicalShow{
    private String choreographer;

    public Ballet(String musicAuthor, String librettoText, String choreographer) {
        super(musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }
}
