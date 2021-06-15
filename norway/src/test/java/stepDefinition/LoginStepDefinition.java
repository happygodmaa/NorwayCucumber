package stepDefinition;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
  LoginPage lp;

  public LoginStepDefinition() {
    lp = new LoginPage();
  }



  @Given("User navigate to Login Page")
  public void user_navigate_to_login_page() {
    lp.setup();
  }

  @When("User Enters {string} and {string}")
  public void user_enters_userid_and_password(String u, String p) {
    lp.loginToAccount(u, p);
  }

  @Then("User close all browser")
  public void user_close_all_browser() {
    lp.tearDown();
  }



}
/*
 * Scenario Outline
 * 
 * @When("User Enters {string} and {string}") // @When("^User Enters \"(.*)\" and \"(.*)\"$") public
 * void user_enters_userid_and_password(String un, String pwd) { LoginPage.loginUser.sendKeys(un);
 * System.out.println("user-----" + un); LoginPage.loginPass.sendKeys(pwd);
 * LoginPage.loginOnPopup.click(); }
 */
