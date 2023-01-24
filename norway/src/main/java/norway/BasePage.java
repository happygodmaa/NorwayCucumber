package norway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	private static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();		
		driver.get("https://www.toolsqa.com/selenium-webdriver/webdrivermanager/");
		
		WebElement e1;
		
		Actions myAction= new Actions(driver);
		
		

	}

}
