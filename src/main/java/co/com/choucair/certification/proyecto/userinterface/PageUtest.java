package co.com.choucair.certification.proyecto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PageUtest extends PageObject {

    public static final Target JOIN = Target.the("sign in button")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
