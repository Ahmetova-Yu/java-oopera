package Theatre;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String musicAuthor, String librettoText, int choirSize) {
        super(musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
