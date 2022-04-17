package Screens;

import Base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PhoneNumberScreen extends Base {

    public PhoneNumberScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy (accessibility = "phoneNumb_cell")
    private MobileElement phoneNumberField;
    @AndroidFindBy (accessibility = "continue_btn")
    private MobileElement phoneNumberContinueButton;

    public void addPhoneNumberAndContinue() {
        phoneNumberField.sendKeys("1284659986");
        phoneNumberContinueButton.click();

    }
}
