package Compulsory;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<CatalogItem> catalogItems= new ArrayList<>();

    public Catalog() {
    }

    public Catalog(ArrayList<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public void add(CatalogItem catalogItem){
        this.catalogItems.add(catalogItem);
    }

    public void list (){
        System.out.println("Catalog items:\n");
        for (CatalogItem catalogItem: catalogItems)
            System.out.println(catalogItem);
    }

    public void play(CatalogItem catalogItem){

    }

    public void save(){}

    public void load(){}
}
