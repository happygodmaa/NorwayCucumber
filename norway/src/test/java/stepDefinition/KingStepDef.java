package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class KingStepDef {


  @When("you are on homePage")
  public void m4() {
    System.out.println("homepage bhai");
  }

  @Then("you are King")
  public void m5() {
    System.out.println("king bhai");
  }

}
