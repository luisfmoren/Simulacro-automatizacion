package co.com.choucair.pruebaelcolombiano.stepdefinitions;

import co.com.choucair.pruebaelcolombiano.model.ElColombianoData;
import co.com.choucair.pruebaelcolombiano.questions.AnswerSearch;
import co.com.choucair.pruebaelcolombiano.tasks.OpenUp;
import co.com.choucair.pruebaelcolombiano.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SearchElColombianoStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants search news about sports$")
    public void thanLuisWantsSearchNewsAboutSports() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());

    }


    @When("^he enter the information about sports$")
    public void heEnterTheInformationAboutSports(List<ElColombianoData> elColombianoData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(elColombianoData.get(0).getStrSearch()));

    }

    @Then("^he will find information about sports$")
    public void heWillFindInformationAboutSports(List<ElColombianoData> elColombianoData) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerSearch.toThe(elColombianoData.get(0).getStrText())));

    }
}
