package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

private POMFactory factory = new POMFactory();
        	
    @When("User click on Sign in option")
    public void userClickOnSignInOption() {
    	click(factory.signInPage().signButton);
    	
    }
    @And("User enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String email,String password)  {
    	    sendText(factory.signInPage().emailField,email);
			logger.info("User entered email : "+ email);
			
			sendText(factory.signInPage().passwordField, password);
			logger.info("User entered password: "+password);
			
    }
    @And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
      logger.info("user clicked on login button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountButton));
		logger.info("user logged in into account");
		slowDown();
	}
    @And("User click on Create New Account button")
    public void userClickOnCreateNeewAccountButton() {
    	click(factory.signInPage().createNewAccountButton);
    	logger.info("User clicked on New Account Button");
    	       }
    @And("User fill the signUp information with below data")
  	public void userFillTheSignUPInformationWithBelowData(DataTable data) {
		List<Map<String,String>> signUpData= data.asMaps(String.class,String.class);
		
		sendText(factory.signInPage().inputName,signUpData.get(0).get("name"));
		sendText(factory.signInPage().inputEmail,signUpData.get(0).get("email"));
		sendText(factory.signInPage().inputPassword,signUpData.get(0).get("password"));
		sendText(factory.signInPage().inputConfirmPass,signUpData.get(0).get("confirmPassword"));
		
		logger.info("User entered required informaiton into sign up form");
		
    }
    @And("User click on SignUp button")
    public void userClickOnSignUpButton() {
    	click(factory.signInPage().singUpButton);
    	logger.info("User clicked on Sign Up Button");
    	slowDown();
    }
    @Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		
		Assert.assertTrue(isElementDisplayed(factory.signInPage().userProfile));
		Assert.assertTrue(isElementDisplayed(factory.signInPage().userAccount));
		logger.info("User Created New Account was created");
		slowDown();
    }}