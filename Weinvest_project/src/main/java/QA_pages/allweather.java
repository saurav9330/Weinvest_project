package QA_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QA_Base.Base_class;

public class allweather extends Base_class {

	@FindBy(css=".btn.btn-success.btn-invest.btn-md.btn-customize-portfolio")
	WebElement customize_port;
	
	
	
	public allweather() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public Portfolio_Performance clickonexploreidea() throws IOException
	{
		customize_port.click();
		return new Portfolio_Performance();
	}
	
}
