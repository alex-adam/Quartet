package testautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import org.junit.*;

public class TestQuartetLogin {

	WebDriver driver;
	QuartetLogin objLogin;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"/chrome/chromedriver");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://patient.quartethealth.com/login");
	}

	/**
	 * This test case will login into the Quartet patient portal
	 * Login to portal
	 * Verify that the error message is displayed on incorrect credentials
	 */
	@Test
	public void test_login() {
		objLogin = new QuartetLogin(driver);
		objLogin.login("mgr123@gmail.com", "mgr!23");
		Assert.assertTrue(objLogin.getErrorMessage().toLowerCase().contains("invalid username and/or password"));
	}

	@After
	public void cleanUp(){
		driver.close();
	}
}
