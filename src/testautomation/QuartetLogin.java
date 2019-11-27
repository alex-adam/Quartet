package testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuartetLogin {

	WebDriver driver;

	/**
	 * All WebElements are identified by @FindBy annotation
	 */
	@FindBy(name="email")
	WebElement userName;

	@FindBy(name="password")
	WebElement password;    

	@FindBy(className="barone")
	WebElement titleText;

	@FindBy(className="sc-cHGsZl sc-eLdqWK hYBEMu")
	WebElement login;

	public QuartetLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Sets the Username in the username textbox
	 */
	public void setUserName(String userName){
		this.userName.sendKeys(userName);     
	}

	/**
	 * Sets the password in the password textbox
	 */
	public void setPassword(String password){
		this.password.sendKeys(password);
	}

	/**
	 * Clicks the Login Button
	 */
	public void clickLogin(){
		login.click();
	}  

	/**
	 * Returns the Title of the WebPage
	 * @return titleText
	 */
	public String getLoginTitle(){
		return titleText.getText();
	}

	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param userName
	 * @param password
	 */
	public void login(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
		this.clickLogin();        
	}
}