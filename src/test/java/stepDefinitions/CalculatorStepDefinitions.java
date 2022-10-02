package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.Calculator;
import utilities.Driver;

public class CalculatorStepDefinitions {

    static AppiumDriver driver;

    static {
        try {
            driver = Driver.getAppiumDriver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    Calculator calculator=new Calculator();

    public CalculatorStepDefinitions() throws InterruptedException {
    }




    @Given("Kullanici calculator uygulamasini acar")
    public void kullaniciCalculatorUygulamasiniAcar() throws InterruptedException {

        Driver.getAppiumDriver();
    }

    @And("Kullanici {string} rakamina basar")
    public void kullaniciRakaminaBasar(String number) throws InterruptedException {

        Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/digit_"+number).click();
    }

    @And("Kullanici arti isaretine basar")
    public void kullaniciArtiIsaretineBasar() throws InterruptedException {
        Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/op_add").click();


    }

    @And("Kullanici esittir isaretine basar")
    public void kullaniciEsittirIsaretineBasar() throws InterruptedException {

        Driver.getAppiumDriver().findElementById("com.google.android.calculator:id/eq").click();

        //
    }

    @And("Kullanici sonucun dort oldugunu dogrular")
    public void kullaniciSonucunDortOldugunuDogrular() throws InterruptedException {

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


    @Given("Kullanici calculator i acar")
    public void kullaniciCalculatorIAcar() {

        System.out.println(driver.getSessionId());
    }

    @And("Kullanici {string}sayisina tiklar")
    public void kullaniciSayisinaTiklar(String number) {

        driver.findElementById("com.google.android.calculator:id/digit_"+number).click();

        text=  driver.findElementById("com.google.android.calculator:id/result_preview").getText();
    }

    @And("Kullanici carpma islemini secer")
    public void kullaniciCarpmaIsleminiSecer() {

        driver.findElementById("com.google.android.calculator:id/op_mul").click();
    }
    static String text;
    @And("Kullanici pre result ile resultin ayni oldugunu dogrular")
    public void kullaniciPreResultIleResultinAyniOldugunuDogrular() {



        System.out.println(text);

      Assert.assertTrue(text.equals(driver.findElementById("com.google.android.calculator:id/result_final").getText()));
    }
}
