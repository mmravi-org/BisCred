//package StepDefinitions;
//
//import Pages.List.ListLogic;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//import static Setup.DriverSetup.driver;
//
//public class ListStepDef {
//    ListLogic listLogic = new ListLogic();
//
//
//    @When("I click on List main menu")
//    public void iClickOnListMainMenu() throws InterruptedException {
//        listLogic.ClickOnListMainMenu();
//    }
//
//    @And("I click on New person list")
//    public void iClickOnNewPersonList() {
//        listLogic.ClickOnNewPersonList();
//    }
//
//    @Then("I should See popup to create new list")
//    public void iShouldSeePopToCreateNewList() {
//        listLogic.ShouldSeePopToCreateNewList();
//    }
//
//    @When("I Add a valid list name")
//    public void iAddValidListName() {
//        listLogic.AddValidListName();
//    }
//
//    @And("I click on submit button")
//    public void iClickOnSubmitButton() {
//        listLogic.ClickOnSubmitButton();
//    }
//
////  @Then("I should see a success message for creating new list")
////    public void iShouldSeeSuccessMessage()
////  {
////      listLogic.ShouldSeeSuccessMessage();
////  }
//
//    @And("I should see the added list name")
//    public void iShouldSeeTheAddedListName() {
//        listLogic.ShouldSeeTheAddedListName();
//    }
//
//    @Then("I should be redirect to the person lists page")
//    public void iShouldBeRedirectToThePersonListsPage() throws InterruptedException {
//        listLogic.ShouldRedirectToPersonListPage();
//    }
//
//    @Given("I am on BisCred lists page and want to Add new persons list")
//    public void iAmOnBisCredListsPageAndWantToAddNewPersonsList() throws InterruptedException {
//        listLogic.ClickOnListMainMenu();
//    }
//
//    @Then("I should see an error message {string}")
//    public void iShouldSeeAnErrorMessage(String arg0) {
//        listLogic.ShouldSeeTheErrorMessage();
//    }
//
//    @Given("I am on BisCred lists page and want to view person list")
//    public void iAmOnBisCredListsPageAndWantToViewPersonList() {
//        listLogic.ShouldBeOnPersonListPage();
//    }
//
//    @When("I click on any person list")
//    public void iClickOnAnyPersonList() {
//        listLogic.ClickOnViewLinkOnTheFirstPersonList();
//
//    }
//
//    @Then("I should be redirected to the person list page details")
//    public void iShouldBeRedirectedToThePersonListPageDetails() {
//        listLogic.VerifyThatYouOnPersonListPageDetails();
//    }
//
//    @Then("I should click on cancel button on the create new list pop up")
//    public void iShouldClickOnCancelButtonOnTheCreateNewListPopUp() {
//        listLogic.ClickOnCancelButtonOnTheCreateNewListPopUp();
//    }
//
//    @When("I click close icon")
//    public void iClickCloseIcon() {
//        listLogic.ClickCloseIcon();
//    }
//
//
//    @Given("I am on BisCred lists page and want to edit persons list")
//    public void iAmOnBisCredListsPageAndWantToEditPersonsList() {
//        listLogic.ShouldBeOnPersonListPage();
//    }
//
//    @When("I click on edit button")
//    public void iClickOnEditButton() throws InterruptedException {
//        listLogic.EditList();
//    }
//
//    @Then("I should See popup to edit the list name")
//    public void iShouldSeePopupToEditTheListName() throws InterruptedException {
//        listLogic.ShouldSeePopupToEditTheListName();
//    }
//
//    @Then("I should see a success message for updating list")
//    public void iShouldSeeASuccessMessageForUpdatingList() throws InterruptedException {
//        listLogic.ShouldSeeASuccessMessageForUpdatingList();
//    }
//
//    @And("I should see the name of the list has been updated")
//    public void iShouldSeeTheNameOfTheListHasBeenUpdated() {
//        listLogic.ShouldSeeTheNameOfTheListHasBeenUpdated();
//    }
//
//    @When("I Edit a valid list name")
//    public void iEditAValidListName() {
//        listLogic.EditAValidListName();
//    }
//
//    @And("I click on submit button on edit popup")
//    public void iClickOnSubmitButtonOnEditPopup() {
//        listLogic.ClickOnSubmitButtonOnEditPopup();
//    }
//
//    @When("I clear the name in person list field")
//    public void iClearTheNameInPersonListField() {
//        listLogic.ClearTheNameInPersonListField();
//    }
//
//    @When("I click cancel button on edit pop up")
//    public void iClickCancelButtonOnEditPopUp() {
//        listLogic.ClickCancelButtonOnEditPopUp();
//    }
//
//    @When("I click close icon on edit pop up")
//    public void iClickCloseIconOnEditPopUp() {
//        listLogic.ClickCloseIconOnEditPopUp();
//    }
//
//    @When("I click on edit button again")
//    public void iClickOnEditButtonAgain() {
//        listLogic.ClickOnEditButtonAgain();
//    }
//
//    @Given("I am on BisCred lists page and want to Delete persons list")
//    public void iAmOnBisCredListsPageAndWantToDeletePersonsList() {
//        listLogic.AmOnBisCredListsPageAndWantToDeletePersonsList();
//    }
//
//    @When("I click on Delete Link")
//    public void iClickOnDeleteLink() {
//        listLogic.ClickOnDeleteLink();
//    }
//
//    @Then("I should See popup to confirm deleting the list")
//    public void iShouldSeePopupToConfirmDeletingTheList() {
//        listLogic.ShouldSeePopupToConfirmDeletingTheList();
//    }
//
//    @When("I click on delete list button")
//    public void iClickOnDeleteListButton() {
//        listLogic.ClickOnDeleteListButton();
//    }
//
////    @Then("I should see a success message for deleting the list")
////    public void iShouldSeeASuccessMessageForDeletingTheList()
////    { listLogic.ShouldSeeASuccessMessageForDeletingTheList();
////    }
//
//    @And("I should see the list has been deleted")
//    public void iShouldSeeTheListHasBeenDeleted() {
//        listLogic.ShouldSeeTheListHasBeenDeleted();
//    }
//
//    @When("I click cancel button on delete pop up")
//    public void iClickCancelButtonOnDeletePopUp() {
//        listLogic.ClickCancelButtonOnDeletePopUp();
//    }
//
//    @When("I click on Delete Link again")
//    public void iClickOnDeleteLinkAgain() {
//        driver.navigate().refresh();
//        listLogic.ClickOnDeleteLinkAgain();
//    }
//
//    @When("I click close icon on delete pop up")
//    public void iClickCloseIconOnDeletePopUp() {
//        listLogic.ClickCloseIconOnDeletePopUp();
//    }
//
//    @Given("I am on BisCred lists page and want to view persons list")
//    public void iAmOnBisCredListsPageAndWantToViewPersonsList() {
//        listLogic.AmOnBisCredListsPageAndWantToViewPersonsList();
//
//    }
//
//    @When("I click on view Link")
//    public void iClickOnViewLink() {
//        listLogic.ClickOnViewLink();
//    }
//
//    @Given("I am on BisCred dashboard and want to search about a person")
//    public void CheckAdminDashboardAppears() throws InterruptedException {
//        listLogic.CheckAdminDashboardAppears();
//    }
//
//
//    @When("I enter an exist company name {string} on the search field")
//    public void iEnterAnExistCompanyNameOnTheSearchField(String text)
//    {
//        listLogic.EnterAnExistCompanyNameOnTheSearchField(text);
//    }
//
//    @And("I select the company from the result")
//    public void iSelectTheCompanyFromTheResult() throws InterruptedException {
//        listLogic.SelectTheCompanyFromTheResult();
//    }
//
//    @And("I select all the people on the search result")
//    public void iSelectAllThePeopleOnTheSearchResult() {
//        listLogic.SelectAllThePeopleOnTheSearchResult();
//    }
//
//    @And("I click on Actions button")
//    public void iClickOnActionsButton() throws InterruptedException {
//        listLogic.ClickOnActionsButton();
//    }
//
//    @And("I click on Save to list from from the shown list")
//    public void iClickOnSaveToListFromFromTheShownList() throws InterruptedException {
//        listLogic.ClickOnSaveToListFromFromTheShownList();
//    }
//
//    @Then("I should see the Save People to List pop up")
//    public void iShouldSeeTheSavePeopleToListPopUp() throws InterruptedException {
//        listLogic.ShouldSeeTheSavePeopleToListPopUp();
//    }
//
//    @When("I click on New List Tab")
//    public void iClickOnNewListTab() {
//        listLogic.ClickOnNewListTab();
//    }
//
//    @And("I type a list name on List Name Field")
//    public void iTypeAListNameOnListNameField() {
//        listLogic.TypeAListNameOnListNameField();
//    }
//
//    @And("I click on Submit button on the Save People to List pop up")
//    public void iClickOnSubmitButtonOnTheSavePeopleToListPopUp() {
//        listLogic.ClickOnSubmitButtonOnTheSavePeopleToListPopUp();
//    }
//
//
//    @Then("I should see a notification massage {string}")
//    public void iShouldSeeANotificationMassage(String arg0) throws InterruptedException {
//        listLogic.ShouldSeeANotificationMassage();
//    }
//
//    @Then("I click on the first person list")
//    public void iClickOnTheFirstPersonList() {
//        listLogic.ClickOnTheFirstPersonList();
//    }
//
//    @When("I select all the records from person list page")
//    public void iSelectAllTheRecordsFromPersonListPage() {
//        listLogic.SelectAllTheRecordsFromPersonListPage();
//    }
//
//
//    @And("I select Remove from list option")
//    public void iSelectRemoveFromListOption() throws InterruptedException {
//        listLogic.SelectRemoveFromListOption();
//    }
//
//    @And("I select Remove from list option Contact")
//    public void iSelectRemoveFromListOptionContact() throws InterruptedException {
//        listLogic.SelectRemoveFromListOptionContact();
//    }
//
//    @Then("I should see Remove from List pop up")
//    public void iShouldSeeRemoveFromListPopUp() throws InterruptedException {
//        listLogic.ShouldSeeRemoveFromListPopUp();
//    }
//
//    @And("I click on Remove from List button")
//    public void iClickOnRemoveFromListButton() throws InterruptedException
//    {
//        listLogic.ClickOnRemoveFromListButton();
//    }
//
//    @And("I should see a notification massage Selected profiles have been removed from your list. for removing list")
//    public void iShouldSeeANotificationMassageForRemovingList() throws InterruptedException {
//        listLogic.ShouldSeeANotificationMassageForRemovingList();
//    }
//
//    @And("I should see a massage displayed on the page Your list is currently empty.")
//    public void iShouldSeeAMassageDisplayedOnThePage() {
//        listLogic.ShouldSeeAMassageDisplayedOnThePage();
//    }
//
//
//    @Then("I should be redirect to the person lists page after viewing")
//    public void iShouldBeRedirectToThePersonListsPageAfterViewing() {
//        listLogic.ShouldBeRedirectToThePersonListsPageAfterViewing();
//    }
//
//    @And("I click on Cancel button")
//    public void iClickOnCancelButton() {
//        listLogic.ClickOnCancelButton();
//    }
//
//    @And("I should see the list Result is not deleted")
//    public void iShouldSeeTheListResultIsNotDeleted() {
//        listLogic.ShouldSeeTheListResultIsNotDeleted();
//    }
//
//
//    @And("I click on X icon button")
//    public void iClickOnXIconButton() {
//        listLogic.ClickOnXIconButton();
//    }
//
//    @And("I should see a message No records have been selected!")
//    public void iShouldSeeAMessageNoRecordsHaveBeenSelected() {
//        listLogic.ShouldSeeAMessageNoRecordsHaveBeenSelected();
//    }
//
//    @And("I click on Actions button double click")
//    public void iClickOnActionsButtonDoubleClick() throws InterruptedException {
//        listLogic.ClickOnActionsButtonDoubleClick();
//    }
//
//    @And("I select Clear Selected from drop down list")
//    public void iSelectClearSelectedFromDropDownList() throws InterruptedException {
//        listLogic.SelectClearSelectedFromDropDownList();
//    }
//
//    @Then("I should see All selected options cleared and not selected")
//    public void iShouldSeeAllSelectedOptionsClearedAndNotSelected() {
//        listLogic.ShouldSeeAllSelectedOptionsClearedAndNotSelected();
//    }
//
//    @And("I select Download from Action list")
//    public void iSelectDownloadFromActionList() {
//        listLogic.SelectDownloadFromActionList();
//    }
//
//    @Then("I should see a pop up Confirm Download")
//    public void iShouldSeeAPopUpConfirmDownload() throws InterruptedException {
//        listLogic.ShouldSeeAPopUpConfirmDownload();
//    }
//
//
//    @When("I leave the check box beside Clear selected results after download. without checking it")
//    public void iLeaveTheCheckBoxBesideClearSelectedResultsAfterDownloadWithoutCheckingIt() {
//        listLogic.LeaveTheCheckBoxBesideClearSelectedResultsAfterDownloadWithoutCheckingIt();
//    }
//
//    @And("I click Download button")
//    public void iClickDownloadButton() {
//        listLogic.ClickDownloadButton();
//    }
//
//    @Then("I should see a notification massage for download {string}")
//    public void iShouldSeeANotificationMassageForDownload(String arg0) throws InterruptedException {
//        listLogic.ShouldSeeANotificationMassageForDownload();
//    }
//
//    @And("the selected list should be stay selected")
//    public void theSelectedListShouldBeStaySelected()
//    {   listLogic.theSelectedListShouldBeStaySelected();
//    }
//
//    @When("I click Cancel button")
//    public void iClickCancelButton()
//    { listLogic.ClickCancelButton();
//    }
//
//    @When("I click Close Icon button")
//    public void iClickCloseIconButton()
//    { listLogic.ClickCloseIconButton();
//    }
//
//    @When("I click on check box beside Clear selected results after download")
//    public void iClickOnCheckBoxBesideClearSelectedResultsAfterDownload() {
//        listLogic.ClickOnCheckBoxBesideClearSelectedResultsAfterDownload();
//    }
//
//    @And("I click Download link when link is disabled")
//    public void iClickDownloadButtonWhenLinkIsDisabled()
//    { listLogic.ClickDownloadButtonWhenLinkIsDisabled();
//    }
//
//    @Then("I should see an error message {string} again for download function")
//    public void iShouldSeeAnErrorMessageAgainForDownloadFunction(String arg0)
//    {  listLogic.ShouldSeeAnErrorMessageAgainForDownloadFunction();
//    }
//
//    @And("I click on Actions button double click on download link once it disabled")
//    public void iClickOnActionsButtonDoubleClickToCoClickOnDownloadLinkOnceItDisabled() throws InterruptedException {
//        listLogic.ClickOnActionsButtonDoubleClickToCoClickOnDownloadLinkOnceItDisabled();
//    }
//
//    @Then("I should see a success message for deleting the list")
//    public void iShouldSeeASuccessMessageForDeletingTheList() throws InterruptedException {
//        listLogic.ShouldSeeASuccessMessageForDeletingTheList();
//    }
//
//    @Given("I am on BisCred lists page and want to Add new company list")
//    public void iAmOnBisCredListsPageAndWantToAddNewCompanyList() throws InterruptedException
//    { listLogic.AmOnBisCredListsPageAndWantToAddNewCompanyList();
//    }
//
//    @When("I click on New company list")
//    public void iClickOnNewCompanyList() throws InterruptedException { listLogic.ClickOnNewCompanyList();
//    }
//
//    @And("I should be redirect to the company lists page")
//    public void iShouldBeRedirectToTheCompanyListsPage()
//    { listLogic.ShouldBeRedirectToTheCompanyListsPage();
//    }
//
//
//    @When("I Add a valid Company list name")
//    public void iAddAValidCompanyListName()
//    { listLogic.AddAValidCompanyListName();
//
//    }
//
//    @Given("I am on BisCred lists page and want to view company list")
//    public void iAmOnBisCredListsPageAndWantToViewCompanyList() {
//        listLogic.AmOnBisCredListsPageAndWantToViewCompanyList();
//    }
//
//    @When("I click on any company list")
//    public void iClickOnAnyCompanyList() {
//        listLogic.ClickOnAnyCompanyList();
//    }
//
//    @Then("I should be redirected to the company list page details")
//    public void iShouldBeRedirectedToTheCompanyListPageDetails() throws InterruptedException {
//        listLogic.ShouldBeRedirectedToTheCompanyListPageDetails();
//    }
//
//    @Given("I am on BisCred lists page and want to edit company list")
//    public void iAmOnBisCredListsPageAndWantToEditCompanyList() {
//        listLogic.AmOnBisCredListsPageAndWantToEditCompanyList();
//    }
//
//    @And("I should see the company list name edited")
//    public void iShouldSeeTheCompanyListNameEdited() {
//        listLogic.ShouldSeeTheCompanyListNameEdited();
//    }
//
//    @When("I Edit a valid list  for company")
//    public void iEditAValidListForCompany() {
//        listLogic.EditAValidListForCompany();
//    }
//
//    @When("I clear the name in company list field")
//    public void iClearTheNameInCompanyListField() {
//        listLogic.ClearTheNameInCompanyListField();
//    }
//
//    @Given("I am on BisCred lists page and want to Delete company list")
//    public void iAmOnBisCredListsPageAndWantToDeleteCompanyList() {
//        listLogic.AmOnBisCredListsPageAndWantToDeleteCompanyList();
//    }
//
//    @Then("I should be redirect to the company lists page after viewing")
//    public void iShouldBeRedirectToTheCompanyListsPageAfterViewing() {
//        listLogic.ShouldBeRedirectToTheCompanyListsPageAfterViewing();
//    }
//
//    @Given("I am on BisCred dashboard and want to search about a company")
//    public void iAmOnBisCredDashboardAndWantToSearchAboutACompany() throws InterruptedException {
//        listLogic.AmOnBisCredDashboardAndWantToSearchAboutACompany();
//    }
//
//    @And("I select all the companies on the search result")
//    public void iSelectAllTheCompaniesOnTheSearchResult() throws InterruptedException {
//        listLogic.SelectAllTheCompaniesOnTheSearchResult();
//    }
//
//
//    @Then("I click on the first company list")
//    public void iClickOnTheFirstCompanyList() {
//        listLogic.ClickOnTheFirstCompanyList();
//    }
//
//    @When("I select all the records from company list page")
//    public void iSelectAllTheRecordsFromCompanyListPage()  {
//        listLogic.SelectAllTheRecordsFromCompanyListPage();
//    }
//
//    @And("I click on view all companies results link")
//    public void iClickOnViewAllCompaniesResultsLink() throws InterruptedException {
//        listLogic.ClickOnViewAllCompaniesResultsLink();
//    }
//
//    @And("I click on Actions button for company")
//    public void iClickOnActionsButtonForCompany() throws InterruptedException {
//        listLogic.ClickOnActionsButtonForCompany();
//    }
//
//    @And("I click on company tab")
//    public void iClickOnCompanyTab() throws InterruptedException {
//        listLogic.ClickOnCompanyTab();
//    }
//
//    @And("I select Download from Action list in the company list page")
//    public void iSelectDownloadFromActionListInTheCompanyListPage() {
//        listLogic.SelectDownloadFromActionListInTheCompanyListPage();
//    }
//
//    @Then("I should be redirected to the company list page details after viewing a company")
//    public void iShouldBeRedirectedToTheCompanyListPageDetailsAfterViewingACompany() throws InterruptedException {
//        listLogic.ShouldBeRedirectedToTheCompanyListPageDetailsAfterViewingACompany();
//    }
//
//    @And("I select Remove from list option from company list page")
//    public void iSelectRemoveFromListOptionFromCompanyListPage() throws InterruptedException {
//        listLogic.SelectRemoveFromListOptionFromCompanyListPage();
//    }
//
//    @Then("I should see All selected options cleared and not selected in person list page")
//    public void iShouldSeeAllSelectedOptionsClearedAndNotSelectedInPersonListPage() {
//        listLogic.ShouldSeeAllSelectedOptionsClearedAndNotSelectedInPersonListPage();
//    }
//
//        @When("I select any list from existing list drop Down List")
//    public void iSelectAnyListFromExistingListDropDownList() {
//        listLogic.selectAnyListFromExistingListDropDownList();
//    }
//
//    @When("I click on any person name")
//    public void iClickOnAnyPersonName() {
//        listLogic.clickOnPersonNameToShowProfilePanel();
//    }
//
//
//}
