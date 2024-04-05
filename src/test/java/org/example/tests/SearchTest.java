package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.HomePageFluent;
import org.example.pages.LoginPage;
import org.example.pages.LoginPageFluent;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest {

    @Test
    public void searchTest() {
        //Normal way of using page objects
        LoginPage loginPage=new LoginPage();
        loginPage.enterUserName("Raaj");
        loginPage.enterPassword("pass@123");
        loginPage.submit();

        //intuitive fluent design which is more readable and concise
        LoginPageFluent loginPageFluent = new LoginPageFluent();
        HomePageFluent homePageFluent = loginPageFluent.enterUserName("Raaj").enterPassword("pass@123").submit();

        homePageFluent.searchForProduct("tws earphone")
                .setBrand("Sony")
                .setPriceFilter("10000");

    }


}
