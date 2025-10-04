package Theatre;

public class MusicalShow {
    private String musicAuthor;
    private String librettoText;


    public MusicalShow(String musicAuthor, String librettoText) {
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }
}
