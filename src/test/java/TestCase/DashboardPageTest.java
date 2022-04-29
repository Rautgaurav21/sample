package TestCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashboardPageTest extends TestBase {
	public DashboardPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	DashboardPage dash;
	LoginPage login;
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		intalization();
		login=new LoginPage();
		login.Login();
		dash= new DashboardPage();
		dash.UserId.click();
	}
	@Test 
	public void varifyNicknameTest() throws InterruptedException
	{
		String expected ="Gaurav";
		String actual = dash.varifyNickname();
		assertEquals(actual, expected);
		Thread.sleep(1000);
		Reporter.log("Nick Name Is = "+actual);
	}
	@Test 
	public void varifyUserIdTest() throws InterruptedException
	{
		String expected = "LFK888";
		String actual = dash.varifyUserId();
		assertEquals(expected, actual);
		Thread.sleep(1000);
		Reporter.log("User Id Is ="+actual);
	}
	@Test 
	public void varifyUsername() throws InterruptedException
	{
		String expected ="Gaurav Prakash Raut";
		String actual= dash.varifyUsername();
		assertEquals(expected, actual);
		Thread.sleep(1000);
		Reporter.log("User Name Is ="+actual);
	}
	@Test
	public void varifyEmailId() throws InterruptedException
	{
		String expected ="rautgaurav1995.gr@gmail.com";
		String actual = dash.varifyEmailId();
		assertEquals(expected, actual);
		Thread.sleep(1000);
		Reporter.log("Email ID Is ="+actual);
		}
	@AfterMethod
	public void exit(ITestResult it) throws IOException
	{
		if(ITestResult.SUCCESS==it.getStatus())
		{
			Utility.util.screenShot(driver, it.getName());
		}
		driver.close();
	}
}
