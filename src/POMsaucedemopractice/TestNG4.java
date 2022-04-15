package POMsaucedemopractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG4 {

@Test
	public void verifiylogin()
	{// s1
		
		String expectedUrl ="https://www.saucedemo.com";
		String actualUrl = "https://www.saucedemo.com";
		Assert.assertEquals(actualUrl,expectedUrl,"Url are match");
	
	//s2
		String ExpectedTitle = "Swag labs";
	String actualTitle = "swag labs";  
	Assert.assertEquals(actualTitle, ExpectedTitle,"Title are not match");
       soft.assertAll();
	} 
@Test
	public void verifiyproduct()
	{
		String expectedproductTitle = "Bagpack";
		String actualproductTitle = "Bagpack";
		Assert.assertEquals(actualproductTitle,expectedproductTitle, "product are verifiy");
		soft.assertAll();
	}
	
	
	
	
}
