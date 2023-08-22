package co.com.choucair.certification.proyectobase.stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.OpenUp;
import tasks.Register;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Maria wants to register on the Utest platform$")
    public void mariaWantsToRegisterOnTheUtestPlatform() {
        OnStage.theActorCalled("Maria").wasAbleTo(OpenUp.thePage(), Register.thePage());

    }
    @When("^she registers the data$")
    public void sheRegistersTheData() {

    }
    @Then("^she sew completes the record with the button complete setup$")
    public void sheSewCompletesTheRecordWithTheButtonCompleteSetup() {
    }

}
