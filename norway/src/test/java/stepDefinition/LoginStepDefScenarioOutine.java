package stepDefinition;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefScenarioOutine {
  LoginPage lp = new LoginPage();

  @Given("User0 navigate to Login Page")
  public void user0_navigate_to_login_page() {
    lp.setup();
  }

  @When("User0 Enters {string} and {string}")
  public void user0_enters_and(String un, String pwd) {
    lp.loginToAccount(un, pwd);
  }

  @Then("User0 close all browser")
  public void user0_close_all_browser() {
    lp.tearDown();
  }

}
