package cucumber_RUN;

import adactin.Adactin_Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.Resuable_Methods;

public class StepDefinations {
	
	Adactin_Elements ae = new Adactin_Elements();
	Resuable_Methods reuse = new Resuable_Methods();
	

@Given("I have in login page")
public void i_have_in_login_page() {
    reuse.visitAdactin();
}

@When("I Enter currect username and password")
public void i_enter_currect_username_and_password() {
    ae.Adactin_Credentials();
}

@And("I have clicked submit button")
public void i_have_clicked_submit_button() {
    System.out.println("submit Button");
}
@Then("I should login")
public void i_should_login() {
System.out.println("login successfull");
}
}
