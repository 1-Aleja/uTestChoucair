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
    @Given("^than Maria wants to learn automation at the academy Choucair$")
    public void thanMariawantsToLearnAutomationAtTheAcademyChoucair(){
        OnStage.theActorCalled("Maria").wasAbleTo(OpenUp.thePage(), Register.thePage());

    }
    @When("^she search for the course Recursos Automatixzacion Bancolombia on the choucair academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcasdemyPlattform(){

    }
    @Then("^she finds the course called resources Recursos Automatizacion Bancolombia$")
    public void sheFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(){
    }

}
