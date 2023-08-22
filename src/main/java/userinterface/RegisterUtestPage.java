package userinterface;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterUtestPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the( "button that shows us the form to register").located(By.cssSelector("a[href='/signup/personal']"));
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write email").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select month").located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do select day").located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select year").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Where do go to next page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("where do we write city").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("where do we write postal code").located(By.id("zip")) ;
    public static final Target SELECT_COUNTRY = Target.the("where do we select Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target COUNTRY =Target.the("Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SELECT_OS = Target.the("where do we select Os").located(By.cssSelector("[placeholder='Select OS']"));
    public static final Target NEXT_DEVICES = Target.the("where do go to next page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
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
    public static final Target INPUT_PASSWORD = Target.the("where do write password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do write confirm password").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_ONE = Target.the("where do click checkbox 1").located(By.name("newsletterOptIn"));
    public static final Target CHECKBOX_TWO = Target.the("where do click checkbox 2").located(By.name("termOfUse"));

    public static final Target CHECKBOX_THREE = Target.the("where do click checkbox 3").located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("where do we finish register").located(By.id("laddaBtn")) ;
}
