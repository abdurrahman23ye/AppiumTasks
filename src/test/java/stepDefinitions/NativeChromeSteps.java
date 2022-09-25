package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import utilities.ConfigReader;
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


    @And("Kullanici youyube u aratir")
    public void kullaniciYouyubeUAratir() {

        driver.findElementById("com.android.chrome:id/search_box_text").sendKeys("youtube");


    }

    @And("Kullanici arama kutusuna amazon yazar")
    public void kullaniciAramaKutusunaAmazonYazar() throws InterruptedException {

        driver.get("https://www.amazon.com");

        Thread.sleep(1000);

        driver.findElementById("com.android.chrome:id/search_box_text").sendKeys("amazon");
    }

    @And("Kullanici acilan seceneklerden amazon u tiklar")
    public void kullaniciAcilanSeceneklerdenAmazonUTiklar() throws InterruptedException {

        Thread.sleep(1000);

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView").click();
    }

    @And("Kullanici sonuclardan amazon web sayfasini secer")
    public void kullaniciSonuclardanAmazonWebSayfasiniSecer() throws InterruptedException {

        Thread.sleep(1000);

        driver.findElementByXPath("//android.view.View[@content-desc=\"https://www.amazon.com.tr Amazon\"]/android.view.View[2]").click();
    }

    @And("Kullanici cerezleri kabul eder")
    public void kullaniciCerezleriKabulEder() throws InterruptedException {
        Thread.sleep(1000);
        if( driver.findElementById("sp-cc-accept").isDisplayed()){

        driver.findElementById("sp-cc-accept").click();}
    }

    @And("Kullanici arama kutusuna tiklar")
    public void kullaniciAramaKutusunaTiklar() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElementById("Arama anahtar kelimelerini silin").click();
    }

    @And("Kullanici arama kutusuna kalem yazar")
    public void kullaniciAramaKutusunaKalemYazar() throws InterruptedException {

        Thread.sleep(1000);

        driver.findElementById("Arama anahtar kelimelerini silin").sendKeys("kalem");
    }

    @And("Kullanici arama butonuna basar")
    public void kullaniciAramaButonunaBasar() throws InterruptedException {

        Thread.sleep(1000);

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.Button").click();
    }

    @And("Kullanici amazon a gider native")
    public void kullaniciAmazonAGiderNative() {

        driver.get("https://www.amazon.com");
    }

    @And("Kullanici deliver adresini degistirmemeyi secer")
    public void kullaniciDeliverAdresiniDegistirmemeyiSecer() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View[1]/android.widget.Button").click();
    }

    @And("Kullanici arama kutusuna at yazar")
    public void kullaniciAramaKutusunaAtYazar() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText").sendKeys("at");
    }

    @And("Kullanici arama butonuna tiklar")
    public void kullaniciAramaButonunaTiklar() {

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.TextView").click();
    }

    @And("Kullanici arama kutusuna tiklar ve at yazar")
    public void kullaniciAramaKutusunaTiklarVeAtYazar() throws InterruptedException {
        Thread.sleep(2000);

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.EditText").sendKeys("at");
    }
}
