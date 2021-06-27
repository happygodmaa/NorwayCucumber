package stepDefinition;

import java.util.List;
import java.util.Map;
import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDataMapStepDef {
  LoginPage lp;

  public LoginDataMapStepDef() {
    lp = new LoginPage();
  }

  @Given("User2 navigate to Login Page")
  public void user_navigate_to_login_page() {
    lp.setup();
  }

  @When("User2 Enters user and password")
  public void user_enters_user_and_pass(DataTable credential) {
    List<Map<String, String>> list2 = credential.asMaps(String.class, String.class);

    for (int i = 0; i < 2; i++) {
      lp.loginToAccount(list2.get(i).get("userid"), list2.get(i).get("password"));
    }
  }

  @Then("User2 close all browser")
  public void user_close_all_browser() {
    lp.tearDown();
  }

}


