package org.example.pages.android;

import org.example.pages.basepages.HomePage;

public class AndroidHomePage implements HomePage {

    public AndroidHomePage(){
            System.out.println("Android homepage constructor");
    }

    @Override
    public void searchForProduct(String searchTerm) {

    }

    @Override
    public void setPriceFilter(String price) {

    }
}
