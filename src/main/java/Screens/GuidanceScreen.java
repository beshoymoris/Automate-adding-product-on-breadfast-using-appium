package Screens;

import Base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class GuidanceScreen extends Base {

    public GuidanceScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"Login_btn\"]/android.widget.TextView")
    private MobileElement loginButton;


    public void clickOnLoginButton() throws InterruptedException {
        loginButton.click();

    }
}
