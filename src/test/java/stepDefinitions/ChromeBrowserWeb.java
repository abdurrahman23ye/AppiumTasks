package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ChromeWeb;
import utilities.Driver;

import java.util.Set;

public class ChromeBrowserWeb {

    ChromeWeb chromeWeb=new ChromeWeb();
    AppiumDriver driver;
    @Given("Kullanici chrome browser i acar")
    public void kullaniciChromeBrowserIAcar() {

      driver= Driver.getAppiumDriver();
    }

    @And("Kullanici context secimi yapar")
    public void kullaniciContextSecimiYapar() throws InterruptedException {

        Set contextName = driver.getContextHandles();

        for (Object contextname : contextName
        ) {

            Thread.sleep(4000);

            if (contextname.toString().contains("CHOROMIUM")) {

                driver.context((String) contextname);
            }
        }
    }

    @And("Kullanici amazon a gider")
    public void kullaniciAmazonAGider() {

        driver.get("https://www.amazon.com/");
    }

    @And("Kullanici arama kutusunda nutella aratir")
    public void kullaniciAramaKutusundaNutellaAratir() {

        chromeWeb.amazonSearchBox.sendKeys("nutella"+ Keys.ENTER);


    }
}
