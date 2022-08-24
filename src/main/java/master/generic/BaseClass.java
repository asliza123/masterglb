package master.generic;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;



import io.github.bonigarcia.wdm.WebDriverManager;
import master.objectRepositery.Home;
import master.objectRepositery.login;

public class BaseClass {
	public  WebDriver driver;
	public static WebDriver sdriver;
	/*object Creation for Lib*/
	public JavaUtility jLib= new JavaUtility();
	public WebdriverUtility wLib=new WebdriverUtility();
	public FileUtility fLib=new FileUtility();
	public ExcelUtility eLib=new ExcelUtility();
	
	@BeforeSuite
	public void configBS() {
		System.out.println("=====connect to DB=====");
		
	}
@BeforeClass
public void configBC() throws Throwable {
	System.out.println("==Launch the Browser==");
	String Browser = fLib.getPropertyKeyValue("browser");
	if(Browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("FIREFOX")) {
		WebDriverManager.firefoxdriver().setup();	
		driver=new FirefoxDriver();
	}

	//driver=new ChromeDriver();
	sdriver = driver;
	driver.manage().window().maximize();
	
}
@BeforeMethod
public void configBM() throws Throwable {
	String URL = fLib.getPropertyKeyValue("url");
	String USERNAME = fLib.getPropertyKeyValue("username");
	String PASSWORD = fLib.getPropertyKeyValue("password");
	driver.get(URL);
	 login loginPage = new login(driver);
	 loginPage.loginToApp(USERNAME, PASSWORD);
	
}
@AfterMethod
public void configAM() {
	
	 Home homePage = new Home(driver);
	 homePage.logout();
}
@AfterClass
public void configAC() {
	System.out.println("=====close DB=====");
}
	
	

}
