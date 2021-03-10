package ESS_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	
WebDriver driver;
	
	public void Login_page(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	@FindBy(id="txtUserName")
	WebElement user_name; 
	
	@FindBy(id="txtPassword")
	WebElement user_password;
	
	@FindBy(id="saveButton")
	WebElement saveButton;
	
	
	public void Login(String username, String password) {
		
		user_name.sendKeys(username);
		user_password.sendKeys(password);
		saveButton.click();
		
		
	}
	
	

}
