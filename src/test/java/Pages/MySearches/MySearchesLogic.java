package Pages.MySearches;

import static helpers.helpers.createTimeStamp;

public class MySearchesLogic extends MySearchesPO{
    public MySearchesLogic(){
        super();
    }
    public void clickOnRecentSearch() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(RecentSearchField);
    }

    public void ValidateRecentSearchResults() throws InterruptedException {
       Thread.sleep(1000);
        assertDisplayed(MatchingRecentSearchResults);
    }

    public void goToDashboard() {
        goToURL("https://dashboard.beta.biscred.net");
    }

    public void ValidateTheDate() throws InterruptedException {
       Thread.sleep(1000);
        assertDisplayed(ValidateSearchDate);
    }

    public void CheckAdminDashboardAppears(){
        waitForVisibility(DashboardUser,20);
        assertDisplayed(DashboardUser);
    }

    public void clickOnSavedSearch() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(SavedSearchButton);
    }

    public void TypeSavedSearchName() {
        waitForVisibility(SavedSearchName,20);
        clickOnElement(SavedSearchName);
        sendElementText(SavedSearchName,"New SavedSearch" + createTimeStamp());
    }

    public void clickOnSubmitSavedSearch() {
        clickOnElement(SubmitSavedSearchButton);
    }

    public void clickOnSavedSearchTab() {
        clickOnElement(SavedSearchTab);
    }


    public void ShouldSeeASavedSearchesShownOnTheDashboard() {
        assertDisplayed(SavedSearchBlock);

    }






}
