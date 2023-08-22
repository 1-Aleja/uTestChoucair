package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUtestStepFinal {
    public static final Target INPUT_PASSWORD = Target.the("where do write password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do write confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_ONE = Target.the("where do click checkbox 1").located(By.name("newsletterOptIn"));
    public static final Target CHECKBOX_TWO = Target.the("where do click checkbox 2").located(By.name("termOfUse"));
    public static final Target CHECKBOX_THREE = Target.the("where do click checkbox 3").located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("where do we finish register").located(By.id("laddaBtn")) ;
}
