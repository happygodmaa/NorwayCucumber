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
    path = "\\config.properties";
    try {
      fis = new FileInputStream(path);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      prop.load(fis);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  public void initialization() {

    // System.setProperty("webdriver.gecko.driver", "D:\\javaPractice\\selenium\\geckodriver.exe");
    System.setProperty("webdriver.chrome.driver",
        "D:\\javaPractice\\selenium\\driver_selenium_grid\\chromedriver.exe");
    driver = new ChromeDriver();
    wait = new WebDriverWait(driver, 20);
    driver.get(prop.getProperty("url"));
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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

