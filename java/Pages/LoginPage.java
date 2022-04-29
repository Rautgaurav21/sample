package Pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath = "//input[@id='userid']") private WebElement Username;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Login;
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement KiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement ZerodhaLogo;
	@FindBy(xpath = "//input[@label='PIN']")private	WebElement Pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement Continue;
	
	public LoginPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public String validateGetTitle()
	{
		return driver.getTitle();
	}
	
	public boolean KiteLogo()
	{
		return KiteLogo.isDisplayed();
	}
	public boolean zerodhaLogo()
	{
		return ZerodhaLogo.isDisplayed();
	}
	public void Login() throws InterruptedException
	{
		Username.sendKeys(prop.getProperty("UserId"));
		Thread.sleep(1000);
		password.sendKeys(prop.getProperty("Password"));
		Thread.sleep(1000);
		Login.click();
		Thread.sleep(1000);
		Pin.sendKeys(prop.getProperty("Pin"));
		Thread.sleep(1000);
		Continue.click();
		Thread.sleep(2000);

	}
}
