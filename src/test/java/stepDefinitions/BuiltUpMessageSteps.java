package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.BuiltUpMessage;
import utilities.Driver;

public class BuiltUpMessageSteps {

    BuiltUpMessage builtUpMessage=new BuiltUpMessage();
    @Given("Mesaj uygulamasi acilir")
    public void mesajUygulamasiAcilir() {

        System.out.println(Driver.getAppiumDriver().getSessionId());
    }

    @And("Ecu tiklanir")
    public void ecuTiklanir() {

        builtUpMessage.ecu.click();


    }

    @And("Ecu aranir")
    public void ecuAranir() {

        //mesaj atilamiyor, o yuzden aradim

        builtUpMessage.arama.click();


    }
}
