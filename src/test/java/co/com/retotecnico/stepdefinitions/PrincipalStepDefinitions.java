package co.com.retotecnico.stepdefinitions;

import static co.com.retotecnico.utils.Constantes.URL;

import co.com.retotecnico.questions.Is;
import co.com.retotecnico.tasks.OpenThe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.is;

public class PrincipalStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the (.+) enters banistmo$")
    public void thatTheActorEntersBanistmo(String user){
        OnStage.theActorCalled(user).attemptsTo(Open.url(URL));
    }

    @When("^he enters the tariff menu and open the PDF$")
    public void heEntersTheTariffMenuAndOpenThePDF(){
        OnStage.theActorInTheSpotlight().attemptsTo(OpenThe.pdf());
    }

    @Then("^he should see the pdf open in another tab with the rates$")
    public void heShouldSeeThePdfOpenInAnotherTabWithTheRates(){
        OnStage.theActorInTheSpotlight().should(seeThat(Is.open(), is(false)));
    }
}
