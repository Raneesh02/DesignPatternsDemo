package org.example.tests;

import base.BaseTest;
import org.example.pages.basepages.HomePage;
import org.testng.annotations.Test;

public class HomePageTestMultiPlat extends BaseTest {

    @Test
    public void testHomePage(){
        HomePage homePage = pageFactory.getHomePage();
        homePage.searchForProduct("neck band");
        homePage.setPriceFilter("20000");


    }


}
