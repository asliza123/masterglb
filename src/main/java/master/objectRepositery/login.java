package master.objectRepositery;

import javax.security.auth.login.LoginContext;

import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
 public login(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }public static void main(String[] args) {
	
}
 @FindBy(name = "email")
 private WebElement userNm;
 @FindBy(id= "password")
 private WebElement userPwd;
 
 @FindBy(id = "btnSubmit")
 private WebElement loginbtn;
 

	 public WebElement getUseeNm() {
	return userNm;
}

public WebElement getUserPwd() {
	return userPwd;
}

public WebElement getLoginbtn() {
	return loginbtn;
}

	public void loginToApp(String userName, String password) {
		 
		userNm.sendKeys(userName);
		userPwd.sendKeys(password);
		loginbtn.click(); 
	
}
	 
		
	}


