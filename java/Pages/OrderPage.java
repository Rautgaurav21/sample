package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase {
	@FindBy(xpath = "//span[text()='Orders']") private WebElement Orders;
	@FindBy(xpath = "//span[text()='GTT']") private WebElement GTT;
	@FindBy(xpath = "//button[text()='New GTT ']") private WebElement NewGTTBTN;
	@FindBy(xpath = "(//input[@icon='search'])[2]") private WebElement search;
	@FindBy(xpath = "//li[@class='search-result-item selected']") private WebElement MRF;
	@FindBy(xpath = "//button[text()='Create GTT ']") private WebElement CreateGTT;
	@FindBy(xpath = "//input[@label='Trigger price']") private WebElement TriggerPrice;
	@FindBy(xpath = "//input[@label='Qty.']") private WebElement QTY;
	@FindBy(xpath = "//input[@label='Price']") private WebElement Price;
	@FindBy(xpath = "(//button[@type='submit'])[1]") private WebElement Place;
	@FindBy(xpath = "//span[@class='icon icon-ellipsis']") private WebElement menu;
	
	public OrderPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public String Order()
	{
		  Orders.click();
		return null;
	}
	public String GTT()
	{
		GTT.click();
		return null;
	}
	public String CompleteOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		NewGTTBTN.click();
		Thread.sleep(1000);
		search.sendKeys(Utility.util.readExcel(0, 0));
		Thread.sleep(1000);
		MRF.click();
		Thread.sleep(1000);
		CreateGTT.click();
		Thread.sleep(1000);
		TriggerPrice .clear();
		Thread.sleep(1000);
		TriggerPrice.sendKeys(Utility.util.readExcel(1, 0));
		Thread.sleep(1000);
		QTY.clear();
		Thread.sleep(1000);
		QTY.sendKeys(Utility.util.readExcel(2, 0));
		Price.clear();
		Thread.sleep(1000);
		Price.sendKeys(Utility.util.readExcel(3, 0));
		Thread.sleep(1000);
		Place.click();
		Thread.sleep(2000);
		menu.click();
		Actions a= new Actions(driver);
		a.moveToElement(menu).click().build().perform();
		Thread.sleep(2000);
		
		return null;
	}
}
