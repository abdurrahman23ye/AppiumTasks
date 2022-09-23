package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Calculator;
import utilities.Driver;

public class CalculatorStepDefinitions {

    Calculator calculator=new Calculator();


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



        Assert.assertTrue(Driver.
                getAppiumDriver().
                findElementById("com.google.android.calculator:id/result_final").
                getText().equals("4"));
    }

    @And("Kullanici iki rakamina basar")
    public void kullaniciIkiRakaminaBasar() {

        calculator.numberTwo.click();


    }

    @And("Kullanici carpi islemini secer")
    public void kullaniciCarpiIsleminiSecer() {

        calculator.multiple.click();
    }

    @And("Kullanici bes rakamina basar")
    public void kullaniciBesRakaminaBasar() {

        calculator.numberFive.click();
    }

    @And("Kullanici esittir isaretine secer")
    public void kullaniciEsittirIsaretineSecer() {

        calculator.equal.click();
    }

    @And("Kullanici sonucun on oldugunu dogrular")
    public void kullaniciSonucunOnOldugunuDogrular() {

      Assert.assertTrue(calculator.resultPanel.getText().equals("10"));
    }


}
