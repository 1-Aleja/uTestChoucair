package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUtestStepTwo {
    public static final Target INPUT_CITY = Target.the("where do we write city").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("where do we write postal code").located(By.id("zip")) ;
    public static final Target SELECT_COUNTRY = Target.the("where do we select Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY =Target.the("Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES = Target.the("where do go to next page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
