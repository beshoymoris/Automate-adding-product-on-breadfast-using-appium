package tests;

import Base.Base;
import Screens.*;
import org.testng.annotations.Test;


public class AddaProductToCartTest extends Base {

    LanguagesScreen languagesScreen;
    GuidanceScreen guidanceScreen;
    PhoneNumberScreen phoneNumberScreen;
    LoginScreen loginScreen;
    LocationScreen locationScreen;
    HomeScreen homeScreen;
    DairyScreen dairyScreen;
    CartScreen cartScreen;

    @Test
    public void addaProductToCart() throws InterruptedException {

        languagesScreen = new LanguagesScreen();
        languagesScreen.selectLanguageAndContinue();
        guidanceScreen = new GuidanceScreen();
        guidanceScreen.clickOnLoginButton();
        phoneNumberScreen = new PhoneNumberScreen();
        phoneNumberScreen.addPhoneNumberAndContinue();
        loginScreen = new LoginScreen();
        loginScreen.addPasswordAndContinue();
        locationScreen = new LocationScreen();
        locationScreen.denyLocationAccess();
        homeScreen = new HomeScreen();
        homeScreen.clickOnStartButton();
        homeScreen.openDairyScreen();
        dairyScreen = new DairyScreen();
        dairyScreen.addProductToCart();
        dairyScreen.openCartScreen();
        cartScreen = new CartScreen();
        cartScreen.getProductText();

    }
}
