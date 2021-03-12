package ESS_Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class advancesearch_Leave {
	
	//Advance button functions
	
		@FindBy(xpath = "//div[@class='col-md-12']/a")
		WebElement advance;
		
		@FindBy(xpath = "//div[@class='chosen-container chosen-container-single']/a[@class='chosen-single']")
		List<WebElement> leaveType;
		
		@FindBy(xpath = "//div[@class='chosen-drop']/ul[@class='chosen-results']/li")
		List<WebElement> advance_list;
		
		@FindBy(xpath = "//button[@class='btn btn-grn']")
		WebElement submit;
		
		@FindBy(xpath = "//button[@class='btn btn-default']")
		WebElement clear;
		
		@FindBy(id="fromDate")
		WebElement fromDate;
		
		@FindBy(id = "toDate")
		WebElement toDate;
		
		//Advance filter selection starting
		
		public void Click_advance() {
			
			advance.click();
		}
		
		public void click_leaveType(int index) {
			
			int count = leaveType.size();
			
			for(int i=0; i<=count; i++) {
				
				WebElement ele = leaveType.get(index);
				{
					ele.click();
					break;
				}
			}
		}
		
		public void leaveType_select() {
			
			int count = advance_list.size();
			
			for(int i=0; i<=count; i++) {
				
				WebElement ele = advance_list.get(i);
				
				String ds = ele.getAttribute("innerHTML");
				
				if(ds.contentEquals("Forward")) {
					
					ele.click();
					break;
				}
			}
			
			
		}
		
		public void fDate_click() {
			
			fromDate.click();
		}
		
		public void show_result() {
			
			submit.click();
			
		}

}
