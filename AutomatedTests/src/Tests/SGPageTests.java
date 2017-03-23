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
 		System.setProperty("webdriver.chrome.driver", "/Users/aperkins/QAAutoTests/AutomatedTests/bin/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://dev.fanthreesixty.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		PropertyConfigurator.configure("log4j.properties");
		HomePage = new HomePageFactory(driver);
		SGPage = new SGPageFactory(driver);
		ln = new Login(driver);

	 }

	 @Test
	  public void AcctRepSG() {
		  driver.get(baseUrl);
		  ln.Login();
		  HomePage.clickSmartGroup();
		  SGPage.clickCreateSG();
		  SGPage.clickAcctRepToggle();
		  SGPage.clickSelection();
		  SGPage.displayCount();
	  }

	@Test
	 public void SGonSG() {
		 driver.get(baseUrl);
		  ln.Login();
		  HomePage.clickSmartGroup();
		  SGPage.clickCreateSG();
		  SGPage.clickSGonSGs();
		  SGPage.segmentSG();
		  SGPage.clickSG();
	 }

	 @Test
	 public void SGCategory() {
		 driver.get(baseUrl);
		 ln.Login();
		 HomePage.clickSmartGroup();
		 SGPage.clickCreateSG();
		 SGPage.clickSGCategory();
		 SGPage.selectCategory();
	 }

	@Test
	public void SGAge() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickAge();
	}

	@Test
	public void SGGender() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickGender();
		SGPage.selectMale();
	}

	@Test
	public void SGPostalCode() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickPostalCode();
		SGPage.inputPostalCode();
	}

	@Test
	public void SGState() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickState();
		SGPage.clickStateDrop();
		SGPage.selectState();
	}

	@Test
	public void SGEmail() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickEmail();
		SGPage.setverifiedEmail();
	}

	@Test
	public void SGProfileType() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.selectProfileType();
		SGPage.setBusinessType();
	}

	@Test
	public void SGAcctType() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickAcctType();
		SGPage.selectAcctTypeDrop();
		SGPage.setAcctType();
	}

	@Test
	public void SGSourceType() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickSegmentProfileSource();
		SGPage.setSourceSelection();
		SGPage.setSource3();
	}

//	This one has issues....flaky - needs work
	@Test
	public void SGTags() throws Exception {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickSegmentTags();
		SGPage.clickTagDrop();
//		SGPage.setTag1();
		Thread.sleep(3000);
	}

	@Test
	public void SGPurchaseDate() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();
		SGPage.clickSegPurchaseDate();
		SGPage.clickSelectPurchasePeriod();
		SGPage.selectPurchasePeriod();
	}

	@Test
	public void SGSections() {
		driver.get(baseUrl);
		ln.Login();
		HomePage.clickSmartGroup();
		SGPage.clickCreateSG();

	}


	
	 @AfterMethod
	  public void afterMethod() {
		 HomePage.clickMyAccount();
		 HomePage.clickSignout();
		 driver.quit();
	  }

	}
