package ESS_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {
	
	@FindBy(id="home-tab")
	WebElement actions;
	
	@FindBy(id="profile-tab")
	WebElement request;
	
	@FindBy(id="contact-tab")
	WebElement document;
	
	@FindBy(id="showbutton")
	WebElement showbutton;
	
	public void action() {
		
		actions.click();
	}
	
	public void request() {
		
		request.click();
		System.out.println("success");
	}
	
	public void document() {
		
		document.click();
	}
	
	public void showbutton() {
		
		showbutton.click();
	}

}
