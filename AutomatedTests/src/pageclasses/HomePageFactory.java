package pageclasses;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import utilities.WaitTypes;

public class HomePageFactory {
	WebDriver driver;
	
	@FindBy (css="a[data-qa-id='navbar.home']")
	WebElement Home;
	
	@FindBy (css="a[data-qa-id='navbar.smart_groups']")
	WebElement SmartGroup;
	
	@FindBy (css="a[data-qa-id='navbar.communications']")
	WebElement Communications;
	
	@FindBy (css="a[data-qa-id='navbar.programs']")
	WebElement Programs;
	
	@FindBy (css="a[data-qa-id='navbar.reporting']")
	WebElement Reporting;
	
	@FindBy (css="input[data-qa-id='navbar.fanSearch.field']")
	WebElement SearchFan;
	
	@FindBy (className="create-fan")
	WebElement AddAFan;
	
	@FindBy (css="a[data-qa-id='navbar.tasks']")
	WebElement MyTasks;
	
	@FindBy (css="div[data-qa-id='navbar.fanSearch.result.0']")
	WebElement FanList;
	
	@FindBy (css="input[data-qa-id='editFan.profile.form.firstName']")
	WebElement FanFirst;
	
	@FindBy (css="input[data-qa-id='editFan.profile.form.lastName']")
	WebElement FanLast;

	@FindBy (css="input[data-qa-id='editFan.profile.form.email.0.address']")
	WebElement FanEmail;
	
	@FindBy (css="button[data-qa-id='editFan.form.save']")
	WebElement SaveFan;
	
	@FindBy (css="li[data-qa-id='navbar.account']")
	WebElement MyAccount;
	
	@FindBy (css="a[data-qa-id='navbar.account.admin']")
	WebElement Admin;
	
	@FindBy (css="a[data-qa-id='navbar.account.support']")
	WebElement Support;
	
	@FindBy (css="a[data-qa-id='navbar.account.signout']")
	WebElement NavbarAccountSignout;	
	
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickHome() {
		Home.click();
	}
	
	public void clickSmartGroup() {
		SmartGroup.click();
	}

	public void clickCommunications() {
		Communications.click();
	}

	public void clickPrograms() {
		Programs.click();
	}
	
	public void clickReporting() {
		Reporting.click();
	}
	
	public void clickSearchFan() {
		SearchFan.click();
	}
	
	public void clickAddAFan() {
		AddAFan.click();
	}
	
	public void clickMyTasks() {
		MyTasks.click();
	}
	
	public void setSearchFan(String fan) {
		SearchFan.sendKeys(fan);
	}
	
	public void selectFan() {
		FanList.click();
	}
	
	public void setFanFirst(String first) {
		FanFirst.sendKeys(first);
	}
	
	public void setFanLast(String last) {
		FanLast.sendKeys(last);
	}
	
	public void setFanEmail(String email) {
		FanEmail.sendKeys(email);
	}
	
	public void SaveAFan() {
		SaveFan.click();
	}
	
	public void clickMyAccount() {
		MyAccount.click();
	}
	
	public void clickAdmin() {
		Admin.click();
	}
	
	public void clickSignout() {
	        NavbarAccountSignout.click();
	     }
}
