package Tests;

import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageclasses.HomePageFactory;
import pageclasses.SGPageFactory;
import utilities.Login;



public class SGPageTests {
		private WebDriver driver;
		private String baseUrl;
		HomePageFactory HomePage;
		SGPageFactory SGPage;
		Login ln;
//		private boolean isProduction=false;

	@BeforeMethod
	 public void beforeMethod() {
 		System.setProperty("webdriver.chrome.driver", "AutomatedTests/bin/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://qa.fanthreesixty.com";
			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		PropertyConfigurator.configure("log4j.properties");
		
		HomePage = new HomePageFactory(driver);
		SGPage = new SGPageFactory(driver);
		ln = new Login(driver);

	 }

	 @Test
	  public void AcctRepSG() throws InterruptedException {
		  driver.get(baseUrl);
		  ln.Login();
		  Thread.sleep(8000);
		  HomePage.clickSmartGroup();
		  SGPage.clickCreateSG();
		  SGPage.clickAcctRepToggle();
		  SGPage.clickSelection();
		  Thread.sleep(5000);
		  SGPage.displayCount();
	  }

	@Test
	 public void SGonSG() throws InterruptedException {
		 driver.get(baseUrl);
		  ln.Login();
		  HomePage.clickSmartGroup();
		  SGPage.clickCreateSG();
		  SGPage.clickSGonSGs();
		  SGPage.segmentSG();
		  Thread.sleep(3000);
		  SGPage.clickSG();
	 }

	 @Test
	 public void SGCategory() throws InterruptedException {
		 driver.get(baseUrl);
		 ln.Login();
		 HomePage.clickSmartGroup();
		 SGPage.clickCreateSG();
		 SGPage.clickSGCategory();
		 SGPage.selectCategory();
		 Thread.sleep(3000);
	 }

	@Test
	public void SGAge() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickAge();
	}
	
	 @AfterMethod
	  public void afterMethod() {
		 driver.quit();
	  }

	}
