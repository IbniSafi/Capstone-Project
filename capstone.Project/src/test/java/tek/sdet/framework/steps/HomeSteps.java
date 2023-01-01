package tek.sdet.framework.steps;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

    private POMFactory factory = new POMFactory();
    
    @Given("User is on retail website")
	public void userIsOnRetailWebsite() throws InterruptedException {
	String expectedTitle = "React App";	
	String actualTitle = getTitle();
	Assert.assertEquals(expectedTitle,actualTitle);
logger.info(actualTitle+ " is equal to "+ expectedTitle);

    }
    
    @When("User click on All section")
    public void userClickOnAllSection() {
       click(factory.homePage().allSection);
     logger.info("User clicked on All Section");
    }
    @Then("below options are present in Shop by Department sidebar")
    public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable)  {
    	List<List<String>> shopByDepartment = dataTable.asLists(String.class);

    	for (int i = 0; i < shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(
					getDriver().findElement(By.xpath("//span[text()='" + shopByDepartment.get(0).get(i) + "']"))));
			logger.info(shopByDepartment.get(0).get(i) + " is present");
		}
     
        }
    
    @When("User on {string}")
    public void userOnDepartments(String department) {
    
    	// First Method
    	
//   	getDriver().findElement((By.xpath("//span[text()='" + department + "']"))).click();

	
	// Second Method the for loop
	
   	List<WebElement> dept = factory.homePage().sideBar;
    	for(WebElement element : dept) {
    		if(element.getText().equals(department)) {
    			element.click();
    			break;
    		}
    	}
    	
// Third Method to find the departments
    	
//    	if(department.equals("Electronics")) {
//			getDriver().findElement((By.xpath("//span[text()='Electronics']"))).click();
//		}else if(department.equals("Computers")) {
//			getDriver().findElement((By.xpath("//span[text()='Computers']"))).click();
//		}else if(department.equals("Smart Home")) {
//			getDriver().findElement((By.xpath("//span[text()='Smart Home']"))).click();
//		}else if(department.equals("Sports")) {
//			getDriver().findElement((By.xpath("//span[text()='Sports']"))).click();
//		}else 
//			getDriver().findElement((By.xpath("//span[text()='Automative']"))).click();
    	
//    	logger.info(department+" was selected from All Section!");
    	}
    	
   @Then("below options are present in department")
      public void belowOptionsArePresentInDepartment(DataTable dataTable){
	
	List<List<String>> departmentOptions = dataTable.asLists(String.class);
	
	List<WebElement> dept = factory.homePage().sideBar;
	for(int i=0; i<departmentOptions.get(0).size();i++) {
		
		for(WebElement element: dept) {
			if(element.getText().equals(departmentOptions.get(0).get(i))){
				Assert.assertTrue(element.isDisplayed());
			logger.info(element.getText() + " is present ");	
			}
		}
		
	}
	
//Assert.assertTrue(getDriver().findElement(By.xpath("//span[text()='"+departmentOptions.get(0).get(0)+"']")).isDisplayed());
//Assert.assertTrue(getDriver().findElement(By.xpath("//span[text()='"+departmentOptions.get(0).get(1)+"']")).isDisplayed());
 }
    @And("User change the category to {string}")
	public void userChangeTheCategory(String value) {
    	selectByVisibleText(factory.homePage().allDepartments,value);
		logger.info(value+" was selected from the drop down");
	}
	@And("User search for an item {string}")
	public void userSearchForAnItem(String value) {
sendText(factory.homePage().searchInputField,value);
		logger.info("User entered "+value);
			}
@And("User click on Search icon")
public void userClickOnSearchIcon() {
click(factory.homePage().searchButton);	
logger.info("user clicked on search button");
	}
	
	@And("User click on item")
	public void userClickOnItem() {
			waitTillPresence(factory.homePage().itemName);
			click(factory.homePage().itemName);
			logger.info("User clicked on >>" + factory.homePage().itemName);
			}
		    
