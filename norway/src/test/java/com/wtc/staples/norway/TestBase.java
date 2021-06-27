package com.wtc.staples.norway;

import static org.testng.Assert.assertTrue;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class TestBase {
  protected WebDriver driver;
  protected WebDriverWait wait;
  Properties prop;
  String path;
  FileInputStream fis;

  public TestBase() {
    path =
        "C:\\Users\\nkumar\\git\\NorwayCucumber\\norway\\src\\test\\java\\com\\wtc\\staples\\norway\\Config.properties";
    try {
      fis = new FileInputStream(path);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      prop = new Properties();
      prop.load(fis);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void initialization() {
    // FFInstanceCreation();
    ChromeInstanceCreation();
    wait = new WebDriverWait(driver, 20);
    // driver.get("https://www.google.com");
    driver.get(prop.getProperty("url"));
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

  }

  public void ChromeInstanceCreation() {
    // System.setProperty("webdriver.gecko.driver", "D:\\javaPractice\\selenium\\geckodriver.exe");
    System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\nkumar\\git\\NorwayCucumber\\norway\\src\\main\\resources\\profiles\\drivers\\chromedriver_win32_91.0.4472.101\\chromedriver.exe");
    // Open chrome in Incognito mode
    /*
     * ChromeOptions options = new ChromeOptions(); options.addArguments("--incognito");
     * DesiredCapabilities capabilities = new DesiredCapabilities();
     * capabilities.setCapability(ChromeOptions.CAPABILITY, options); options.merge(capabilities);
     * ChromeDriver driver = new ChromeDriver(options);
     * driver.get("http://demo.guru99.com/test/simple_context_menu.html");
     * driver.manage().window().maximize();
     */
    // accept SSL certificates on websites by default
    /*
     * Create an object of desired capabilities class with Chrome driver DesiredCapabilities
     * SSLCertificate = DesiredCapabilities.chrome(); Set the pre defined capability –
     * ACCEPT_SSL_CERTS value to true SSLCertificate.setCapability(CapabilityType.ACCEPT_SSL_CERTS,
     * true); Open a new instance of chrome driver with the desired capability WebDriver driver =
     * new ChromeDriver(SSLCertificate);
     */
    DesiredCapabilities capabilities = new DesiredCapabilities();

    driver = new ChromeDriver();

  }



  public void FFInstanceCreation() {
    System.setProperty("webdriver.gecko.driver",
        "C:\\Users\\nkumar\\git\\NorwayCucumber\\norway\\src\\main\\resources\\profiles\\drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
  }

  public boolean isElementPresent(final By by) {
    try {
      new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(by));

    } catch (TimeoutException exception) {
      return false;
    }
    return true;
  }

  public boolean isElementVisible(final By by) {
    try {
      new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(by));

    } catch (TimeoutException exception) {
      return false;
    }
    return true;
  }

  public void customAssertFailure(By by) {
    // LOG.error("Failed to locate element: [ " + by + " ]");
    assertTrue(false, "Failed to locate element: [ " + by + " ]");
  }

  private ExpectedCondition<WebElement> visibilityOfElementLocated(final By by)
      throws NoSuchElementException {
    return driver -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      WebElement element = driver.findElement(by);
      return element.isDisplayed() ? element : null;
    };
  }

  protected WebElement waitForExpectedElement(final By by) {
    return wait.until(visibilityOfElementLocated(by));
  }


}

