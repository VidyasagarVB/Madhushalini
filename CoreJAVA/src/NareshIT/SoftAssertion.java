package NareshIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void Softasssert()
	{
		//SoftAssert:Even test case failed still it will proceed further 
		//Comparing the page titles Using softAssert
		//assertAll(); must be used right after the softAssert
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com");//Opening the browser
		
		driver.getTitle();//Getting the page title
		
		System.out.println(driver.getTitle());//Printing the page title
		
		//Initializing the soft Assert
		SoftAssert softAssert= new SoftAssert();
		
		//Comparing the Expected title with actual
		//===========================================
		//Actual Title="1234 Selenium Training in Bangalore"
		//Expected title="Selenium Training in Bangalore,Marathahalli,Software testing"
		
		softAssert.assertEquals(driver.getTitle(), "1234 Selenium Training in Bangalore");
		System.out.println("Test case passed");
		driver.close();
		softAssert.assertAll();
		
		
	}
    
}
