package Tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageclasses.HomePageFactory;
import pageclasses.SGPageFactory;
import utilities.Login;
import utilities.Logout;



public class HomePageTests {
	private WebDriver driver;
	private String baseUrl;
	
	HomePageFactory HomePage;
	SGPageFactory SGPage;
	Login ln;
	Logout lo;
//	private boolean isProduction=false;
	
	
@BeforeMethod
	 public void beforeMethod() {
		  //need to point setProperty to chromedriver in /AutomatedTests/bin
// 		System.setProperty("webdriver.chrome.driver", "/Users/aperkins/Desktop/workspace/selenium/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://qa.fanthreesixty.com";
			
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		PropertyConfigurator.configure("log4j.properties");
		
		HomePage = new HomePageFactory(driver);
		ln = new Login(driver);
	 }
	
  @Test
  public void NavigateToFan() {
//	  if (isProduction) {
//		  return;
//	  }
	  	driver.get(baseUrl);
	  	ln.Login();
		HomePage.clickSearchFan();
		HomePage.setSearchFan("John Smith");
		HomePage.selectFan();
  }
  
  @Test
  public void NavigateToSG() {
	  driver.get(baseUrl);
      ln.Login();
	  HomePage.clickSmartGroup();
  }
  
  @Test
  public void NavigateToComm() {
	  driver.get(baseUrl);
	  ln.Login();
	  HomePage.clickCommunications();
  }
  
  @Test
  public void AddAFan() {
	  driver.get(baseUrl);
	  ln.Login();
	  HomePage.clickAddAFan();
	  HomePage.setFanFirst("Juan");
	  HomePage.setFanLast("Julio");
	  HomePage.setFanEmail("jj41@email.com");
	  HomePage.SaveAFan();
  }
  
 
  @Test
  public void MyAcctDrop() {
	  driver.get(baseUrl);
	  ln.Login();
	  HomePage.clickMyAccount();
	  HomePage.clickAdmin();
  }
  
 
  @AfterMethod
  public void afterMethod() {
	  lo.Logout();
	  driver.quit();
  }

}

