package stepDefinition;

import java.util.List;
import java.util.Map;
import Pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginDatMapStepDef2 {

  LoginPage lp;

  public LoginDatMapStepDef2() {
    lp = new LoginPage();
  }


  @Given("User4 navigate to Login Page")
  public void User2_navigate_to_Login_Page() {
    lp.setup();
  }

  @When("User4 Enters user and password")
  public void User2_Enters_user_and_password(DataTable credential) {
    List<Map<String, String>> list3 = credential.asMaps();



    // lp.loginToAccount(u, p);
  }


}



/*
 * Given User2 navigate to Login Page When User2 Enters user and password |userid| password|
 * |nik200| pass200| |nik16| pass16| Then User2 close all browser
 * 
 * 
 */
