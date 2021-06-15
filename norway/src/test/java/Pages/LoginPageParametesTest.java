package Pages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageParametesTest {
  LoginPageParameters lp;

  public LoginPageParametesTest() {
    lp = new LoginPageParameters();
  }

  @BeforeClass
  public void homPageNavigation() {
    lp.setup();
  }

  @Parameters({"userid", "password"})
  @Test
  public void LoginAccount(String un, String pwd) {
    lp.loginToAccount(un, pwd);
  }

  @AfterClass
  public void closeBrowser() {
    lp.tearDown();
  }

}
