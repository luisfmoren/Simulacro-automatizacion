package co.com.choucair.pruebaelcolombiano.tasks;

import co.com.choucair.pruebaelcolombiano.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    private String name;
    private String lastName;
    private String email;
    private String password;

    public Register(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public static Performable the(String name, String lastName, String email, String password){
        return Tasks.instrumented(Register.class,name,lastName,email,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BUTTON_REGISTER),
                Enter.theValue(name).into(RegisterPage.INPUT_NAME),
                Enter.theValue(lastName).into(RegisterPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(RegisterPage.INPUT_EMAIL),
                Enter.theValue(password).into(RegisterPage.INPUT_PASSWORD),
                Enter.theValue(password).into(RegisterPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterPage.CHECK_HEANDLINES),
                Click.on(RegisterPage.CHECK_THIRD_PARTIES));

    }
}
