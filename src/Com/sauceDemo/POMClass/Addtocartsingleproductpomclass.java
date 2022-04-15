package Com.sauceDemo.POMClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocartsingleproductpomclass {
	
//1) WebDriver declared
	private WebDriver driver;
	
	//2) find elements  menubutton, logout button
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement MenuButton;
	 
	@FindBy(xpath="//input[@id='password']")
	private WebElement logoutButton;
	
	//Tc-4, add to cart single product
	@FindBy(xpath= "//input[@id='login-button']")
	private WebElement Addtocartsingleproduct;
	
	// TC- 5 add to cart all product
	@FindBy(xpath="//button[text() = 'Add to cart']")
	private WebElement addtocartallproduct;
	//button[@id = 'add-to-cart-sauce-labs-backpack']
	// cerate constructor
	public void homepage(WebDriver driver)
	{
		this.driver = driver;
		 
		PageFactory.initElements(driver,this);
		

	}	//	actions on elements
public void clickmenuButton()
	{
		MenuButton.click();
	}
public void clicklogoutbutton()

{
	logoutButton.click();

}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
