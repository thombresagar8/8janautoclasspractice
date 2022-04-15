package Com.sauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	// 1) WebDriver Declared
	 private WebDriver driver;

	// 2) Find Elements
	@FindBy(xpath="(//input [@class = 'input_error form_input'])[1]")
	private WebElement userName;
	
	//password
	@FindBy(xpath="(//input [@class = 'input_error form_input'])[2]")
	private WebElement password;
	
	//loginButton
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	// create constructor 
	public Loginpage (WebDriver driver)
	{
		//globle Local
		this.driver = driver;
		//selenium class --> initElemets
		 PageFactory.initElements(driver, this);

	}

	/// actions perform on elements
	public void sendUserName()
	{
	  userName.sendKeys("standard_user");
	}
	
	public void sendPassword()
	{
	  password.sendKeys("secret_sauce");
	}
	
	public void clickLoginButton()
	{
	   loginButton.click();

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	}
