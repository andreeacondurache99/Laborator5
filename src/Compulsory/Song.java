package Compulsory;

public class Song extends CatalogItem {
    private String artistName;

    public Song() {
    }

    public Song(String name, String path, int year) throws InvalidDataException {
        super(name, path, year);
    }

    public Song(String artistName) {
        this.artistName = artistName;
    }

    public Song(String name, String path, int year, String artistName) throws InvalidDataException {
        super(name, path, year);
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
