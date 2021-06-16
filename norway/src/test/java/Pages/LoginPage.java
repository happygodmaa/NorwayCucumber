package Pages;

import org.openqa.selenium.By;
import com.wtc.staples.norway.TestBase;

public class LoginPage extends TestBase {
  private By loginButton = By.cssSelector("#login2");
  private By loginUser = By.cssSelector("#loginusername");
  private By loginPass = By.cssSelector("#loginpassword");
  private By loginOnPopup = By.cssSelector("button[onclick=\"logIn()\"]");
  private By closeButton = By.xpath("//button[@onclick='logIn()']/preceding-sibling::button");
  private By closeButton2 = By.xpath("//button[@onclick='logIn2()']/preceding-sibling::button");

  public void setup() {
    initialization();
  }

  public void tearDown() {
    driver.close();
  }

  public void loginToAccount(String u, String p) {
    if (isElementPresent(loginButton)) {
      waitForExpectedElement(loginButton).click();
    } else {
      customAssertFailure(loginButton);
    }

    if (isElementPresent(loginUser)) {
      waitForExpectedElement(loginUser).sendKeys(u);
    } else {
      customAssertFailure(loginUser);
    }

    if (isElementPresent(loginPass)) {
      waitForExpectedElement(loginPass).sendKeys(p);
    } else {
      customAssertFailure(loginPass);
    }

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    if (isElementPresent(closeButton)) {
      waitForExpectedElement(closeButton).click();
    } else {
      customAssertFailure(closeButton);
    }
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
