package tasks;


import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.RegisterUtestPage;
import userinterface.RegisterUtestStepOne;

import java.util.List;

public class RecorDataStepTwo implements Task {
    private List<UtestData> data;

    public RecorDataStepTwo(List<UtestData> data) {
        this.data = data;
    }

    public static RecorDataStepTwo thepage(List<UtestData> data) {
        return Tasks.instrumented(RecorDataStepTwo.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterUtestPage.INPUT_CITY),
                Enter.theValue(data.get(0).getStrCity()).into(RegisterUtestPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(RegisterUtestPage.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.INPUT_CITY),
                Enter.theValue(data.get(0).getStrPostalCode()).into(RegisterUtestPage.INPUT_POSTAL_CODE),
                Click.on(RegisterUtestPage.SELECT_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(RegisterUtestPage.COUNTRY),
                Hit.the(Keys.ENTER).keyIn(RegisterUtestPage.COUNTRY),
                Click.on(RegisterUtestPage.NEXT_DEVICES)
        );
    }
}
