package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Logout {
	WebDriver driver;
	String baseUrl;
	WaitTypes wt;
	
	public Logout (WebDriver driver) {
		this.driver = driver;
		baseUrl = "https://qa.fanthreesixty.com/";
	}
	
	public WebElement Logout() {
		WebElement element = null;
		try {
			WebElement mainElement = driver.findElement(By.className("i-chevron"));
			
			Actions action = new Actions(driver);
			action.moveToElement(mainElement).perform();
			Thread.sleep(2000);
			
			WebElement subElement = driver.findElement(By.xpath("//div[@id='navbar']//a[text()='Sign Out']"));
			action.moveToElement(subElement).click().perform();
			
			}
		catch(Exception e) {
			System.out.println("Logout Failed");
			
		}
		return null;
		
	}

	

}
