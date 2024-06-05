package StepDefinitions;

import Pages.SavedSearches.SavedSearchesLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.text.ParseException;

public class SavedSearchesStepDef {
   SavedSearchesLogic savedsearcheslogic = new SavedSearchesLogic();

   @When("I click on the save search button")
   public void iClickOnTheSaveSearchButton() {
      savedsearcheslogic.clickOnSaveSearchButton();
   }

   @Then("I should see a pop up is displayed")
   public void iShouldSeeAPopUpIsDisplayed() throws InterruptedException {
      savedsearcheslogic.validateSaveSearchPopUpIsDisplayed();

   }

   @Then("I fill in the Saved Search Name field {string}")
   public void iFillInTheSavedSearchNameField(String text) {
      savedsearcheslogic.FillInSavedSearchNameField(text);
   }

   @Then("I should see a notification message is displayed {string}")
   public void iShouldSeeANotificationMessageIsDisplayed(String text) throws InterruptedException {
      savedsearcheslogic.validateSaveSearchMessageDisplayed(text);
   }

   @Given("I am on BisCred saved searches page and want to Edit a saved persons search name")
   public void iAmOnBisCredSavedSearchesPageAndWantToEditASavedPersonsSearchName() {
      savedsearcheslogic.goToSaveSearchURL();
   }

   @When("I click on Edit button in the saved search page")
   public void iClickOnEditButtonInTheSavedSearchPage() throws InterruptedException {
      savedsearcheslogic.clickOnEditSaveSearchLink();
   }

   @Then("I should See popup to edit the saved search name")
   public void iShouldSeePopupToEditTheSavedSearchName() throws InterruptedException {
      savedsearcheslogic.ValidateSaveSearchPopUp();
   }

   @When("I Add a valid saved search name")
   public void iAddAValidSavedSearchName() {
      savedsearcheslogic.FillInSaveSearchField();
   }

   @And("click submit button")
   public void clickSubmitButton() {
      savedsearcheslogic.clickOnSubmitSaveSearchLink();
   }

   @Then("I should see a success message for updating saved search name Your Saved Search has been udpated!")
   public void iShouldSeeASuccessMessageForUpdatingSavedSearchNameYourSavedSearchHasBeenUdpated() throws InterruptedException {
      savedsearcheslogic.validateUpdateSaveSearchMessageDisplayed();
   }

   @And("I should be redirect to the saved search page")
   public void iShouldBeRedirectToTheSavedSearchPage() throws InterruptedException {
      savedsearcheslogic.validateRedirectedToSavedSearchPage();
   }

   @And("the new added name should be reflected on the Name column")
   public void theNewAddedNameShouldBeReflectedOnTheNameColumn() throws InterruptedException {
      savedsearcheslogic.validateSavedSearchResults();
   }

   @When("I click cancel button")
   public void iClickCancelButton() {
      savedsearcheslogic.clickOnCancelSaveSearchLink();

   }

   @Then("I should see error {string}")
   public void iShouldSeeError(String text) throws InterruptedException {
      savedsearcheslogic.validateUpdateSaveSearchErrorMessageDisplayed(text);
   }

   @And("I Add a valid saved search name empty")
   public void iAddAValidSavedSearchNameEmpty() {
      savedsearcheslogic.FillInEmptySaveSearchField();
   }

   @When("I click on Delete button for a saved search")
   public void iClickOnDeleteButtonForASavedSearch() throws InterruptedException {
      savedsearcheslogic.clickOnDeleteSaveSearchLink();
   }

   @Then("I should See popup to confirm deleting the saved search")
   public void iShouldSeePopupToConfirmDeletingTheSavedSearch() throws InterruptedException {
      savedsearcheslogic.validateDeleteSavedSearchPopUp();
   }

   @When("I click delete button")
   public void iClickDeleteButton() {
      savedsearcheslogic.clickOnDeleteSaveSearchButton();
   }

   @Then("I should see a success message for deleting the saved search")
   public void iShouldSeeASuccessMessageForDeletingTheSavedSearch() throws InterruptedException {
      savedsearcheslogic.validateDeleteSaveSearchMessageDisplayed();
   }

   @And("the saved searches name should be displayed on the column name not deleted")
   public void theSavedSearchesNameShouldBeDisplayedOnTheColumnNameNotDeleted() throws InterruptedException {
      savedsearcheslogic.validateSavedSearchResults();
   }

