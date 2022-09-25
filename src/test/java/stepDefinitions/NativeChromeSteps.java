package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class NativeChromeSteps {

   static AppiumDriver driver;

    {
        try {
            driver = Driver.getAppiumDriver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("Kullanici chrome uygulamsini acar")
    public void kullaniciChromeUygulamsiniAcar() {


    }


    @And("Kullanici amazon sitesine gider alternatif")
    public void kullaniciAmazonSitesineGiderAlternatif() {

        driver.get("https://www.amazon.com");
    }
}
