package org.example.tests;

import base.BaseTest;
import org.example.pages.web.HomePageFluent;
import org.example.pages.web.LoginPageFluent;
import org.example.pages.web.WebLoginPage;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LoginTestFluent extends BaseTest
{
    @Test
    public void test()  {


        WebLoginPage loginPage=new WebLoginPage();
        loginPage.enterUserName("Raaj");
        loginPage.enterPassword("pass@123");
        loginPage.submit();

        LoginPageFluent loginPageFluent = new LoginPageFluent();
        loginPageFluent.enterUserName("feawf").enterPassword("feawf").submit();

        LoginPageFluent loginPageFluent2 = new LoginPageFluent();
        loginPageFluent2.enterUserName("Raaj");
        loginPageFluent2.enterPassword("pass@123");



        HomePageFluent homePageFluent = new HomePageFluent();
        homePageFluent.searchForProduct("fea").setBrand("feawf");
        //Assertions
    }

}
