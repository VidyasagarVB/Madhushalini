package NareshIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KRNlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new FirefoxDriver();
    driver.get("https://krninformatix.com/");
   driver.findElement(By.id("(//input[@id='number')[2]")).sendKeys("9481761696");
    driver.findElement(By.id("//*[@id=\"navbar-example\"]/ul/li[2]/a")).getText();
    driver.findElement(By.className("(//a[@class='page-scroll'])[1]")).click();
    driver.close();
    
	}

}
