package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	//System.setProperty("webdriver.chrome.driver","");
	
	//WebDriver driver = new ChromeDriver();
	
//	driver.get("www.google.com");
	
	WebDriverManager.chromedriver().setup();
	
	
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(5000);
	
	driver.manage().window().maximize();
	
	driver.get("https://github.com/0KartikRaut0/Automation_Selenium/blob/main/pom.xml");
	
	
	
	}
	
}
