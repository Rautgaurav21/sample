package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class util {

	public static String readExcel(int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D://eclips22-03/Domain/TestData/UtilTestData.xlsx");
		org.apache.poi.ss.usermodel.Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
	public static void screenShot(WebDriver driver, String name) throws IOException {
		File sourch = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\eclips22-03\\Domain\\ScreenShot\\ "+ name +".jpeg");
		org.openqa.selenium.io.FileHandler.copy(sourch, dest);
	
	}
}
