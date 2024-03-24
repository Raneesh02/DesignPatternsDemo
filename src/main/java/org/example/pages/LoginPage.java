package org.example.pages;

public class LoginPage {

    public LoginPage enterUserName(){
        //To do method implementation
        System.out.println("User name entered");
        return this;
    }

    public LoginPage enterPassword(){
        //To do method implementation
        System.out.println("Password entered");
        return this;
    }

    public HomePage submit(){
        //To do method implementation
        System.out.println("Submit Clicked");
        return new HomePage();
    }
}
