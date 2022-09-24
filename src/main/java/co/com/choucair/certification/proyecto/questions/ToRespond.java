package co.com.choucair.certification.proyecto.questions;

import co.com.choucair.certification.proyecto.model.Data;
import co.com.choucair.certification.proyecto.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ToRespond implements Question<Boolean> {
    private List<Data> data;

    public ToRespond(List<Data> data) {
        this.data = data;
    }

    public static ToRespond to(List<Data> data) {
        return new ToRespond(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Last_Button = Text.of(LastPage.BUTTON_END).viewedBy(actor).asString();
        return data.get(0).getStrLastText().equals(Last_Button);
    }
}
