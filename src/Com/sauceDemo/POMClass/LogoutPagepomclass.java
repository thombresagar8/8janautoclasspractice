package Com.sauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogoutPagepomclass {
	//webdriver declared as private
	
   private WebDriver driver;
   private Actions act;
	private Select s;
	

   
   //find elements logoutbutton 
   
   
   @FindBy(xpath="(//button[@id='react-burger-menu-btn'])")
   private WebElement MenuButton;
   
   @FindBy(xpath="(//a[@id='logout_sidebar_link'])")
   private WebElement logoutButton;
   
   // constructor
   
   public LogoutPagepomclass(WebDriver driver)
   
   {
	   this.driver = driver;
	   PageFactory.initElements(driver,this);
   }
   //actions on elements
   
   public void clickMenuButton()
   {
	   //click on menubutton
	   MenuButton.click();
   
   
   //mouse actions on action class
  // act.click(MenuButton).perform();
   
   // TC03  click on logoutButton  
   }
   public void logoutButton()
   {
	   logoutButton.click();
   }
   
   
   
   
   }
   
   
   

