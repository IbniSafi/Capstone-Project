package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	
	 public RetailSignInPage() {
	PageFactory.initElements(getDriver(), this);
	  
	}
	 
	 @FindBy(id="signinLink")
	   public WebElement signButton;
	 
	    @FindBy(id="email")
	    public WebElement emailField;
	    
	    @FindBy(id="password")
	    public WebElement passwordField;
	    
	    @FindBy(id="loginBtn")
	    public WebElement loginButton;
	    
	    @FindBy(xpath="//a[@id='accountLink']")
		public WebElement accountButton;
	    
	    @FindBy(id="newAccountBtn")
	    public WebElement createNewAccountButton;
	    
	    @FindBy(id="nameInput")
	    public WebElement inputName;
	    
	    @FindBy(id="emailInput")
	   public WebElement inputEmail;

	    @FindBy(id="passwordInput")
	    public WebElement inputPassword;
	    
	    @FindBy(id="confirmPasswordInput")
	    public WebElement inputConfirmPass;
	    
	    @FindBy(id="signupBtn")
	    public WebElement singUpButton;
	    
	    @FindBy(id="profileImage")
	    public WebElement userProfile;
	    
	    @FindBy(id="accountLink")
	    public WebElement userAccount;
}

