package org.example.pages;

public class HomePage {

    public HomePage searchForProduct(String product){
        System.out.println(product + " searched");
        return this;
    }

    public HomePage setPriceFilter(String price){
        System.out.println(price + " price filter set");
        return this;
    }

    public HomePage setBrand(String brand){
        System.out.println(brand + " selected");
        return this;
    }

}
