package Com.sauceDemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.pomclass.Homepage;
import com.sauceDemo.pomclass.Loginpage;

public class TC02Logoutfunctionality {

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
	 System.out.println("Chrome driver is open");
		
		driver.get("https://www.saucedemo.com");
	System.out.println("url is open");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//actions on webelements
	 // loginpage
	Loginpage lp= new Loginpage(driver);
	
lp.sendUserName();
	System.out.println("username entered");
	lp.sendPassword();
	System.out.println("passward entered");
	 lp.clickLoginButton();
	 System.out.println("login the page");
	

	 // homeage object
	 Homepage hp = new Homepage(driver);
	 hp.clickMenuButton();
	 hp.clickOnLogOut();
	 
	 String expectedTitle="swag labs";
	 String actualTitle =driver.getTitle();
	
	if(expectedTitle.equals(actualTitle))
			{
	System.out.println("test pass-logout the functionality");	
			} 
	else
	{ System.out.println("test case failed");
				
			}
	
	
	
	
	
	
	
	
	
	
	}

}
