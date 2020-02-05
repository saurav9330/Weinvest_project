package QA_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {

	public static WebDriver driver;
	public static Properties prop;
	
	public Base_class() throws IOException
	{
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\91904\\Weinvest_project\\src\\main\\java\\QA_config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91904\\Desktop\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91904\\Desktop\\Selenium\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
}
}
