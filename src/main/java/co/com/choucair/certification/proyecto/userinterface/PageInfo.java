package co.com.choucair.certification.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageInfo {

    public static final Target FIRST_NAME = Target.the("first name")
            .located(By.xpath("firstName"));
    public static final Target LAST_NAME = Target.the("last name")
            .located(By.xpath("lastName"));
    public static final Target EMAIL = Target.the("email")
            .located(By.xpath("email"));
    public static final Target DATE_OF_BIRTH = Target.the("date of birth")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target MOUNTH_OF_BIRTH = Target.the("date of birth")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target BIRTH_YEAR = Target.the("birth year")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]"));
    public static final Target BUTTON_NEXT = Target.the("BUTTON FOR NEXT LOCATION")
            .located(By.xpath("//a[class='btn btn-blue']"));

}
