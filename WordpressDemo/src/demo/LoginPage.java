package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.ID,using="user_login")
	WebElement username;
	
	@FindBy(how=How.CSS,using="#user_pass")
	WebElement password;
	
	@FindBy(how=How.CSS, using="#wp-submit")
	WebElement submit_button;
	
	@FindBy(how=How.CSS, using="#rememberme")
	WebElement remember_me_chk_box;
	
	@FindBy(how=How.CSS,using="#nav>a")
	WebElement forget_password;
	
	
	public void login_demo(String uName, String pWord){
		
		username.sendKeys(uName);
		password.sendKeys(pWord);
		submit_button.click();
	}
	

}
