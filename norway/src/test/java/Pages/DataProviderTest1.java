package Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.wtc.staples.norway.DataProvider1;

public class DataProviderTest1 {
  LoginPageParameters lp;

  public DataProviderTest1() {
    lp = new LoginPageParameters();
  }

  @Test(dataProvider = "dpname", dataProviderClass = DataProvider1.class)
  public void LoginAccount(String un, String pwd) {
    lp.loginToAccount(un, pwd);
  }


  @BeforeMethod
  public void homPageNavigation() {
    lp.setup();
  }

  @AfterMethod
  public void closeBrowser() {
    lp.tearDown();
  }
}
