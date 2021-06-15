package stepDefinition;

import java.util.List;
import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataTableStepDef {
  LoginPage lp;

  public LoginDataTableStepDef() {
    lp = new LoginPage();
  }

  @Given("User1 navigate to Login Page")
  public void user_navigate_to_login_page() {
    lp.setup();
  }

  @When("User1 Enters <uid> and <pass>")
  public void user_enters_uid_and_pass(DataTable credential) {
    List<List<String>> list1 = credential.asLists();
    lp.loginToAccount(list1.get(1).get(0), list1.get(1).get(1));
  }


  @Then("User1 close all browser")
  public void user_close_all_browser() {
    lp.tearDown();
  }

}


