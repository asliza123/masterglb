package master.objectRepositery;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import master.generic.WebdriverUtility;


public class vaddstudent extends WebdriverUtility{
	WebDriver driver;
	public vaddstudent(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=' Add Student']")
	private WebElement addstudent;
	
	@FindBy(id = "index_number")
	private WebElement indexxnumber;
	
	@FindBy(id = "full_name")
	private WebElement fullname;
	
	@FindBy(id = "i_name")
    private WebElement iname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "phone")
	private WebElement phone;
	
	@FindBy(id = "b_date")
	private WebElement bdate;
	
	@FindBy(id="gender")
	private WebElement gndDrpDwnBtn;
	
	
	@FindBy(xpath = "//input[@id='fileToUpload']")
	private WebElement fileupload;
	
	@FindBy(name = "g_full_name")
	private WebElement gfullname;
	
	@FindBy(name = "g_i_name")
	private WebElement gifullname;
	
	@FindBy(name = "g_address")
	private WebElement gaddress;
	
	@FindBy(name = "g_email")
	private WebElement gmail;
	
	@FindBy(name = "g_phone")
	private WebElement gphome;
	
	@FindBy(name = "g_b_date")
	private WebElement gbdate;
	
	@FindBy(id = "g_gender")
			private WebElement ggenderDwnBtn;
	
	@FindBy(xpath = "//input[@id='g_fileToUpload']")
	private WebElement gfileupload;
	
	@FindBy(xpath = "//button[@id='btnSubmit']")
	private WebElement btnsubmit;
	
	@FindBy(id = "grade")
	private WebElement gradedwnBtn;
	
	@FindBy(xpath = "//table[@class='table ']/tbody/tr/td[text()='Subject 2']/parent::tr/td/input[@id='checkbox']")
	private WebElement checkbox1;
	
	@FindBy(xpath = "//button[@id='btnSubmit1']")
	private WebElement btnsubmit1;
	
	@FindBy(xpath = "//button[@class='close  ']")
	private WebElement close;
	
	public WebElement getAddstudent() {
		return addstudent;
	}

	public WebElement getIndexxnumber() {
		return indexxnumber;
	}

	public WebElement getFullname() {
		return fullname;
	}

	public WebElement getIname() {
		return iname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getBdate() {
		return bdate;
	}

	public WebElement getGndDrpDwnBtn() {
		return gndDrpDwnBtn;
	}

	public WebElement getFileupload() {
		return fileupload;
	}

	public WebElement getGfullname() {
		return gfullname;
	}

	public WebElement getGifullname() {
		return gifullname;
	}

	public WebElement getGaddress() {
		return gaddress;
	}

	public WebElement getGmail() {
		return gmail;
	}

	public WebElement getGphome() {
		return gphome;
	}

	public WebElement getGbdate() {
		return gbdate;
	}

	public WebElement getGgenderDwnBtn() {
		return ggenderDwnBtn;
	}

	public WebElement getGfileupload() {
		return gfileupload;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public WebElement getGradedwnBtn() {
		return gradedwnBtn;
	}

	public WebElement getCheckbox() {
		return checkbox1;
	}

	public WebElement getBtnsubmit1() {
		return btnsubmit1;
	}

	public WebElement getclose() {
		return   close;
	}
	
	
public void verifyStudentDetails(String inNum,  String fullnae, String inam, String addres, String emai,String phon, String bdat,String gender,String stdImgPath, String gfullnam,String gifullnam, String gaddres, String gmai,String gphom,String gbdat,String gender2,String grdImgPath,String grade) {
	indexxnumber.sendKeys(inNum);
	fullname.sendKeys(fullnae);
	iname.sendKeys(inam);
	address.sendKeys(addres);
	email.sendKeys(emai);
	phone.sendKeys(phon);
	bdate.sendKeys(bdat);
	select(gndDrpDwnBtn, gender);
	File f1= new File(stdImgPath);
	String stdImg = f1.getAbsolutePath();
	fileupload.sendKeys(stdImg);
	gfullname.sendKeys(gfullnam);
	gifullname.sendKeys(gifullnam);
	gaddress.sendKeys(gaddres);
	gmail.sendKeys(gmai);
	gphome.sendKeys(gphom);
	gbdate.sendKeys(gbdat);
	select(ggenderDwnBtn, gender2);
	File f= new File(grdImgPath);
	String grdImg = f.getAbsolutePath();
	gfileupload.sendKeys(grdImg);
	btnsubmit.click();
	select(gradedwnBtn, grade);
	waitForElementClickable(driver, checkbox1);
	checkbox1.click();
	btnsubmit1.click();
	
}

	
	
	 
}
