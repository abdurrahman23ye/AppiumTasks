package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.Driver;

public class CalculatorStepDefinitions {
    @Given("Kullanici calculator uygulamasini acar")
    public void kullaniciCalculatorUygulamasiniAcar() {

        Driver.getAppiumDriver();
    }

    @And("Kullanici {string} rakamina basar")
    public void kullaniciRakaminaBasar(String number) {

        Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/digit_"+number).click();
    }

    @And("Kullanici arti isaretine basar")
    public void kullaniciArtiIsaretineBasar() {
        Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/op_add").click();


    }

    @And("Kullanici esittir isaretine basar")
    public void kullaniciEsittirIsaretineBasar() {

        Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/eq").click();

        //
    }

    @And("Kullanici sonucun dort oldugunu dogrular")
    public void kullaniciSonucunDortOldugunuDogrular() {

        ;



        Assert.assertTrue(Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/result_final").getText().equals("4"));
    }
}
