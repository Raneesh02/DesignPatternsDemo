package org.example.pages;

public class HomePage {

    public void searchForProduct(String product){
        System.out.println(product + " searched");
    }

    public void setPriceFilter(String price){
        System.out.println(price + " price filter set");
    }

    public void setBrand(String brand){
        System.out.println(brand + " selected");
    }

}
