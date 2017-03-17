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



public class HomePageTests {
	private WebDriver driver;
	private String baseUrl;
	
	HomePageFactory HomePage;
	SGPageFactory SGPage;
	Login ln;
//	private boolean isProduction=false;
	
	
@BeforeMethod
	 public void beforeMethod() {
 		System.setProperty("webdriver.chrome.driver", "AutomatedTests/bin/chromedriver");
		driver = new ChromeDriver();
		baseUrl = "https://dev.fanthreesixty.com";
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
        HomePage.clickMyAccount();
        HomePage.clickSignout();
  }
  
  @Test
  public void NavigateToSG() {
	  driver.get(baseUrl);
      ln.Login();
	  HomePage.clickSmartGroup();
      HomePage.clickMyAccount();
      HomePage.clickSignout();
  }
  
  @Test
  public void NavigateToComm() {
	  driver.get(baseUrl);
	  ln.Login();
	  HomePage.clickCommunications();
      HomePage.clickMyAccount();
      HomePage.clickSignout();
  }

  @Test
  public void NavigatetoPrograms () {
    driver.get(baseUrl);
    ln.Login();
    HomePage.clickPrograms();
    HomePage.clickMyAccount();
    HomePage.clickSignout();
  }

  @Test
  public void NavigatetoReporting () {
    driver.get(baseUrl);
    ln.Login();
    HomePage.clickReporting();
    HomePage.clickMyAccount();
    HomePage.clickSignout();
  }

  @Test
  public void NavigatetoMyTasks () {
    driver.get(baseUrl);
    ln.Login();
    HomePage.clickMyTasks();
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
      HomePage.clickMyAccount();
      HomePage.clickSignout();
  }
  
 
  @Test
  public void MyAcctDrop() {
	  driver.get(baseUrl);
	  ln.Login();
	  HomePage.clickMyAccount();
	  HomePage.clickAdmin();
      HomePage.clickSignout();
  }
  
 
  @AfterMethod
  public void afterMethod() {
          driver.quit();
      }

}


