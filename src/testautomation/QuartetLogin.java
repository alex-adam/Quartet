package testautomation;

import org.openqa.selenium.By;
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
	 * Returns the Error Message on an invalid credentials
	 * @return errorMessage
	 */
    public String getInvalidCredentialsErrorMessage(){
    	return driver.findElement(By.xpath("//div[contains(@class, 'sc-eNQAEJ jObAxp')]")).getText();
    }

	/**
	 * Sets Username and Password and attempts to log in
	 * @param userName
	 * @param password
	 */
	public void login(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
		this.password.submit();
	}
}