package POMsaucedemopractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	@AfterMethod
	public void Teardownmethod()
	{
		System.out.println("3) Logout functionality");
		
	}
@Test
	public void verifiyloginfunctionality()
	{
		System.out.println("2 LOgin functionality");
	}
@BeforeMethod

public void Setupmethod()
{
	System.out.println("1 browser is open");
}





}
