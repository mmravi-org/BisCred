package StepDefinitions;

import Pages.CompanyDetailsPage.CompanyDetailsPageLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompanyDetailsPageStepDef {


    CompanyDetailsPageLogic companyDetailsPageLogic = new CompanyDetailsPageLogic();

    @When("I select a the exact company from result")
    public void iSelectATheExactCompanyFromResult() throws InterruptedException {

        companyDetailsPageLogic.SelectATheExactCompanyFromResult();
    }



    @When("I click on Validate Profile Indexing link")
    public void iClickOnValidateProfileIndexingLink() throws InterruptedException {
        companyDetailsPageLogic.ClickOnValidateProfileIndexingLink();
    }

    @Then("I should see a message {string}")
    public void iShouldSeeAMessage(String text) {
        companyDetailsPageLogic.ShouldSeeAMessage(text);
    }


    @When("I click on Company webSite")
    public void iClickOnCompanyWebSite() throws InterruptedException {
        companyDetailsPageLogic.ClickOnCompanyWebSite();

    }

    @Then("I should be redirected to the company profile")
    public void iShouldBeRedirectedToTheCompanyProfile() throws InterruptedException {
        companyDetailsPageLogic.ShouldBeRedirectedToTheCompanyProfile();
    }


    @And("I should see the Lists column removed from the company details page")
    public void iShouldSeeTheListsColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeTheListsColumnRemovedFromTheCompanyDetailsPage();
    }


    @When("I click on Columns button on company details page")
    public void iClickOnColumnsButtonOnCompanyDetailsPage() throws InterruptedException {
        companyDetailsPageLogic.ClickOnColumnsButtonOnCompanyDetailsPage();
    }

    @And("I click on selection box beside the lists column for company")
    public void iClickOnSelectionBoxBesideTheListsColumnForCompany() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideTheListsColumnForCompany() ;
    }


    @And("I should see Industry column removed from the company details page")
    public void iShouldSeeIndustryColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeeIndustryColumnRemovedFromTheCompanyDetailsPage();
    }

    @And("I click on selection box beside Industry column for company")
    public void iClickOnSelectionBoxBesideIndustryColumnForCompany() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideIndustryColumnForCompany();
    }

    @And("I click on selection box beside Asset Experience column")
    public void iClickOnSelectionBoxBesideAssetExperienceColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideAssetExperienceColumn();
    }

    @And("I should see Asset Experience column removed from the company details page")
    public void iShouldSeeAssetExperienceColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeeAssetExperienceColumnRemovedFromTheCompanyDetailsPage();
    }

    @And("I should see Property Count column removed from the company details page")
    public void iShouldSeePropertyCountColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeePropertyCountColumnRemovedFromTheCompanyDetailsPage();
    }

    @And("I click on selection box beside Property Count column")
    public void iClickOnSelectionBoxBesidePropertyCountColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesidePropertyCountColumn();
    }

    @And("I click on selection box beside Contact Count column")
    public void iClickOnSelectionBoxBesideContactCountColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideContactCountColumn();
    }


    @And("I should see Contact Count column removed from the company details page")
    public void iShouldSeeContactCountColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeeContactCountColumnRemovedFromTheCompanyDetailsPage();
    }

    @And("I click on selection box beside HQ City column")
    public void iClickOnSelectionBoxBesideHQCityColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideHQCityColumn();
    }

    @And("I should see HQ City column removed from the company details page")
    public void iShouldSeeHQCityColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeeHQCityColumnRemovedFromTheCompanyDetailsPage();
    }

    @And("I click on selection box beside HQ State column")
    public void iClickOnSelectionBoxBesideHQStateColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideHQStateColumn();
    }

    @And("I should see HQ State column removed from the company details page")
    public void iShouldSeeHQStateColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeeHQStateColumnRemovedFromTheCompanyDetailsPage();

    }

    @And("I click on selection box beside Company LinkedIn column")
    public void iClickOnSelectionBoxBesideCompanyLinkedInColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideCompanyLinkedInColumn();
    }

    @And("I should see LinkedIn column removed from the company details page")
    public void iShouldSeeLinkedInColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeeLinkedInColumnRemovedFromTheCompanyDetailsPage();
    }

    @And("I click on selection box beside WebSites column")
    public void iClickOnSelectionBoxBesideWebSitesColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesideWebSitesColumn();
    }

    @And("I should see WebSites column removed from the company details page")
    public void iShouldSeeWebSitesColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeeWebSitesColumnRemovedFromTheCompanyDetailsPage();
    }

    @And("I click on selection box beside phone column")
    public void iClickOnSelectionBoxBesidePhoneColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSelectionBoxBesidePhoneColumn();
    }

    @And("I should see phone column removed from the company details page")
    public void iShouldSeePhoneColumnRemovedFromTheCompanyDetailsPage() {
        companyDetailsPageLogic.ShouldSeePhoneColumnRemovedFromTheCompanyDetailsPage();
    }

    @When("I click on The hide link beside list column on company details page")
    public void iClickOnTheHideLinkBesideListColumnOnCompanyDetailsPage() throws InterruptedException {
        companyDetailsPageLogic.ClickOnTheHideLinkBesideListColumnOnCompanyDetailsPage();
    }

    @When("I click on Hide link beside the Industry column on company details page")
    public void iClickOnHideLinkBesideTheIndustryColumnOnCompanyDetailsPage() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideTheIndustryColumnOnCompanyDetailsPage();
    }

    @When("I click on Hide link beside the Asset Experience column")
    public void iClickOnHideLinkBesideTheAssetExperienceColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideTheAssetExperienceColumn();
    }

    @When("I click on Hide link beside the Property Count column")
    public void iClickOnHideLinkBesideThePropertyCountColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideThePropertyCountColumn();
    }

    @When("I click on Hide link beside the Contact Count column")
    public void iClickOnHideLinkBesideTheContactCountColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideTheContactCountColumn();
    }

    @When("I click on Hide link beside the HQ City column")
    public void iClickOnHideLinkBesideTheHQCityColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideTheHQCityColumn();
    }

    @When("I click on Hide link beside the HQ State column")
    public void iClickOnHideLinkBesideTheHQStateColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideTheHQStateColumn();
    }

    @When("I click on Hide link beside the LinkedIn column")
    public void iClickOnHideLinkBesideTheLinkedInColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideTheLinkedInColumn();
    }

    @When("I click on Hide link beside the WebSites column")
    public void iClickOnHideLinkBesideTheWebSitesColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideTheWebSitesColumn();
    }

    @When("I click on Hide link beside the Phone column")
    public void iClickOnHideLinkBesideThePhoneColumn() throws InterruptedException {
        companyDetailsPageLogic.ClickOnHideLinkBesideThePhoneColumn();
    }

    @Given("I am on BisCred Admin dashboard and want to search about company using quick search")
    public void iAmOnBisCredAdminDashboardAndWantToSearchAboutCompanyUsingQuickSearch() {
        companyDetailsPageLogic.AmOnBisCredAdminDashboardAndWantToSearchAboutCompanyUsingQuickSearch();


    }

    @Then("I should see company profile panel")
    public void iShouldSeeCompanyProfilePanel() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeCompanyProfilePanel();
    }

    @And("I click on save Company Button inside profile panel")
    public void iClickOnSaveCompanyButtonInsideProfilePanel() throws InterruptedException {
        companyDetailsPageLogic.ClickOnSaveCompanyButtonInsideProfilePanel();
    }

    @Then("I should see a pop up display for Save companies to List")
    public void iShouldSeeAPopUpDisplayForSaveCompaniesToList() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeAPopUpDisplayForSaveCompaniesToList();
    }


    @And("I leave the checkbox of Clear selected results after submit. not selected")
    public void iLeaveTheCheckboxOfClearSelectedResultsAfterSubmitNotSelected() {
        companyDetailsPageLogic.LeaveTheCheckboxOfClearSelectedResultsAfterSubmitNotSelected();
    }

    @Then("I click on the first company in the shown list")
    public void iClickOnTheFirstCompanyInTheShownList() throws InterruptedException {
        companyDetailsPageLogic.ClickOnTheFirstCompanyInTheShownList();
    }

    @When("I click on saved list")
    public void iClickOnSavedList() {
        companyDetailsPageLogic.ClickOnSavedList();
    }

    @Then("I should be redirected to the save list page")
    public void iShouldBeRedirectedToTheSaveListPage() {
        companyDetailsPageLogic.ShouldBeRedirectedToTheSaveListPage();
    }

    @And("I click on the checkbox of Clear selected results after submit. not selected")
    public void iClickOnTheCheckboxOfClearSelectedResultsAfterSubmitNotSelected() {
        companyDetailsPageLogic.ClickOnTheCheckboxOfClearSelectedResultsAfterSubmitNotSelected();
    }

    @Then("I close the summary panel")
    public void iCloseTheSummaryPanel() {
        companyDetailsPageLogic.CloseTheSummaryPanel();
    }

    @When("I click on existing list Tab")
    public void iClickOnExistingListTab() {
        companyDetailsPageLogic.ClickOnExistingListTab();

    }

    @And("I select any list from drop down list options")
    public void iSelectAnyListFromDropDownListOptions() throws InterruptedException {
        companyDetailsPageLogic.SelectAnyListFromDropDownListOptions();
    }

    @And("I click on Cancel button on save companies to list")
    public void iClickOnCancelButtonOnSaveCompaniesToList() {
        companyDetailsPageLogic.ClickOnCancelButtonOnSaveCompaniesToList();
    }

    @And("I should see the company not saved to new list")
    public void iShouldSeeTheCompanyNotSavedToNewList() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeTheCompanyNotSavedToNewList();
    }

    @And("I click on close icon on save companies to list")
    public void iClickOnCloseIconOnSaveCompaniesToList() {
        companyDetailsPageLogic.ClickOnCloseIconOnSaveCompaniesToList();
    }

    @Then("I should see a notification massage {string} for removing list")
    public void iShouldSeeANotificationMassageForRemovingList(String arg0) throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeANotificationMassageForRemovingList();
    }

    @Then("I should see the list not deleted")
    public void iShouldSeeTheListNotDeleted() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeTheListNotDeleted();
    }

    @And("I click on close icon on Remove from List pop up")
    public void iClickOnCloseIconOnRemoveFromListPopUp() {
        companyDetailsPageLogic.ClickOnCloseIconOnRemoveFromListPopUp();
    }

    @And("I fill the list name field with space")
    public void iFillTheListNameFieldWithSpace() {
        companyDetailsPageLogic.FillTheListNameFieldWithSpace();
    }

    @Then("I should see a notification massage There was a problem saving to your search.")
    public void iShouldSeeANotificationMassageThereWasAProblemSavingToYourSearch() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeANotificationMassageThereWasAProblemSavingToYourSearch();
    }

    @And("I click on Copy UUID icon at the bottom corner inside profile panel")
    public void iClickOnCopyUUIDIconAtTheBottomCornerInsideProfilePanel() throws InterruptedException {
        companyDetailsPageLogic.ClickOnCopyUUIDIconAtTheBottomCornerInsideProfilePanel();
    }

    @Then("I should see success message Company UUID copied to clipboard.")
    public void iShouldSeeSuccessMessageCompanyUUIDCopiedToClipboard() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeSuccessMessageCompanyUUIDCopiedToClipboard();
    }

    @Then("I Click on clear selected button")
    public void iClickOnClearSelectedButton() {
        companyDetailsPageLogic.ClickOnClearSelectedButton();

    }

    @Then("I click on Actions button on company details page")
    public void iClickOnActionsButtonOnCompanyDetailsPage() {
        companyDetailsPageLogic.ClickOnActionsButtonOnCompanyDetailsPage();
    }

    @Then("I should see a notification massage There was a problem saving to your list.")
    public void iShouldSeeANotificationMassageThereWasAProblemSavingToYourList() throws InterruptedException {
        companyDetailsPageLogic.ShouldSeeANotificationMassageThereWasAProblemSavingToYourList();
    }


    @Then("I should See options for matching names for company")
    public void iShouldSeeOptionsForMatchingNamesForCompany() {
        companyDetailsPageLogic.ShouldSeeOptionsForMatchingNamesForCompany();
    }

    @When("I click on New Search")
    public void iClickOnNewSearch() throws InterruptedException {
        companyDetailsPageLogic.iClickOnNewSearch();
    }

    @When("I click on Delete icon beside list name on profile panel")
    public void iClickOnDeleteIconBesideListNameOnProfilePanel() throws InterruptedException {
        companyDetailsPageLogic.ClickOnDeleteIconBesideListNameOnProfilePanel();
    }

    @And("I should see the company list not changed")
    public void iShouldSeeTheCompanyListNotChanged() throws InterruptedException {
        companyDetailsPageLogic.iShouldSeeTheCompanyListNotChanged();
    }
}