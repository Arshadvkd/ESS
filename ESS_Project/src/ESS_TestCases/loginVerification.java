package ESS_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ESS_Pages.loginPage;
import Helper.BrowserFactory;

public class loginVerification {
	
	
	WebDriver driver;
	
	@Test
	public void verify_login() {
		
		try {
			
			driver = BrowserFactory.startBrowser("FirefoxDriver", "http://111.92.110.196:8099/");
			loginPage login = PageFactory.initElements(driver, loginPage.class);
			
			
			login.Login("esstest@mail.com", "123456789");
			
			String expected = "ESS Test";
			
			String title = driver.findElement(By.xpath("//div[@class='menuEmpDetail']/h3")).getText();
			
			if(expected.equals(title)) {
				
				System.out.println("Success name is "+title);
				driver.quit();
			}else {
				
				System.out.println("failed the title");
			}
			
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	} 
	

}
