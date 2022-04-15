package POMsaucedemopractice;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
public class TestNGassert2 {

	private Object soft;

	//SoftAssert Soft = new SoftAssert()
@Test
			public void verifiyLogin()
			{
				// example for soft assert
				
				String expectedUrl = "https://www.saucedemo.com";
				String actualUrl = "ABC";
			((Assertion) soft).assertEquals(actualUrl,expectedUrl,"Url are not match");
		
			
			String expectedTitle = "swag labs";
			String actualTitle = "swag labs";
			((Assertion) soft).assertEquals(actualTitle,expectedTitle, "both title are matched");
			
					((SoftAssert) soft).assertAll();
			
			
			
		}
@Test
public void verifiyproduct()
{
	String expectedproduct = "Bugpack";
	String actualproduct = "Bagpack";
	((Assertion) soft).assertEquals(actualproduct,expectedproduct, "product are same");
	((SoftAssert) soft).assertAll();
}
	
	
	
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
