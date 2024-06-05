package StepDefinitions;


import Pages.QuickSearchIcon.QuickSearchIconLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class QuickSearchIconStepDef {
    QuickSearchIconLogic quickSearchIconLogic = new QuickSearchIconLogic();
    @Given("I am on BisCred List Page and want to search using quick search icon")
    public void iAmOnBisCredListPageAndWantToSearchAboutCompanyUsingQuickSearchIcon() {
        quickSearchIconLogic.iAmOnBisCredListPageAndWantToSearchAboutCompanyUsingQuickSearchIcon();
    }

    @When("I click on search Icon on top nav menu")
    public void iClickOnSearchIconOnTopNavMenu() throws InterruptedException {
        quickSearchIconLogic.clickOnSearchIconOnTopNavMenu();
    }

    @Then("I should see a search icon pop up display")
    public void iShouldSeeASearchIconPopUpDisplay() throws InterruptedException {
        quickSearchIconLogic.validateSeeASearchIconPopUpDisplay();
    }

    @When("I type any company name into quick search bar")
    public void iTypeAnyCompanyNameIntoQuickSearchBar() throws InterruptedException {
        quickSearchIconLogic.iTypeAnyCompanyNameIntoQuickSearchBar();
    }

    @When("I type any contact name into quick search bar")
    public void iTypeAnyContactNameIntoQuickSearchBar() {
        quickSearchIconLogic.iTypeAnyContactNameIntoQuickSearchBar();
    }

    @When("I click on ctrl + k Keys at the same time")
    public void iClickOnCtrlKKeysAtTheSameTime() throws InterruptedException {
        quickSearchIconLogic.iClickOnCtrlKKeysAtTheSameTime();
    }

    @Then("I should see the search pop up closed")
    public void iShouldSeeTheSearchPopUpClosed() throws InterruptedException {
        quickSearchIconLogic.validateSearchPopUpClosed();
    }

    @When("I click Esc key from keyboard")
    public void iClickEscKeyFromKeyboard() {
        quickSearchIconLogic.clickOnEscKKeys();
    }

    @When("I click anywhere outside the module")
    public void iClickAnywhereOutsideTheModule() {
        quickSearchIconLogic.clickAnywhereOutsideTheModule();
    }

    @When("I click on Recent Search tab")
    public void iClickOnRecentSearchTab() {
        quickSearchIconLogic.clickOnRecentSearchTab();
    }

    @Then("I should be redirect to the search results page")
    public void iShouldBeRedirectToTheSearchResultsPage() throws InterruptedException {
        quickSearchIconLogic.validateRedirectToTheSearchResultsPage();
    }

    @Then("I should see search results that correspond with the entered text")
    public void iShouldSeeSearchResultsThatCorrespondWithTheEnteredText() throws InterruptedException {
        quickSearchIconLogic.validateRedirectToTheSearchResultsPage();
    }
}
