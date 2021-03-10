package Helper;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatePicker {
	
	@FindBy(xpath="//tr/th[@class='datepicker-switch' and @colspan='5']")
	WebElement datepicker;
	
	@FindBy(xpath = "//tr/th[@class='datepicker-switch' and @colspan='5']")
	List<WebElement> datepicker1;
	
	@FindBy(xpath = "//th[@class='prev']")
	List<WebElement> previouse;
	
	@FindBy(xpath = "//th[@class='next']")
	List<WebElement> next;
	
	@FindBy(xpath = "//td[@colspan='7']/span[@class='month']")
	List<WebElement> month;
	
	@FindBy(xpath = "//td[@colspan='7']/span[@class='year']")
	List<WebElement> year;
	
	@FindBy(xpath = "//tr/td[@class='day']")
	List<WebElement> day;
	
	public void prev(int index) {
		
		WebElement ele = previouse.get(index);
		ele.click();
		
	}
	
	public void nex(int index) {
		
		WebElement ele = next.get(index);
		ele.click();
	}
	
	public void select_date(String yearNum) {
		
		int count = datepicker1.size();
		
		for(int i=0; i<=count; i++) {
			
			WebElement ele = datepicker1.get(i);
			String DT = ele.getAttribute("innerHTML");
			if(DT.contentEquals(yearNum)) {
				
				ele.click();
				break;
			} else {
				
				System.out.println("Error in Date");
			}
		}
		
	}
	
	public void select_year(String yearNum) throws Exception {
		
		
		select_date("March 2021");
		Thread.sleep(100);
		select_date("2021");
		Thread.sleep(100);
		
		int count = year.size();
		
		for(int i=0; i<=count; i++) {
			
			WebElement ele = year.get(i);
			String YR = ele.getAttribute("innerHTML");
			if(YR.contentEquals(yearNum)) {
				ele.click();
				break;
			}
		}
	}
	
	
	public void select_month(String yearNum) {
		
		int count = month.size();
		
		for(int i=0; i<=count; i++) {
			
			WebElement ele = month.get(i);
			String MT = ele.getAttribute("innerHTML");
			if(MT.contentEquals(yearNum)) {
				
				ele.click();
				break;
			}
		}
	}
	
	public void select_day(String yearNum) {
		
		int count = day.size();
		
		for(int i=0; i<=count; i++) {
			
			WebElement ele = day.get(i);
			
			String DY = ele.getAttribute("innerHTML");
			if(DY.contentEquals(yearNum)) {
				
				ele.click();
				break;
			}
		}
	}

}
