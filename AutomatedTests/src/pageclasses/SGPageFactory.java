package pageclasses;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitTypes;

public class SGPageFactory {
	WebDriver driver;

	@FindBy (css="button[data-qa-id='sgList.addSG']")
	WebElement CreateSG;
	
	@FindBy (css="button[data-qa-id='sgList.table.addSG']")
	WebElement noSGcreateButton;

	@FindBy (css="select[data-qa-id='sgBuilder.category']")
	WebElement SGCategory;

	@FindBy (xpath="//*[@id='sgSetCategory']/option[2]")
	WebElement Category2;
	
	@FindBy (id="CHIP_ACCOUNT_REP_HYBRID")
	WebElement AcctRepToggle;
	
	@FindBy (xpath="//*[@data-qa-id='sgBuilder.segment.ACCOUNT_REP_HYBRID.rep.0.repName']/descendant-or-self::button[contains(@ng-click, 'toggle')]")
	WebElement Selection;
	
	@FindBy (xpath="//*[@id='account_rep_0']/span/div/div[2]/div[1]")
	WebElement AcctRep;
	
	@FindBy (css="li[data-qa-id='sgBuilder.segment.SMART_GROUP_INSTANCE_ID.toggle']")
	WebElement SGonSGs;
	
	@FindBy (id="smartGroupOfSmartGroups_elementId")
	WebElement SegmentOnSG;
	
	@FindBy (xpath="//*[@id='active-segmentation']/sg-dynamic-multiselect/div/div[2]/div[2]/div[1]/div/span/div/div[2]/div[1]")
	WebElement SelectSGseg;

	@FindBy (id="CHIP_AGE")
	WebElement SegmentAge;

	@FindBy (id="CHIP_GENDER")
	WebElement SegmentGender;

	@FindBy (id="GENDER_MALE")
	WebElement Male;

	@FindBy (id="CHIP_POSTAL_CODE")
	WebElement SegmentZipCode;

	@FindBy (id="POSTAL_CODE")
	WebElement ZipCode;

	@FindBy (id="CHIP_DISTRICT")
	WebElement SegmentStateProvince;

	@FindBy (id="district_elementId")
	WebElement StateDropDown;

	@FindBy (xpath = "//*[@id='active-segmentation']/sg-dynamic-multiselect/div/div[2]/div[2]/div[1]/div/span/div/div[2]/div[1]/div/label/span")
	WebElement FirstState;

	@FindBy (id="CHIP_VERIFIED_EMAIL")
	WebElement SegmentEmail;

	@FindBy (id="VERIFIED_EMAIL_VERIFIED")
	WebElement VerifiedEmail;

	@FindBy (id="CHIP_OWNER_NAME_TYPE")
	WebElement SegmentProfileType;

	@FindBy (id="OWNER_NAME_TYPE_BUSINESS")
	WebElement BusinessType;

	@FindBy (id="CHIP_CUSTOMER_TYPE")
	WebElement SegmentAcctType;

	@FindBy (id="accountType_elementId")
	WebElement AcctTypeDrop;

	@FindBy (xpath="//*[@id='active-segmentation']/sg-dynamic-multiselect/div/div[2]/div[2]/div[1]/div/span/div/div[2]/div[4]/div/label/span")
	WebElement AcctTypeSelect;

	@FindBy (id="CHIP_PROFILE_SOURCE_DATE_HYBRID")
	WebElement SegmentProfileSource;

	@FindBy (id="PROFILE_SOURCE_DATE_HYBRID_source_0")
    WebElement SourceSelection;

	@FindBy (css="option[label='Dimension']")
    WebElement Source3;

	@FindBy (id="CHIP_TAGS")
	WebElement SegmentTags;

	@FindBy (css="button[id='tags_elementId']")
    WebElement TagDrop;

	@FindBy (xpath="//*[@id='active-segmentation']/sg-dynamic-multiselect[2]/div/div[2]/div[2]/div[1]/div/span/div/div[2]/div[1]")
    WebElement Tag1;

   @FindBy (id="CHIP_TICKET_PURCHASE_PERIOD")
   WebElement SegPurchaseDate;

   @FindBy (id="TICKET_PURCHASE_PERIOD")
   WebElement SelectPurchasePeriod;

   @FindBy (xpath="//*[@id='TICKET_PURCHASE_PERIOD']/option[2]")
   WebElement PurchasePeriod;

   @FindBy (id="CHIP_SECTIONS_PURCHASED")
   WebElement SegSections;

   @FindBy (id="SECTIONS_PURCHASED_venue")
   WebElement SectionsDrop;

   @FindBy (xpath="//*[@id='SECTIONS_PURCHASED_venue']/option[2]")
   WebElement Sections;


	public SGPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCreateSG() {
		CreateSG.click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
    }
	
	public void clickAcctRepToggle() {
		AcctRepToggle.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
	}
	
	public void clickSelection() {
		Selection.click();
	}

	public void displayCount() {
		WebElement text = driver.findElement(By.xpath("//*[@id='ars_col_1_0']/div/p"));
		System.out.println("Acct Reps: " + text.getAttribute("innerText"));
	}
	public void clickSGCategory() {
		SGCategory.click();
	}
	
	public void selectCategory() {
		Category2.click();
	}
	
	public void clickSGonSGs () {
		SGonSGs.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
	}
	
	public void segmentSG () {
		SegmentOnSG.click();
	}
	
	public void clickSG () {
		SelectSGseg.click();
	}

	public void clickAge () {
		SegmentAge.click();
	}

	public void clickGender () {
		SegmentGender.click();
	}

	public void selectMale() {
		Male.click();
	}

	public void clickPostalCode() {
		SegmentZipCode.click();
	}

	public void inputPostalCode() {
		ZipCode.sendKeys("11111");
	}

	public void clickState() {
		SegmentStateProvince.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
	}

	public void clickStateDrop() {
		StateDropDown.click();
	}

	public void selectState() {
		FirstState.click();
	}

	 public void clickEmail() {
		SegmentEmail.click();
		 new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
	 }

	 public void setverifiedEmail() {
		VerifiedEmail.click();
	 }

	 public void selectProfileType() {
		SegmentProfileType.click();
	 }

	 public void setBusinessType() {
		BusinessType.click();
	 }

	 public void clickAcctType() {
		SegmentAcctType.click();
	 }

	 public void selectAcctTypeDrop() {
		AcctTypeDrop.click();
		 new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
	 }

	 public void setAcctType() {
		AcctTypeSelect.click();
	 }

	 public void clickSegmentProfileSource() {
         SegmentProfileSource.click();
         new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
     }

     public void setSourceSelection() {
	    SourceSelection.click();
     }

     public void setSource3() {
	    Source3.click();
     }

     public void clickSegmentTags() {
	    SegmentTags.click();
         new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));

     }

     public void clickTagDrop() {
         TagDrop.click();
     }

     public void setTag1() {
	    Tag1.click();
     }

     public void clickSegPurchaseDate() {
	    SegPurchaseDate.click();
         new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.className("panel-loader")));
     }

     public void clickSelectPurchasePeriod() {
	    SelectPurchasePeriod.click();
     }

     public void selectPurchasePeriod () {
	    PurchasePeriod.click();
     }

     public void clickSegSections() {
	    SegSections.click();
     }

     public void clickSectionsDrop() {
	    
     }




}
