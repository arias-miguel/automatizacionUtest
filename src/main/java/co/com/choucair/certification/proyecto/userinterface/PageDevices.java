package co.com.choucair.certification.proyecto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageDevices {
    public static final Target C_DEVICE_MOVIL = Target.the("container device")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target DEVICE_MOVIL = Target.the("device movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target C_MODEL = Target.the("container model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));
    public static final Target DEVICE_MODEL = Target.the("devices model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target C_OPERATING_SYSTEM = Target.the("container operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target OPERATING_SYSTEM = Target.the("operating system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target BTN_NEXT_LAST_STEP = Target.the("BUTTON NEXT LAST STEP")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
