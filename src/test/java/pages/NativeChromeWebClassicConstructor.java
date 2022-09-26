package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class NativeChromeWebClassicConstructor {

    // Selenium'daki klasik page sayfasi CHROMİUM ile kullanılabilir.

    public NativeChromeWebClassicConstructor(){

        try {
            PageFactory.
                    initElements(new AppiumFieldDecorator(Driver.
                            getAppiumDriver(), Duration.ofSeconds(15)),this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.TabWidget/android.view.View[5]")
    public WebElement musicLink;

    @AndroidFindBy(id = "//android.view.View[@content-desc=\"Ahmet Kaya Seçmeler / En İyiler\"]")
    public WebElement ilkSira;

   /* public ChromeWeb() throws InterruptedException { PageFactory.
            initElements(new AppiumFieldDecorator(Driver.
                    getAppiumDriver(), Duration.ofSeconds(15)),this);
    }






    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View")
    public MobileElement amazonSearchBox;

    */






}

