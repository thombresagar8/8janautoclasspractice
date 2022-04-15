package Com.sauceDemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.pomclass.Loginpage;

public class TC01Loginfuntionality {

	
	
	public static void main(String[]args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // 1) Browser open
		
		driver.manage().window().maximize();
		{
			System.out.println("1. browser is open");
		}
		
		driver.get("https://www.saucedemo.com");  // 2) Url open
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
{
	System.out.println("2. url is open");
}
//3 login page

   	Loginpage lp = new Loginpage(driver);
	lp.sendUserName();
	lp.sendPassword();
	lp.clickLoginButton();
	{
		System.out.println("3. home page is open");
	}
	String expectedHomepageurl = "https://www.saucedemo.com/inventory.html";
 
 String actualHomepageurl = driver.getCurrentUrl(); // Checking url 
 System.out.println("4. Checking login test case");
 if (expectedHomepageurl.equals(actualHomepageurl))
 {
	 System.out.println("5. test case is passed- we have login succesfully on saucedemo site");
 } else
 {
 System.out.println("6. test case failed");
	}
	}
}