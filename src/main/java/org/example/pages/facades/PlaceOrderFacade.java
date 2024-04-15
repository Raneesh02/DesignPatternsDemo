package org.example.pages.facades;

import org.example.pages.web.CartPage;
import org.example.pages.web.HomePageFluent;
import org.example.pages.web.LoginPageFluent;
import org.example.pages.web.ProductDetailPage;

public class PlaceOrderFacade {

    public void addToCart(String productName, int qty){
        LoginPageFluent loginPageFluent = new LoginPageFluent();
        HomePageFluent homePageFluent = loginPageFluent.enterUserName("feawf").enterPassword("feawf").submit();;
        ProductDetailPage productDetailPage = homePageFluent.searchForProduct(productName).setBrand("feawf").openProduct(productName);
        CartPage cartPage = productDetailPage.addToCart(qty).goToCart();
        cartPage.proceedToCheckout();
    }

}
