package TestRunner;


import java.io.File;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import com.vimalselvam.cucumber.listener.Reporter;
import com.wtc.staples.norway.FileReaderManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "C:\\Users\\nkumar\\eclipse-workspace\\norway\\src\\test\\java\\feature",
    glue = "stepDefinition", dryRun = true, tags = "@test2 or @test6",
    plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json",
        "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
// ,plugin = "com.cucumber.listener.ExtentCucumberFormatter::target/cucumber-reports/report.html"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

  @DataProvider(parallel = true)
  public Object[][] scenarios() {
    return super.scenarios();
  }

  @AfterClass
  public static void writeExtentReport() {
    Reporter.loadXMLConfig(new File(
        FileReaderManager.getFileReaderManager().getConfigFileReader().getReportConfigPath()));



  }


  // https://www.toolsqa.com/extent-report/extent-report-for-cucumber-testng-project/

  // @AfterClass
  // public static void writeExtentReport() {
  // Reporter.loadXMLConfig(new
  // File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
  // }
}

// tags = "not @test6"
// = "@test6 or @test5"-----feature file has either of one tag
//
// = "@test6 and @test5"----feature file has both tag
