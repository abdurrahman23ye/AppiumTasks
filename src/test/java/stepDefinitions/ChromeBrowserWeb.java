package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ChromeWeb;
import pages.ChromeWebAppiumFindElement;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class ChromeBrowserWeb {



    static AndroidDriver<AndroidElement> driver;

    static {
        try {
            driver = (AndroidDriver<AndroidElement>) Driver.getAppiumDriver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    ChromeWeb chromeWeb=new ChromeWeb();
    ChromeWebAppiumFindElement chromeWebAppiumFindElement=new ChromeWebAppiumFindElement();


    public ChromeBrowserWeb() throws InterruptedException {
    }

    @Given("Kullanici chrome browser i acar")
    public void kullaniciChromeBrowserIAcar() throws InterruptedException {


    }


    @And("Kullanici amazon a gider")
    public void kullaniciAmazonAGider() throws InterruptedException {

        driver= (AndroidDriver<AndroidElement>) Driver.getAppiumDriver();



            driver.get("https://www.amazon.com");
        }


    @And("Kullanici arama kutusunda nutella aratir")
    public void kullaniciAramaKutusundaNutellaAratir()  {



            driver.findElementByXPath("//input[@type='text']").sendKeys("nutella");





        }


    @And("Kullanici uyariyi kapatir")
    public void kullaniciUyariyiKapatir() {

        WebElement close=driver.findElement(By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']"));

        close.click();
    }

    @Given("Kullanici amazon sitesine gider")
    public void kullaniciAmazonSitesineGider() {


    }

    @Given("Kullanici {string} sitesine gider")
    public void kullaniciSitesineGider(String web) {

        driver.get(ConfigReader.getProperty(web));




    }

    @And("Kullamici delivery option i kapatir")
    public void kullamiciDeliveryOptionIKapatir() {

        chromeWeb.DeliveryOptionClose.click();
    }

    @And("Kullainici nutella aratir")
    public void kullainiciNutellaAratir() {

        chromeWeb.searchBox.sendKeys("nutella"+Keys.ENTER);
    }

    @And("Kullamici delivery option i kapatir alternatif")
    public void kullamiciDeliveryOptionIKapatirAlternatif() {

        chromeWebAppiumFindElement.DeliveryOptionClose.click();
    }

    @And("Kullainici nutella aratir alternatif")
    public void kullainiciNutellaAratirAlternatif() {

        chromeWebAppiumFindElement.searchBox.sendKeys("nutella"+Keys.ENTER);
    }


}
