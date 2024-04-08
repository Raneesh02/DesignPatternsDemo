package org.example.pages.factory;

import org.example.pages.basepages.HomePage;
import org.example.pages.web.WebHomePage;

import java.io.IOException;

public class WebPageFactory extends PageFactory{
    public WebPageFactory() throws IOException {
    }

    @Override
    public HomePage getHomePage() {
        return new WebHomePage();
    }
}
