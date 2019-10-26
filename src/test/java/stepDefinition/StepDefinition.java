package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.FedexloginPage;

import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import Logistics.Base;

@RunWith(Cucumber.class)
public class StepDefinition extends Base{

    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
    	driver=baseNavigation();
		driver.get(prop.getProperty("URL3"));

    }

    
    @When("^user shall enter required details on sign up page$")
    public void user_shall_enter_required_details_on_sign_up_page() throws Throwable {
FedexloginPage FL=new FedexloginPage(driver);
		
		
		
	
    }
    
    	

    @Then("^user shall able to sign up sucessfully $")
    public void user_shall_able_to_sign_up_sucessfully() throws Throwable {
       
    }

    @And("^user shall able to sign into application with created username and password$")
    public void user_shall_able_to_sign_into_application_with_created_username_and_password() throws Throwable {
        throw new PendingException();
    }

}