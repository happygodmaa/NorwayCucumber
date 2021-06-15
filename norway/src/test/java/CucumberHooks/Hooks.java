package CucumberHooks;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.vimalselvam.cucumber.listener.Reporter;
import com.wtc.staples.norway.TestBase;
import com.wtc.staples.norway.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.messages.internal.com.google.common.io.Files;

public class Hooks extends TestBase {

  TestContext testContext;

  public Hooks(TestContext context) {
    testContext = context;
  }

  @Before(order = 2)
  public void m11() {
    System.out.println("run before everyscenario-order2");
  }

  @Before(order = 3)
  public void m111() {
    System.out.println("run before everyscenario-order2");
  }

  @After
  public void m2() {
    System.out.println("run after everyscenario");
  }

  @BeforeStep(order = 1)
  private void m3() {
    System.out.println("run before everyscenario- beforestep--order1");
  }

  @BeforeStep(order = 2)
  private void m33() {
    System.out.println("run before everyscenario- beforestep--order2");
  }

  @AfterStep
  public void m4() {
    System.out.println("run before everyscenario");
  }

  @After(order = 1)
  public void afterScenario(Scenario scenario) {
    if (scenario.isFailed()) {
      String screenshotName = scenario.getName().replaceAll(" ", "_");
      try {
        // This takes a screenshot from the driver at save it to the specified location
        // File sourcePath = ((TakesScreenshot)
        // testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
        File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Building up the destination path for the screenshot to save
        // Also make sure to create a folder 'screenshots' with in the cucumber-report folder
        File destinationPath = new File(System.getProperty("user.dir")
            + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");

        // Copy taken screenshot from source location to destination location
        Files.copy(sourcePath, destinationPath);

        // This attach the specified screenshot to the test
        Reporter.addScreenCaptureFromPath(destinationPath.toString());
      } catch (IOException e) {
      }
    }
  }

}
