package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
        PageFactory.initElements(getDriver(), this);
               
	}
	@FindBy(id="orderLink")
	public WebElement orderButton;
	@FindBy(xpath="//div/p[text()='Show Details']")
	public WebElement firstOrder;
		
	@FindBy(id="reasonInput")
	public WebElement reasonTocancel;
	
	@FindBy(xpath="//select/option[text()='Bought wrong item']")
	public WebElement wrongItem;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement orderCancelled;
	
	@FindBy(xpath="//div/*[text()='Your Order Has Been Cancelled']")
	public WebElement CancelationMessage;
     @FindBy(id="cancelBtn")
     public WebElement cancelOrder;
	@FindBy(id="returnBtn")
	public WebElement returnButton;
	@FindBy(id="reasonInput")
	public WebElement reasonToReturn;
	@FindBy(xpath="//option[text()='Item damaged']")
	public WebElement damageItem;
	@FindBy(id="dropOffInput")
	public WebElement dropOff;
	@FindBy(xpath="//option[text()='FedEx']")
	public WebElement fedex;
	@FindBy(id="orderSubmitBtn")
	public WebElement orderReturned;
	@FindBy(xpath="//div/*[text()='Return was successfull']")
	public WebElement returnMessage;
	
	@FindBy(id="reviewBtn")
	public WebElement reviewButton;
	@FindBy(id="headlineInput")
	public WebElement reviewHeadline;
	@FindBy(id="descriptionInput")
	public WebElement descriptionReview;
	@FindBy(id="reviewSubmitBtn")
	public WebElement reviewSubmitButton;
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewMessage;
	
}
