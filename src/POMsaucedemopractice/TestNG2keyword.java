package POMsaucedemopractice;

import org.testng.annotations.Test;

public class TestNG2keyword {
@Test(invocationCount=1)
	public void method()
	{
		System.out.println("method1");
	}
@Test(dependsOnMethods= {"method4"})
	public void methoda()
	{
		System.out.println("method2");
		
	}@Test(invocationCount=5)
	public void methodb()
	{
		System.out.println("method3");
		
	}@Test(timeOut=2000)
	public void method4() throws InterruptedException
	{
		System.out.println("method4");
		Thread.sleep(5000);
	}
}
