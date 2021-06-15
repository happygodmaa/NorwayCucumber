package stepDefinition;

import org.testng.Assert;
import Pages.ParallelExecutionPage;
import io.cucumber.java.en.Given;

public class ParallelExecutionStepDef extends ParallelExecutionPage {

  ParallelExecutionPage pep;

  public ParallelExecutionStepDef() {
    initialization();
  }

  @Given("User go to cucumber page")
  public void user_go_to_cucumber_page() {
    pep.verifyButtons();
    Assert.assertTrue(introductionButton.isDisplayed());
  }
}
