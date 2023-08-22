package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.RegisterUtestPage;
import userinterface.RegisterUtestStepOne;
import java.util.List;

public class RecordData implements Task{
    private List<UtestData> data;

    public RecordData(List<UtestData> data) {
        this.data = data;
    }

    public static RecordData thePage(List<UtestData> data) {
        return Tasks.instrumented(RecordData.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrFirstName()).into(RegisterUtestStepOne.INPUT_FIRST_NAME),
                Enter.theValue(data.get(0).getStrlastName()).into(RegisterUtestStepOne.INPUT_LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(RegisterUtestStepOne.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonth()).from(RegisterUtestStepOne.SELECT_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDay()).from(RegisterUtestStepOne.SELECT_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getStrYear()).from(RegisterUtestStepOne.SELECT_YEAR),
                Click.on(RegisterUtestPage.NEXT_BUTTON)
        );
    }
}
