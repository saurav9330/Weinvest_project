package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import QA_Base.Base_class;
import QA_pages.Homepage;
import QA_pages.Portfolio_Performance;
import QA_pages.allweather;


public class Loginpage_testcase extends Base_class {

	Homepage hp;
	allweather all;
	Portfolio_Performance pp;
	
	public Loginpage_testcase() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		hp=new Homepage();
		all=new allweather();
		pp=new Portfolio_Performance();
			
	}
	
	@Test(priority=1)
	public void assignment2() throws IOException, InterruptedException {
		
		all=hp.clickonexploreidea();
		pp=all.clickonexploreidea();
		pp.clickoncustomize();
		pp.Reset1();
		Thread.sleep(1000);
		pp.clickonaddstock();
		Thread.sleep(2000);
		pp.clickonstockadd();
		pp.created();
		
	}
	
	@Test(priority=2)
	public void assignment1() throws IOException {
		all=hp.clickonexploreidea();
		pp=all.clickonexploreidea();
		pp.clickoncustomize();
		pp.slider();
		pp.clickonrebalance();
		pp.clickoninvest();
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
}
