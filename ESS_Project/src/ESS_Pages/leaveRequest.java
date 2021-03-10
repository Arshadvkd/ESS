package ESS_Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class leaveRequest {
	
	@FindBy(xpath = "//button[@class='btn btn-add']")
	WebElement btn_add;
	
	@FindBy(xpath="//div[@class='chosen-container chosen-container-single']/a[@class='chosen-single']")
	List<WebElement> drope;
	
	@FindBy(xpath = "//ul[@class='chosen-results']/li[@class='active-result']")
	List<WebElement> result;
	
	@FindBy(id="LvFromDate")
	WebElement from_date;
	
	@FindBy(id="ToLvDate")
	WebElement to_date;
	
	@FindBy(id="txtReason")
	WebElement Reason;
	
	@FindBy(id="btnLeaveSave")
	WebElement save;
	
	@FindBy(xpath = "//div[@class='btn-group tbl-btn-grp']/button[@class='btn btn-default dropdown-toggle table-drop action-btn']")
	List<WebElement> action;
	
	@FindBy(xpath = "//ul[@class='dropdown-menu action-drop-list']/li/a[@class='action-link']")
	List<WebElement> list_actions;
	
	
	
	
	public void add_button() {
		
		btn_add.click();
	}
	
	public void click_drope(int index) {
		
		int count = drope.size();
		
		for(int i=0; i<=count; i++) {
			
			WebElement els = drope.get(index);
			{
				
				els.click();
				break;
			}
		}
	}
	
	
	
	public void select_leave(int index) {
		
		int count = result.size();
		
		for(int i=0; i<=count; i++) {
			
			WebElement ele = result.get(index);{
				
			ele.click();
			break;
				
			}
		}
	}
	
	public void click_action(int index) {
		
		int count = action.size();
		
		for(int i=0; i<count; i++) {
			
			WebElement ele = action.get(index);
			{
				ele.click();
				break;
			}
			
		}
	}
	
	public void select_view() {
		
		int count = list_actions.size();
		
		for(int i=0; i<=count; i++) {
			
			WebElement ele = list_actions.get(i);
			
			String DS = ele.getAttribute("innerHTML");
			
			if(DS.contentEquals("View")) {
				
				ele.click();
				break;
			}
		}
	}
	
	public void clickFdate() {
		
		from_date.click();
	}
	
	public void clickTodate() {
		
		to_date.click();
	}
	
	public void click_Fdate(String date) {
		
		from_date.clear();
		from_date.sendKeys(date);
		from_date.sendKeys(Keys.ENTER);
	}
	
	public void click_Tdate(String date) {
		
		to_date.clear();
		to_date.sendKeys(date);
		to_date.sendKeys(Keys.ENTER);
	}
	

	public void click_reason(String reason) {
		
		Reason.click();
		Reason.clear();
		Reason.sendKeys(reason);
		
	}
	
	public void click_save() {
		
		save.click();
	}
	
	
	
	
}
