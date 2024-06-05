package Pages.Accounts;

import Enums.Users;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static helpers.helpers.getRegressionEnvironment;


public class AccountsLogic extends AccountsPO {

    public AccountsLogic() {
        super();
    }

    public static String AccountName() {
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


    public void iAmOnBisCredAccountsPage() throws InterruptedException {
        goToURL("https://dashboard.beta.biscred.net/management/accounts");
        Thread.sleep(1000);
    }

    public void clickOnCreateAccountButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(CreateAccountButton);
    }

    public void validateAccountsManagementPage() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(AccountManagementPage);
    }

    public void FillTheAccountFormWithValidData() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        sendElementText(AccountNameField, AccountName());
        clickOnElement(CompanyNameField);
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void clickOnCreateAccountButtonInsideAccountPage() {
        clickOnElement(CreateAccountButtonInsideAccountPage);
    }

    public void validateSuccessMessageForAddingNewAccount(String message) throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(SuccessMessageForAddingNewAccount);
        assertElementText(SuccessMessageForAddingNewAccount, message);
    }

    public void validateAccountsPage() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(AccountPage);
    }

    public void FillTheAccountNameWithNameAlreadyExist() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(AccountNameField);
        sendElementText(AccountNameField, "AutomationAcountForTesting");
    }

    public void FillTheAccountFormWithoutName() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyNameField);
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void validateMassageExistingName(String text) {
        waitForVisibility(MassageErrorName, 20);
        assertDisplayed(MassageErrorName);
        assertElementText(MassageErrorName, text);
    }

    public void validateAccountsDetailsPage() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(AccountDetailsPage);
    }

    public void FillTheAccountFormWithEmptyName() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        sendElementText(AccountNameField, " ");
        clickOnElement(CompanyNameField);
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void FillTheAccountFormWithEmptyCompany() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        sendElementText(AccountNameField, AccountName());
        clickOnElement(CompanyNameField);
        sendElementText(CompanyNameField, "  ");
        clickOnElement(NumberOfSeatsField);
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void validateMassageCompanyName(String text) {
        waitForVisibility(MassageErrorCompanyName, 20);
        assertDisplayed(MassageErrorCompanyName);
        assertElementText(MassageErrorCompanyName, text);
    }

    public void validateMassageNumberOfSeats(String text) {
        waitForVisibility(MassageErrorNumberOfSeats, 20);
        assertDisplayed(MassageErrorNumberOfSeats);
        assertElementText(MassageErrorNumberOfSeats, text);
    }

    public void FillTheAccountFormWithEmptyNumberOfSeats() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        sendElementText(AccountNameField, AccountName());
        clickOnElement(CompanyNameField);
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        sendElementText(NumberOfSeatsField, "   ");
    }

    public void ClickOnAccountActiveCheckBox() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(AccountActiveCheckBox);
    }

    String AccountName = AccountName();

    public void FillTheAccountFormWithInactiveAccount() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        sendElementText(AccountNameField, AccountName);
        clickOnElement(CompanyNameField);
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void SearchAboutTheCreatedAccount() {
        clickOnElement(AccountSearchBar);
        sendElementText(AccountSearchBar, "AutomationAccountNew");
    }

    public void RetainsTheCreatedAccountWithStatusInactive() throws InterruptedException {
        Thread.sleep(1000);
        assertElementText(AccountSearchResultsStatus, "Inactive");
    }

    public void FillTheAccountFormWithAllFieldEmpty() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        sendElementText(AccountNameField, "  ");
        clickOnElement(CompanyNameField);
        sendElementText(CompanyNameField, "  ");
        clickOnElement(NumberOfSeatsField);
        sendElementText(NumberOfSeatsField, "  ");
    }

    public void SearchAboutAccountFunctionality() {
        clickOnElement(AccountSearchBar);
        sendElementText(AccountSearchBar, "AutomationAcountForTesting");
    }

    public void SearchAccountFunctionality() {
        clickOnElement(AccountSearchBar);
        sendElementText(AccountSearchBar, "Account + Company");
    }

    public void SearchAboutAccount() {
        clickOnElement(AccountSearchBar);
        sendElementText(AccountSearchBar, "BJCDEAFEEN");
    }
    public void RetainsAccountWithCorrectValue() throws InterruptedException {
        Thread.sleep(3000);
        assertElementText(AccountNameResult, "AutomationAcountForTesting");
        assertElementText(AccountSearchResultsStatus, "Active");
    }

    public void RetainsAccountWithUsersRelated() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(UsersAccountResult);
        assertElementText(AccountSearchResultsStatus, "Active");
    }

    public void RetainsAccountWithNoUsersRelated() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(UsersAccountResult);
        assertElementText(UsersAccountResult,"This account has no users.");
    }

    public void RetainsAccountWithStatusRelated() throws InterruptedException {
        Thread.sleep(3000);
        assertElementText(AccountSearchResultsStatus, "Active");
    }

    public void ClickOnEditLink() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(EditLink);
    }

    public void validateEditAccountPage() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(EditAccountPage);
    }

    public void UpdateAccountForm() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(CompanyNameField);
        CompanyNameField.clear();
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        NumberOfSeatsField.clear();
        sendElementText(NumberOfSeatsField, "2000");
    }

    public void ClickOnUpdateAccountButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(UpdateAccountButton);
    }

    public void ClickOnAllFilter() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AllFilter);
    }

    public void validateSearchResultsMatchedTheActiveStatus(String text) throws InterruptedException {
        Thread.sleep(3000);
        int tableSize = SearchResultsTable.size();
        for (int i = 0; i <= tableSize; i++) {
            assertElementText(AccountSearchResultsStatus, text);
        }
    }

    public void validateMassageExistingAccountName() {
        waitForVisibility(MassageErrorName, 20);
        assertDisplayed(MassageErrorName);

    }
    public void iShouldSeeTheNamesAreSortingAlphabetically() {
        List<String> names = nameList.stream()
                .map(n -> n.getText())
                .collect(Collectors.toList());
        List<String> sortedNames = names;
        Collections.sort(sortedNames);
        boolean areSorted =  names.equals(sortedNames);
        assertIfTrue(areSorted);
    }
    public void ClickOnTheArrowsBesideTheNameField() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(SortArrow.get(0));
    }

    public void ClickOnTheArrowsBesideCompanyField() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(SortArrow.get(1));
    }

    public void iShouldSeeTheCompaniesAreSortingAlphabetically() {
        List<String> names = CompanynameList.stream()
                .map(n -> n.getText())
                .collect(Collectors.toList());
        List<String> sortedNames = names;
        Collections.sort(sortedNames);
        boolean areSorted =  names.equals(sortedNames);
        assertIfTrue(areSorted);
    }

    public void ClickOnTheArrowsBesideStatusField() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(SortArrow.get(2));
    }

    public void iShouldSeeTheStatusesAreSortingAlphabetically() {
        List<String> names = StatusesList.stream()
                .map(n -> n.getText())
                .collect(Collectors.toList());
        List<String> sortedNames = names;
        Collections.sort(sortedNames);
        boolean areSorted =  names.equals(sortedNames);
        assertIfTrue(areSorted);
    }

    public void ClickOnTheArrowsBesideSeatsField() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(SortArrow.get(3));
    }

    public void iShouldSeeTheSeatsAreSortingAlphabetically() {
        List<String> names = SeatsList.stream()
                .map(n -> n.getText())
                .collect(Collectors.toList());
        List<String> sortedNames = names;
        Collections.sort(sortedNames);
        boolean areSorted =  names.equals(sortedNames);
        assertIfTrue(areSorted);
    }

    public void UpdateTheAccountNameWithNameAlreadyExist() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        AccountNameField.clear();
        sendElementText(AccountNameField, "Account + Company");
    }

    public void UpdateTheAccountFormWithoutName() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(CompanyNameField);
        CompanyNameField.clear();
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        NumberOfSeatsField.clear();
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void UpdateTheAccountFormWithEmptyName() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        AccountNameField.clear();
        sendElementText(AccountNameField, " ");
        clickOnElement(CompanyNameField);
        CompanyNameField.clear();
        sendElementText(CompanyNameField, "https://" + AccountName() + ".com");
        clickOnElement(NumberOfSeatsField);
        NumberOfSeatsField.clear();
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void UpdateTheAccountFormWithEmptyCompany() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(CompanyNameField);
        CompanyNameField.clear();
        sendElementText(CompanyNameField, "  ");
        clickOnElement(NumberOfSeatsField);
        NumberOfSeatsField.clear();
        sendElementText(NumberOfSeatsField, "1000");
    }

    public void UpdateTheAccountFormWithEmptySeats() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(AccountNameField);
        AccountNameField.clear();
        sendElementText(AccountNameField, "  ");
        clickOnElement(CompanyNameField);
        CompanyNameField.clear();
        sendElementText(CompanyNameField, "  ");
        clickOnElement(NumberOfSeatsField);
        NumberOfSeatsField.clear();
        Thread.sleep(500);
        sendElementText(NumberOfSeatsField, "  ");
    }

    public void validateSearchResultsMatchedAllStatus() throws InterruptedException {
        Thread.sleep(2000);
        int tableSize = SearchResultsTable.size();
        for (int i = 0; i <= tableSize; i++) {
            assertDisplayed(ActiveStatus);
            assertDisplayed(InactiveStatus);
        }
    }
}