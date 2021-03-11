package ESS_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ESS_Pages.DashBoard;
import ESS_Pages.Menu;
import ESS_Pages.loginPage;
import Helper.BrowserFactory;

public class dashBoard {
	
	WebDriver driver;
	
	  //this
	@BeforeTest
	public void login() {
		
		try {
			driver = BrowserFactory.startBrowser("FirefoxDriver", "http://111.92.110.196:8099/");
			loginPage login = PageFactory.initElements(driver, loginPage.class);
			
			System.out.println("new");
			
			// Login credentials
			login.Login("esstest@mail.com", "123456789");
			
			// Menu selecting
			  
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
	} 
	
	@Test(priority = 1)
	public void dashBoard() {
		
		Menu menu = PageFactory.initElements(driver, Menu.class);
		
		//DashBoard Click
		menu.click_dashboard();
		
		
	}
	
	// Verify the Designation
	
	@Test(priority = 2)
	public void verify_designation() {
		
		String expected = "HR Manager";
		
		String actual = driver.findElement(By.id("dash_emp_designation")).getText();
		
		if(actual.equalsIgnoreCase(expected)) {
			
			System.out.println("The Designation is correct and it is ="+actual);
		} else {
			
			System.out.println("The Designation is not matching correct");
		}
	}
	
	// Verify the Department
	
	@Test(priority = 3)
	public void verify_department() {
		
		String expected = "HR";
		
		String actual = driver.findElement(By.xpath("//p[@id='dash_emp_designation']/span")).getText();
		
		if(actual.equalsIgnoreCase(expected)) {
			
			System.out.println("The Department is correct and it is = "+actual);
		} else {
			
			System.out.println("The Department is not matching correct");
		}
	}
	
	@Test(priority = 5)
	public void request() {
		
		DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
		
		dash.request();
	}
	
	@Test(priority = 4)
	public void actions() {
		
		DashBoard dash = PageFactory.initElements(driver, DashBoard.class);
		
		dash.showbutton();
		
	}
	
	

}
