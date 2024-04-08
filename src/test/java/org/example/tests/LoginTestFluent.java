package org.example.tests;

import base.BaseTest;
import org.example.pages.web.HomePageFluent;
import org.example.pages.web.LoginPageFluent;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LoginTestFluent extends BaseTest
{
    @Test
    public void test()  {

        LoginPageFluent loginPageFluent = new LoginPageFluent();
        HomePageFluent homePageFluent = loginPageFluent.enterUserName("Raaj").enterPassword("pass@123").submit();
        homePageFluent.searchForProduct("tws earphone").setBrand("Sony").setPriceFilter("10000");

        //Assertions
    }

}
