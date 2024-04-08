package org.example.pages.web;

public class LoginPageFluent {

    public LoginPageFluent enterUserName(String username){
        //To do method implementation
        System.out.println("User name "+ username +"entered");
        return this;
    }

    public LoginPageFluent enterPassword(String password){
        //To do method implementation
        System.out.println("Password" + password + " entered");
        return this;
    }

    public HomePageFluent submit(){
        //To do method implementation
        System.out.println("Submit Clicked");
        return new HomePageFluent();
    }
}
