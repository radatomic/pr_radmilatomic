package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BankPage;
import utility.Constant;
import utility.ExcelUtils;

public class BankAccountAction {
	public static void Execute(WebDriver driver) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Bank");
		String bank[]=new String[5];
		for(int i=0;i<5;i++) {
			bank[i]=ExcelUtils.getCellData(1, i+1);
			System.out.println(bank[i]);
		}
		BankPage.addNewBankAccount(driver);
		
		BankPage.setBankName(driver, bank[0]);
		BankPage.setAccountNumber(driver, bank[1]);
		BankPage.setSwiftNumber(driver, bank[2]);
		
		BankPage.setPaymentInstructions(driver, bank[3]);
		
		BankPage.addCurrency(driver);
		BankPage.selectCurrency(driver, bank[4]);
		BankPage.addAccount(driver);
		
		
	}
	}
