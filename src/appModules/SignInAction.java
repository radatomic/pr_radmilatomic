package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import utility.ExcelUtils;

public class SignInAction {
	public static void Execute(WebDriver driver) throws Exception {
		String userName=ExcelUtils.getCellData(1, 1);
		String password=ExcelUtils.getCellData(1, 2);
		LogInPage.addLoginEmail(driver,userName);
		LogInPage.addLoginPassword(driver, password);
		LogInPage.loginButton(driver).click();
				
	}
	

}
