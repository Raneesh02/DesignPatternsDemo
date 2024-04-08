package org.example.pages.web;

import org.example.pages.basepages.HomePage;

public class WebHomePage implements HomePage {

    public WebHomePage(){
        System.out.println("web homepage constructor");
    }

    //Webelements and locators

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
