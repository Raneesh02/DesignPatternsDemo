package org.example.pages.factory;

import org.example.pages.basepages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static java.util.Optional.*;

public abstract class PageFactory {
    static String platform;
    static Properties properties;

    public static PageFactory getPageFactory() throws IOException {
//        System.setProperty("platform", "mobile");
        properties =  new Properties();
        properties.load(new FileInputStream(String.join(File.separator,System.getProperty("user.dir") ,"src","main","resources","app.properties")));

        platform = ofNullable(System.getProperty("platform")).orElse(properties.getProperty("platform"));

        return switch (platform){
            case "web" -> new WebPageFactory();
            case "android" -> new AndroidPageFactory();
            default -> throw new IllegalArgumentException("Platform " + platform + " is not correct value");
        };
    }

    abstract public HomePage getHomePage();

}
