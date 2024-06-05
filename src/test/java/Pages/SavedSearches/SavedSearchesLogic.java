package Pages.SavedSearches;

import org.testng.Assert;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SavedSearchesLogic extends SavedSearchesPO{
    public SavedSearchesLogic(){ super();}

    public void clickOnSaveSearchButton() {
        clickOnElement(SaveSearchButton);
    }

    public void validateSaveSearchPopUpIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(SaveSearchButton);
    }

    public void FillInSavedSearchNameField(String text) {
        clickOnElement(SaveSearchNameField);
        sendElementText(SaveSearchNameField,text);
    }

    public void validateSaveSearchMessageDisplayed(String text) throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(SaveSearchSuccessfulMessage);
        assertElementText(SaveSearchSuccessfulMessage,text);
    }

    public void goToSaveSearchURL(){
        goToURL("https://dashboard.beta.biscred.net/saved-searches");
    }

    public void clickOnEditSaveSearchLink() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(EditSaveSearchLink);
    }

    public void ValidateSaveSearchPopUp() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(SubmitSaveSearchButton);
    }

    public void FillInSaveSearchField() {
        clickOnElement(SaveSearchFieldName);
        SaveSearchFieldName.clear();
        sendElementText(SaveSearchFieldName,"new Saved Search Updated");
    }
    public void clickOnSubmitSaveSearchLink() {
        clickOnElement(SubmitSaveSearchButton);
    }

    public void validateUpdateSaveSearchMessageDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(EditSaveSearchSuccessfulMessage);
        assertElementText(EditSaveSearchSuccessfulMessage,"Your Saved Search has been updated!");
    }

    public void validateRedirectedToSavedSearchPage() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(SaveSearchPage);
    }

    public void validateSavedSearchResults() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(SaveSearchResults);
    }

    public void clickOnCancelSaveSearchLink() {
        clickOnElement(CancelSaveSearchButton);
    }

    public void validateUpdateSaveSearchErrorMessageDisplayed(String text) throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(EditSaveSearchErrorMessage);
        assertElementText(EditSaveSearchErrorMessage,text);
    }

    public void FillInEmptySaveSearchField() {
        clickOnElement(SaveSearchFieldName);
        SaveSearchFieldName.clear();
        sendElementText(SaveSearchFieldName, "  ");
    }

    public void clickOnDeleteSaveSearchLink() throws InterruptedException {
//        Thread.sleep(2000);
        waitForElementToAppear(DeleteSaveSearchLink,20);
        clickOnElement(DeleteSaveSearchLink);
    }

    public void validateDeleteSavedSearchPopUp() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(DeleteSaveSearchButton);
    }

    public void clickOnDeleteSaveSearchButton() {
        clickOnElement(DeleteSaveSearchButton);
    }

    public void validateDeleteSaveSearchMessageDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementToAppear(DeleteSaveSearchMessage,20);
        assertDisplayed(DeleteSaveSearchMessage);
        assertElementText(DeleteSaveSearchMessage,"Your Saved Search has been deleted!");
    }

    public void clickOnPersonTap() {
        clickOnElement(PersonTap);
    }

    public void clickOnPersonSavedSearch() {
        clickOnElement(PersonSavedSearchResult);
    }

    public void validateRedirectToThePersonSearchResultPage() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(PersonSavedSearchPage);
        assertIfTrue(PersonSavedSearchTap.isEnabled());
    }

    public void validateDeleteSavedSearchDateTap() throws ParseException, InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(PersonSavedSearchDateResult);
       // SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd, yyyy a", Locale.US);
       // Assert.assertEquals(dateFormat.parse(PersonSavedSearchDateResult.toString().replaceAll("\\p{Cntrl}", "")),new SimpleDateFormat("MM dd, yyyy").format(new java.util.Date()));
    }

    public void validateSavedSearchButton() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(SaveSearchButton);
    }

    public void validateSavedSearchResult() throws InterruptedException {
       Thread.sleep(2000);
        assertDisplayed(PersonSavedSearchValue);
    }

    public void clickOnNewSearchLink() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(RunSearchSavedSearchLink);
    }

    public void ValidateSearchResults() throws InterruptedException {
       Thread.sleep(3000);
        assertDisplayed(SearchResults);
        assertIfTrue(CompanySavedSearchTap.isEnabled());
    }

    public void clickOnCompanyTap() {
        clickOnElement(CompanySavedSearchTap);
    }

    public void clickOnCompanyFirstSavedSearch() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanySavedSearchFirstOption);
    }

    public void clickOnAllTap() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(AllSavedSearchTap);
    }
    public void ValidateAllSearchResults() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(CompanySavedSearchFirstOption);
    }

    public void RefreshSavedSearchPage() {
        driver.navigate().refresh();
    }

    public void validateLastSearchedDateNotUpdated() {
        Date cur_dt = new Date();
        DateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM");
        String strTodaysDate = dateFormat.format(cur_dt);
        assertIfFalse(LastSearchedUpdate.equals(strTodaysDate));
    }
    public void ValidateCurrentDateOnTheLastSearchedUpdate() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(LastSearchedUpdate);

    }

    public void ValidateTheFirstSavedSearch() throws InterruptedException {
      Thread.sleep(3000);
        assertDisplayed(SavedSearchFirstOption.get(0));
    }

    public void clickOnCancelsButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(CancelButton);
    }

    public void clickOnCloseButton() {
    }
}
