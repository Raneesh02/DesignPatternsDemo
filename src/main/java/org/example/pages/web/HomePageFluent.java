package org.example.pages.web;

public class HomePageFluent {

    public HomePageFluent searchForProduct(String product){
        System.out.println(product + " searched");
        return this;
    }

    public HomePageFluent setPriceFilter(String price){
        System.out.println(price + " price filter set");
        return this;
    }

    public HomePageFluent setBrand(String brand){
        System.out.println(brand + " selected");
        return this;
    }

    public ProductDetailPage openProduct(String productName){
        System.out.println("Opening product name "+ productName);
        return new ProductDetailPage();
    }

}
