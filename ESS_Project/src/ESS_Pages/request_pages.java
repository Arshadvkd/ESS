package ESS_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class request_pages {
	
	@FindBy(linkText = "Leave")
	WebElement leave;
	
	@FindBy(linkText = "EarlyLeaveDelayCome")
	WebElement earlyLeave;
	
	@FindBy(linkText = "Vacation")
	WebElement vacation;
	
	@FindBy(linkText = "Loan")
	WebElement loan;
	
	@FindBy(linkText = "Payslip")
	WebElement payslip;
	
	@FindBy(linkText = "Letter")
	WebElement letter;
	
	@FindBy(linkText = "Resignation")
	WebElement resignation;
	
	@FindBy(linkText = "Bank Change Request")
	WebElement bank;

	
	public void leave() {
		
		leave.click();
		
	}
	
	public void earlyLeave() {
		
		earlyLeave.click();
	}
	
    public void vacation() {
		
		vacation.click();
	}

    public void loan() {
	 
	loan.click();
}
    
    public void payslip() {
		
		payslip.click();
	}
    
   public void letter() {
		
		letter.click();
	}
   
   public void resignation() {
		
		resignation.click();
	}
   
   public void bank() {
		
		bank.click();
	}

}
