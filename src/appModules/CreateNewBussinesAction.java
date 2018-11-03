package appModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BussinesPage;
import utility.Constant;
import utility.ExcelUtils;

public class CreateNewBussinesAction {
	public static void Execute(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bussines");
		
		String bussines[]=new String[6];
		for(int i=0;i<6;i++) {
			bussines[i]=ExcelUtils.getCellData(1, i+1);
			System.out.println(bussines[i]);
		}
		
		BussinesPage.setbussinesName(driver, bussines[0]);
		BussinesPage.addCountry(driver,bussines[1]);
		BussinesPage.setBussinesCity(driver,bussines[2]);
		BussinesPage.setBussinesStreet(driver,bussines[3]);
		System.out.println("ovo je zip:"+bussines[4]);
		BussinesPage.setBussinesZip(driver,bussines[4]);
		BussinesPage.setBussinesRegistry(driver,bussines[5]);
		//Thread.sleep(2000);
		BankAccountAction.Execute(driver);
		BussinesPage.saveBussines(driver);
	}
	

}
