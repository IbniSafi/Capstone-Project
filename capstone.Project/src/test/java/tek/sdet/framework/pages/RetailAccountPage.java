package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);

	}

@FindBy(id ="accountLink")
public WebElement accountButton;
	
@FindBy(xpath = "//input[@id='nameInput']")
public WebElement nameField;
	
@FindBy(id = "personalPhoneInput")
public WebElement phoneNumber;
	
@FindBy(id="personalUpdateBtn")
public WebElement updateButton;

@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
public WebElement personalInformationUpdatedMessage;

@FindBy(id="previousPasswordInput")
public WebElement previousPass;

@FindBy(id="newPasswordInput")
public WebElement newPass;

@FindBy(id="confirmPasswordInput")
public WebElement confirmPass;

@FindBy(xpath="//div[text()='Password Updated Successfully']")
public WebElement passChangeMsg;

@FindBy(id="credentialsSubmitBtn")
public WebElement changePass;

@FindBy(xpath="//div[text()='Password Updated Successfully']")
public WebElement passwordUpdatedSuccessfullyMessage;

@FindBy(xpath="//*[text()='Add a payment method']")
public WebElement paymentMethod;

@FindBy(id="cardNumberInput")
public WebElement cardNumber;

@FindBy(id="nameOnCardInput")
public WebElement cardUserName;

@FindBy(id="expirationMonthInput")
public WebElement expirationDate;

@FindBy(id="expirationYearInput")
public WebElement expirationYear;

@FindBy(id="securityCodeInput")
public WebElement securityPin;

@FindBy(id="paymentSubmitBtn")
public WebElement paymentButton;

@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
public WebElement PaymentMethodAddedSuccessfully;

@FindBy(xpath="//img[@alt='Master Card']")
public WebElement editCard;

@FindBy(xpath="//button[text()='Edit']")
public WebElement editButton;

@FindBy(id="cardNumberInput")
public WebElement editCardNumber;

@FindBy(id="nameOnCardInput")
public WebElement editNameOnCard;

@FindBy(id="expirationMonthInput")
public WebElement editExpMonth;

@FindBy(id="expirationYearInput")
public WebElement editExpYear;

@FindBy(id="securityCodeInput")
public WebElement editSecurityCode;

@FindBy(id="paymentSubmitBtn")
public WebElement updatYourCardButton;

@FindBy(xpath="//button[text()='remove']")
public WebElement removeCard;

@FindBy(xpath="//div[@class='account__address-new-wrapper']")
public WebElement addAddress;

@FindBy(xpath=("//Select[@id='countryDropdown']"))
public WebElement selectCountry;

@FindBy(xpath="//input[@id='fullNameInput']")
public WebElement fullName;

@FindBy(id="phoneNumberInput")
public WebElement phoneNum;

@FindBy(id="streetInput")
public WebElement streetAddress;
@FindBy(id="apartmentInput")
public WebElement apartmentNumber;
@FindBy(id="cityInput")
public WebElement CityName;
@FindBy(xpath=("//select[@name='state']"))
public WebElement stateName;
@FindBy(id="zipCodeInput")
public WebElement zip;
@FindBy(id="addressBtn")
public WebElement addressButton;
@FindBy(xpath="//button[text()='Edit']")
public WebElement editAddressButton;
@FindBy(xpath="//button[@id='addressBtn']")
public WebElement updateaddButton;

@FindBy(xpath="//button[text()='Remove']")
public WebElement removeAdd;

}
