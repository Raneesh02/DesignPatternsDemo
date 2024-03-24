package org.example;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest {

    @Test
    public void searchTest() {
        LoginPage loginPage= new LoginPage();

        //Normal way of using page objects
        loginPage.enterPassword();
        loginPage.enterUserName();
        loginPage.submit();

        //intuitive fluent design which is more readable and concise
        HomePage homePage = loginPage
                .enterUserName()
                .enterPassword()
                .submit();

        homePage.searchForProduct("tws earphone")
                .setBrand("Sony")
                .setPriceFilter("10000");

    }


}
