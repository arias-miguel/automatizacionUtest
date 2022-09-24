package co.com.choucair.certification.proyecto.tasks;

import co.com.choucair.certification.proyecto.model.Data;
import co.com.choucair.certification.proyecto.userinterface.PageInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.proyecto.userinterface.PageInfo.*;

import java.util.List;

public class Fill implements Task {
    private List<Data> data;

    public Fill(List<Data> data) {
        this.data = data;
    }

    public static Fill thePage(List<Data> data) {
        return Tasks.instrumented(Fill.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrFirstName()).into(FIRST_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMounthOfBirth()).from(MOUNTH_OF_BIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDateOfBirth()).from(DATE_OF_BIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrYearOfBirth()).from(BIRTH_YEAR),
                Click.on(BUTTON_NEXT)
                );

    }
}
