package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BussinesPage {
	public static WebElement addNewBussines(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement addNewBussines=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']")));
		return addNewBussines;
	}
	
	public static WebElement getBussines(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement getBussines=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']")));
		return getBussines;
	}
	
	
	public static WebElement bussinesName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement bussinesName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='business-form-name']")));
		return bussinesName;
	}
	
	public static void setbussinesName(WebDriver driver, String input) {
		bussinesName(driver).sendKeys(input);
	}
	
	public static WebElement bussinesCity(WebDriver driver) {
		WebElement bussinesCity=driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return bussinesCity;
	}
	public static void setBussinesCity(WebDriver driver, String input) {
		bussinesCity(driver).sendKeys(input);
	}
	
	public static WebElement bussinesStreet(WebDriver driver) {
		WebElement bussinesStreet=driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return bussinesStreet;
	}
	public static void setBussinesStreet(WebDriver driver, String input) {
		bussinesStreet(driver).sendKeys(input);
	}
	
	
	public static WebElement bussinesZip(WebDriver driver) {
		WebElement bussinesZip=driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return bussinesZip;
	}
	
	public static void setBussinesZip(WebDriver driver, String input) {
		bussinesZip(driver).sendKeys(input);
	}
	public static WebElement registryNumber(WebDriver driver) {
		WebElement registryNumber=driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return registryNumber;
	}
	
	public static void setBussinesRegistry(WebDriver driver, String input) {
		registryNumber(driver).sendKeys(input);
	}
	public static WebElement saveButton(WebDriver driver) {
		WebElement saveButton=driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return saveButton;
	}
	public static void saveBussines(WebDriver driver) {
		saveButton(driver).click();
	}
	
	
	
	public static WebElement getCountry(WebDriver driver) {
		WebElement getCountry=driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return getCountry;
	}
	
	
	public static void addCountry(WebDriver driver, String countryName) throws InterruptedException
	{   
	Actions builder = new Actions(driver);
	Actions country = builder
	.moveToElement(getCountry(driver))
	.click()
	.sendKeys(countryName);
	country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
	country.perform();
	}
	
	
	
	
}
