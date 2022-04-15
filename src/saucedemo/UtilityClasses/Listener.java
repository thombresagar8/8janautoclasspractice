package saucedemo.UtilityClasses;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener 
{
	
public void onteststart(ITestResult result)
{
	System.out.println("Execusion start ");
	
}
public void ontestsuccess(ITestResult result)
{
	System.out.println("Test case is successfully passed");
}

public void ontestfailure(ITestResult result)
{
	System.out.println("test case is failed & hence taking screenshots ");
}


}
