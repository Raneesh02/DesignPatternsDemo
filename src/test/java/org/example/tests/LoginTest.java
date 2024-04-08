package org.example.tests;

import base.BaseTest;
import org.example.pages.web.WebHomePage;
import org.example.pages.web.WebLoginPage;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LoginTest extends BaseTest
{
    @Test
    public void test()  {
        WebLoginPage loginPage=new WebLoginPage();
        loginPage.enterUserName("Raaj");
        loginPage.enterPassword("pass@123");
        loginPage.submit();

        WebHomePage webHomePage = new WebHomePage();
        webHomePage.searchForProduct("tws earphone");
        webHomePage.setBrand("Sony");
        webHomePage.setPriceFilter("10000");

        //Assertions

    }

}
