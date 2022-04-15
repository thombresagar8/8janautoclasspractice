package Com.sauceDemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Com.sauceDemo.POMClass.Homepage;
import Com.sauceDemo.POMClass.Loginpage;

public class TC04addtocartsingleproduct {
	
 @AfterMethod
	WebDriver Driver; // intialized 
	
 public void setupmethod1() {

System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // 1) Browser open
		
		driver.manage().window().maximize();
		{
			System.out.println("1. Chrome browser is open");
		}
		
		driver.get("https://www.saucedemo.com");  // 2) Url open
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      System.out.println("Url i open");

         //input[@id='user-name']
      //login to page
      
      Loginpage lp = new Loginpage(driver);
      lp.sendUserName();
      System.out.println("username entered");
      
      lp.sendPassword();
      System.out.println("password enetered");
      
      lp.clickLoginButton();
      System.out.println("click on loginButton");

      

@Test

public void verifiyaddtocartsingleproduct()
{
	Homepage hp= new Homepage(driver);
	
			


public void clickmenubutton()
hp.cliclkmenubtton();
System.out.println(",menubuton is passed");
}


















       }
	 }
