package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.awt.*;
import java.util.List;

public class ApiDemosSteps {
    static AndroidDriver driver;



    @Given("Api demos uygulamasini u ac")
    public void apiDemosUygulamasiniUAc() throws InterruptedException {
        driver= (AndroidDriver) Driver.getAppiumDriver();
    }

    @And("Api demos a tikla")
    public void apiDemosATikla() throws InterruptedException {


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

    List<AndroidElement> elementChecked= (List<AndroidElement>) driver
                .findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.RelativeLayout\").index(0).checked(false)");


    if(elementChecked.size()==1){elementChecked.get(0).click();}
    }

    @And("Wifi setting e tikla")
    public void wifiSettingETikla() throws InterruptedException {

        Thread.sleep(3000);
        driver
                .findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();


    }
}
