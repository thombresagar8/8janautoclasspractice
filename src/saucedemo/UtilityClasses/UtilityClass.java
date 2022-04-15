package saucedemo.UtilityClasses;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
	public static void TakesScreenshot(WebDriver driver)
	{
	TakesScreenshot t = (TakesScreenshot) driver;
	
	File sourcefile = t.getScreenshotAs(OutputType.FILE);
	
    File destFile =  new File("D:\\automation notes\\Automation  part\\Utility date n time data\"
	         + "D:\\automation notes\\Automation  part\\Utility date n time data\\screenshots\");
FileHandler.copy(sourcefile, destFile);

	
	
	
	
	
	
	
	}

}
