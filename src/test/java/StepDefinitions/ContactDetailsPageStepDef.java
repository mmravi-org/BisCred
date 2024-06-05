package StepDefinitions;

import Pages.ContactDetailsPage.ContactDetailsPageLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactDetailsPageStepDef {

    ContactDetailsPageLogic contactDetailsPageLogic = new ContactDetailsPageLogic();

    @Then("I should see a person search results that correspond with the person entered text")
    public void iShouldSeeAPersonSearchResultsThatCorrespondWithThePersonEnteredText() throws InterruptedException {
        contactDetailsPageLogic.ValidatePersonSearchResult();
    }

    @And("I should be redirect to the person search results page")
    public void iShouldBeRedirectToThePersonSearchResultsPage() throws InterruptedException {
        contactDetailsPageLogic.ShouldBeRedirectToThePersonSearchResultsPage();
    }

    @When("I select a the exact person from result")
    public void iSelectATheExactPersonFromResult() throws InterruptedException {
        contactDetailsPageLogic.SelectATheExactPersonFromResult();
    }


    @When("I click on Columns button")
    public void iClickOnColumnsButton() {
        contactDetailsPageLogic.ClickOnColumnsButton();
    }

    @And("I click on selection box beside the list columns")
    public void iClickOnSelectionBoxBesideTheListColumns() throws InterruptedException {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideTheListColumns();
    }

    @And("I should see the List column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeTheListColumnRemovedFromTheContactsDetails() throws InterruptedException {
        contactDetailsPageLogic.ShouldSeeTheListColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Email column")
    public void iClickOnSelectionBoxBesideEmailColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideEmailColumn();
    }

    @And("I should see Email column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeEmailColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeEmailColumnRemovedFromTheContactsDetails();
     }

    @And("I click on selection box beside Phone column")
    public void iClickOnSelectionBoxBesidePhoneColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnSelectionBoxBesidePhoneColumn();
    }

    @And("I should see Phone column removed from the contacts details and make sure all other columns added")
    public void iShouldSeePhoneColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeePhoneColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Job Title column")
    public void iClickOnSelectionBoxBesideJobTitleColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideJobTitleColumn();
    }

    @And("I should see Job Title column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeJobTitleColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeJobTitleColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Seniority column")
    public void iClickOnSelectionBoxBesideSeniorityColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideSeniorityColumn();
    }

    @And("I should see Seniority column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeSeniorityColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeSeniorityColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Asset Experienced column")
    public void iClickOnSelectionBoxBesideAssetExperiencedColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideAssetExperiencedColumn();
    }

    @And("I should see Asset Experienced column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeAssetExperiencedColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeAssetExperiencedColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside City column")
    public void iClickOnSelectionBoxBesideCityColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideCityColumn();
    }

    @And("I should see City column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeCityColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeCityColumnRemovedFromTheContactsDetails();

    }

    @And("I click on selection box beside State column")
    public void iClickOnSelectionBoxBesideStateColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideStateColumn();
    }

    @And("I should see State column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeStateColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeStateColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside LinkedIn column")
    public void iClickOnSelectionBoxBesideLinkedInColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideLinkedInColumn();
    }

    @And("I should see LinkedIn column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeLinkedInColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeLinkedInColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Company column")
    public void iClickOnSelectionBoxBesideCompanyColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideCompanyColumn();
    }

    @And("I should see Company column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeCompanyColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeCompanyColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Company Asset Experience column")
    public void iClickOnSelectionBoxBesideCompanyAssetExperienceColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideCompanyAssetExperienceColumn();
    }

    @And("I should see Company Asset Experience column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeCompanyAssetExperienceColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeCompanyAssetExperienceColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Company Industries column")
    public void iClickOnSelectionBoxBesideCompanyIndustriesColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideCompanyIndustriesColumn();
    }

    @And("I should see Company Industries column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeCompanyIndustriesColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeCompanyIndustriesColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Company HQ City column")
    public void iClickOnSelectionBoxBesideCompanyHQCityColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideCompanyHQCityColumn();
    }

    @And("I should see Company HQ City column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeCompanyHQCityColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeCompanyHQCityColumnRemovedFromTheContactsDetails();
    }

    @And("I click on selection box beside Company HQ State column")
    public void iClickOnSelectionBoxBesideCompanyHQStateColumn() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideCompanyHQStateColumn();
    }

    @And("I should see Company HQ State column removed from the contacts details and make sure all other columns added")
    public void iShouldSeeCompanyHQStateColumnRemovedFromTheContactsDetails() {
        contactDetailsPageLogic.ShouldSeeCompanyHQStateColumnRemovedFromTheContactsDetails();
    }

    @When("I click on The hide link beside list column")
    public void iClickOnTheHideLinkBesideListColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideListColumn();
    }


    @When("I click on The hide link beside Email column")
    public void iClickOnTheHideLinkBesideEmailColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideEmailColumn();
    }

    @When("I click on The hide link beside Phone column")
    public void iClickOnTheHideLinkBesidePhoneColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesidePhoneColumn();
    }

    @When("I click on The hide link beside Job Title column")
    public void iClickOnTheHideLinkBesideJobTitleColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideJobTitleColumn();
    }

    @When("I click on The hide link beside Seniority column")
    public void iClickOnTheHideLinkBesideSeniorityColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideSeniorityColumn();
    }

    @When("I click on The hide link beside City column")
    public void iClickOnTheHideLinkBesideCityColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideCityColumn();
    }

    @When("I click on The hide link beside State column")
    public void iClickOnTheHideLinkBesideStateColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideStateColumn();
    }

    @When("I click on The hide link beside LinkedIn column")
    public void iClickOnTheHideLinkBesideLinkedInColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideLinkedInColumn();
    }

    @When("I click on The hide link beside Company column")
    public void iClickOnTheHideLinkBesideCompanyColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideCompanyColumn();
    }

    @When("I click on The hide link beside Asset Experience column")
    public void iClickOnTheHideLinkBesideAssetExperienceColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideAssetExperienceColumn();
    }

    @When("I click on The hide link beside company industries column")
    public void iClickOnTheHideLinkBesideCompanyIndustriesColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideCompanyIndustriesColumn();
    }

    @When("I click on The hide link beside Company HQ City column")
    public void iClickOnTheHideLinkBesideCompanyHQCityColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideCompanyHQCityColumn();
    }

    @When("I click on The hide link beside Company HQ State column")
    public void iClickOnTheHideLinkBesideCompanyHQStateColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideCompanyHQStateColumn();
    }

    @When("I click on The hide link beside Company Asset Experience column")
    public void iClickOnTheHideLinkBesideCompanyAssetExperienceColumn() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheHideLinkBesideCompanyAssetExperienceColumn();
    }


    @When("I click on New Search button two")
    public void iClickOnNewSearchButtonTwo() {
        contactDetailsPageLogic.ClickOnNewSearchButtonTwo();
    }

    @Then("I should be redirected to the Quick Search Tab")
    public void iShouldBeRedirectedToTheQuickSearchTab() {
      contactDetailsPageLogic.ShouldBeRedirectedToTheQuickSearchTab();
    }

    @When("I click on save person Button")
    public void iClickOnSavePersonButton()   {
        contactDetailsPageLogic.ClickOnSavePersonButton();
    }

    @And("I should see the list added to the profile panel")
    public void iShouldSeeTheListAddedToTheProfilePanel() throws InterruptedException {
        contactDetailsPageLogic.ShouldSeeTheListAddedToTheProfilePanel();
    }

    @And("I type a list name on List Name Field to save person")
    public void iTypeAListNameOnListNameFieldToSavePerson() {
        contactDetailsPageLogic.TypeAListNameOnListNameFieldToSavePerson();
    }

    @And("I click on Cancel button on Save People to List pop up")
    public void iClickOnCancelButtonOnSavePeopleToListPopUp() throws InterruptedException {
        contactDetailsPageLogic.ClickOnCancelButtonOnSavePeopleToListPopUp();
    }

    @And("I click on X icon on save to list pop up")
    public void iClickOnXIconOnSaveToListPopUp() throws InterruptedException {
        contactDetailsPageLogic.ClickOnXIconOnSaveToListPopUp();
    }

    @When("I click on the Delete icon beside list name on profile panel")
    public void iClickOnTheDeleteIconBesideListNameOnProfilePanel() throws InterruptedException {
        contactDetailsPageLogic.ClickOnTheDeleteIconBesideListNameOnProfilePanel();
    }

    @And("I should see the person list removed from profile panel")
    public void iShouldSeeThePersonListRemovedFromProfilePanel() throws InterruptedException {
        contactDetailsPageLogic.ShouldSeeThePersonListRemovedFromProfilePanel();
    }
    
    @And("I should see the delete icon still displayed on the profile")
    public void iShouldSeeTheDeleteIconStillDisplayedOnTheProfile() {
        contactDetailsPageLogic.ShouldSeeTheDeleteIconStillDisplayedOnTheProfile();
    }

    @And("I click on selection box beside Company HQ State column to set up the columns for hide functionality")
    public void iClickOnSelectionBoxBesideCompanyHQStateColumnToSetUpTheColumnsForHideFunctionality() {
        contactDetailsPageLogic.ClickOnSelectionBoxBesideCompanyHQStateColumnToSetUpTheColumnsForHideFunctionality();
    }
}
