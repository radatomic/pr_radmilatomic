package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankPage {
	
	public static WebElement addBankAccount(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement addBankAccount=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']")));
		return addBankAccount;
	}
	
	public static void addNewBankAccount(WebDriver driver) {
		addBankAccount(driver).click();
	}
	public static WebElement bankName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement bankName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='bank-dialog-name']")));
		//WebElement bankName=driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return bankName;
	}
	
	public static void setBankName(WebDriver driver,String input) {
		bankName(driver).sendKeys(input);
	}
	
	public static WebElement accountNumber(WebDriver driver) {
		WebElement accountNumber=driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return accountNumber;
	}
	
	public static void setAccountNumber(WebDriver driver,String input) {
		accountNumber(driver).sendKeys(input);
	}
	
	public static WebElement swiftNumber(WebDriver driver) {
		WebElement swiftNumber=driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return swiftNumber;
	}
	
	public static void setSwiftNumber(WebDriver driver,String input) {
		swiftNumber(driver).sendKeys(input);
	}
	
	public static WebElement paymentInstructions(WebDriver driver) {
		WebElement paymentInstructions=driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return paymentInstructions;
	}
	
	public static void setPaymentInstructions(WebDriver driver,String input) {
		paymentInstructions(driver).sendKeys(input);
	}
	
	
	
	//1
	public static WebElement getCurrency(WebDriver driver) {
		WebElement getCurrency=driver.findElement(By.xpath("//div[@class='v-select__selections']"));
		return getCurrency;
	}
	//2
	public static void addCurrency(WebDriver driver) throws InterruptedException
	{   
	getCurrency(driver).click();
	}
	//3
	
	public static WebElement currencyClick(WebDriver driver, String input) {
		WebElement currencyClick=driver.findElement(By.xpath("//div[@class='v-list__tile__title'][contains(text(),'"+input+"')]"));
		return currencyClick;
	}
	//4
	
	public static void selectCurrency(WebDriver driver,String input) {
		currencyClick(driver, input).click();
	}
	
	public static void addAccount(WebDriver driver) {
		driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]")).click();
	}
	
	
}
