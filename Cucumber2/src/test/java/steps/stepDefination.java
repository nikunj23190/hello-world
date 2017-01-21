package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {
	
	

@Given("^the user is on login page of facebook$")
public void the_user_is_on_login_page_of_facebook() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("First Step pass");
}

@When("^the user choose to login$")
public void the_user_choose_to_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Second Step pass");
}

@When("^he provides user id as$")
public void he_provides_user_id_as() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Third Step pass");
}

@When("^he provides password$")
public void he_provides_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Forth Step pass");
}

@When("^he click on submit button$")
public void he_click_on_submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Fifth Step pass");
}

@Then("^Successfully login$")
public void successfully_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Sixth Step pass");
}


// This is second scenario






}
