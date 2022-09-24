package co.com.choucair.certification.proyecto.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {
    public static final Target CITY = Target.the("city")
            .located(By.id("city"));
    public static final Target POST_C = Target.the("postal code")
            .located(By.id("zip"));
    public static final Target C_COUNTRY = Target.the("container country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY = Target.the("country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BTN_NEXT_DEVICES = Target.the("next devices button")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
