package co.com.choucair.certification.proyecto.tasks;

import co.com.choucair.certification.proyecto.model.Data;
import co.com.choucair.certification.proyecto.userinterface.PageDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;
import static co.com.choucair.certification.proyecto.userinterface.PageDevices.*;

public class FillDevices implements Task {
    private List<Data> data;

    public FillDevices(List<Data> data) {
        this.data = data;
    }

    public static FillDevices thePage(List<Data> data) {
        return Tasks.instrumented(FillDevices.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(C_DEVICE_MOVIL),
                Enter.theValue(data.get(0).getStrDevice()).into(DEVICE_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(C_MODEL),
                Enter.theValue(data.get(0).getStrModel()).into(DEVICE_MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(C_OPERATING_SYSTEM),
                Enter.theValue(data.get(0).getStrSystemOperating()).into(OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BTN_NEXT_LAST_STEP)
        );
    }
}
