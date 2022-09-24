package co.com.choucair.certification.proyecto.tasks;

import co.com.choucair.certification.proyecto.userinterface.PageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    private PageUtest page;

    public static OpenPage thePage() {
        return Tasks.instrumented(OpenPage.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page),
                Click.on(PageUtest.JOIN));
        
    }
}
