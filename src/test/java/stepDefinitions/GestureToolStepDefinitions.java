package stepDefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class GestureToolStepDefinitions {

    AndroidDriver<MobileElement> driver;


    @Given("Kullanici uygulamayi acar")
    public void kullaniciUygulamayiAcar() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\asus\\IdeaProjects\\AppiumTasks\\Apps\\gestureTool.apk");

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(7000);
    }
}
