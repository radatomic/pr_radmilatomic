package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	public static WebElement loginEmail(WebDriver driver) {
		WebElement loginEmail=driver.findElement(By.xpath("//input[@id='login-form-email']"));
		return loginEmail;
	}
	public static WebElement loginPassword(WebDriver driver) {
		WebElement loginPassword=driver.findElement(By.xpath("//input[@id='login-pass']"));
		return loginPassword;
	}
	public static WebElement loginButton(WebDriver driver) {
		WebElement loginButton=driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return loginButton;
	}
	
	public static void addLoginEmail(WebDriver driver, String input) {
		loginEmail(driver).sendKeys(input);
	}
	
	public static void addLoginPassword(WebDriver driver, String input) {
		loginPassword(driver).sendKeys(input);
	}
}
