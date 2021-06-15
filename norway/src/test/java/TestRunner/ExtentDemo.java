package TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.wtc.staples.norway.TestBase;

public class ExtentDemo extends TestBase {
  static ExtentTest test;
  static ExtentReports report;

  @BeforeClass
  public static void startTest() {
    report = new ExtentReports();
    // test = ((Object) report).startTest("ExtentDemo");
  }

  @Test
  public void extentReportsDemo() {
    {
      // test.log(LogStatus.PASS, "Navigated to the specified URL");
    }
    // else
    {
      // test.log(LogStatus.FAIL, "Test Failed");
    }
  }

  @AfterClass
  public static void endTest() {
    // report.endTest(test);
    // report.flush();
  }
}


