package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

	static WebDriver driver;

	public static WebDriver start() {

//		System.setProperty("webdriver.chrome.driver", "");

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://github.com/0KartikRaut0/Automation_Selenium/blob/main/pom.xml");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;

	}

	public static WebDriver close() {

		driver.close();
		System.out.println("jh");

		return driver;
	}
	
	public static void main(String[] args) {
		
		Chrome.start();
		Chrome.close();
	}

}
