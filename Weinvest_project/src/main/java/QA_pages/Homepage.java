package QA_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import QA_Base.Base_class;

public class Homepage extends Base_class {

	@FindBy(xpath="(//a[@href='#selected-model-portfolios'])[1]")
	WebElement portfolio_recommend;
	@FindBy(xpath="((//a[@href='#remaining-model-portfolios'])[1]")
	WebElement portfolio_choice;
	@FindBy(id="btn-explore79")
	WebElement Explore_idea;
	
	
	
	public Homepage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	

	public allweather clickonexploreidea() throws IOException
	{
		Explore_idea.click();
		return new allweather();
	}
	
}
