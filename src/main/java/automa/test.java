package automa;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {

	
	@Given("user is in login page")
	public void user_is_in_login_page(){
	   System.out.println("user is in log page");
	}

	@When("user enters username and password")  
	public void user_enters_username_and_password() {
	    System.out.println("users enters username and password");
	}

	@And("clicks on login button") 
	public void clicks_on_login_button (){
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("login");
	}

	@Then("user is navigated to the home page") 
	public void user_is_navigated_to_the_home_page(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home");
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
