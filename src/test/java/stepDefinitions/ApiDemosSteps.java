package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.Driver;

public class ApiDemosSteps {
    static AndroidDriver<AndroidElement> driver;

    static {
        try {
            driver = (AndroidDriver) Driver.getAppiumDriver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("Api demos uygulamasini u ac")
    public void apiDemosUygulamasiniUAc() {
    }

    @And("Api demos a tikla")
    public void apiDemosATikla() {
      driver
              .findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/text1\").index(2)").click();
    }

    @And("Preference e tikla")
    public void preferenceETikla() {

        driver
                .findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/text1\").index(10)").click();

    }

    @And("Preference dependencies e tikla")
    public void preferenceDependenciesETikla() {


        driver
                .findElementByAndroidUIAutomator("UiSelector().resourceId(\"android:id/text1\").index(3)").click();

    }

    @And("Wifi butonunu check yap")
    public void wifiButonunuCheckYap() {


        driver
                .findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.RelativeLayout\").index(0)").click();

    }
}
