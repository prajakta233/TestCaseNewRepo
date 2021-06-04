package QualityKiosksTraining.OrangeHRMTestCases;

public class WithoutFramework_LoginTestcase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		ChrommeDriver D=new ChromeDriver();
		D.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement UserName=D.findelementById("txtUsername");
		UserName.sendKeys("Admin");
		
		WebElement Password=D.findElementByCssSelector("input[type='password']");
		Password.sendKeys("admin123");
		
		
		WebElement LoginButton=D.findElementByName("Submit");
		LoginButton.click();
		
		String URL=D.getCurrentURL();
		if(URL.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))
			System.out.println("Login functionality worked with Valid Credentials..PASSED");
		else
			System.out.println("Login functionality did not work with Valid Credentials..FAILED");
		
		
		*
		*	PROBLEMS:
		*		1.Hard coding of Driver path,Application URL,Element identification stratergy and locator
		*		2.Login is such a funtionality which is required in all the test cases so if we don't create
		*		reusable function then we will end up repeating the code at number of places.
		*	    3.Test case contains implementation of flow to excercise a business process like Login
		*		So if business process steps changes then test case will have an impact of that change
		*		4.Technical coding is involved to write simple test case
		*
		*/
	
		
	}

}
