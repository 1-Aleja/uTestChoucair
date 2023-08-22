package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUtestStepThree {
    public static final Target SELECT_OS = Target.the("where do we select Os").located(By.cssSelector("[placeholder='Select OS']"));

    public static final Target INPUT_OS = Target.the(("Where do select os")).located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static  final Target SELECT_VERSION =Target.the("where do select version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]"));

    public static final Target INPUT_VERSION = Target.the("where do write version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target SELECT_LANGUAGE = Target.the("where do select language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div")) ;

    public static final Target INPUT_LANGUAGE = Target.the("where do write language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target SELECT_MOBILE_DEVICE = Target.the("where do select mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div")) ;

    public static final Target INPUT_MOBILE_DEVICE = Target.the("where do write mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target SELECT_MODEL = Target.the("where do select model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));

    public static final Target INPUT_MODEL = Target.the("where do write model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]")) ;

    public static final Target SELECT_OPERATING_SYSTEM = Target.the("where do select operating system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));

    public static final Target INPUT_OPERATING_SYSTEM = Target.the("where do write operating system").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_LAST_STEP =Target.the("where do go to last step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
