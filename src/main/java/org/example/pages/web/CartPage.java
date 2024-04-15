package org.example.pages.web;

public class CartPage {

    public void checkProductPresent(String productName, int qty){
        System.out.println("Product name "+ productName + " is present with qty: "+qty);
    }

    public void proceedToCheckout(){
        System.out.println("proceeding to checkout page");
    }


}