@And("User select quantity {string}")
public void userSelectQuanity(String Quantity) {
	selectByVisibleText(factory.homePage().selectQTY,Quantity);
	logger.info("User select the Quantity"+ Quantity);
}

@When("User click add to Cart button")
public void userclickAddToCartButton() {
	click(factory.homePage().addToCartButton);
	logger.info("user clicked add to cart button");

}
		@Then("the cart icon quantity should change to {string}")
		public void theCartIconQuantityShouldChange(String expectedValue)  {
		Assert.assertEquals(expectedValue,factory.homePage().cartQuantity.getText());
		logger.info("Quantity changed to"+expectedValue);
		
		}
		@And("User click on Cart option")
		public void userClickOnCartOption() {
		click(factory.homePage().cartButton);
		logger.info("User clicked on cart button");
		}
		@And("User click on Proceed to Checkout button")
		public void userClickOnProceedToCheckoutButton() {
		 click(factory.homePage().checkoutButton);
		 logger.info("User clicked on Proceed to checkout Button");
		}
		@And("User click Add a new address link for shipping address")
		public void userClickAddANewAddressLinkForShippingAddress() {
		    click(factory.homePage().addShippingAdd);
			logger.info("User clicked on add shipping address button");
			}
		@And("User fill new address form with below information")
		public void userFillNewAddressFormWithBelowInformation(DataTable dataTable2) throws InterruptedException {
			List<Map<String,String>> Address= dataTable2.asMaps(String.class,String.class);
			selectByVisibleText(factory.homePage().countryAdd,Address.get(0).get("country")); 
			sendText(factory.homePage().fullName,Address.get(0).get("fullName"));
			sendText(factory.homePage().phoneNum,Address.get(0).get("phoneNumber"));
			sendText(factory.homePage().streetAdd,Address.get(0).get("streetAddress"));
			sendText(factory.homePage().apartmentNum,Address.get(0).get("apt"));
			sendText(factory.homePage().cityName,Address.get(0).get("city"));
			selectByVisibleText(factory.homePage().stateAdd,Address.get(0).get("state"));
			sendText(factory.homePage().zipCode,Address.get(0).get("zipCode"));
			logger.info("User entered personal informaiton");
			Thread.sleep(1500);
		}
		@And("User click Add Your Address button")
		public void userClickAddYourAddress() {
		click(factory.homePage().addressButton);
		logger.info("User clicked add Address button");
		}
		
		@And("User click Add a credit card or Debit Card for Payment method")
		public void userClickAddACreditCardDebitCardForPaymentMethod() {
		 click(factory.homePage().addCard);
		 logger.info("User clicked on Add Card link");
		}
		@And ("User fill Debit or credit card information")
		public void userFillDebitCreditCardInformation(DataTable cardInfo) {
		List<Map<String,String>> cardInformation= cardInfo.asMaps(String.class,String.class);
		sendText(factory.homePage().cardNumber,cardInformation.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCard,cardInformation.get(0).get("nameOnCard"));
		selectByVisibleText(factory.homePage().expirationMonth,cardInformation.get(0).get("expirationMonth"));
		selectByVisibleText(factory.homePage().expirationYear,cardInformation.get(0).get("expirationYear"));
		sendText(factory.homePage().securityPin,cardInformation.get(0).get("securityCode"));
		logger.info("User entered card information");
		}
		@And("User click on Add your card button")
		public void userClickOnAddYourCard(){
		click(factory.homePage().submitCard);
	    logger.info("User click on add card button");
		}
		@And("User click on Place Your Order")
		public void userClickOnPlaceYourOrder() {
		 click(factory.homePage().placeOrderButton);
		 logger.info("User clicked on place order button");
		}
	
		@Then ("a message should be displayed Order Placed, Thanks")
		public void thenAMessageShouldBeDisplayed() throws InterruptedException {
			waitTillPresence(factory.homePage().orderPlacedMessage);
			Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMessage));
			logger.info("Message displaye "+ factory.homePage().orderPlacedMessage);
			Thread.sleep(6000);
		}
		
    }
    
    
    
