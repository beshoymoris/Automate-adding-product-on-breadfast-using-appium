package Screens;

import Base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends Base {

    public HomeScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy (accessibility = "start_btn")
    private MobileElement startButton;

    @AndroidFindBy (uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+"Long-Life Milk"+"\").instance(0))")
    private MobileElement milkItem;


    public void clickOnStartButton() {
        startButton.click();
    }

    public void openDairyScreen() {
        milkItem.click();
    }



}
