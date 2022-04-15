package Com.sauceDemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.pomclass.Loginpage;

public class TC03AddToCartbutton 
{
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
	WebElement addtocartButton = driver.findElement(By.xpath("(//button [@id= 'add-to-cart-sauce-labs-backpack']"));
	addtocartButton.click(); 
	System.out.println("4. addtocartbutton is click - all 6 product is sellect");

	
	System.out.println("end of program");
	
	

	WebElement AddtocartButton = driver.findElement(By.xpath("(//button [@class= 'btn btn_primary btn_small btn_inventory']"));
	AddtocartButton.click(); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

} 

