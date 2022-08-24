package master.admin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import master.generic.ExcelUtility;
import master.generic.FileUtility;
import master.generic.JavaUtility;
import master.generic.WebdriverUtility;
import master.objectRepositery.Home;
import master.objectRepositery.login;
import master.objectRepositery.vaddstudent;

public class VreyTest {
	
	
		WebDriver driver=null;

		
		FileUtility ful=new FileUtility();
		ExcelUtility eul=new ExcelUtility();
		WebdriverUtility wul=new WebdriverUtility();
		JavaUtility jul=new JavaUtility();
		int random = jul.getRanDomNumber();
		@Test
		public void createstudenttest() throws Throwable {
		
		String URL = ful.getPropertyKeyValue("url");
		String USERNAME = ful.getPropertyKeyValue("username");
		String PASSWORD = ful.getPropertyKeyValue("password");
		String Browser = ful.getPropertyKeyValue("browser");
		String stdImgPath= ful.getPropertyKeyValue("imagepath");
		String grdImgPath= ful.getPropertyKeyValue("imagepath1");
        String INDEXNUMBER = eul.getExcelData("Sheet1", 1, 0)+random;
		String FullName = eul.getExcelData("Sheet1", 1, 1);
		String NameWithintials = eul.getExcelData("Sheet1", 1, 2);
		String Addres = eul.getExcelData("Sheet1", 1, 2);
		String Email = random+eul.getExcelData("Sheet1", 1, 4);
		String Phone = eul.getExcelData("Sheet1", 1, 5);
		String DateofBirth = eul.getExcelData("Sheet1", 1, 6);
		String Gender1 = eul.getExcelData("Sheet1", 1, 13);
		String FullName1 = eul.getExcelData("Sheet1", 1, 7);
		String NameWithintials1 = eul.getExcelData("Sheet1", 1, 8);
		String Addres1 = eul.getExcelData("Sheet1", 1, 9);
		String Email1 = random+eul.getExcelData("Sheet1", 1, 10);
		String Phone1 = eul.getExcelData("Sheet1", 1, 11);
		String DateofBirth1 = eul.getExcelData("Sheet1", 1, 12);
		String Gender2 = eul.getExcelData("Sheet1", 1, 14);
		String Grade = eul.getExcelData("Sheet1", 1, 15);


		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();	
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		wul.waitForElementInDOM(driver);
		driver.get(URL);
		
		login lp=new login(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		
		Home hp=new Home(driver);
		hp.getstudent().click();
		vaddstudent vad= new vaddstudent(driver);
		vad.getAddstudent().click();
		vad.verifyStudentDetails(INDEXNUMBER,FullName,NameWithintials,Addres,Email,Phone,DateofBirth,Gender1,stdImgPath,FullName1,NameWithintials1,Addres1,Email1,Phone1,DateofBirth1,Gender2,grdImgPath,Grade);
		vad.getCheckbox().click();
		vad.getBtnsubmit1().click();
		vad.getclose().click();
		hp.logout();
		/*driver.findElement(By.name("email")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(PASSWORD);
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.xpath("//span[text()='Student']")).click();
		driver.findElement(By.xpath("//a[text()=' Add Student']")).click();
		driver.findElement(By.id("index_number")).sendKeys(INDEXNUMBER);
		driver.findElement(By.id("full_name")).sendKeys(FullName);
		driver.findElement(By.id("i_name")).sendKeys(NameWithintials);
		driver.findElement(By.id("address")).sendKeys(Address);
		driver.findElement(By.id("email")).sendKeys(random+Email);
		driver.findElement(By.id("phone")).sendKeys(Phone);
		driver.findElement(By.id("b_date")).sendKeys(DateofBirth);

		WebElement Genderlistbox = driver.findElement(By.id("gender"));
		wul.select(Genderlistbox, Gender1);
		File f1= new File(stdImgPath);
		String stdImg = f1.getAbsolutePath();
		WebElement upload_file = driver.findElement(By.xpath("//input[@id='fileToUpload']"));
		upload_file.sendKeys(stdImg);
		driver.findElement(By.name("g_full_name")).sendKeys(FullName1);
		driver.findElement(By.name("g_i_name")).sendKeys(NameWithintials1);
		driver.findElement(By.name("g_address")).sendKeys(Addres1);
		driver.findElement(By.name("g_email")).sendKeys(random+Email1);
		driver.findElement(By.name("g_phone")).sendKeys(Phone1);
		driver.findElement(By.name("g_b_date")).sendKeys(DateofBirth1);
		WebElement Genderlistbox1 = driver.findElement(By.id("g_gender"));
		wul.select(Genderlistbox1, Gender2);
		File f= new File(grdImgPath);
		String grdImg = f.getAbsolutePath();
		WebElement upload_file1 = driver.findElement(By.xpath("//input[@id='g_fileToUpload']"));
		upload_file1.sendKeys(grdImg);
		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
		WebElement Gradelistbox = driver.findElement(By.id("grade"));
		wul.select(Gradelistbox, Grade);
		driver.findElement(By.xpath("//td[text()='Teacher 3']/../td/input[@id='checkbox']")).click();
		driver.findElement(By.xpath("//button[@id='btnSubmit1']")).click();
		driver.findElement(By.xpath("//button[@class='close  ']")).click();
		driver.findElement(By.xpath("//img[@class='user-image']")).click();
		driver.findElement(By.xpath("//a[@href='login.php']")).click();

*/
		}
	}



