package master.objectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import master.generic.WebdriverUtility;


public class Home {
	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Exam']")
	private WebElement ExamLnk;
	
	@FindBy(xpath = "//a[text()='Create Exam']")
	private WebElement creatLnk;
	
	@FindBy(xpath = "//a[@class='confirm-delete btn btn-danger btn-xs']")
	private WebElement deleteLnk;
	
	@FindBy(id = "btnYes")
	private WebElement btnYesLnk;
	

	@FindBy(xpath = "//span[text()='Student']")
	private WebElement student;
	
	@FindBy(xpath = "//img[@class='user-image']")
	private WebElement imageLnk;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement singoutLnk;
	
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getExamLnk() {
		return ExamLnk;
	}

	public WebElement getCreatLnk() {
		return creatLnk;
	}
	
	public WebElement getdeleteLnk() {
		return deleteLnk;
	}
		public WebElement getbtnYesLnk() {
		return btnYesLnk;
		}
		
		public WebElement getstudent() {
		return student;	
		}
		
		
	

	public WebElement getImage() {
		return imageLnk;
	}

	public WebElement getSingoutLnk() {
		return singoutLnk;
	}
	
	

public void logout() {
	 Actions act = new Actions(driver);
	 WebdriverUtility wLib=new WebdriverUtility();
	 wLib.waitForElement(driver, imageLnk);
	 act.moveToElement(imageLnk).click().perform();
	 singoutLnk.click();
	}
	

}
