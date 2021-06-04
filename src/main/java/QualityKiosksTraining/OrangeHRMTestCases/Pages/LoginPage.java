package QualityKiosksTraining.OrangeHRMTestCases.Pages;

import org.openqa.selenium.WebElement;

import QualityKiosksTraining.AutomationFrameworkAPI.WebTest;
import QualityKiosksTraining.AutomationFrameworkAPI.Utilities.JavaUtilities;

//LAYER 2:-PAGE OBJECTS
/*
 * Page Objects contains implementation of different BUISINESS PROCESSES.
 * Every page in our application supports multiple buisiness processes
 * In Page Object we create different classes for each page of our application
 * and buisiness processes supported by each page gets implemented as separate functions
 * in corresponding classes
 */
public class LoginPage 
{

	WebTest T;
	public LoginPage(String BrowserName)
	{
		T=new WebTest();
		JavaUtilities.ReadEnvVars();
		T.StartTest(BrowserName);
		T.CreateObjectRepository("LoginPage");
	}
	public void DoLogin(String UserName,String Password)
	{
		/*
		 * 1.Type UserName in UserName field
		 * 2.Type Password in Password field
		 * 3.Click on Login button
		 * WebElement UserName=D.findElementByid("txtUsername").sendKeys(UserName)
		 * 
		 * 
		 */
		
		//EnterText(UE,UserName);
		//EnterText(PE,Password);
		//ClickElement(Btn);
		//WebElement E=D.findElementByName("txtUsername");
		T.EnterText(T.ObjectRepo.get("UserNameField"),UserName);
		//WebElement E=D.findElementByCssSelector("input[type='password']");
		T.EnterText(T.ObjectRepo.get("PasswordField"),Password);
		//WebElement E=D.findElementByxpath("//input[@value='LOGIN']")
		T.ClickElement(T.ObjectRepo.get("LoginButton"));
	}
	
	public String GetLoginError()
	{
		WebElement ErrorElement=T.FindAndReturnElement("BY_ID", "spanMessage");
		String LoginError=T.GetElementText(ErrorElement);
		return LoginError;
	}

}
