package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ChromeWeb;
import utilities.Driver;

import java.util.Set;

public class ChromeBrowserWeb {

    ChromeWeb chromeWeb = new ChromeWeb();

    TouchAction touchAction=new TouchAction(Driver.getAppiumDriver());

    static AppiumDriver driver;

    public ChromeBrowserWeb() throws InterruptedException {
    }

    @Given("Kullanici chrome browser i acar")
    public void kullaniciChromeBrowserIAcar() throws InterruptedException {

        driver = Driver.getAppiumDriver();
    }


    @And("Kullanici amazon a gider")
    public void kullaniciAmazonAGider() {

        driver.get("https://www.amazon.com/");
    }

    @And("Kullanici arama kutusunda nutella aratir")
    public void kullaniciAramaKutusundaNutellaAratir() throws InterruptedException {

        Set contextName = driver.getContextHandles();

        for (Object contextname : contextName
        ) {

            Thread.sleep(4000);

            if (contextname.toString().contains("CHOROMIUM")) {

                driver.context((String) contextname);

            }



            System.out.println(driver.context((String) contextname));



            driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View").click();
           Thread.sleep(5000);
            driver.findElementByXPath("//input[@type='text']").sendKeys("nutella");





        }
    }
}
