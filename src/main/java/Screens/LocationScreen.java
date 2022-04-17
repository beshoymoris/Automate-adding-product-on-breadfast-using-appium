package Screens;

import Base.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LocationScreen extends Base {

    public LocationScreen(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy (uiAutomator ="new UiSelector().text(\"DENY\")")
    private MobileElement denyLocationAccess;
    @AndroidFindBy (uiAutomator ="new UiSelector().text(\"PROCEED ANYWAY\")")
    private MobileElement proceedDisableLocation;
    @AndroidFindBy (xpath ="//android.view.ViewGroup[@content-desc=\"CONFIRM LOCATION\"]/android.widget.TextView")
    private MobileElement confirmDefualtLocation;


    public void denyLocationAccess() {

        denyLocationAccess.click();
        proceedDisableLocation.click();
        confirmDefualtLocation.click();

    }
}
