package StepDefinitions;


import Pages.UserManagement.UserManagementLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class UserManagementStepDef {
   UserManagementLogic usermanagementlogic = new UserManagementLogic();

   @Given("I am on BisCred Users management page and want to Create new user")
   public void iAmOnBisCredUsersManagementPageAndWantToCreateNewUser() {
      usermanagementlogic.iAmOnBisCredUsersManagementPage();
   }

   @When("I click on Create user button")
   public void iClickOnCreateUserButton() throws InterruptedException {
      usermanagementlogic.ClickOnCreateUserButton();

   }

   @Then("I should be redirected to create user page")
   public void iShouldBeRedirectedToCreateUserPage() {
      usermanagementlogic.ValidateRedirectedToCreateUserPage();

   }

   @When("I fill the form with valid user data")
   public void iFillTheFormWithValidUserData() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserData();

   }

   @And("click on Create user button")
   public void clickOnCreateUserButton() {
      usermanagementlogic.clickOnCreateUserButton();

   }

   @Then("I should see a success massage for adding new user")
   public void iShouldSeeASuccessMassageForAddingNewUser() {
      usermanagementlogic.validateSuccessMassageForAddingNewUser();

   }

   @And("I should be redirected to the manage users page")
   public void iShouldBeRedirectedToTheManageUsersPage() {
      usermanagementlogic.RedirectedToTheManageUsersPage();
   }

   @When("I fill the form with valid user data for internal")
   public void iFillTheFormWithValidUserDataForInternal() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForInternal();
   }

   @When("I fill the form with valid user data trial")
   public void iFillTheFormWithValidUserDataTrial() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForTrail();
   }

   @Then("the user downloads settings section should be hidden")
   public void theUserDownloadsSettingsSectionShouldBeHidden() {
      usermanagementlogic.validateDownloadsSettingsSectionShouldBeHidden();

   }

   @When("I fill the form with valid user data for Basic")
   public void iFillTheFormWithValidUserDataForBasic() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForBasic();
   }

   @When("I fill the form with valid user data Super Admin")
   public void iFillTheFormWithValidUserDataSuperAdmin() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForBasicSuperAdmin();
   }

   @When("I fill the form with valid user data and leave the user name empty")
   public void iFillTheFormWithValidUserDataAndLeaveTheUserNameEmpty() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForEmptyName();
   }

   @Then("I should see an error message says: {string}")
   public void iShouldSeeAnErrorMessageSays(String message) {
      usermanagementlogic.validateErrorMessageForEmptyName(message);
   }

   @When("I fill the form with valid user data and leave the email empty")
   public void iFillTheFormWithValidUserDataAndLeaveTheEmailEmpty() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForEmptyEmail();
   }

   @When("I fill the form with valid user data and leave accounts dropdown empty")
   public void iFillTheFormWithValidUserDataAndLeaveAccountsDropdownEmpty() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForEmptyAccount();
   }

   @When("I fill the form with valid user data and leave the role field empty")
   public void iFillTheFormWithValidUserDataAndLeaveTheRoleFieldEmpty() {
      usermanagementlogic.FillTheFormWithValidUserDataForEmptyRole();
   }

   @When("I fill the form with valid user")
   public void iFillTheFormWithValidUser() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUser();
   }

   @When("I search about the created user {string}")
   public void iSearchAboutTheCreatedUser(String text) throws InterruptedException {
      usermanagementlogic.SearchAboutTheCreatedUser(text);

   }

   @And("I click on the Edit link")
   public void iClickOnTheEditLink() throws InterruptedException {
      usermanagementlogic.clickOnEditLink();
   }

   @And("I click on the User Active to unchecked it")
   public void iClickOnTheUserActiveToUncheckedIt() throws InterruptedException {
      usermanagementlogic.clickOnInactiveInputCheckBox();
   }

   @And("I click on Update User button")
   public void iClickOnUpdateUserButton() throws InterruptedException {
      usermanagementlogic.clickOnUpdateUserButton();
   }

   @Then("I should see a success massage {string}")
   public void iShouldSeeASuccessMassage(String message) {
      usermanagementlogic.validateMassageForUpdateUser(message);
   }

   @And("I should see {string} beside the user name")
   public void iShouldSeeBesideTheUserName(String text) {
      usermanagementlogic.validateInactiveUser(text);
   }

   @When("I click on management page on tob nav menu")
   public void iClickOnManagementPageOnTobNavMenu() {
      usermanagementlogic.RedirectedToTheManageUsersPage();
   }

   @Then("I should see the updated user Status is {string}")
   public void iShouldSeeTheUpdatedUserStatusIs(String text) {
      usermanagementlogic.validateInactiveUserStatus(text);
   }

   @When("I fill the form with valid user data and mark can download false")
   public void iFillTheFormWithValidUserDataAndMarkCanDownloadFalse() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForUserCantDawnload();
   }

   @When("I fill the form with valid user data and mark can download true")
   public void iFillTheFormWithValidUserDataAndMarkCanDownloadTrue() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForUserCanDownload();
   }

   @And("I select monthly from Download Limit Cadence")
   public void iSelectWeeklyFromDownloadLimitCadence() {
      usermanagementlogic.selectMonthlyDownloadLimitCadenceField();
   }

   @And("I fill the Download Limit field with any download limit")
   public void iFillTheDownloadLimitFieldWithAnyDownloadLimit() {
      usermanagementlogic.fillInDownloadLimitFieldWithAnyDownloadLimit();
   }

   @Given("I am on BisCred Users management page")
   public void iAmOnBisCredUsersManagementPage() {
      usermanagementlogic.iAmOnBisCredUsersManagementPage();
   }

   @When("I enter in the search bar {string}")
   public void iEnterInTheSearchBar(String text) throws InterruptedException {
      usermanagementlogic.SearchAboutTheCreatedUser(text);
   }

   @Then("I should see all users that matched the typed name {string}")
   public void iShouldSeeAllUsersThatMatchedTheTypedName(String text) throws InterruptedException {
      usermanagementlogic.validateSearchResultsMatchedTheTypedName(text);
   }

   @Then("I should see all users that matched the typed Email {string}")
   public void iShouldSeeAllUsersThatMatchedTheTypedEmail(String email) throws InterruptedException {
      usermanagementlogic.validateSearchResultsMatchedTheTypedEmail(email);
   }

   @Then("I should see all users under account {string}")
   public void iShouldSeeAllUsersUnderAccount(String account) throws InterruptedException {
      usermanagementlogic.validateSearchResultsMatchedTheTypedAccount(account);
   }

   @When("I click on Active filter")
   public void iClickOnActiveFilter() throws InterruptedException {
      usermanagementlogic.ClickOnActiveFilter();
   }

   @Then("I should see all users with status {string}")
   public void iShouldSeeAllUsersWithStatus(String status) throws InterruptedException {
      usermanagementlogic.validateSearchResultsMatchedTheActiveStatus(status);
   }

   @When("I click on InActive filter")
   public void iClickOnInActiveFilter() throws InterruptedException {
      usermanagementlogic.ClickOnInactiveFilter();
   }

   @When("I click on next arrow pagination on the right bottom corner")
   public void iClickOnNextArrowPaginationOnTheRightBottomCorner() {
      usermanagementlogic.ClickOnNextPage();
   }

   @Then("I should see the next page")
   public void iShouldSeeTheNextPage() {
      usermanagementlogic.validateSecondPage();
   }

   @When("I click on view link")
   public void iClickOnViewLink() throws InterruptedException {
      usermanagementlogic.ClickOnViewLink();
   }

   @Then("I should be redirected to View user page")
   public void iShouldBeRedirectedToViewUserPage() {
      usermanagementlogic.validateViewPage();
   }

   @Then("I should see User Download Stats")
   public void iShouldSeeUserDownloadStats() {
      usermanagementlogic.validateUserDownloadStatsInViewPage();
   }

   @And("I should see user Activity")
   public void iShouldSeeUserActivity() {
      usermanagementlogic.validateUserActivityInViewPage();
   }

   @When("I click on downloads tab")
   public void iClickOnDownloadsTab() {
      usermanagementlogic.clickOnDownloadsTab();
   }

   @Then("I should see the files downloaded by the user")
   public void iShouldSeeTheFilesDownloadedByTheUser() throws InterruptedException {
      usermanagementlogic.validateFilesDownloadedByTheUser();
   }

   @When("I click on Activity tab")
   public void iClickOnActivityTab() {
      usermanagementlogic.clickOnUserActivityTapInViewPage();
   }

   @Then("I should see the user Activity")
   public void iShouldSeeTheUserActivity() throws InterruptedException {
      usermanagementlogic.validateUserActivityByTheUser();
   }

   @Then("I should see the Active status in the right top corner")
   public void iShouldSeeTheActiveStatusInTheRightTopCorner() throws InterruptedException {
      usermanagementlogic.validateUserActiveStatus();
   }

   @Then("I should see the InActive status in the right top corner")
   public void iShouldSeeTheInActiveStatusInTheRightTopCorner() throws InterruptedException {
      usermanagementlogic.validateUserInactiveStatus();
   }

   @Then("I should be redirected to Edit User page")
   public void iShouldBeRedirectedToEditUserPage() {
      usermanagementlogic.validateEditUserPage();
   }

   @When("I update the form with valid user data and leave the email empty")
   public void iUpdateTheFormWithValidUserDataAndLeaveTheEmailEmpty() throws InterruptedException {
      usermanagementlogic.UpdateTheFormWithValidUserDataForEmptyEmail();
   }

   @When("I update the form with valid user data and leave the name empty")
   public void iUpdateTheFormWithValidUserDataAndLeaveTheNameEmpty() throws InterruptedException {
      usermanagementlogic.UpdateTheFormWithValidUserDataFoNameEmpty();
   }

   @When("I Enter new password and confirm new password")
   public void iEnterNewPasswordAndConfirmNewPassword() {
      usermanagementlogic.EnterPasswordAndConfirmItInUpdateUserPage();
   }

   @And("I click on Update password Button")
   public void iClickOnUpdatePasswordButton() {
      usermanagementlogic.clickOnUpdatePasswordButton();
   }

   @And("I should see success massage {string}")
   public void iShouldSeeSuccessMassage(String message) throws InterruptedException {
      usermanagementlogic.validateMassageForUpdatePassword(message);

   }

   @When("I Update all the fields")
   public void iUpdateAllTheFields() throws InterruptedException {
      usermanagementlogic.UpdateTheFormWithValidUserDataForUser();
   }

   @When("I Enter an empty space to the password field")
   public void iEnterAnEmptySpaceToThePasswordField() {
      usermanagementlogic.EnterEmptyPasswordAndConfirmItInUpdateUserPage();
   }

   @And("I should see error message under the password field {string}")
   public void iShouldSeeErrorMessageUnderThePasswordField(String message) {
      usermanagementlogic.validateMassageErrorPassword(message);
   }

   @And("I should see error message {string}")
   public void iShouldSeeErrorMessage(String message) {
      usermanagementlogic.validateMassageErrorPasswordNotification(message);
   }

   @When("I click on the profile icon")
   public void iClickOnTheProfileIcon() throws InterruptedException {
      usermanagementlogic.clickOnProfileIcon();
   }

   @And("I select Logout option from drop down list")
   public void iSelectLogoutOptionFromDropDownList() {
      usermanagementlogic.clickOnLogoutProfile();
   }

   @Then("I should be redirected to the login page")
   public void iShouldBeRedirectedToTheLoginPage() throws IOException {
      usermanagementlogic.validateLoginPage();
   }

   @When("I enter the new password to the password field")
   public void iEnterTheNewPasswordToThePasswordField() {
      usermanagementlogic.EnterUpdatedPasswordsCredentials();
   }

   @And("I should see download center , User Management and Accounts page displaying on the top nav")
   public void iShouldSeeDownloadCenterUserManagementAndAccountsPageDisplayingOnTheTopNav() throws InterruptedException {
      usermanagementlogic.validateAdminNavigation();
   }

   @When("I click on User Management on the top nav")
   public void iClickOnUserManagementOnTheTopNav() {
      usermanagementlogic.iAmOnBisCredUsersManagementPage();
   }

   @And("I should see Export Activity Report button")
   public void iShouldSeeExportActivityReportButton() {
      usermanagementlogic.validateDisplayedExportActivityReportButtonForAdminUser();
   }

   @When("I fill the form with valid user data for Basic User")
   public void iFillTheFormWithValidUserDataForBasicUser() throws InterruptedException {
      usermanagementlogic.FillTheFormWithValidUserDataForBasicUser();
   }

   @When("I enter valid email and password for The Basic User")
   public void iEnterValidEmailAndPasswordForTheBasicUser() {
      usermanagementlogic.EnterBasicUserCredentials();
   }

   @And("I should see Base Permissions displaying on the top nav")
   public void iShouldSeeBasePermissionsDisplayingOnTheTopNav() {
      usermanagementlogic.validateBasicNavigation();
   }

   @When("I Enter new password and confirm new password For Basic")
   public void iEnterNewPasswordAndConfirmNewPasswordForBasic() {
      usermanagementlogic.EnterPasswordAndConfirmItForBasicUser();
   }

   @When("I enter valid email and password for The User")
   public void iEnterValidEmailAndPasswordForTheUser() {
      usermanagementlogic.EnterUserRoleCredentials();
   }

   @When("I enter valid email and password for Trail User")
   public void iEnterValidEmailAndPasswordForTrailUser() {
      usermanagementlogic.EnterTrailUserRoleCredentials();
   }

   @And("I should see Base Permissions displaying on the top nav with No downloads display")
   public void iShouldSeeBasePermissionsDisplayingOnTheTopNavWithNoDownloadsDisplay() {
      usermanagementlogic.validateBasicPermissionsWithNoDownloadsNavigation();
   }

   @When("I enter valid email and password for The Internal User")
   public void iEnterValidEmailAndPasswordForTheInternalUser() {
      usermanagementlogic.EnterInternalUserRoleCredentials();
   }
}