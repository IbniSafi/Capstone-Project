package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
    
    public RetailHomePage() {
        PageFactory.initElements(getDriver(), this);
  
}
    
    @FindBy(id="contentHeader")
	public WebElement shopByDepartment;
    	
    @FindBy(id="hamburgerBtn")
    public  WebElement allSection;
    
    @FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBar;

    @FindBy(id="submenuBtn")
    public WebElement subMenuButton;
    
    @FindBy(xpath="//span[text()='Electronics']")
    public WebElement electronics;
    
    @FindBy(xpath="//span[text()='Computers']")
    public WebElement computers;
    
    @FindBy(xpath="//span[text()='Smart Home']")
    public WebElement smartHome;
    
    @FindBy(xpath="//span[text()='Sports']")
    public WebElement sports;
    
    @FindBy(xpath="//span[text()='Automative']")
    public WebElement automotive;
        
    @FindBy(xpath="//span[text()='TV & Video']")
    public WebElement tvAndVideo;
    
    @FindBy(xpath="//span[text()='Video Games']")
    public WebElement videoGames;
    
    @FindBy(xpath="//span[text()='Accessories']")
    public WebElement accessories;
    
    @FindBy(xpath="//span[text()='Networking']")
    public WebElement netWorking;
    
    @FindBy(xpath="//span[text()='Smart Home Lightning']")
    public WebElement smartHomeLightning;
    
    @FindBy(xpath="//span[text()='Plugs and Outlets']")
    public WebElement plugAndOutlets;
    
    @FindBy(xpath="//span[text()='Athletic Clothing']")
    public WebElement athleticClothing;
    @FindBy(xpath="//span[text()='Exercise & Fitness']")
    public WebElement exerciseAndFitness;
    
    @FindBy(xpath="//span[text()='Automative Parts & Accessories']")
    public WebElement AutomativePartsAndAccessories;
    @FindBy(xpath="//span[text()='MotorCycle & Powersports']")
    public WebElement MotorCycleAndPowersports;
       
    @FindBy(xpath="//select/*[text()='All departments']")
    public WebElement all;
    
    @FindBy(xpath="//select[@id='search']")
    public WebElement allDepartments;
  
	@FindBy(id="searchInput")
	public WebElement searchInputField;
	
	@FindBy(id ="searchBtn")
	public WebElement searchButton;
	
	@FindBy(xpath="//div/p[@class='products__name']")
	public WebElement itemName;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement selectQTY;
		
	@FindBy(id="addToCartBtn")
	public WebElement addToCartButton;
	
	@FindBy(xpath="//span[@id='cartQuantity']")
	public WebElement cartCurrentNum;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	@FindBy(id="cartBtn")
	public WebElement cartButton;
	@FindBy(id="proceedBtn")
	public WebElement checkoutButton;
	@FindBy(id="addAddressBtn")
	public WebElement addShippingAdd;
	@FindBy(xpath="//select[@name='country']")
	public WebElement countryAdd;
	@FindBy(id="fullNameInput")
	public WebElement fullName;
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNum;
	@FindBy(id="streetInput")
	public WebElement streetAdd;
	@FindBy(id="apartmentInput")
	public WebElement apartmentNum;
	@FindBy(id="cityInput")
	public WebElement cityName;
	@FindBy(xpath="//select[@name='state']")
	public WebElement stateAdd;
	@FindBy(id="zipCodeInput")
	public WebElement zipCode;
	@FindBy(id="addressBtn")
	public WebElement addressButton;
	@FindBy(id="addPaymentBtn")
	public WebElement addCard;
@FindBy(id="cardNumberInput")
		public WebElement cardNumber;
@FindBy(id="nameOnCardInput")
public WebElement nameOnCard;
@FindBy(id="expirationMonthInput")
public WebElement expirationMonth;
@FindBy(id="expirationYearInput")
public WebElement expirationYear;
@FindBy(id="securityCodeInput")
public WebElement securityPin;
@FindBy(id="paymentSubmitBtn")
public WebElement submitCard;
@FindBy(xpath="//div/button[text()='Place Your Order']")
public WebElement placeOrderButton;
@FindBy(xpath="//div/*[text()='Order Placed, Thanks']")
public WebElement orderPlacedMessage;
@FindBy(id="addToCartBtn")
public WebElement addtoCart;

	    }
