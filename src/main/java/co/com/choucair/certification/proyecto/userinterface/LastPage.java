package co.com.choucair.certification.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {
    public static final Target PASSWORD = Target.the("user password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("user confirm password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_1 = Target.the("checkbox 01")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_2 = Target.the("checkbox 02")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_3 = Target.the("checkbox 03")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_END = Target.the("the last click button for the end")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));


}
