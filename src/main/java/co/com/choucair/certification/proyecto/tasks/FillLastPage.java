package co.com.choucair.certification.proyecto.tasks;

import co.com.choucair.certification.proyecto.model.Data;
import co.com.choucair.certification.proyecto.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import static co.com.choucair.certification.proyecto.userinterface.LastPage.*;

public class FillLastPage implements Task {

    private List<Data> data;

    public FillLastPage(List<Data> data) {
        this.data = data;
    }

    public static FillLastPage thePage(List<Data> data) {
        return Tasks.instrumented(FillLastPage.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(CHECKBOX_1),
                Click.on(CHECKBOX_2),
                Click.on(CHECKBOX_3),
                Click.on(BUTTON_END)
                );


    }
}
