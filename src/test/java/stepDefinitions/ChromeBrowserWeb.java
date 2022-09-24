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
import utilities.Driver;

import java.util.Set;

public class ChromeBrowserWeb {



    static AndroidDriver<AndroidElement> driver;





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
}
