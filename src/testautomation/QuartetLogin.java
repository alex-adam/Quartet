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

	@FindBy(className="sc-cHGsZl sc-eLdqWK hYBEMu")
	WebElement login;
	
	@FindBy(className="sc-eNQAEJ jObAxp")
	WebElement invalidUser;

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
		System.out.print(login);
		login.click();
	}  
	
	/**
	 * Returns the Error Message on an invalid input
	 * @return errorMessage
	 */
    public String getErrorMessage(){
    	return driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/div/form/div/div[2]/div[2]/div")).getText();
    }

	/**
	 * This POM method will be exposed in test case to login in the application
	 * @param userName
	 * @param password
	 */
	public void login(String userName, String password) {
		this.setUserName(userName);
		this.setPassword(password);
		this.password.submit();
	}
}