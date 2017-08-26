package demo;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import reader.ReadData;
import util.BrowserFactory;
import util.ExcelDataConfig;

public class LoginTest {

	//ReadData readExcelData = new ReadData();
	ExcelDataConfig Excel= new ExcelDataConfig("../WordpressDemo/data/login.xlsx");
	
	@Test
	public void loginTest() throws IOException{
		
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php?loggedout=true");
				
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		String username=Excel.getData(0, 1, 0);
		String password=Excel.getData(0, 1, 1);
		
			
		loginPage.login_demo(username, password);
		
		driver.close();
		driver.quit();
		
		
	}
}
