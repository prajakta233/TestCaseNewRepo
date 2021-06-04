package QualityKiosksTraining.OrangeHRMTestCases.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import QualityKiosksTraining.OrangeHRMTestCases.Pages.LoginPage;

//LAYER 1:-TESTCASE LAYER
public class ValidLoginCredentialsTestcase 
{
	LoginPage loginpage;
	@BeforeClass
	@Parameters({"Browser"})
	public void Init(String Br)
	{
		loginpage=new LoginPage(Br);
		
	}
	
	@Test(priority=1)
	public void TestLoginWithValidCredentials()
	{
		loginpage.DoLogin("Admin", "admin123");
	}
}
