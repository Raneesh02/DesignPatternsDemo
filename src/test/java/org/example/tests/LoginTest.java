package org.example.tests;

import base.BaseTest;
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
        loginPage.enterUserName().enterPassword().submit();

        DBUtilSingleton.testCreation();

    }

}
