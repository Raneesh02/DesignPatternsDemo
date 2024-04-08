package org.example.pages.factory;

import org.example.pages.android.AndroidHomePage;
import org.example.pages.basepages.HomePage;
import org.example.pages.web.WebHomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class PageFactory {
    String platform;
    Properties properties;

    public PageFactory() throws IOException {
        properties =  new Properties();
        properties.load(new FileInputStream(String.join(File.separator,System.getProperty("user.dir") ,"src","main","resources","app.properties")));

        platform = Optional.ofNullable(System.getProperty("platform")).orElse(properties.getProperty("platform"));

    }

    public HomePage getHomePage(){

        if(platform.equalsIgnoreCase("web")){
            return new WebHomePage();
        }
        else if(platform.equalsIgnoreCase("android")){
            return new AndroidHomePage();
        }
        else{
            throw new IllegalArgumentException("wrong platform value "+ platform);
        }

    }

}
