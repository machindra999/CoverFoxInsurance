 package coverFoxUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
		// TODO Auto-generated method stub
		public static void takeScreenshot(WebDriver driver,String TCID ) throws IOException
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String timeStamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
			File dest= new File("E:\\Screenshots\\sc"+TCID+timeStamp+".png");
			FileHandler.copy(src, dest);
		}
		
		
		public static void scrollIntoView(WebDriver driver, WebElement element)
		{		
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",element );
		}
		
		
		public static void implicitWait(WebDriver driver, int time)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		}
		
//		public static String readDataFromExcel (int row, int cell) throws EncryptedDocumentException, IOException,FileNotFoundException
//		{
//			FileInputStream myFile= new FileInputStream("D:\\Screenshots\\TestingSheet.xlsx");
//			Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
//			String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
//			return value;
//			
//			
//		}
		
		public static String readDataFromExcel(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
		{
			FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestingSheetPractice.xlsx");
			Sheet mySheet=WorkbookFactory.create(myFile).getSheet(sheetName);
			String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
			return value;
		}
		
		public static String readDataFromPropertiesFile(String data) throws IOException
		{
			Properties prop = new Properties();
			FileInputStream myFile= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\CoverFox.properties");
			prop.load(myFile);
			String value=prop.getProperty(data);
			return value;
		}

	

}
