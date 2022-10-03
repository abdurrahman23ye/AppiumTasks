package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.Driver;

public class UiSelectorSteps {
    AndroidDriver driver= (AndroidDriver) Driver.getAppiumDriver();

    public UiSelectorSteps() throws InterruptedException {
    }

    @Given("Uiselector kullanimi")
    public void uiselectorKullanimi() {


    }

    @And("UiSelector ile {string} e bas")
    public void uiselectorIleEBas(String number) {
    //resourceid
        driver
                .findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.google.android.calculator:id/digit_"+number+"\")").click();


    }

    @And("Uiautomator className ile {string} e bas")
    public void uiautomatorClassNameIleEBas(String number) {

        //className
        //android.widget.Button


        driver
                .findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")").click();


    }

    @And("UiSelector ve text kullanimi")
    public void uiselectorVeTextKullanimi() {
     //className ve text
        driver
                .findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").text(\"3\")").click();


    }

    @And("UiSelector ve index kullanimi")
    public void uiselectorVeIndexKullanimi() {

        //className ve index
        driver
                .findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(5)").click();
    }

    @And("UiSelector text contains kullanimi")
    public void uiselectorTextContainsKullanimi() {

        //className ve textcontains
        driver
                .findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").textContains(\"6\")").click();

    }
}
