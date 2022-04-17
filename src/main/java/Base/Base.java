package Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.netbeans.lib.cvsclient.file.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import java.util.concurrent.TimeUnit;


public class Base {

    protected static AndroidDriver <MobileElement> driver;

    @BeforeClass
    public void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","7.1.1");
        caps.setCapability("deviceName","Nexus6P");
        caps.setCapability("app","resources\\breadfast_2.apk");
        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void screenshotOnFailure(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            File snapshot = (File) driver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(snapshot, new File("ScreenShot/screen-shot.png"));
        }
    }

}


