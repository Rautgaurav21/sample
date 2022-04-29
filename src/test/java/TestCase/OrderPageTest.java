package TestCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.OrderPage;

public class OrderPageTest extends TestBase{
	public OrderPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPage login;
	DashboardPage dash;
	OrderPage order;
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		intalization();
		login = new LoginPage();
		dash= new DashboardPage();
		order = new OrderPage();
		login.Login();
		order.Order();
		order.GTT();
	}
	@Test
	public void completeOrderTest() throws EncryptedDocumentException, InterruptedException, IOException
	{
	String value =order.CompleteOrder();
	Reporter.log("Order Completeted "+value);
		
	}
	@AfterMethod
	public void exit(ITestResult it) throws IOException
	{
		if(ITestResult.SUCCESS==it.getStatus())
		{
			Utility.util.screenShot(driver, it.getName());
			driver.close();
		}
	}

}
