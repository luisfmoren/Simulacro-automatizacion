package co.com.choucair.pruebaautomatizacion.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class toolQaStepDefinition {

    @Before
    public void SetStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants to access the page$")
    public void thanLuisWantsToAccessThePage() {

    }


    @When("^he enters one information a textbox$")
    public void heEntersOneInformationATextbox() {

    }

    @Then("^he will wait one information text$")
    public void heWillWaitOneInformationText() {

    }
}
