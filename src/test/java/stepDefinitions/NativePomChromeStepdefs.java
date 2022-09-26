package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.NativeChromeWebClassicConstructor;
import utilities.ConfigReader;
import utilities.Driver;

public class NativePomChromeStepdefs {

    static AppiumDriver driver;

    static {
        try {
            driver = Driver.getAppiumDriver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    NativeChromeWebClassicConstructor nativeChromeWebClassicConstructor=new NativeChromeWebClassicConstructor();

    @Given("Kullanici chromu uygulamasini acar")
    public void kullaniciChromuUygulamasiniAcar() {


    }

    @And("Kullanici youtube a gider")
    public void kullaniciYoutubeAGider() {
        driver.get(ConfigReader.getProperty("youtube"));
    }

    @And("Kullanici muzik linkine tiklar")
    public void kullaniciMuzikLinkineTiklar() {

        nativeChromeWebClassicConstructor.musicLink.click();
    }

    @And("Kullanici isabelle sarkisini secer")
    public void kullaniciIsabelleSarkisiniSecer() {

        nativeChromeWebClassicConstructor.ilkSira.click();
    }

}
