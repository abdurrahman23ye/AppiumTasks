package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ChromeWebAppiumFindElement {

    public ChromeWebAppiumFindElement() {
 // constructor fark etmiyor ama context chromium ise xpath olarak da web sayfasi inspect edildiyse

        // findby/selenium anotasyonu kullanilacak androidfindby calismiyor.

        try {
            PageFactory.
                    initElements(new AppiumFieldDecorator(Driver.
                            getAppiumDriver(), Duration.ofSeconds(15)), this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//input[@data-action-type='DISMISS']")
    public WebElement DeliveryOptionClose;

    @AndroidFindBy(xpath = "//input[@type='text']")
    public WebElement searchBox;

   /* public ChromeWeb() throws InterruptedException { PageFactory.
            initElements(new AppiumFieldDecorator(Driver.
                    getAppiumDriver(), Duration.ofSeconds(15)),this);
    }






    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View")
    public MobileElement amazonSearchBox;

    */






}

