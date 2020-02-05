package QA_pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import QA_Base.Base_class;

public class Portfolio_Performance extends Base_class {

	@FindBy(xpath="(//div[@class='col-md-2']/a)[2]")
	WebElement customize;
	@FindBy(xpath="(//a[contains(text(),'Add Stock')])[1]")
	WebElement addstock;
	@FindBy(xpath="(//button[@data-allocation-name='US EQUITIES'])[65]")
	WebElement stockadd;
	@FindBy(xpath="(//button[contains(text(),'Done')])[1]")
	WebElement Done;
	@FindBy(xpath="//*[contains(text(),'BT Group plc')]")
	WebElement created;
	@FindBy(xpath="(//div[@class='col-md-2']/a)[1]")
	WebElement rebalance;
	@FindBy(xpath="(//div[@class='col-md-2']/a)[3]")
	WebElement invest;
	
	
	
	
	public Portfolio_Performance() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void clickoncustomize() {
		customize.click();
	}

	public void Reset1() {
		String actual=customize.getText();
		Assert.assertEquals(actual, "Reset");
	}
	public void clickonaddstock() {
		addstock.click();
	}

	public void clickonstockadd() {
		stockadd.click();
	}
	public void clickondone() {
		Done.click();
	}
	
	public void created() {
		String actualcreated=created.getText();
		Assert.assertEquals(actualcreated, "BT Group plc");
	}
	
	public void slider() {
		WebElement slider = driver.findElement(By.xpath("(//input[@type='range'])[1]"));
	     Actions move = new Actions(driver);
	     move.dragAndDropBy(slider, 1, 0).build().perform();
	}
	public void clickonrebalance() {
		rebalance.click();
	}
	public void clickoninvest() {
		invest.click();
	}
      
    
}
