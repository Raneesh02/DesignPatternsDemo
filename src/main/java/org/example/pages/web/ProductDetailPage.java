package org.example.pages.web;

public class ProductDetailPage {


    public ProductDetailPage addToCart(int qty){
        System.out.println("Product Quantity "+ qty+" added to cart");
        return this;
    }

    public CartPage goToCart(){
        System.out.println("Navigating to cart page");
        return new CartPage();
    }


}
