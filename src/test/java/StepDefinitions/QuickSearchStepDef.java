package StepDefinitions;


import Pages.QuickSearch.QuickSearchLogic;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QuickSearchStepDef {
    QuickSearchLogic quickSearchLogic = new QuickSearchLogic();

    @Given("I am on BisCred Admin dashboard and want to search about contact")
    public void iAmOnBisCredAdminDashboardAndWantToSearchAboutContact() {
        quickSearchLogic.goToDashboard();
    }

    @When("I type any person name into quick search bar {string}")
    public void iTypeAnyPersonNameIntoQuickSearchBar(String text) throws InterruptedException{
        quickSearchLogic.SearchForAPersonOrCompany(text);
    }

    @Then("I should See options for matching names")
    public void iShouldSeeOptionsForMatchingNames() {
        quickSearchLogic.ValidateSearchForAPersonOption();
    }

    @When("I select a result from the dropdown")
    public void iSelectAResultFromTheDropdown() {
        quickSearchLogic.SelectSearchFromPersonOption();
    }

    @Then("I should see a person search results that correspond with the entered text")
    public void iShouldSeeAPersonSearchResultsThatCorrespondWithTheEnteredText() throws InterruptedException {
        quickSearchLogic.ValidatePersonSearchResults();
    }

    @Then("I should be redirect to person search results page")
    public void iShouldBeRedirectToTheSearchResultsPage() throws InterruptedException {
        quickSearchLogic.ValidatePersonSearchResultsPage();
    }

    @And("I should see summary panel with the selected contact result")
    public void iShouldSeeSummaryPanelWithTheSelectedContactResult() {
        quickSearchLogic.ValidateSearchResultsPanel();
    }

    @When("I type any company name into quick search bar {string}")
    public void iTypeAnyCompanyNameIntoQuickSearchBar(String Company) throws InterruptedException {
        quickSearchLogic.SearchForACompany(Company);
    }

    @Then("I should see a company search results that correspond with the entered text")
    public void iShouldSeeACompanySearchResultsThatCorrespondWithTheEnteredText() {
        quickSearchLogic.ValidateSearchForACompanyOption();
    }

    @Given("I am on BisCred Admin dashboard and want to search about company")
    public void iAmOnBisCredAdminDashboardAndWantToSearchAboutCompany() {
        quickSearchLogic.goToDashboard();
    }

    @And("I should see summary panel with the selected company result")
    public void iShouldSeeSummaryPanelWithTheSelectedCompanyResult() throws InterruptedException {
        quickSearchLogic.ValidateCompanyResultsPanel();
    }

    @When("I select a Company result from the dropdown")
    public void iSelectACompanyResultFromTheDropdown() {
        quickSearchLogic.SelectCompanyFromPersonOption();
    }

    @Given("I am on BisCred Admin dashboard and want to search about specific record")
    public void iAmOnBisCredAdminDashboardAndWantToSearchAboutSpecificRecord() {
        quickSearchLogic.goToDashboard();
    }


    @Then("I should See options for matching result")
    public void iShouldSeeOptionsForMatchingResult() {
        quickSearchLogic.ValidateSearchForAPersonOption();
    }

    @When("I Select a result from the dropdown")
    public void iSelectANewResultFromTheDropdown() {
        quickSearchLogic.SelectSearchFromPersonOption();
    }


    @And("I should be redirect to the search results page and see only the selected result")
    public void iShouldBeRedirectToTheSearchResultsPageAndSeeOnlyTheSelectedResult() throws InterruptedException {
        quickSearchLogic.ValidateSearchResultsPage();
    }

    @And("I should see summary panel with the selected result")
    public void iShouldSeeSummaryPanelWithTheSelectedResult() throws InterruptedException {
        quickSearchLogic.ValidateCompanyResultsPanel();
    }

    @When("I click on view all contacts results")
    public void iClickOnViewAllContactsResults() {
        quickSearchLogic.SelectAllResultsFromPersonOption();
    }

    @And("I should be redirect to the search results page and see many possible results returned")
    public void iShouldBeRedirectToTheSearchResultsPageAndSeeManyPossibleResultsReturned() throws InterruptedException {
        quickSearchLogic.ValidateSearchResultsPage();
    }

    @When("I click on any contact name")
    public void iClickOnAnyContactName() throws InterruptedException {
        quickSearchLogic.ClickOnFirstOptionOnResultsFromPersonOption();
    }

    @Then("I should be redirect to the search All results page and see many possible results returned")
    public void iShouldBeRedirectToTheSearchAllResultsPageAndSeeManyPossibleResultsReturned() throws InterruptedException {
        quickSearchLogic.ValidateAllSearchResultsPage();
    }

    @Given("I am on BisCred Admin dashboard and want to search about companies")
    public void iAmOnBisCredAdminDashboardAndWantToSearchAboutCompanies() {
        quickSearchLogic.goToDashboard();
    }

    @When("I click on view all companies results")
    public void iClickOnViewAllCompaniesResults() throws InterruptedException {
        quickSearchLogic.SelectAllCompanyResultsFromPersonOption();
    }

    @When("I click on any company name")
    public void iClickOnAnyCompanyName() throws InterruptedException {
        quickSearchLogic.ClickOnFirstOptionOnResultsFromPersonOption();
    }

    @Given("I am on BisCred Admin dashboard and want to start new search")
    public void iAmOnBisCredAdminDashboardAndWantToStartNewSearch() {
        quickSearchLogic.goToDashboard();
    }

    @When("I click on Start New Search button")
    public void iClickOnStartNewSearchButton() {
        quickSearchLogic.ClickOnNewSearchButton();
    }

    @And("I should be back to the landing page search page")
    public void iShouldBeBackToTheLandingPageSearchPage() {
        quickSearchLogic.CheckAdminDashboardAppears();
    }

    @Given("I am on BisCred Admin dashboard")
    public void iAmOnBisCredAdminDashboard() {
        quickSearchLogic.goToDashboard();
    }

    @When("I click on select and unselect checkboxes")
    public void iClickOnSelectAndUnselectCheckboxes() throws InterruptedException {
        quickSearchLogic.ClickOnSelectOptions();
    }

    @And("I should be able to selected and unselected contacts with a shown number of the selected numbers in the page footer")
    public void iShouldBeAbleToSelectedAndUnselectedContactsWithAShownNumberOfTheSelectedNumbersInThePageFooter() {
        quickSearchLogic.ValidateSelectionOptionsOnFooter();
    }

    @And("I should be able to selected and unselected companies with a shown number of the selected numbers in the page footer")
    public void iShouldBeAbleToSelectedAndUnselectedCompaniesWithAShownNumberOfTheSelectedNumbersInThePageFooter() {
        quickSearchLogic.ValidateSelectionOptionsOnFooter();
    }


    @When("I click on sort arrow beside person name")
    public void iClickOnSortArrowBesidePersonName() {
        quickSearchLogic.ClickOnSortArrow();
    }

    @And("I should see the results sorted alphabitaclly")
    public void iShouldSeeTheResultsSortedAlphabitaclly() throws InterruptedException {
        quickSearchLogic.ValidateSearchAllResultsSorted();
    }

    @And("I should see Items per page on the page bottom should be reflected on the shown data on the page")
    public void iShouldSeeItemsPerPageOnThePageBottomShouldBeReflectedOnTheShownDataOnThePage() {
        quickSearchLogic.ValidateSelectionOptionsOnFooter();
    }

    @When("I click on sort arrow beside companys name")
    public void iClickOnSortArrowBesideCompanysName() {
        quickSearchLogic.ClickOnSortArrow();
    }

    @When("I type a any value into quick search bar {string}")
    public void iTypeAAnyValueIntoQuickSearchBar(String text) throws InterruptedException {
        quickSearchLogic.SearchForACompany(text);
    }

    @And("I should be redirect to the company search results page")
    public void iShouldBeRedirectToTheCompanySearchResultsPage() throws InterruptedException {
        quickSearchLogic.ValidateCompanySearchResults();
    }

    @Then("I should be redirect to the companies search result page")
    public void iShouldBeRedirectToTheCompaniesSearchResultPage() throws InterruptedException {
        quickSearchLogic.ValidateCompaniesSearchResultsPage();
    }

    @Then("I should be redirect to person search result page")
    public void iShouldBeRedirectToPersonSearchResultPage() throws InterruptedException {
        quickSearchLogic.ValidatePersonSearchResultPage();
    }

    @Then("I should be redirect to the company searchs result page")
    public void iShouldBeRedirectToTheCompanySearchsResultPage() throws InterruptedException {
        quickSearchLogic.ValidateCompanySearchsResultPage();
    }

    @Then("I should see search results that correspond with the entered text {string}")
    public void iShouldSeeSearchResultsThatCorrespondWithTheEnteredText(String text) throws InterruptedException {
        quickSearchLogic.ValidateSearchResults(text);
    }
}
