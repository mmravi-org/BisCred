package Pages.QuickSearch;


import org.openqa.selenium.interactions.Actions;

public class QuickSearchLogic extends QuickSearchPO {

    public QuickSearchLogic(){
            super();
        }

    public void goToDashboard() {
        goToURL("https://dashboard.beta.biscred.net/");
    }

    public void SearchForAPersonOrCompany(String text) throws InterruptedException {
    Thread.sleep(500);
    clickOnElement(SearchTextField);
    sendElementText(SearchTextField, text);
    }

    public void ValidateSearchForAPersonOption() {
        waitForVisibility(SearchOptions,30);
        assertDisplayed(SearchOptions);
    }

    public void SelectSearchFromPersonOption() {
        waitSeconds(30);
       clickOnElement(quickSearchInputContainer);
    }

    public void ValidateSearchResults(String text) throws InterruptedException {
        Thread.sleep(2000);
        assertElementContainsText(CompanySearchResults,text);
    }

    public void ValidateCompanySearchResults() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(CompanySearchResultPage);
    }

    public void ValidatePersonSearchResults() throws InterruptedException {
        Thread.sleep(500);
        assertDisplayed(PersonSearchResults.get(0));
//        assertElementContainsText(PersonSearchResults,"Andrew");
    }

    public void ValidatePersonSearchResultsPage() throws InterruptedException {
        Thread.sleep(500);
        assertDisplayed(PersonSearchResultsPage);
    }

    public void ValidatePersonSearchResultPage() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(PersonSearchResultTap);
    }

    public void ValidateCompanySearchsResultPage() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(CompanySearchTap);
    }

    public void ValidateSearchResultsPage() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(CompanySearchResultPage);
    }

    public void ValidateCompaniesSearchResultsPage() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(CompaniesSearchResultPage);
    }

    public void ValidateSearchResultsPanel() {
        waitForVisibility(SearchResultsPanel,20);
        assertDisplayed(SearchResultsPanel);
    }

    public void SearchForACompany(String text) throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SearchTextField);
        sendElementText(SearchTextField,text);
    }

    public void ValidateSearchForACompanyOption() {
        waitForVisibility(SearchCompanyOptions,30);
        assertDisplayed(SearchCompanyOptions);
        assertElementContainsText(SearchResultsPage,"10 F");
    }

    public void SelectCompanyFromPersonOption() {
        waitSeconds(30);
        clickOnElement(CompanySearchInputContainer);
    }

    public void ValidateCompanyResultsPanel() throws InterruptedException {
        waitForVisibility(SearchResultsPanel,30);
        assertDisplayed(SearchResultsPanel);
    }

    public void SelectAllResultsFromPersonOption() {
        waitSeconds(30);
        clickOnElement(SearchAllResults);
    }

    public void ClickOnFirstOptionOnResultsFromPersonOption() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(FirstOptionOnAllSearch);
    }

    public void ValidateAllSearchResultsPage() throws InterruptedException {
        Thread.sleep(2000);
//        assertDisplayed(AllPersonSearchResults.get(0));
        assertElementContainsText(AllPersonSearchResults,"Tandi");
    }

    public void SelectAllCompanyResultsFromPersonOption() throws InterruptedException {
        Thread.sleep(2000);
        scrollDownToElement(SearchAllCompanyResults);
        Actions act = new Actions(driver);
        act.doubleClick(SearchAllCompanyResults).perform();
        Thread.sleep(1000);
    }

    public void ClickOnNewSearchButton() {
        waitSeconds(30);
        clickOnElement(NewSearchButton);
    }

    public void ClickOnSelectOptions() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(SelectOptionBox);
    }

    public void CheckAdminDashboardAppears(){
        assertDisplayed(DashboardUser);
    }

    public void ValidateSelectionOptionsOnFooter() {
        waitForVisibility(SelectionOptionsOnFooter,20);
        assertDisplayed(SelectionOptionsOnFooter);
    }
    public void ClickOnSortArrow() {
        waitSeconds(30);
        clickOnElement(SortArrow);
    }

    public void ValidateSearchAllResultsSorted() throws InterruptedException {
       Thread.sleep(1000);
        assertDisplayed(ResultsSortedAlphabitaclly);
    }

    public void ValidateDDLResults() {
        waitForVisibility(ResultsSortedAlphabitaclly,30);
        assertDisplayed(ResultsSortedAlphabitaclly);
    }
}
