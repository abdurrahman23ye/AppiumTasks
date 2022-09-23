package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class ChromeWeb {

    public ChromeWeb(){ PageFactory.
            initElements(new AppiumFieldDecorator(Driver.
                    getAppiumDriver(), Duration.ofSeconds(15)),this);
    }




    @FindBy(xpath = "//input[@placeholder='Search Amazon']")
    public MobileElement amazonSearchBox;




}

