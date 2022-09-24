package co.com.choucair.certification.proyecto.stepdefinitions;

import co.com.choucair.certification.proyecto.model.Data;
import co.com.choucair.certification.proyecto.questions.ToRespond;
import co.com.choucair.certification.proyecto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user wants to register in Utest$")
    public void userWantsToRegisterInUtest() throws Exception {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenPage.thePage());
    }

    @When("^The user enters the data required by the system$")
    public void theUserEntersTheDataRequiredByTheSystem(List<Data> data) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.thePage(data), FillAddress.thePage(data),
                FillDevices.thePage(data), FillLastPage.thePage(data)
                );

    }

    @Then("^Registration is completed when you see the complete setup button$")
    public void registrationIsCompletedWhenYouSeeTheCompleteSetupButton(List<Data> data) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ToRespond.to(data)));
    }
}