   @When("I click on person saved search tab")
   public void iClickOnPersonSavedSearchTab() {
      savedsearcheslogic.clickOnPersonTap();
   }

   @And("I click on any Person Saved search")
   public void iClickOnAnyPersonSavedSearch() {
      savedsearcheslogic.clickOnPersonSavedSearch();
   }

   @Then("I should be redirect to the person search result page")
   public void iShouldBeRedirectToThePersonSearchResultPage() throws InterruptedException {
      savedsearcheslogic.validateRedirectToThePersonSearchResultPage();
   }

   @And("I click on saved search menu on the top nav")
   public void iClickOnSavedSearchMenuOnTheTopNav() {
      savedsearcheslogic.goToSaveSearchURL();
   }

   @Then("I should see the saved search dates match the current date")
   public void iShouldSeeTheSavedSearchDatesMatchTheCurrentDate() throws ParseException, InterruptedException {
      savedsearcheslogic.validateDeleteSavedSearchDateTap();
   }

   @Then("I should see the Save search button at the right side of the page")
   public void iShouldSeeTheSaveSearchButtonAtTheRightSideOfThePage() throws InterruptedException {
      savedsearcheslogic.validateSavedSearchButton();
   }

   @And("I should see the total value on the result column is matched the results on the contact search page")
   public void iShouldSeeTheTotalValueOnTheResultColumnIsMatchedTheResultsOnTheContactSearchPage() throws InterruptedException {
      savedsearcheslogic.validateSavedSearchResult();
   }

   @When("I click on Run search.")
   public void iClickOnRunSearch() throws InterruptedException {
      savedsearcheslogic.clickOnNewSearchLink();
   }

   @Then("I should see a company search results that correspond to the saved search")
   public void iShouldSeeACompanySearchResultsThatCorrespondToTheSavedSearch() throws InterruptedException {
      savedsearcheslogic.ValidateSearchResults();
   }

   @Given("I am on BisCred saved searches page and want to Edit a saved company search name")
   public void iAmOnBisCredSavedSearchesPageAndWantToEditASavedCompanySearchName() {
      savedsearcheslogic.goToSaveSearchURL();
   }

   @Given("I am on BisCred saved searches page and want to Delete Saved Search for a saved company search")
   public void iAmOnBisCredSavedSearchesPageAndWantToDeleteSavedSearchForASavedCompanySearch() {
      savedsearcheslogic.goToSaveSearchURL();
   }

   @When("I click on company saved search tab")
   public void iClickOnCompanySavedSearchTab() {
      savedsearcheslogic.clickOnCompanyTap();
   }

   @And("I click on any Company Saved search")
   public void iClickOnAnyCompanySavedSearch() throws InterruptedException {
      savedsearcheslogic.clickOnCompanyFirstSavedSearch();
   }

   @Then("I should be redirect to the company search result page")
   public void iShouldBeRedirectToTheCompanySearchResultPage() throws InterruptedException {
      savedsearcheslogic.ValidateSearchResults();
   }

   @When("I click on all saved search tab")
   public void iClickOnAllSavedSearchTab() throws InterruptedException {
      savedsearcheslogic.clickOnAllTap();
   }

   @Then("I should see both companies and contacts saved search")
   public void iShouldSeeBothCompaniesAndContactsSavedSearch() throws InterruptedException {
      savedsearcheslogic.ValidateAllSearchResults();
   }

    @When("I refresh the page")
    public void iRefreshThePage() {
      savedsearcheslogic.RefreshSavedSearchPage();
    }

   @Then("I should see the date is not updated")
   public void iShouldSeeTheDateIsNotUpdated() {
      savedsearcheslogic.validateLastSearchedDateNotUpdated();
   }

    @Given("I am on BisCred contact details page")
    public void iAmOnBisCredContactDetailsPage() {

    }

   @Then("I should see the saved search date match the current dates")
   public void iShouldSeeTheSavedSearchDateMatchTheCurrentDates() throws InterruptedException {
      savedsearcheslogic.ValidateCurrentDateOnTheLastSearchedUpdate();
   }

   @And("I should see saved result for the first search matching the applied search")
   public void iShouldSeeSavedResultForTheFirstSearchMatchingTheAppliedSearch() throws InterruptedException {
      savedsearcheslogic.ValidateTheFirstSavedSearch();
   }


   @And("I click on Cancels button")
   public void iClickOnCancelsButton() throws InterruptedException {
      savedsearcheslogic.clickOnCancelsButton();
   }
}
