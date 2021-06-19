package TestRunner;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\nkumar\\git\\NorwayCucumber\\norway\\src\\test\\resources\\feature",
    glue = "stepDefinition", dryRun = false, tags = "@test2", plugin = {"pretty",
        "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"
    // ,"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
    }
// ,plugin = "com.cucumber.listener.ExtentCucumberFormatter::target/cucumber-reports/report.html"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }

  // @AfterClass
  // public static void writeExtentReport() {
  // Reporter.loadXMLConfig(new File(
  // FileReaderManager.getFileReaderManager().getConfigFileReader().getReportConfigPath()));
  // }


}

// tags = "not @test6"
// = "@test6 or @test5"-----feature file has either of one tag
//
// = "@test6 and @test5"----feature file has both tag
