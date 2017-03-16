package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Login {
	WebDriver driver;
	String baseUrl;
	WaitTypes wt;
	
	public Login (WebDriver driver) {
		this.driver = driver;
		baseUrl = "https://qa.fanthreesixty.com/";
	}
	
	public WebElement Login() {
		WebElement element = null;
		try {
			driver.get(baseUrl + "fanthreesixty/login");
			driver.findElement(By.id("userId")).sendKeys("dimension+skc@fanthreesixty.com");
			System.out.println("Input user id");
			driver.findElement(By.id("password")).sendKeys("FiberPrincess411");
			System.out.println("Input user password");
			driver.findElement(By.id("loginButton")).click();
			
			}
		catch(Exception e) {
			System.out.println("Login Failed");
			
		}
		return null;
		
	}

	

}
