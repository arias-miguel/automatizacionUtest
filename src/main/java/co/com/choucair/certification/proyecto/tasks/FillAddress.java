package co.com.choucair.certification.proyecto.tasks;

import co.com.choucair.certification.proyecto.model.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.proyecto.userinterface.AddressPage.*;

public class FillAddress implements Task {
    private List<Data> data;

    public FillAddress(List<Data> data) {
        this.data = data;
    }

    public static FillAddress thePage(List<Data> data) {
        return Tasks.instrumented(FillAddress.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrPostCode()).into(POST_C),
                Click.on(C_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BTN_NEXT_DEVICES));

    }
}
