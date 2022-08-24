package master.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerImplementation implements ITestListener{

public void onTestFailure(ITestResult result) {
		
		String testNAme = result.getMethod().getMethodName();
		JavaUtility jLib=new JavaUtility();
		 String date = jLib.getSystemDate();
		int random = JavaUtility.getRanDomNumber();
		System.out.println(testNAme +"=== Execute & i am Listnening===");
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.sdriver);
		File srcFile = edriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./Screenshot/"+testNAme+random+date+".png"));
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		}
}
