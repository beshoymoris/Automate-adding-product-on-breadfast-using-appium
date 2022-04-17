package Screens;

import Base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends Base {

    public LoginScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy (accessibility = "password_pwd")
    private MobileElement passwordField;
    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"login_btn\"]/android.widget.TextView")
    private MobileElement loginButton;

    public void addPasswordAndContinue() {
        passwordField.sendKeys("z86yupqg");
        loginButton.click();

    }
}
