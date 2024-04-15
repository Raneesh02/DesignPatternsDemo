package org.example.tests;

import org.example.pages.facades.PlaceOrderFacade;
import org.example.pages.web.CartPage;
import org.example.pages.web.HomePageFluent;
import org.example.pages.web.LoginPageFluent;
import org.example.pages.web.ProductDetailPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest {

    @Test
    public void testCartAddition(){
        LoginPageFluent loginPageFluent = new LoginPageFluent();
        HomePageFluent homePageFluent = loginPageFluent.enterUserName("feawf").enterPassword("feawf").submit();;
        ProductDetailPage productDetailPage = homePageFluent.searchForProduct("fea").setBrand("feawf").openProduct("feawf");
        CartPage cartPage = productDetailPage.addToCart(2).goToCart();
        cartPage.proceedToCheckout();
    }


    @Test
    public void testCartAdditionFacade(){
        PlaceOrderFacade placeOrderFacade=new PlaceOrderFacade();
        placeOrderFacade.addToCart("neckband",2);
    }


}
