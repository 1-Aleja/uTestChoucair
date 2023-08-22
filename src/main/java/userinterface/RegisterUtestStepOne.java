package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUtestStepOne {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do select day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select year").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Where do go to next page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
