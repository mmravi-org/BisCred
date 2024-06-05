package Pages.UserManagement;

import Enums.Users;

import java.io.IOException;
import java.util.Random;

import static helpers.helpers.getRegressionEnvironment;

public class UserManagementLogic extends UserManagementPO {
    public UserManagementLogic() {
        super();
    }

    public static String UserName() {
        String SALTCHARS = "ABCDEFGHIJKLMN";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public void iAmOnBisCredUsersManagementPage() {
        goToURL("https://dashboard.beta.biscred.net/management/users");
    }

    public void ClickOnCreateUserButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(CreateNewUserButton);
    }

    public void ValidateRedirectedToCreateUserPage() {
        waitForVisibility(CreateUserPage, 20);
        assertDisplayed(CreateUserPage);
    }

    public void FillTheFormWithValidUserData() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 4);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void clickOnCreateUserButton() {
        clickOnElement(CreateUserButton);
    }

    public void validateSuccessMassageForAddingNewUser() {
        waitForVisibility(MassageForAddingNewUser, 20);
        assertDisplayed(MassageForAddingNewUser);
        assertElementText(MassageForAddingNewUser, "User has been created.");
    }

    public void RedirectedToTheManageUsersPage() {
        goToURL("https://dashboard.beta.biscred.net/management/users");
        waitForVisibility(ManageUsersPage, 20);
        assertDisplayed(ManageUsersPage);

    }

    public void FillTheFormWithValidUserDataForInternal() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 1);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void FillTheFormWithValidUserDataForTrail() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 3);
    }

    public void validateDownloadsSettingsSectionShouldBeHidden() {
        waitForVisibility(TrailMassageForNoDownload, 20);
        assertDisplayed(TrailMassageForNoDownload);
    }

    public void FillTheFormWithValidUserDataForBasic() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 0);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void FillTheFormWithValidUserDataForBasicSuperAdmin() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 2);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void FillTheFormWithValidUserDataForEmptyName() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, " ");
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 2);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void validateErrorMessageForEmptyName(String text) {
        waitForVisibility(NameErrorMassageForAddingNewUser, 20);
        assertDisplayed(NameErrorMassageForAddingNewUser);
        assertElementText(NameErrorMassageForAddingNewUser, text);
    }

    public void FillTheFormWithValidUserDataForEmptyEmail() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, " ");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 2);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void FillTheFormWithValidUserDataForEmptyAccount() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField, " ");
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 2);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void FillTheFormWithValidUserDataForEmptyRole() {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void FillTheFormWithValidUser() throws InterruptedException {
        clickOnElement(UserNameField);

        sendElementText(UserNameField, "RegressionAutomationTest");
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 2);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void SearchAboutTheCreatedUser(String text) throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SearchAboutTheCreatedUser);
        sendElementText(SearchAboutTheCreatedUser, text);
        Thread.sleep(1000);
    }

    public void clickOnEditLink() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(EditLink);
    }

    public void clickOnInactiveInputCheckBox() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CanDownloadToggle.get(0));
    }

    public void clickOnUpdateUserButton() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(UpdateUserButton);
    }

    public void validateMassageForUpdateUser(String text) {
        waitForVisibility(MassageForUpdateUser, 20);
        assertDisplayed(MassageForUpdateUser);
        assertElementText(MassageForUpdateUser, text);
    }

    public void validateInactiveUser(String text) {
        waitForVisibility(InactiveText, 20);
        assertDisplayed(InactiveText);
        assertElementText(InactiveText, text);
    }

    public void validateInactiveUserStatus(String text) {
        waitForVisibility(InactiveStatus, 20);
        assertDisplayed(InactiveStatus);
        assertElementText(InactiveStatus, text);
    }

    public void FillTheFormWithValidUserDataForUserCantDawnload() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 2);
    }

    public void FillTheFormWithValidUserDataForUserCanDownload() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, UserName());
        clickOnElement(EmailField);
        sendElementText(EmailField, UserName() + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 2);
    }

    public void selectMonthlyDownloadLimitCadenceField() {
        clickOnElement(DownloadLimitCadenceField);
        selectFromUnOrderList(DownloadLimitCadenceOption, 1);
    }

    public void fillInDownloadLimitFieldWithAnyDownloadLimit() {
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void validateSearchResultsMatchedTheTypedName(String text) throws InterruptedException {
        Thread.sleep(1000);
        int tableSize = SearchResultsTable.size();
        for (int i = 0; i <= tableSize; i++) {
            assertElementText(SearchResultsValue, text);
        }
    }

    public void validateSearchResultsMatchedTheTypedEmail(String text) throws InterruptedException {
        Thread.sleep(1000);
        int tableSize = SearchResultsTable.size();
        for (int i = 0; i <= tableSize; i++) {
            assertElementText(SearchResultsEmailValue, text);
        }
    }

    public void validateSearchResultsMatchedTheTypedAccount(String text) throws InterruptedException {
        Thread.sleep(1000);
        int tableSize = SearchResultsTable.size();
        for (int i = 0; i <= tableSize; i++) {
            assertElementText(SearchResultsAccountValue, text);
        }
    }

    public void ClickOnActiveFilter() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(ActiveFilter);
    }

    public void validateSearchResultsMatchedTheActiveStatus(String text) throws InterruptedException {
        Thread.sleep(1000);
        int tableSize = SearchResultsTable.size();
        for (int i = 0; i <= tableSize; i++) {
            assertElementText(SearchResultsActiveStatus, text);
        }
    }

    public void ClickOnInactiveFilter() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(InactiveFilter);
    }

    public void ClickOnNextPage() {
        clickOnElement(SecondPage);
    }
    public void validateSecondPage() {
     assertIfTrue(SecondPage.isEnabled());
    }

    public void ClickOnViewLink() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(ViewLink);
    }

    public void validateViewPage() {
        waitForVisibility(ViewPage,20);
        assertDisplayed(ViewPage);
    }

    public void validateUserDownloadStatsInViewPage() {
        waitForVisibility(UserDownloadStatsInViewPage,20);
        assertDisplayed(UserDownloadStatsInViewPage);
    }

    public void validateUserActivityInViewPage() {
        waitForVisibility(UserActivityInViewPage,20);
        assertDisplayed(UserActivityInViewPage);
    }

    public void clickOnUserActivityTapInViewPage() {
        clickOnElement(UserActivityInViewPage);
    }

    public void clickOnDownloadsTab() {
        clickOnElement(UserDownloadStatsInViewPage);
    }


    public void validateFilesDownloadedByTheUser() throws InterruptedException {
        Thread.sleep(500);
        assertDisplayed(FilesDownloadedByTheUser);
        assertElementText(FilesDownloadedByTheUser,"No downloads found.");
    }

    public void validateUserActivityByTheUser() throws InterruptedException {
        Thread.sleep(500);
        assertDisplayed(UserActivity);
        assertElementText(UserActivity,"No activity found.");
    }

    public void validateUserActiveStatus() throws InterruptedException {
        Thread.sleep(500);
        assertDisplayed(ActiveStatus);
        assertElementText(ActiveStatus,"Active");
    }

    public void validateUserInactiveStatus() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(InactiveStatus);
        assertElementText(InactiveStatus,"Inactive");
    }

    public void UpdateTheFormWithValidUserDataForEmptyEmail() throws InterruptedException {
        clickOnElement(EmailField);
        EmailField.clear();
        sendElementText(EmailField, " ");
        Thread.sleep(500);
    }

    public void UpdateTheFormWithValidUserDataFoNameEmpty() throws InterruptedException {
        clickOnElement(UserNameField);
        UserNameField.clear();
        sendElementText(UserNameField, " ");
        Thread.sleep(500);
    }

    public void validateEditUserPage() {
        waitForVisibility(EditUser,20);
        assertDisplayed(EditUser);
    }

    public void EnterPasswordAndConfirmItInUpdateUserPage() {
        clickOnElement(PasswordField);
        sendElementText(PasswordField,"Aspire@123456H");
        clickOnElement(ConfirmPasswordField);
        sendElementText(ConfirmPasswordField,"Aspire@123456H");
    }

    public void clickOnUpdatePasswordButton() {
        clickOnElement(UpdatePasswordButton);
    }

    public void validateMassageForUpdatePassword(String text) throws InterruptedException {
       Thread.sleep(3000);
        assertElementContainsSomeText(MassageForUpdatePasswordDownload.get(0),text);
    }

    public void UpdateTheFormWithValidUserDataForUser() throws InterruptedException {
        clickOnElement(EmailField);
        EmailField.clear();
        sendElementText(EmailField, UserName()+"Updated" + "@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
        waitForVisibility(AccountsOption, 20);
        selectFromUnOrderList(AccountsOption, 0);
    }

    public void EnterEmptyPasswordAndConfirmItInUpdateUserPage() {
        clickOnElement(PasswordField);
        PasswordField.clear();
        sendElementText(PasswordField,"  ");
        clickOnElement(ConfirmPasswordField);
        ConfirmPasswordField.clear();
        sendElementText(ConfirmPasswordField,"  ");
    }

    public void validateMassageErrorPassword(String text) {
        waitForVisibility(MassageErrorPassword, 20);
        assertDisplayed(MassageErrorPassword);
        assertElementText(MassageErrorPassword, text);
    }

    public void validateMassageErrorPasswordNotification(String text) {
        waitForVisibility(MassageErrorPasswordNotification, 20);
        assertDisplayed(MassageErrorPasswordNotification);
        assertElementText(MassageErrorPasswordNotification, text);
    }
    public void clickOnProfileIcon() throws InterruptedException {
        Thread.sleep(9000);
        waitForElementToAppear(ProfileIcon,20);
        clickOnElement(ProfileIcon);
    }

    public void clickOnLogoutProfile(){clickOnElement(ProfileLogout);}

    public void validateLoginPage() {
        waitForVisibility(SignInButton, 20);
        assertDisplayed(SignInButton);
    }

    public void EnterUpdatedPasswordsCredentials(){
        waitForVisibility(EmailTextField,30);
        sendElementText(EmailTextField, "AutomationTestUser@gmail.com");
        waitForVisibility(PasswordTextBox,30);
        sendElementText(PasswordTextBox,"Aspire@123456H");
    }

    public void validateAdminNavigation() throws InterruptedException {
        Thread.sleep(500);
        assertDisplayed(DownloadCenter);
        assertDisplayed(UserManagement);
        assertDisplayed(Accounts);
    }

    public void validateDisplayedExportActivityReportButtonForAdminUser() {
        waitForVisibility(ExportActivityReportButton, 20);
        assertDisplayed(ExportActivityReportButton);
    }

    public void FillTheFormWithValidUserDataForBasicUser() throws InterruptedException {
        clickOnElement(UserNameField);
        sendElementText(UserNameField, "BasicUserForAutomation2");
        clickOnElement(EmailField);
        sendElementText(EmailField,  "BasicUserForAutomation2@gmail.com");
        clickOnElement(AccountsField);
        sendElementText(AccountsField,"AutomationAcountForTesting");
       Thread.sleep(500);
        selectFromUnOrderList(AccountsOption, 0);
        Thread.sleep(1000);
        clickOnElement(RoleField);
        selectFromUnOrderList(RolesOption, 0);
        clickOnElement(CanDownloadToggle.get(1));
        clickOnElement(DownloadLimitField);
        DownloadLimitField.clear();
        sendElementText(DownloadLimitField, "1000");
    }

    public void EnterPasswordAndConfirmItForBasicUser() {
        clickOnElement(PasswordField);
        sendElementText(PasswordField,"Aspire@123456H");
        clickOnElement(ConfirmPasswordField);
        sendElementText(ConfirmPasswordField,"Aspire@123456H");
    }

    public void EnterBasicUserCredentials(){
        waitForVisibility(EmailTextField,30);
        sendElementText(EmailTextField, "BasicUserForAutomation2@gmail.com");
        waitForVisibility(PasswordTextBox,30);
        sendElementText(PasswordTextBox,"Aspire@123456H");
    }

    public void validateBasicNavigation() {
        waitForVisibility(DownloadCenter, 20);
        assertDisplayed(DownloadCenter);
    }

    public void EnterUserRoleCredentials(){
        waitForVisibility(EmailTextField,30);
        sendElementText(EmailTextField, "UserRoleForAutomation@gmail.com");
        waitForVisibility(PasswordTextBox,30);
        sendElementText(PasswordTextBox,"Aspire@123456H");
    }

    public void EnterTrailUserRoleCredentials(){
        waitForVisibility(EmailTextField,30);
        sendElementText(EmailTextField, "TrailUserForAutomation@gmail.com");
        waitForVisibility(PasswordTextBox,30);
        sendElementText(PasswordTextBox,"Aspire@123456H");
    }

    public void validateBasicPermissionsWithNoDownloadsNavigation() {
        assertDisplayed(SearchNav);
        assertDisplayed(ListsNav);
        assertDisplayed(SavedNav);
    }
    public void EnterInternalUserRoleCredentials(){
        waitForVisibility(EmailTextField,30);
        sendElementText(EmailTextField, "InternalRoleForAutomation@gmail.com");
        waitForVisibility(PasswordTextBox,30);
        sendElementText(PasswordTextBox,"Aspire@123456H");
    }

}
