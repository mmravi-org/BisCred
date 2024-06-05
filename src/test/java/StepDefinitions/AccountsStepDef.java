package StepDefinitions;

import Pages.Accounts.AccountsLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class AccountsStepDef {
    AccountsLogic accountsLogic = new AccountsLogic();

    @Given("I am on BisCred Accounts page and want to Create new account")
    public void iAmOnBisCredAccountsPageAndWantToCreateNewAccount() throws InterruptedException {
        accountsLogic.iAmOnBisCredAccountsPage();
    }

    @When("I click on Create account button")
    public void iClickOnCreateAccountButton() throws InterruptedException {
        accountsLogic.clickOnCreateAccountButton();
    }

    @Then("I should be redirected to create account page")
    public void iShouldBeRedirectedToCreateAccountPage() throws InterruptedException {
        accountsLogic.validateAccountsPage();
    }

    @When("I fill the form with valid data")
    public void iFillTheFormWithValidData() throws InterruptedException {
        accountsLogic.FillTheAccountFormWithValidData();

    }

    @And("click on Create account button")
    public void clickOnCreateAccountButton() {
        accountsLogic.clickOnCreateAccountButtonInsideAccountPage();
    }

    @Then("I should see a success message {string}")
    public void iShouldSeeASuccessMessage(String message) throws InterruptedException {
        accountsLogic.validateSuccessMessageForAddingNewAccount(message);
    }

    @And("I should be redirected to the Account Management page")
    public void iShouldBeRedirectedToTheAccountManagementPage() throws InterruptedException {
        accountsLogic.validateAccountsManagementPage();
    }

    @When("I fill the account name with name already exist")
    public void iFillTheAccountNameWithNameAlreadyExist() throws InterruptedException {
        accountsLogic.FillTheAccountNameWithNameAlreadyExist();
    }

    @And("I fill the other fields with valid data")
    public void iFillTheOtherFieldsWithValidData() throws InterruptedException {
        accountsLogic.FillTheAccountFormWithoutName();
    }

    @And("I should see error message under the Name field {string}")
    public void iShouldSeeErrorMessageUnderTheNameField(String message) {
        accountsLogic.validateMassageExistingName(message);
    }

    @And("I should be redirected to the Account details page")
    public void iShouldBeRedirectedToTheAccountDetailsPage() throws InterruptedException {
        accountsLogic.validateAccountsDetailsPage();
    }

    @When("I fill the account name field with empty data")
    public void iFillTheAccountNameFieldWithEmptyData() throws InterruptedException {
        accountsLogic.FillTheAccountFormWithEmptyName();
    }

    @When("I fill the company Name field with empty data")
    public void iFillTheCompanyNameFieldWithEmptyData() throws InterruptedException {
        accountsLogic.FillTheAccountFormWithEmptyCompany();
    }

    @Then("I should see an error message under company Name {string}")
    public void iShouldSeeAnErrorMessageUnderCompanyName(String message) {
        accountsLogic.validateMassageCompanyName(message);
    }

    @Then("I should see an error message under number of Seats {string}")
    public void iShouldSeeAnErrorMessageUnderNumberOfSeats(String message) {
        accountsLogic.validateMassageNumberOfSeats(message);
    }

    @When("I fill the Number of Seats field with empty data")
    public void iFillTheNumberOfSeatsFieldWithEmptyData() throws InterruptedException {
        accountsLogic.FillTheAccountFormWithEmptyNumberOfSeats();
    }

    @And("I click on Account Active check box")
    public void iClickOnAccountActiveCheckBox() throws InterruptedException {
        accountsLogic.ClickOnAccountActiveCheckBox();
    }

    @When("I search about the created account")
    public void iSearchAboutTheCreatedAccount() {
        accountsLogic.SearchAboutTheCreatedAccount();
    }

    @When("I fill the form with inactive Account")
    public void iFillTheFormWithInactiveAccount() throws InterruptedException {
        accountsLogic.FillTheAccountFormWithInactiveAccount();
    }

    @Then("it should retains the created account with status inactive")
    public void itShouldRetainsTheCreatedAccountWithStatusInactive() throws InterruptedException {
        accountsLogic.RetainsTheCreatedAccountWithStatusInactive();
    }

    @And("I click on the account main menu")
    public void iClickOnTheAccountMainMenu() throws InterruptedException {
        accountsLogic.iAmOnBisCredAccountsPage();
    }

    @When("I left all the fields empty")
    public void iLeftAllTheFieldsEmpty() throws InterruptedException {
        accountsLogic.FillTheAccountFormWithAllFieldEmpty();
    }

    @Given("I am on BisCred Accounts page and want to search about an account")
    public void iAmOnBisCredAccountsPageAndWantToSearchAboutAnAccount() throws InterruptedException {
        accountsLogic.iAmOnBisCredAccountsPage();
    }

    @When("I fill on search field with any account name")
    public void iFillOnSearchFieldWithAnyAccountName() {
        accountsLogic.SearchAboutAccountFunctionality();
    }

    @Then("I should see the correct account retains successfully")
    public void iShouldSeeTheCorrectAccountRetainsSuccessfully() throws InterruptedException {
        accountsLogic.RetainsAccountWithCorrectValue();
    }

    @Given("I am on BisCred Accounts page and want to Check All filter Status")
    public void iAmOnBisCredAccountsPageAndWantToCheckAllFilterStatus() throws InterruptedException {
        accountsLogic.iAmOnBisCredAccountsPage();
    }

    @Then("I should see all the users related to this account")
    public void iShouldSeeAllTheUsersRelatedToThisAccount() throws InterruptedException {
        accountsLogic.RetainsAccountWithUsersRelated();
    }

    @And("I should see the correct status for this account")
    public void iShouldSeeTheCorrectStatusForThisAccount() throws InterruptedException {
        accountsLogic.RetainsAccountWithStatusRelated();
    }

    @Given("I am on BisCred Accounts page and want to edit an account")
    public void iAmOnBisCredAccountsPageAndWantToEditAnAccount() throws InterruptedException {
        accountsLogic.iAmOnBisCredAccountsPage();
    }

    @When("I click on edit link")
    public void iClickOnEditLink() throws InterruptedException {
        accountsLogic.ClickOnEditLink();
    }

    @Then("I should be redirected to Edit Account page")
    public void iShouldBeRedirectedToEditAccountPage() throws InterruptedException {
        accountsLogic.validateEditAccountPage();
    }

    @When("I update the form fields")
    public void iUpdateTheFormFields() throws InterruptedException {
        accountsLogic.UpdateAccountForm();
    }

    @And("I click on Update Account Button")
    public void iClickOnUpdateAccountButton() throws InterruptedException {
        accountsLogic.ClickOnUpdateAccountButton();
    }

    @When("I click on All filter")
    public void iClickOnAllFilter() throws InterruptedException {
        accountsLogic.ClickOnAllFilter();
    }


    @Then("I should see the correct account results {string}")
    public void iShouldSeeTheCorrectAccountResults(String message) throws InterruptedException {
        accountsLogic.validateSearchResultsMatchedTheActiveStatus(message);

    }

    @And("I should see an error message below the account name")
    public void iShouldSeeAnErrorMessageBelowTheAccountName() {
        accountsLogic.validateMassageExistingAccountName();
    }

    @Given("I am on BisCred Accounts page and want to sort the Fields alphabetically")
    public void iAmOnBisCredAccountsPageAndWantToSortTheFieldsAlphabetically() throws InterruptedException {
        accountsLogic.iAmOnBisCredAccountsPage();
    }

    @Then("I should see the names are sorting alphabetically")
    public void iShouldSeeTheNamesAreSortingAlphabetically() {
     accountsLogic.iShouldSeeTheNamesAreSortingAlphabetically();
    }

    @When("I click on the arrows beside the name field")
    public void iClickOnTheArrowsBesideTheNameField() throws InterruptedException {
        accountsLogic.ClickOnTheArrowsBesideTheNameField();
    }

    @When("I click on the arrows beside the company field")
    public void iClickOnTheArrowsBesideTheCompanyField() throws InterruptedException {
        accountsLogic.ClickOnTheArrowsBesideCompanyField();
    }

    @Then("I should see the companies are sorting alphabetically")
    public void iShouldSeeTheCompaniesAreSortingAlphabetically() {
        accountsLogic.iShouldSeeTheCompaniesAreSortingAlphabetically();
    }

    @When("I click on the arrows beside the Status field")
    public void iClickOnTheArrowsBesideTheStatusField() throws InterruptedException {
        accountsLogic.ClickOnTheArrowsBesideStatusField();
    }

    @Then("I should see the Statuses are sorting alphabetically")
    public void iShouldSeeTheStatusesAreSortingAlphabetically() {
        accountsLogic.iShouldSeeTheStatusesAreSortingAlphabetically();
    }

    @When("I click on the arrows beside the Seats field")
    public void iClickOnTheArrowsBesideTheSeatsField() throws InterruptedException {
        accountsLogic.ClickOnTheArrowsBesideSeatsField();
    }

    @Then("I should see the Seats are sorting descending")
    public void iShouldSeeTheSeatsAreSortingDescending() {
        accountsLogic.iShouldSeeTheSeatsAreSortingAlphabetically();
    }

    @When("I update the account name with name already exist")
    public void iUpdateTheAccountNameWithNameAlreadyExist() throws InterruptedException {
        accountsLogic.UpdateTheAccountNameWithNameAlreadyExist();
    }

    @And("I update the other fields with valid data")
    public void iUpdateTheOtherFieldsWithValidData() throws InterruptedException {
        accountsLogic.UpdateTheAccountFormWithoutName();
    }

    @When("I update the account name field with empty data")
    public void iUpdateTheAccountNameFieldWithEmptyData() throws InterruptedException {
        accountsLogic.UpdateTheAccountFormWithEmptyName();
    }

    @When("I update the company Name field with empty data")
    public void iUpdateTheCompanyNameFieldWithEmptyData() throws InterruptedException {
        accountsLogic.UpdateTheAccountFormWithEmptyCompany();
    }

    @When("I update the seats Name field with empty data")
    public void iUpdateTheSeatsNameFieldWithEmptyData() throws InterruptedException {
        accountsLogic.UpdateTheAccountFormWithEmptySeats();
    }

    @Then("I should see the correct account results")
    public void iShouldSeeTheCorrectAccountResults() throws InterruptedException {
        accountsLogic.validateSearchResultsMatchedAllStatus();
    }

    @When("I fill on search field with account name")
    public void iFillOnSearchFieldWithAccountName() {
        accountsLogic.SearchAboutAccount();
    }

    @Then("I should see No users related to this account")
    public void iShouldSeeNoUsersRelatedToThisAccount() throws InterruptedException {
        accountsLogic.RetainsAccountWithNoUsersRelated();
    }

    @When("I fill on search field with any account names")
    public void iFillOnSearchFieldWithAnyAccountNames() {
        accountsLogic.SearchAccountFunctionality();
    }
}
