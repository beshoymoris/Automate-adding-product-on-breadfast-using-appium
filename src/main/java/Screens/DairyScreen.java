package Screens;

import Base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DairyScreen extends Base {

    public DairyScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"AddToCart_btn\"])[1]")
    private MobileElement addToCartButton;

    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"CartImgView\"]/android.view.ViewGroup/android.widget.ImageView")
    private MobileElement cartIcon;

    public void addProductToCart() {
        addToCartButton.click();

    }

    public void openCartScreen() {
        cartIcon.click();
    }

}
