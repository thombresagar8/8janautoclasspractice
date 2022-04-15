package POMsaucedemopractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG3assert {
	@Test
public void method1()
{
		// example hard assart
	String expectedUrl = "https://www.saucedemo.com";
	String actualUrl = "https://www.saucedemo.com";
	Assert.assertEquals(actualUrl,expectedUrl);


//tc 2
	 String expectedTitle = "swag labs";
String actualTitle = "swag labs";
Assert.assertEquals(actualTitle,expectedTitle);

  //3 
@Test
public void method2()
{
	String expecetedproductTitle= "Bagpack";
	String actualproductTitle = "Bagpack";
	Assert.assertEquals(actualTitle,expectedTitle);
}










}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
