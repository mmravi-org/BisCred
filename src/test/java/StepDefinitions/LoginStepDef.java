package StepDefinitions;

import Pages.Login.LoginLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class LoginStepDef {
    LoginLogic login = new LoginLogic();

    @Given("I am on BisCred Login Screen and want to log in as Admin")
    public void iAmOnBisCredLoginScreenAndWantToLogInAsAdmin() throws IOException, InterruptedException {
        login.goToBisCredLogin();
    }

    @When("I enter valid email and password")
    public void iEnterValidEmailAndPassword() throws InterruptedException {
        login.EnterAdminCredentials();
    }

    @Then("I should see Admin Dashboard")
    public void CheckAdminDashboardAppears() throws InterruptedException {
        login.CheckAdminDashboardAppears();
    }


    @And("I click on Sign In Button")
    public void iClickOnSignInButton() {
        login.clickOnSignInButton();
    }
}
