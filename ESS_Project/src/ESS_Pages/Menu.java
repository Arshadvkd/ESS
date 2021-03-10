package ESS_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	
	@FindBy(xpath="//*[@id=\"sidebarMenuList\"]/li[1]/a/div")
	WebElement DashBoard;
	
	@FindBy(xpath="//*[@id=\"sidebarMenuList\"]/li[2]/a/div")
	WebElement MyInfo;
	
	@FindBy(xpath="//*[@id=\"sidebarMenuList\"]/li[3]/a/div")
	WebElement Actions;
	
	@FindBy(xpath="//*[@id=\"sidebarMenuList\"]/li[4]/a/div")
	WebElement Request;
	
	@FindBy(xpath="//*[@id=\"sidebarMenuList\"]/li[5]/a/div")
	WebElement Documents;
	
	@FindBy(xpath="//*[@id=\"sidebarMenuList\"]/li[6]/a/div")
	WebElement directory;
	
	@FindBy(xpath="//*[@id=\"sidebarMenuList\"]/li[7]/a/div")
	WebElement Reports;
	
	
	public void click_dashboard() {
		
		DashBoard.click(); 
	}
	
   public void click_myInfo() {
		
		MyInfo.click();
	}

  public void click_actions() {
	
	Actions.click();
   }
  
  public void click_request() {
		
		Request.click();
	}
  
  public void click_document() {
		
		Documents.click();
	}
  
  public void click_directory() {
		
		directory.click();
	}
  
  public void click_reports() {
		
		Reports.click();
	}

}
