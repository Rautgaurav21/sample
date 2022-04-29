package TestCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	public LoginPageTest() throws IOException {
		super();
		
	}
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		intalization();
		 login= new LoginPage();
	}
	@Test(enabled = true,invocationCount = 3) 
	public void validateGetTitleTest()
	{
	String expeted ="Kite - Zerodha's fast and elegant flagship trading platform";
	String actual = login.validateGetTitle();
	assertEquals(expeted, actual);
	Reporter.log("Title Of Page is = "+actual);
	}
	@Test
	public void KiteLogoTest()
	{
		boolean value =login.KiteLogo();
		assertEquals(value, true);
		Reporter.log("Kite Logo Is = "+value);
	}
	@Test
	public void ZerodhaLogoTest()
	{
		boolean value= login.zerodhaLogo();
		assertEquals(value,true);
		Reporter.log("Zerodha Logo Is = "+value);
	}
	@Test
	public void LoginTest() throws InterruptedException
	{
		login.Login();
		Reporter.log(" Login Is Successful ");
	}
	@AfterMethod
	public void exit(ITestResult it) throws IOException
	{
		if(ITestResult.SUCCESS==it.getStatus())
		{
		Utility.util.screenShot(driver,it.getName());
		}
		
		driver.close();
	}

}
