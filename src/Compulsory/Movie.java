package Compulsory;

public class Movie extends CatalogItem{
    private double rating;

    public Movie(){}

    public Movie(double rating) {
        this.rating = rating;
    }

    public Movie(String name, String path, int year, double rating) throws InvalidDataException {
        super(name, path, year);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
