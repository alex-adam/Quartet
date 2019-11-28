package testautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import org.junit.*;

public class TestQuartetLogin {

	WebDriver driver;
	QuartetLogin objLogin;
	//GuruLogin objLogin;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"/chrome/chromedriver");

		//TODO: check for other browser?
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.get("http://demo.guru99.com/V4/");
		driver.get("https://patient.quartethealth.com/login");
	}
	//
	//	    /**
	//	     * This test case will login into the Quartet patient portal
	//	     * Verify login page title
	//	     * Login to application
	//	     * Verify the home page using Dashboard message
	//	     */

	@Test
	public void test_login() {
		//Create Login Page object

		//objLogin = new GuruLogin(driver);
		objLogin = new QuartetLogin(driver);

		//Verify login page title
		//String loginPageTitle = objLogin.getLoginTitle();
		//Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

		//login to application
		//objLogin.login("mgr123", "mgr!23");
		//Assert valid email address
		
		objLogin.login("mgr123@gmail.com", "mgr!23");

		// go the next page
		//objHomePage = new Guru99HomePage(driver);

		//Verify home page
		Assert.assertTrue(objLogin.getErrorMessage().toLowerCase().contains("invalid username and/or password"));
	}

	@After
	public void cleanUp(){
		driver.close();
	}
}
