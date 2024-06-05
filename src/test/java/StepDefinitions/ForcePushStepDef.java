package StepDefinitions;

import Pages.ForcePush.ForcePushLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ForcePushStepDef {
    ForcePushLogic forcePushlogic = new ForcePushLogic();

    @Given("I am on Bisreach admin dashboard and want to add a new contact")
    public void iAmOnBisreachAdminDashboardAndWantToAddANewContact() {
        forcePushlogic.iAmOnBisreachAdminDashboardAndWantToAddANewContact();
    }

    @When("I add a new contact required info")
    public void iAddANewContactRequiredInfo() {
        forcePushlogic.addingContactRequiredFields();
    }

    @When("I Add a valid admin credentials")
    public void iClickOnAddAValidAdminCredentials() throws InterruptedException {
        forcePushlogic.alternativeLogin();
    }

    @Then("I should see a new screen for adding a contact")
    public void iShouldSeeANewScreenForAddingAContact() {
        forcePushlogic.validateAddContactPopupAppears();
    }

    @And("I click on create contact button")
    public void iClickOnCreateContactButton() {
        forcePushlogic.iClickOnCreateContactButton();
    }

    @Then("I should be redirected to Edit contact page")
    public void iShouldBeRedirectedToEditContactPage() {
        forcePushlogic.validateLandingOnContactPage();
    }

    @And("I should see the notification message for creating new contact")
    public void iShouldSeeTheNotificationMessageForCreatingNewContact() {
        forcePushlogic.validateContactCreation();
    }

    @And("I click on Add contact button")
    public void iClickOnAddContactButton() throws InterruptedException {
        forcePushlogic.iClickOnAddContactButton();
    }

    @When("I click on Update Status button")
    public void iClickOnUpdateStatusButton() throws InterruptedException {
        forcePushlogic.iClickOnUpdateStatusButton();
    }

    @Then("I should see a new Pop-Up for update contact status")
    public void iShouldSeeANewPopUpForUpdateContactStatus() {
        forcePushlogic.validateStatusUpdatesPopup();
    }

    @When("I click on contact status dropdown list")
    public void iClickOnContactStatusDropdownList() {
        forcePushlogic.clickOnStatusDropDownMenu();
    }

    @And("I click on In the Bisnow Universe")
    public void iClickOnInTheBisnowUniverse() {
        forcePushlogic.clickOnInBisNowUniverse();
    }

    @And("I click on Update Contact Status button")
    public void iClickOnUpdateContactStatusButton() {
        forcePushlogic.clickOnUpdateContactButton();
    }

    @And("I should see a notification message for updating contact status as {string}")
    public void iShouldSeeANotificationMessageForUpdatingContactStatusAs(String message) throws InterruptedException {
        forcePushlogic.validateStatusNotification(message);
    }

    @Then("I should see the Contact Status updated with In Bisnow")
    public void iShouldSeeTheContactStatusUpdatedWithInBisnow() {
        forcePushlogic.validateStatusInBisNow();
    }

    @When("I click on Add Address button in Contact Profile")
    public void iClickOnAddAddressButtonInContactProfile() {
        forcePushlogic.clickOnAddAddressButton();
    }

    @Then("I should see a new Pop-Up for Create-Update Contact Address")
    public void iShouldSeeANewPopUpForCreateUpdateContactAddress() {
        forcePushlogic.validatePopUPAddAddress();
    }

    @When("I fill in the Postal Code with US valid Code {string}")
    public void iFillInThePostalCodeWithUSValidCode(String code) {
        forcePushlogic.addPostalCodeField(code);
    }

    @And("I should see verified mark for a valid postal code")
    public void iShouldSeeVerifiedMarkForAValidPostalCode() {
        forcePushlogic.validatePostalCode();
    }

    @And("I click on the Save Address button in Create-Update Contact Address Popup")
    public void iClickOnTheSaveAddressButtonInCreateUpdateContactAddressPopup() {
        forcePushlogic.clickOnSaveAddressButton();
    }

    @And("I should see a notification message for contact address update as {string}")
    public void iShouldSeeANotificationMessageForContactAddressUpdateAs(String message) {
        forcePushlogic.validateCityAndStateAddedMassage(message);
    }

    @Then("I should see the new address added with city as Groton and state as Massachusetts")
    public void iShouldSeeTheNewAddressAddedWithCityAsGrotonAndStateAsMassachusetts() throws InterruptedException {
        forcePushlogic.validateCityAndStateAdded();
    }

    @When("I click on Add Employment button for any contact")
    public void iClickOnAddEmploymentButtonForAnyContact() {
        forcePushlogic.clickOnAddEmploymentButton();
    }

    @Then("I should see a new Pop-Up for Create Update Contact Employment")
    public void iShouldSeeANewPopUpForCreateUpdateContactEmployment() {
        forcePushlogic.validateAddEmploymentPopUp();
    }

    @When("I fill in company name then select a company from Company dropdown list that matches the criteria {string}")
    public void iFillInCompanyNameThenSelectACompanyFromCompanyDropdownListThatMatchesTheCriteria(String company) {
        forcePushlogic.selectCompanyEmploymentFromDropDownList(company);
    }

    @And("I fill in job title in Job Title textbox as {string}")
    public void iFillInJobTitleInJobTitleTextboxAs(String title) {
        forcePushlogic.addJobTitleField(title);
    }

    @And("I set Active toggle on")
    public void iSetActiveToggleOn() {
        forcePushlogic.clickOnActiveToggleButton();
    }

    @And("I set Primary toggle on")
    public void iSetPrimaryToggleOn() {
        forcePushlogic.clickOnPrimaryToggleButton();
    }

    @And("I select a job classification from Job Classification dropdownlist")
    public void iSelectAJobClassificationFromJobClassificationDropdownlist() {
        forcePushlogic.selectJobClassificationFromDropDownList();
    }

    @And("I select a asset classes from Asset Classes dropdownlist")
    public void iSelectAAssetClassesFromAssetClassesDropdownlist() {
        forcePushlogic.selectJobAssetClassFromDropDownList();
    }

    @And("I select a contact email from Associated Contact Emails dropdownlist")
    public void iSelectAContactEmailFromAssociatedContactEmailsDropdownlist() {
        forcePushlogic.selectJobEmailFromDropDownList();
    }

    @And("I click on Save Employment button")
    public void iClickOnSaveEmploymentButton() {
        forcePushlogic.clickOnSaveEmploymentButton();
    }

    @Then("I should see the new Active Primary employment added with required data")
    public void iShouldSeeTheNewActivePrimaryEmploymentAddedWithRequiredData() {
        forcePushlogic.validateEmploymentAdded();
    }

    @And("I should see the Active and primary labels added beside the employment on the company profile")
    public void iShouldSeeTheActiveAndPrimaryLabelsAddedBesideTheEmploymentOnTheCompanyProfile() {
        forcePushlogic.validateEmploymentPrimaryAdded();
    }

    @And("I should see contact employment updated notification {string}")
    public void iShouldSeeContactEmploymentUpdatedNotification(String message) {
        forcePushlogic.validateEmploymentPrimaryAddedMassage(message);
    }

    @When("I click on Delete button for non primary employment")
    public void iClickOnDeleteButtonForNonPrimaryEmployment() throws InterruptedException {
        forcePushlogic.clickOnDeleteLink();
    }

    @Then("I should see a new Pop-Up for Delete Employment")
    public void iShouldSeeANewPopUpForDeleteEmployment() {
        forcePushlogic.DeleteEmploymentPopUp();
    }

    @When("I click on Delete Employment button")
    public void iClickOnDeleteEmploymentButton() {
        forcePushlogic.clickOnDeleteEmploymentButton();
    }

    @Then("I should see notification that employment deleted")
    public void iShouldSeeNotificationThatEmploymentDeleted() {
        forcePushlogic.ValidateEmploymentIsDeletedMassage();
    }

    @When("I click on Update Classification button for any contact")
    public void iClickOnUpdateClassificationButtonForAnyContact() {
        forcePushlogic.clickOnUpdateClassificationButton();
    }

    @Then("I should see a new Pop-Up for Add City-Topic Classification")
    public void iShouldSeeANewPopUpForAddCityTopicClassification() {
        forcePushlogic.validateUpdateClassificationPopUp();
    }

    @When("I select a city classification from Classification dropdown list for example Atlanta")
    public void iSelectACityClassificationFromClassificationDropdownListForExampleAtlanta() {
        forcePushlogic.selectClassificationFromDropDownList();
    }

    @And("I click on Update Contact Classification in Update Classification Popup")
    public void iClickOnUpdateContactClassificationInUpdateClassificationPopup() {
        forcePushlogic.clickOnxUpdateContactClassificationButton();
    }

    @Then("I should see city classification is added as Atlanta City")
    public void iShouldSeeCityClassificationIsAddedAsAtlantaCity() {
        forcePushlogic.validateClassificationAdded();
    }

    @And("I should see notification that contact classification updated as {string}")
    public void iShouldSeeNotificationThatContactClassificationUpdatedAs(String text) {
        forcePushlogic.validateClassificationMassage(text);
    }

    @When("I click on Update Note button for any contact")
    public void iClickOnUpdateNoteButtonForAnyContact() {
        forcePushlogic.clickOnUpdateResearcherNoteButton();
    }

    @Then("I should see a new Pop-Up for Update Current Research Note for contacts")
    public void iShouldSeeANewPopUpForUpdateCurrentResearchNoteForContacts() {
        forcePushlogic.validateUpdateResearcherNotePopUp();
    }

    @When("I fill in valid researcher notes in Research Note textbox as {string}")
    public void iFillInValidResearcherNotesInResearchNoteTextboxAs(String notes) {
        forcePushlogic.addResearcherNotesField(notes);
    }

    @And("I select Research Outcome from dropDown List")
    public void iSelectResearchOutcomeFromDropDownList() {
        forcePushlogic.clickOnResearchOutcome();
    }

    @And("I click on Update Note button in the Update Current Research Note for contacts")
    public void iClickOnUpdateNoteButtonInTheUpdateCurrentResearchNoteForContacts() {
        forcePushlogic.clickOnUpdateResearcherNotesButton();
    }

    @Then("I should see the new note added with the account adding as {string}")
    public void iShouldSeeTheNewNoteAddedWithTheAccountAddingAs(String message) {
        forcePushlogic.validateResearcherNotesAdded(message);
    }

    @And("I should see Research Note added notification {string}")
    public void iShouldSeeResearchNoteAddedNotification(String message) throws InterruptedException {
        forcePushlogic.validateResearcherNotesAddedMassage(message);
    }

    @When("I click on Submit for Ready for Review Button")
    public void iClickOnSubmitForReadyForReviewButton() throws InterruptedException {
        forcePushlogic.clickOnSubmitForReadyForReviewButton();
    }

    @And("I should see the contact status is changed to {string}")
    public void iShouldSeeTheContactStatusIsChangedTo(String status) throws InterruptedException {
        forcePushlogic.validateReadyForReviewStatus(status);
    }

    @And("I click on Review Contact Button")
    public void iClickOnReviewContactButton() {
        forcePushlogic.clickOnReviewContactButton();
    }

    @When("I added notes on Review Notes Filed {string}")
    public void iAddedNotesOnReviewNotesFiled(String status) {
        forcePushlogic.validateInReviewStatus(status);
    }

    @And("I click on Approved Contact Button")
    public void iClickOnApprovedContactButton() {
        forcePushlogic.clickOnApprovedContactButton();
    }

    @When("I click on Force Push Button")
    public void iClickOnForcePushButton() {
        forcePushlogic.clickOnForcePushButton();
    }

    @Then("I should see notifications {string}")
    public void iShouldSeeNotifications(String message) throws InterruptedException {
        forcePushlogic.validateDisplayingOfSuccessMessage(message);
    }

    @Then("I should see notification message {string}")
    public void iShouldSeeNotificationMessage(String message) throws InterruptedException {
        forcePushlogic.validateDisplayingContactHasBeenApprovedMessage(message);
    }

    @And("I should see the contacts status is changed to {string}")
    public void iShouldSeeTheContactsStatusIsChangedTo(String status) throws InterruptedException {
        forcePushlogic.validateApprovedStatus(status);
    }

    @Then("I should see success message {string}")
    public void iShouldSeeSuccessMessage(String message) throws InterruptedException {
        forcePushlogic.validateForcePushMessage(message);
    }

    @Given("I am on Bisreach admin dashboard and want to add a new company")
    public void iAmOnBisreachAdminDashboardAndWantToAddANewCompany() {
        forcePushlogic.goToDashboard();
    }

    @When("I click on Add company Button")
    public void iClickOnAddCompanyButton() throws InterruptedException {
        forcePushlogic.clickOnAddCompanyButton();
    }

    @Then("I should see a new screen for adding a company")
    public void iShouldSeeANewScreenForAddingACompany() {
        forcePushlogic.validateAddCompanyPopupAppear();
    }

    @When("I add the new company info with Common Name, Full Legal Name and  Company URL")
    public void iAddTheNewCompanyInfoWithCommonNameFullLegalNameAndCompanyURL() {
        forcePushlogic.addCompanyWithAllFields();
    }

    @And("I click on Add company button inside popup")
    public void iClickOnAddCompanyButtonInsidePopup() {
        forcePushlogic.clickOnCreateCompanyButton();
    }

    @Then("I should be redirected to Edit company page")
    public void iShouldBeRedirectedToEditCompanyPage() {
        forcePushlogic.validateLandingOnCompanyPage();
    }

    @And("I should see the notification message for creating new company {string}")
    public void iShouldSeeTheNotificationMessageForCreatingNewCompany(String message) throws InterruptedException {
        forcePushlogic.validateCompanyCreation(message);
    }

    @When("I click on Update Company status Button")
    public void iClickOnUpdateCompanyStatusButton() throws InterruptedException {
        forcePushlogic.clickingOnUpdateStatusButtonOnCompanyProfile();
    }

    @Then("I should see a pop up for Update Company Status")
    public void iShouldSeeAPopUpForUpdateCompanyStatus() {
        forcePushlogic.verifyingTheDisplayedOfUpdateCompanyStatusModal();
    }

    @When("I select the status In Bisnow Universe status")
    public void iSelectTheStatusInBisnowUniverseStatus() {
        forcePushlogic.clickOnInBisNowUniverse();
    }

    @And("I click on the Update Company Status button")
    public void iClickOnTheUpdateCompanyStatusButton() throws InterruptedException {
        forcePushlogic.clickingOnUpdateCompanyStatusButton();
    }

    @Then("I should see the company status shown as In the Bisnow Universe")
    public void iShouldSeeTheCompanyStatusShownAsInTheBisnowUniverse() {
        forcePushlogic.verifyingCompanyStatusOnCompanyProfileIsEqualInBisnowUniverse();
    }

    @And("I should see a notification message for updating Company Status {string}")
    public void iShouldSeeANotificationMessageForUpdatingCompanyStatus(String message) throws InterruptedException {
        forcePushlogic.verifyingSuccessMessageAfterUpdateCompanyStatus(message);
    }

    @And("I should see a message displayed on the bottom of the page You cannot approve without Addresses, Asset Class, and Industry.")
    public void iShouldSeeAMessageDisplayedOnTheBottomOfThePageYouCannotApproveWithoutAddressesAssetClassAndIndustry() {
        forcePushlogic.verifyingMessageAtTheBottomOfThePageAfterSettingCompanyStatusAsInBisnowUniverse();
    }

    @When("I click on Add Address Button")
    public void iClickOnAddAddressButton() {
        forcePushlogic.clickOnAddCompanyAddressButton();
    }

    @Then("I should see a pop up for Create-Update Company Address")
    public void iShouldSeeAPopUpForCreateUpdateCompanyAddress() {
        forcePushlogic.validatePopUPAddCompanyAddress();
    }

    @When("I fill in the Postal Code textbos with valid postal code as {string}")
    public void iFillInThePostalCodeTextbosWithValidPostalCodeAs(String code) {
        forcePushlogic.addCompanyPostalCodeField(code);
    }

    @And("I select Address Type Headquarters")
    public void iSelectAddressTypeHeadquarters() {
        forcePushlogic.selectHeadQuarterTypeAddress();
    }

    @And("I click on save address button")
    public void iClickOnSaveAddressButton() {
        forcePushlogic.clickOnSaveCompanyAddressButton();
    }

    @Then("I should see the new address added with Headquarters type")
    public void iShouldSeeTheNewAddressAddedWithHeadquartersType() {
        forcePushlogic.validateHeadQuarterAddress();
    }

    @And("I should see a notification message for company address updated {string}")
    public void iShouldSeeANotificationMessageForCompanyAddressUpdated(String message) {
        forcePushlogic.validateAddAddressMassage(message);
    }

    @When("I click on the Add Asset Class button")
    public void iClickOnTheAddAssetClassButton() {
        forcePushlogic.clickOnAddAssetClassButton();
    }

    @Then("I should see a pop up Add Asset Class")
    public void iShouldSeeAPopUpAddAssetClass() {
        forcePushlogic.validatePopUPAddAssetClass();
    }

    @When("I select Asset Class")
    public void iSelectAssetClass() {
        forcePushlogic.selectAssetClassFromDropDownList();
    }

    @And("I should see the new added Asset Class on the company profile")
    public void iShouldSeeTheNewAddedAssetClassOnTheCompanyProfile() {
        forcePushlogic.validateAssetClassAdded();
    }

    @Then("I click on Update Asset Class button")
    public void iClickOnUpdateAssetClassButton() throws InterruptedException {
        forcePushlogic.clickOnUpdateAssetClassButton();
    }

    @And("I should see a success message for adding Asset Class {string}")
    public void iShouldSeeASuccessMessageForAddingAssetClass(String message) throws InterruptedException {
        forcePushlogic.validateAssetClassMassage(message);
    }

    @When("I click on the Add Industry button")
    public void iClickOnTheAddIndustryButton() {
        forcePushlogic.clickOnAddIndustryButton();
    }

    @Then("I should see a pop up Add Industry")
    public void iShouldSeeAPopUpAddIndustry() {
        forcePushlogic.validatePopUPAddIndustry();
    }

    @When("I select one of Company Industry")
    public void iSelectOneOfCompanyIndustry() {
        forcePushlogic.selectIndustryDropDownList();
    }

    @Then("I click on Update Industry button")
    public void iClickOnUpdateIndustryButton() throws InterruptedException {
        forcePushlogic.clickOnAddIndustryPopUpButton();
    }

    @And("I should see the new added Industry on the company profile")
    public void iShouldSeeTheNewAddedIndustryOnTheCompanyProfile() {
        forcePushlogic.validateIndustryAdded();
    }

    @And("I should see a success message for adding Industry {string}")
    public void iShouldSeeASuccessMessageForAddingIndustry(String message) {
        forcePushlogic.validateIndustryMassage(message);
    }

    @When("I click on Approved Button")
    public void iClickOnApprovedButton() throws InterruptedException {
        forcePushlogic.clickOnApprovedLink();
    }

    @Then("I should see Notification massage Company has been approved.")
    public void iShouldSeeNotificationMassageCompanyHasBeenApproved() throws InterruptedException {
        forcePushlogic.validateApprovedMassage();
    }

    @When("I enter valid email and passwords")
    public void iEnterValidEmailAndPasswords() throws InterruptedException {
        forcePushlogic.EnterAdminCredentialsSecond();
    }

    @And("I should see a success message for adding Asset Class")
    public void iShouldSeeASuccessMessageForAddingAssetClass() throws InterruptedException {
        forcePushlogic.validateAssetClassMassage();
    }
}
