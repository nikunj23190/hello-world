package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecondScenarioStepDefination {
	

@Given("^I am in Second scenario$")
public void i_am_in_Second_scenario() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("This is validation of second scenario");
}

@When("^I do nothing in steps (\\d+)$")
public void i_do_nothing_in_steps(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Step 1 is pass");
}

@Then("^I will get nothing in Step (\\d+)$")
public void i_will_get_nothing_in_Step(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Step 2 is also pass");
}


}
