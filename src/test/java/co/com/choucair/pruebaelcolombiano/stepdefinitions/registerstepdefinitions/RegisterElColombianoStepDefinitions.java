package co.com.choucair.pruebaelcolombiano.stepdefinitions;

import co.com.choucair.pruebaelcolombiano.model.ElColombianoData;
import co.com.choucair.pruebaelcolombiano.questions.Answer;
import co.com.choucair.pruebaelcolombiano.tasks.OpenUp;
import co.com.choucair.pruebaelcolombiano.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterElColombianoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants register in the page$")
    public void thanLuisWantsRegisterInThePage() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());

    }


    @When("^he enter your information$")
    public void heEnterYourInformation(List<ElColombianoData> elColombianoData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.the(elColombianoData.get(0).getStrName(),
                elColombianoData.get(0).getStrLastName(),elColombianoData.get(0).getStrEmail(),
                elColombianoData.get(0).getStrPassword()));

    }

    @Then("^he will have a user in the page$")
    public void heWillHaveAUserInThePage(List<ElColombianoData> elColombianoData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(elColombianoData.get(0).getStrText())));

    }
}
