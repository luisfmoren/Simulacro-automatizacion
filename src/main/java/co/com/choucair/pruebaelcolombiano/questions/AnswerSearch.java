package co.com.choucair.pruebaelcolombiano.questions;

import co.com.choucair.pruebaelcolombiano.userinterface.RegisterPage;
import co.com.choucair.pruebaelcolombiano.userinterface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerSearch implements Question<Boolean> {

    private String question;

    public AnswerSearch(String question) {
        this.question = question;
    }

    public static AnswerSearch toThe(String question){
        return new AnswerSearch(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String text = Text.of(SearchPage.TEXT_CONFIRM_PAGE).viewedBy(actor).asString();

        if(question.equals(text)){
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }
}
