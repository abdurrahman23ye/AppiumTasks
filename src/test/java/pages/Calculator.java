package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class Calculator {

    public Calculator(){ PageFactory.
            initElements(new AppiumFieldDecorator(Driver.
                    getAppiumDriver(), Duration.ofSeconds(15)),this);
    }




    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public MobileElement numberTwo;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    public MobileElement multiple;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    public MobileElement numberFive;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    public MobileElement equal;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public MobileElement resultPanel;
}

