package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import utilities.Driver;

public class UiSelectorSteps {
    AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();

    public UiSelectorSteps() throws InterruptedException {
    }

    @Given("Uiselector kullanimi")
    public void uiselectorKullanimi() {

        driver.findElementByAndroidUIAutomator()
    }
}
