package co.com.choucair.pruebaelcolombiano.tasks;

import co.com.choucair.pruebaelcolombiano.userinterface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.model.TakeScreenshots;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Search implements Task {

    private String search;

    public Search(String search) {
        this.search = search;
    }

    public static Performable the(String search) {
        return Tasks.instrumented(Search. class,search);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(search).into(SearchPage.INPUT_SEARCH),
                Click.on(SearchPage.BUTTON_SEARCH),
                WaitUntil.the(SearchPage.CHECK_IMAGES, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SearchPage.CHECK_IMAGES),
                WaitUntil.the(SearchPage.CHECK_SPORTS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SearchPage.CHECK_SPORTS),
                Click.on(SearchPage.NEWS));

    }
}
