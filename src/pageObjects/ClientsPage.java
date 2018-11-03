package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientsPage {
	public static WebElement getClients(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement getClients=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']")));
		return getClients;
	}
	
	public static WebElement addNewClient(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement addNewClient=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']")));
		return addNewClient;
	}
	public static WebElement clientName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement clientName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label=\"Client Name\"]")));
		return clientName;
	}
	
	public static void setClientName(WebDriver driver, String input) {
		clientName(driver).sendKeys(input);
	}
	
	public static WebElement contactName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement contactName=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label=\"Contact Name\"]")));
		return contactName;
	}
	
	public static void setContactName(WebDriver driver, String input) {
		contactName(driver).sendKeys(input);
	}
	
	public static WebElement getEmail(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement getEmail=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label=\"E-mail\"]")));
		return getEmail;
	}
	
	public static void setEmail(WebDriver driver, String input) {
		getEmail(driver).sendKeys(input);
	}
	
	public static WebElement registryNumber(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement registryNumber=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label=\"Registry Number\"]")));
		return registryNumber;
	}
	
	public static void setRegistryNumber(WebDriver driver, String input) {
		registryNumber(driver).sendKeys(input);
	}
	
	public static WebElement getCountry(WebDriver driver) {
		WebElement getCountry=driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
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
	
	public static WebElement clientCity(WebDriver driver) {
		WebElement clientCity=driver.findElement(By.xpath("//input[@aria-label=\"City\"]"));
		return clientCity;
	}
	public static void setClientCity(WebDriver driver, String input) {
		clientCity(driver).sendKeys(input);
	}
	
	public static WebElement clientStreet(WebDriver driver) {
		WebElement clientStreet=driver.findElement(By.xpath("//input[@aria-label=\"Street\"]"));
		return clientStreet;
	}
	public static void setClientStreet(WebDriver driver, String input) {
		clientStreet(driver).sendKeys(input);
	}
	
	public static WebElement clientZip(WebDriver driver) {
		WebElement clientZip=driver.findElement(By.xpath("//input[@aria-label=\"Zip\"]"));
		return clientZip;
	}
	
	public static void setClientZip(WebDriver driver, String input) {
		clientZip(driver).sendKeys(input);
	}
	
	public static WebElement clientCode(WebDriver driver) {
		WebElement clientCode=driver.findElement(By.xpath("//input[@aria-label=\"Code\"]"));
		return clientCode;
	}
	
	public static void setClientCode(WebDriver driver, String input) {
		clientCode(driver).sendKeys(input);
	}
	
	public static void saveClient(WebDriver driver) {
		driver.findElement(By.xpath("//div[contains(text(),'Save')]")).click();
	}


}
