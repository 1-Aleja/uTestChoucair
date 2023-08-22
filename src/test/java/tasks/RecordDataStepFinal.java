package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.RegisterUtestPage;

import java.util.List;

public class RecordDataStepFinal implements Task {
    private List<UtestData> data;

    public RecordDataStepFinal(List<UtestData> data) {
        this.data = data;
    }

    public static RecordDataStepFinal thepage(List<UtestData> data) {
        return Tasks.instrumented(RecordDataStepFinal.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("123VerdeRojo*").into(RegisterUtestPage.INPUT_PASSWORD),
                Enter.theValue("123VerdeRojo*").into(RegisterUtestPage.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterUtestPage.CHECKBOX_ONE),
                Click.on(RegisterUtestPage.CHECKBOX_TWO),
                Click.on(RegisterUtestPage.CHECKBOX_THREE),
                Click.on(RegisterUtestPage.BUTTON_COMPLETE_SETUP)
        );
    }
}
