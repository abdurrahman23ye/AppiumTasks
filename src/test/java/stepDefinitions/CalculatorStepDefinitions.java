package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class Calculator {
    @Given("Kullanici calculator uygulamasini acar")
    public void kullaniciCalculatorUygulamasiniAcar() {

        Driver.getAppiumDriver();
    }
}
