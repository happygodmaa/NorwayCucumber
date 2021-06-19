package Browser;

import org.openqa.selenium.firefox.FirefoxDriver;
import com.wtc.staples.norway.TestBase;

public class FirefoxBrowser extends TestBase {


  public void FFInstanceCreation() {
    System.setProperty("webdriver.gecko.driver",
        "C:\\Users\\nkumar\\git\\NorwayCucumber\\norway\\src\\main\\resources\\profiles\\drivers\\geckodriver.exe");
    driver = new FirefoxDriver();
  }

}
