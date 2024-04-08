package org.example.pages.factory;

import org.example.pages.android.AndroidHomePage;
import org.example.pages.basepages.HomePage;

import java.io.IOException;

public class AndroidPageFactory extends PageFactory{
    public AndroidPageFactory() throws IOException {

    }

    @Override
    public HomePage getHomePage() {
        return new AndroidHomePage();
    }
}
