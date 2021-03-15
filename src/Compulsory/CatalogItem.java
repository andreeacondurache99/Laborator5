package Compulsory;

import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public abstract class CatalogItem {
    private String name;
    private String path;
    private int year;

    public CatalogItem() {
    }

    public CatalogItem(String name, String path, int year) throws InvalidDataException {
        setName(name);
        setPath(path);
        setYear(year);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) throws InvalidDataException {
        try{
            Paths.get(path);
            this.path = path;
        } catch (InvalidPathException| NullPointerException ex){
            throw new InvalidDataException("Invalid path", ex);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws InvalidDataException{
        if (year<1000||year>2021)
            throw new InvalidDataException("Invalid year");
        this.year = year;
    }

    @Override
    public String toString() {
        return "CatalogItem{" +
                "name=" + name +
                ", path=" + path +
                '}';
    }
}
