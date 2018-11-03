package automation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModules.CreateNewBussinesAction;
import appModules.SignInAction;
import tests.Tests;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI_TC {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Tests.SignInTest(driver);
		driver.close();
		driver = new ChromeDriver();
		Tests.CreateBussinesTest(driver);
		driver.close();
		driver = new ChromeDriver();
		Tests.CreateClientTest(driver);
		driver.close();
		

	}

}
