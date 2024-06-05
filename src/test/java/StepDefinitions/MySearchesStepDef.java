package StepDefinitions;


import Pages.MySearches.MySearchesLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySearchesStepDef {
    MySearchesLogic mySearchesLogic = new MySearchesLogic();
    @When("I click on first recent search")
    public void iClickOnFirstRecentSearch() throws InterruptedException {
        mySearchesLogic.clickOnRecentSearch();
    }

    @And("I should see results matches with the search criteria displayed in the recent search box")
    public void iShouldSeeResultsMatchesWithTheSearchCriteriaDisplayedInTheRecentSearchBox() throws InterruptedException {
        mySearchesLogic.ValidateRecentSearchResults();
    }

    @And("I back to dashboard page")
    public void iBackToDashboardPage() {
        mySearchesLogic.goToDashboard();
    }

    @And("I should see recent result for first recent search matching the applied search")
    public void iShouldSeeRecentResultForFirstRecentSearchMatchingTheAppliedSearch() throws InterruptedException {
        mySearchesLogic.ValidateRecentSearchResults();
    }

    @And("I should see the recent search date match the current date")
    public void iShouldSeeTheRecentSearchDateMatchTheCurrentDate() throws InterruptedException {
        mySearchesLogic.ValidateTheDate();
    }

    @When("I Click on the back arrow on the left side of the page")
    public void iClickOnTheBackArrowOnTheLeftSideOfThePage() {
        mySearchesLogic.goToDashboard();
    }

    @Then("I should be navigated to the home page again-recent searches boxes")
    public void iShouldBeNavigatedToTheHomePageAgainRecentSearchesBoxes() {
        mySearchesLogic.CheckAdminDashboardAppears();
    }

    @And("I click on Save search Button")
    public void iClickOnSaveSearchButton() throws InterruptedException {
        mySearchesLogic.clickOnSavedSearch();
    }

    @And("I type the name of the Saved search")
    public void iTypeTheNameOfTheSavedSearch() {
        mySearchesLogic.TypeSavedSearchName();
    }

    @Then("I click on Submit button")
    public void iClickOnSubmitButton() {
        mySearchesLogic.clickOnSubmitSavedSearch();
    }

    @And("I click on saved search tab again")
    public void iClickOnSavedSearchTabAgain() {
        mySearchesLogic.clickOnSavedSearchTab();
    }



    @And("I should see a saved searches shown on the dashboard")
    public void iShouldSeeASavedSearchesShownOnTheDashboard() {
        mySearchesLogic.ShouldSeeASavedSearchesShownOnTheDashboard();
    }



}
