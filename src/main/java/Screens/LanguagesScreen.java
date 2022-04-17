package Screens;

import Base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LanguagesScreen extends Base {

    public LanguagesScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy (accessibility = "en")
    private MobileElement englishbutt;
    @AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"Continue\"]/android.view.ViewGroup")
    private MobileElement languageContinueButton;

    public void selectLanguageAndContinue() {
        englishbutt.click();
        languageContinueButton.click();

    }
}
