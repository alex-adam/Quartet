package testautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class TestQuartetLogin {

	WebDriver driver;
	QuartetLogin objLogin;
	//GuruLogin objLogin;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"/chrome/chromedriver");

		//TODO: check for other browser?
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		objLogin.login("mgr123", "mgr!23");

		// go the next page
		//objHomePage = new Guru99HomePage(driver);

		//Verify home page
		Assert.assertTrue(false);
		//Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	}

	//		@AfterMethod
	//	    public void cleanUp(){
	//	        driver.close();
	//	    }
}
