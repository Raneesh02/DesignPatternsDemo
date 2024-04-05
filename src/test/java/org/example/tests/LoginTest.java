package org.example.tests;

import base.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.testng.annotations.Test;
import utlities.DBUtilSingleton;

/**
 * Unit test for simple App.
 */
public class LoginTest extends BaseTest
{
    @Test
    public void test()  {
        LoginPage loginPage=new LoginPage();
        loginPage.enterUserName("Raaj");
        loginPage.enterPassword("pass@123");
        loginPage.submit();

        HomePage homePage = new HomePage();
        homePage.searchForProduct("tws earphone");
        homePage.setBrand("Sony");
        homePage.setPriceFilter("10000");

        //Assertions

    }

}
