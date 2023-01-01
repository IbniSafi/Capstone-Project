package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountButton));
		click(factory.accountPage().accountButton);
		logger.info("User clicked on Account Button");
	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) throws InterruptedException {
		clearTextUsingSendKeys(factory.accountPage().nameField);
		sendText(factory.accountPage().nameField, name);
		clearTextUsingSendKeys(factory.accountPage().phoneNumber);
		sendText(factory.accountPage().phoneNumber, phone);
		logger.info("User update name and phone fields");
		}
	@And("User click on Update button")
	public void userClickOnUpdateButton() throws InterruptedException {
		click(factory.accountPage().updateButton);
		logger.info("User clicked update Button");
		}
	@Then("user profile information should be updated")
		public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationUpdatedMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationUpdatedMessage));
		logger.info("User profile information is update");
	}
	@And("User enter below information")
	   public void userEnterBelowInformation(DataTable Pass) throws InterruptedException {
		List<Map<String, String>> updatePassword = Pass.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPass, updatePassword.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPass, updatePassword.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPass, updatePassword.get(0).get("confirmPassword"));
		logger.info("User entered new Password");
		Thread.sleep(1500);
	}
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() 
	{
		click(factory.accountPage().changePass);
		logger.info("User clicked on changePassword");
		}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully(String expectedMessage) {
		if (expectedMessage.contains("Password")){
		waitTillPresence(factory.accountPage().passwordUpdatedSuccessfullyMessage);
		Assert.assertEquals(expectedMessage,factory.accountPage().passwordUpdatedSuccessfullyMessage.getText());
		logger.info(expectedMessage+"is displayed");
	}
		else if (expectedMessage.contains("Payment")){
		waitTillPresence(factory.accountPage().PaymentMethodAddedSuccessfully);
		Assert.assertEquals(expectedMessage,factory.accountPage().PaymentMethodAddedSuccessfully.getText());
		logger.info(expectedMessage+"is displayed");
	}
	}
	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	click(factory.accountPage().paymentMethod);
	logger.info("User clicked on Add Payment Method");
	}

	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editCard);
		click(factory.accountPage().editButton);
		logger.info("User clicked on edit Button");
	}

	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable editCard) throws InterruptedException {
		List<Map<String, String>> editCardInformation = editCard.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumber);
		sendText(factory.accountPage().editCardNumber, editCardInformation.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().cardUserName);
		sendText(factory.accountPage().editNameOnCard, editCardInformation.get(0).get("nameOnCard"));
		clearTextUsingSendKeys(factory.accountPage().expirationDate);
		selectByVisibleText(factory.accountPage().editExpMonth, editCardInformation.get(0).get("expirationMonth"));
		clearTextUsingSendKeys(factory.accountPage().expirationYear);
		selectByVisibleText(factory.accountPage().editExpYear, editCardInformation.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityPin);
		sendText(factory.accountPage().editSecurityCode, editCardInformation.get(0).get("securityCode"));
		logger.info("User edited card information");
		Thread.sleep(1500);
	}

	@And("user click on Update Your Card button")
	public void userClickonUpdateYourCardButton() throws InterruptedException {
		click(factory.accountPage().updatYourCardButton);
		logger.info("User clicked on Update Your Card Button");
		slowDown();
	}

	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().editCard);
		click(factory.accountPage().removeCard);
		logger.info("Card Removed");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() throws InterruptedException {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethod));
		Thread.sleep(1500);
	}
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() throws InterruptedException {
		click(factory.accountPage().addAddress);
		logger.info("User clicked on Address Option");
		Thread.sleep(1500);
	}
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable Add) throws InterruptedException {
		slowDown();
		List<Map<String, String>> addressForm = Add.asMaps(String.class, String.class);
		selectByVisibleText(factory.accountPage().selectCountry,addressForm.get(0).get("country"));
		sendText(factory.accountPage().fullName, addressForm.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNum, addressForm.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetAddress, addressForm.get(0).get("streetAddress"));
		sendText(factory.accountPage().apartmentNumber, addressForm.get(0).get("apt"));
		sendText(factory.accountPage().CityName, addressForm.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateName,addressForm.get(0).get("state"));
		sendText(factory.accountPage().zip, addressForm.get(0).get("zipCode"));
		logger.info("User entered address information");
		Thread.sleep(1500);
	}


	@Then("a message should be displayed ‘Address Added Successfully'")
	public void aMessageShouldBeDisplayedAddressAdded() throws InterruptedException {
		System.out.println("Address Added Successfully");
		}
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressButton);
		logger.info("User clicked on address Edit option");
	}

	@And("And user fill new address form with below information")
	public void andUserfillNewAddressFormWithBelowInformation(DataTable newAdd) {
		List<Map<String, String>> editAddressInfo = newAdd.asMaps(String.class, String.class);
    	selectByVisibleText(factory.accountPage().selectCountry,editAddressInfo.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullName);
		sendText(factory.accountPage().fullName, editAddressInfo.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNum);
		sendText(factory.accountPage().phoneNum, editAddressInfo.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetAddress);
		sendText(factory.accountPage().streetAddress, editAddressInfo.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentNumber);
		sendText(factory.accountPage().apartmentNumber, editAddressInfo.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().CityName);
		sendText(factory.accountPage().CityName, editAddressInfo.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateName,editAddressInfo.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zip);
		sendText(factory.accountPage().zip, editAddressInfo.get(0).get("zipCode"));
		logger.info("User updated address information");
	}

	@And("User click update Your Address button")
	public void userClickUpdateYourAddressButton() throws InterruptedException {
		click(factory.accountPage().updateaddButton);
		logger.info("User clicked upate address button");
		Thread.sleep(1500);
	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdated() {
		System.out.println("Address Updated Successfully");
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAdd);
		logger.info("User clicked on address remove button");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() throws InterruptedException {
	waitTillPresence(factory.accountPage().removeAdd);
	logger.info("Address removed");
	
	Thread.sleep(1500);
	}

}
