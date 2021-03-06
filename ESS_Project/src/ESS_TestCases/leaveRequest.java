package ESS_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ESS_Pages.Menu;
import ESS_Pages.advancesearch_Leave;
import ESS_Pages.loginPage;
import ESS_Pages.request_pages;
import Helper.BrowserFactory;
import Helper.DatePicker;


public class leaveRequest {
	
WebDriver driver;
	
    @BeforeTest
	public void request() {
		
		try { 
		   
		driver = BrowserFactory.startBrowser("FirefoxDriver", "http://111.92.110.196:8099/");
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		request_pages rqst_pages = PageFactory.initElements(driver, request_pages.class);
		
		  
		login.Login("esstest@mail.com", "123456789");
		 
		menu.click_request();
		
		
		rqst_pages.leave();
		
		
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
    
    @Test(priority = 1, enabled = false)
    public void add_request()  { 
    	
    	try {
    	ESS_Pages.leaveRequest leave = PageFactory.initElements(driver, ESS_Pages.leaveRequest.class);
    	DatePicker date = PageFactory.initElements(driver, DatePicker.class);
    	
    	leave.add_button();
    	Thread.sleep(100);
    	leave.click_drope(1);
    	Thread.sleep(100);
    	leave.select_leave(1);
    	Thread.sleep(100);
    	leave.clickFdate();
    	Thread.sleep(100);
    	date.select_year("2021");
    	Thread.sleep(100);
    	date.select_month("Apr");
    	Thread.sleep(100);
    	date.select_day("15");
    	Thread.sleep(100);
    	leave.clickTodate();
    	Thread.sleep(100);
    	date.select_year("2021");
    	Thread.sleep(100);
    	date.select_month("Apr");
    	Thread.sleep(100);
    	date.select_day("16");
    	leave.click_reason("Need Medical Emergency");
    	leave.click_save();
    	
    	} catch(Exception e) {
    		
    		e.printStackTrace();
    		System.out.println("The issue is = "+e);
    	}
    }
      
    @Test(priority = 2, enabled = false)
    public void view_request() throws Exception {
    	 
    	try { 
    	ESS_Pages.leaveRequest leave = PageFactory.initElements(driver, ESS_Pages.leaveRequest.class);
    	
    	leave.click_action(0); 
    	Thread.sleep(1000);
    	leave.select_view(); 
    	Thread.sleep(1000);
    	leave.close_window();
    	Thread.sleep(1000);
    	leave.click_action(0);
    	//Thread.sleep(1000);
    	//Clicking the edit
    	//leave.select_edit();
    	Thread.sleep(1000);
    	// Clicking the history    	
    	//leave.select_history();
    	
    	
    	
    	} catch(Exception e) {
    		
    		System.out.println("The issue in view is "+e);
    		
    	}
    	
    }
    
    @Test(priority = 3, enabled = false)
    public void cancel_leave() {
    	
    	try {
    		ESS_Pages.leaveRequest leave = PageFactory.initElements(driver, ESS_Pages.leaveRequest.class);
    		//Clicking the cancel
        	leave.click_cancel();
    		
        	leave.reason("This is the automation test in cancel popup");
        	leave.save_submit();
    		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The issue in cancel is "+e);
		}
    }
    
    
    @Test(priority = 4, enabled = false)
    public void advance_search_leavetype() {
    	
    	try {
    	
    		advancesearch_Leave search = PageFactory.initElements(driver, advancesearch_Leave.class);
    		
    		search.Click_advance();
    		Thread.sleep(1000);
    		search.click_leaveType(0);
    		Thread.sleep(1000);
    		search.leaveType_select();
    		Thread.sleep(1000);
    		search.show_result();
    	
    	
    	} catch(Exception e) {
    		
    		System.out.println("The issue will be " +e);
    	}
    }
    
    @Test(priority = 5, enabled = true)
    public void advance_search_dates() {
    	
    	try {
    	
    	advancesearch_Leave search = PageFactory.initElements(driver, advancesearch_Leave.class);
    	  
    	search.Click_advance();
    	Thread.sleep(1000);
    	search.fDate_click();
    	
    	} catch (Exception e) {
			// TODO: handle exception
    		
    		System.out.println("The issue is "+e);
		}
    }
	

}
