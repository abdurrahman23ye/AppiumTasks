package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.Driver;

public class XpathStepdefs {

    static AppiumDriver driver;

    static {
        try {
            driver = Driver.getAppiumDriver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Given("Kullanici uygulamayi acar")
    public void kullaniciUygulamayiAcar() {
    }

    @And("Kullanici search box a deve yazar")
    public void kullaniciSearchBoxADeveYazar() {

        driver.findElementByXPath("//*[@class='android.widget.EditText']").sendKeys("deve");
    }

    @And("Text ile youtube a tiklar")
    public void textIleYoutubeATiklar() {

        driver.findElementByXPath("//android.widget.TextView[@text='YouTube']").click();
    }

    @And("Kullanici cikis yapar")
    public void kullaniciCikisYapar() {

        Driver.quitAppiumDriver();
    }
}
