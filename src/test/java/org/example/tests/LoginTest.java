package org.example.tests;

import org.example.pages.LoginPage;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class LoginTest
{
    @Test
    public void test(){
        LoginPage loginPage=new LoginPage();
        loginPage.enterUserName().enterPassword().submit();




    }
}
