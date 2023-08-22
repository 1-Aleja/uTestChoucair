package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.RegisterUtestPage;

import java.util.List;

public class RecordDataStepThree implements Task {

        private List<UtestData> data;

        public RecordDataStepThree(List<UtestData> data) {
                this.data = data;
        }

        public static RecordDataStepThree thepage(List<UtestData> data) {
                return Tasks.instrumented(RecordDataStepThree.class,data);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(
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
                        Click.on(RegisterUtestPage.BUTTON_LAST_STEP)
                );

        }
}
