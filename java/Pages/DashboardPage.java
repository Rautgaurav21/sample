package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(xpath = "//span[@class='nickname']") private WebElement Nickname;
	@FindBy(xpath = "//span[@class='user-id']")public WebElement UserId;
	@FindBy(xpath = "//h4[@class='username']")private WebElement Username;
	@FindBy(xpath = "//div[@class='email']") private  WebElement EmailId;
	
	
	public DashboardPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public String varifyNickname()
	{
		return Nickname.getText();
	}
	public String varifyUserId()
	{
		return UserId.getText();
	}
	public String varifyUsername()
	{
		return Username.getText();
	}
	public String varifyEmailId()
	{
		return EmailId.getText();
	}
}
