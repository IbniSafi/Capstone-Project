package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@And("User click on Orders section")
	public void userClickOnOrderSection() {
	click(factory.orderPage().orderButton);
	logger.info("User clicked on order button");

}
			 
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstOrder);
		logger.info("user clicked on first order");
	}
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("User cancelled the order");
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String wrongItem) {
	selectByVisibleText(factory.orderPage().reasonTocancel,wrongItem);
	logger.info("User select the reason to cancel the item");
	
	
	}
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().orderCancelled);
		logger.info("User clicked on Canel Order Button");
				
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancellationMessageShouldBeDisplayed(String messageDisplay) {
		waitTillPresence(factory.orderPage().CancelationMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().CancelationMessage));
		logger.info("Hi ! "+ messageDisplay);
		
	}
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemButton() {
		click(factory.orderPage().returnButton);
		logger.info("User clicked on Return button");
				
	}
	@And("User select the Return Reason {string}")
		public void userSelectTheReturnReason(String itemDamaged) {
		selectByVisibleText(factory.orderPage().reasonToReturn,itemDamaged);
		logger.info("User select the reason to cancel the item");
	}
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String fedex) {
		selectByVisibleText(factory.orderPage().dropOff,fedex);
		logger.info("User select FedEx for drop off");
		
	}
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	click(factory.orderPage().orderReturned);
	logger.info("User clicked on Order Return Button");
	
	}
	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayed() {
	waitTillPresence(factory.orderPage().returnMessage);
	Assert.assertTrue(isElementDisplayed(factory.orderPage().returnMessage));
	logger.info("Order Returned ! ");
	}
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("User clicked on Review Button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteReview(String headline,String reviewText) {
		sendText(factory.orderPage().reviewHeadline,headline);
		logger.info("User add the Headline");
		sendText(factory.orderPage().descriptionReview,reviewText);
		logger.info("User added review");
	}
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmitButton);
		logger.info("User clicked on review submit Button");
	}
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayed() {
		waitTillPresence(factory.orderPage().reviewMessage);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewMessage));
		logger.info("A message will display");
	}



}
	
	

