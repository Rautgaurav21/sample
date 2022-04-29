package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public Properties prop;
	
	public TestBase() throws IOException
	{
		prop = new Properties();
		FileInputStream file= new FileInputStream("D:\\eclips22-03\\Domain\\Config1\\Config.properties");
		prop.load(file);
	}
	public static WebDriver driver;
	public void intalization()
	{
		String browerName = prop.getProperty("browser");
		if(browerName.equals("chrome"))
		{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		else if(browerName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		
	}

}
