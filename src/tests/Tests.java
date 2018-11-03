package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModules.CreateNewBussinesAction;
import appModules.CreateNewClientAction;
import appModules.SignInAction;
import pageObjects.BussinesPage;
import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class Tests {
	public static void SignInTest(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"LogIn");
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		SignInAction.Execute(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		String testStatus;
		if(driver.getCurrentUrl().equals("http://app.invoice-factory.source-code.rs/invoices")){
			testStatus="pass";
		}
		else {
			testStatus="fail";
		}
		ExcelUtils.setCellData(testStatus, 1, 3);
		
	}
	
	public static void CreateBussinesTest(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"LogIn");
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		SignInAction.Execute(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		BussinesPage.getBussines(driver).click();
		Thread.sleep(2000);
		List <WebElement> bussineses=driver.findElements(By.xpath("//div[@class=\"layout business-item-subheader text-xs-left\"]"));	
		System.out.println(bussineses.size());
		int numberOfBussineses=bussineses.size();
		BussinesPage.addNewBussines(driver).click();
		CreateNewBussinesAction.Execute(driver);
		Thread.sleep(2000);
		List <WebElement> bussinesesNew=driver.findElements(By.xpath("//div[@class=\"layout business-item-subheader text-xs-left\"]"));
		String testStatus;
		if(numberOfBussineses==bussinesesNew.size()) {
			testStatus="fail";
		}
		else {
			testStatus="pass";
		}
		System.out.println(testStatus);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Client");
		System.out.println(testStatus);
		ExcelUtils.setCellData(testStatus, 1, 13);
		
		
		
		
	}
	
	public static void CreateClientTest(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"LogIn");
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		SignInAction.Execute(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		ClientsPage.getClients(driver).click();
		List <WebElement> clients=driver.findElements(By.xpath("//div[@class=\"layout clients-item-subheader text-xs-left\"]"));
		CreateNewClientAction.Execute(driver);
		Thread.sleep(2000);
		List <WebElement> clientsNew=driver.findElements(By.xpath("//div[@class=\"layout clients-item-subheader text-xs-left\"]"));
		String testStatus;
		if(clients.size()!=clientsNew.size()&&clientsNew.size()!=0) {
			testStatus="pass";
		}
		else {
			testStatus="fail";
		}
		System.out.println(testStatus);
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bussines");
		
		ExcelUtils.setCellData(testStatus, 1, 7);
	}

}
