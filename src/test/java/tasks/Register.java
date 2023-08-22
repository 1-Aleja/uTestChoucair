package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.RegisterUtestPage;

public class Register implements Task {
    public static Register thePage() {
        return Tasks.instrumented(Register.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUtestPage.REGISTER_BUTTON),

            Enter.theValue("Maria").into(RegisterUtestPage.INPUT_FIRST_NAME),
            Enter.theValue("Rodriguez").into(RegisterUtestPage.INPUT_LAST_NAME),
            Enter.theValue("malejarodri@gmail.com.co").into(RegisterUtestPage.INPUT_EMAIL),
            SelectFromOptions.byVisibleText("November").from(RegisterUtestPage.SELECT_MONTH),
            SelectFromOptions.byVisibleText("11").from(RegisterUtestPage.SELECT_DAY),
            SelectFromOptions.byVisibleText("2000").from(RegisterUtestPage.SELECT_YEAR),
            Click.on(RegisterUtestPage.NEXT_BUTTON),
            Click.on(RegisterUtestPage.INPUT_CITY),
            Enter.theValue("Pereira").into(RegisterUtestPage.INPUT_CITY),
            Hit.the(Keys.ARROW_DOWN).keyIn(RegisterUtestPage.INPUT_CITY),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_CITY),
            Enter.theValue("660001").into(RegisterUtestPage.INPUT_POSTAL_CODE),
            Click.on(RegisterUtestPage.SELECT_COUNTRY),
            Enter.theValue("Colombia").into(RegisterUtestPage.COUNTRY),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.COUNTRY),
            Click.on(RegisterUtestPage.NEXT_DEVICES),
            Click.on(RegisterUtestPage.SELECT_OS),
            Enter.theValue("Linux").into(RegisterUtestPage.INPUT_OS),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_OS),
            Click.on(RegisterUtestPage.SELECT_VERSION),
            Enter.theValue("Debian").into(RegisterUtestPage.INPUT_VERSION),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_VERSION),
            Click.on(RegisterUtestPage.SELECT_LANGUAGE),
            Enter.theValue("English").into(RegisterUtestPage.INPUT_LANGUAGE),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_LANGUAGE),
            Click.on(RegisterUtestPage.SELECT_MOBILE_DEVICE),
            Enter.theValue("Apple").into(RegisterUtestPage.INPUT_MOBILE_DEVICE),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_MOBILE_DEVICE),
            Click.on(RegisterUtestPage.SELECT_MODEL),
            Enter.theValue("iPhone").into(RegisterUtestPage.INPUT_MODEL),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_MODEL),
            Click.on(RegisterUtestPage.SELECT_OPERATING_SYSTEM),
            Enter.theValue("iOS 2.0").into(RegisterUtestPage.INPUT_OPERATING_SYSTEM),
            Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_OPERATING_SYSTEM),
            Click.on(RegisterUtestPage.BUTTON_LAST_STEP),
            Enter.theValue("123VerdeRojo*").into(RegisterUtestPage.INPUT_PASSWORD),
            Enter.theValue("123VerdeRojo*").into(RegisterUtestPage.INPUT_CONFIRM_PASSWORD),
            Click.on(RegisterUtestPage.CHECKBOX_ONE),
            Click.on(RegisterUtestPage.CHECKBOX_TWO),
            Click.on(RegisterUtestPage.CHECKBOX_THREE),
            Click.on(RegisterUtestPage.BUTTON_COMPLETE_SETUP)









        );
    }
}
