package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class CreateNewClientAction {
	public static void Execute(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Client");
		
		ClientsPage.addNewClient(driver).click();
		String client[]=new String[12];
		for(int i=0;i<12;i++) {
			client[i]=ExcelUtils.getCellData(1, i+1);
			System.out.println(client[i]);
		}
		ClientsPage.setClientName(driver, client[0]);
		ClientsPage.setContactName(driver, client[1]);
		ClientsPage.setEmail(driver, client[2]);
		ClientsPage.setRegistryNumber(driver, client[3]);
		ClientsPage.addCountry(driver, client[4]);
		ClientsPage.setClientCity(driver, client[5]);
		ClientsPage.setClientStreet(driver, client[6]);
		ClientsPage.setClientZip(driver, client[7]);
		ClientsPage.setClientCode(driver, client[9]);
		ClientsPage.saveClient(driver);
	}

}
