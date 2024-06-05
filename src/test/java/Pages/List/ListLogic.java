//package Pages.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import java.awt.*;
//import java.util.List;
//
//public class ListLogic extends ListPO {
//
//    public ListLogic() {
//        super();
//    }
//
//    public void ClickOnListMainMenu() throws InterruptedException {
//        {
//            Thread.sleep(3000);
//            // goToURL("https://dashboard.beta.biscred.net/lists");
//            clickOnElement(ListMainMenu);
//        }
//
//    }
//
//    public void ClickOnNewPersonList() {
//        waitForVisibility(NewPersonList, 20);
//        clickOnElement(NewPersonList);
//    }
//
//    public void ShouldSeePopToCreateNewList() {
//        waitForVisibility(PopUpCreateNewList, 20);
//        assertDisplayed(PopUpCreateNewList);
//    }
//
//    public void AddValidListName() {
//        sendElementText(ListNameField, "Person List Automation Test");
//    }
//
//    public void ClickOnSubmitButton() {
//        clickOnElement(SubmitButtonOnCreateNewList);
//    }
//
//    //public void ShouldSeeSuccessMessage() { assertDisplayed();}
//
//    public void ShouldRedirectToPersonListPage() throws InterruptedException {
//       Thread.sleep(4000);
//        assertIfTrue(PersonListTab.isEnabled());
//    }
//
//    public void ShouldSeeTheAddedListName() {
//        assertDisplayed(AddedListName);
//    }
//
//
//    public void ShouldSeeTheErrorMessage() {
//        waitSeconds(20);
//        waitForVisibility(ErrorMessageForAddingEmptyList, 20);
//        //String expectedMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/main/section/div[1]/div/nav/a[1]")).getText();
//        Assert.assertTrue("There was a problem creating your list!", true);
//    }
//
//    public void ClickOnViewLinkOnTheFirstPersonList() {
//        clickOnElement(ViewLinkOnTheFirstPersonList);
//    }
//
//    public void ShouldBeOnPersonListPage() {
//        waitForVisibility(DashboardUser, 20);
//        assertIfTrue(PersonListTab.isEnabled());
//    }
//
//    public void VerifyThatYouOnPersonListPageDetails() {
//        waitSeconds(30);
//        assertDisplayed(PersonListDetailsPage);
//    }
//
//    public void ClickOnCancelButtonOnTheCreateNewListPopUp() {
//        clickOnElement(CancelButtonOnCreateListPopUp);
//
//    }
//
//    public void ClickCloseIcon() {
//        clickOnElement(CloseIconOnCreateListPopUp);
//    }
//
//    public void EditList() throws InterruptedException {
//        Thread.sleep(1000);
//        driver.navigate().refresh();
//        clickOnElement(EditListLink);
//    }
//
//    public void ShouldSeePopupToEditTheListName() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(EditListPopUp);
//    }
//
//
//    public void ShouldSeeASuccessMessageForUpdatingList() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitForVisibility(EditSuccessMessage, 20);
//        assertElementText(EditSuccessMessage, "Your list has been updated!");
//    }
//
//    public void ShouldSeeTheNameOfTheListHasBeenUpdated() {
//        assertDisplayed(EditedListNameFirstRecord);
////        assertElementText(EditedListNameFirstRecord, "Person List Automation");
//    }
//
//    public void EditAValidListName() {
//        EditListNameField.clear();
//        sendElementText(EditListNameField, "Person List Automation");
//    }
//
//    public void ClickOnSubmitButtonOnEditPopup() {
//        clickOnElement(SubmitButtonOnEditListPage);
//    }
//
//    public void ClearTheNameInPersonListField() {
//        EditListNameField.clear();
//    }
//
//    public void ClickCancelButtonOnEditPopUp() {
//        clickOnElement(CancelButtonOnEditListPopUp);
//    }
//
//    public void ClickCloseIconOnEditPopUp() {
//        clickOnElement(CancelIconOnEditListPopUp);
//    }
//
//    public void ClickOnEditButtonAgain() {
//        driver.navigate().refresh();
//        waitForVisibility(EditListLink, 20);
//        clickOnElement(EditListLink);
//    }
//
//
//    public void AmOnBisCredListsPageAndWantToDeletePersonsList() {
//        waitForVisibility(DashboardUser, 20);
//        assertIfTrue(PersonListTab.isEnabled());
//    }
//
//    public void ClickOnDeleteLink() {
//        waitForVisibility(DeleteListLink, 20);
//        clickOnElement(DeleteListLink);
//    }
//
//    public void ShouldSeePopupToConfirmDeletingTheList() {
//        waitForVisibility(DeleteListConfirmationMessage, 20);
//        assertDisplayed(DeleteListConfirmationMessage);
//    }
//
//    public void ClickOnDeleteListButton() {
//        clickOnElement(DeleteButtonOnDeletePopUp);
//    }
//
//    // public void ShouldSeeASuccessMessageForDeletingTheList()
//    // { assertDisplayed(); }
//
//    public void ShouldSeeTheListHasBeenDeleted() {
//        int tableSize = CheckingAllListValues.size();
//        for (int i = 0; i < tableSize; i++)
//            Assert.assertNotEquals(CheckingAllListValues.get(i), "Person List Automation");
//    }
//
//    public void ClickCancelButtonOnDeletePopUp() {
//        clickOnElement(CancelButtonOnDeletePopUp);
//    }
//
//    public void ClickOnDeleteLinkAgain() {
//        driver.navigate().refresh();
//        waitForVisibility(DeleteListLink, 20);
//        clickOnElement(DeleteListLink);
//    }
//
//
//    public void ClickCloseIconOnDeletePopUp() {
//        clickOnElement(CloseIconOnDeletePopUp);
//    }
//
//    public void AmOnBisCredListsPageAndWantToViewPersonsList() {
//        waitForVisibility(DashboardUser, 20);
//        assertIfTrue(PersonListTab.isEnabled());
//    }
//
//    public void ClickOnViewLink() {
//        clickOnElement(ViewListLink);
//    }
//
//
//    public void CheckAdminDashboardAppears() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitForVisibility(BiscredLogo, 40);
//
//        waitForVisibility(DashboardUser, 20);
//        assertDisplayed(DashboardUser);
//        goToURL("https://dashboard.beta.biscred.net/");
//        //clickOnElement(BiscredLogo);
//    }
//
//    public void EnterAnExistCompanyNameOnTheSearchField(String text) {
//        waitSeconds(30);
//        sendElementText(SearchForaPersonOrCompanyField, text);
//    }
//
//    public void SelectTheCompanyFromTheResult() throws InterruptedException {
////        waitForVisibility(CompanySearchFirstOption, 30);
////        waitForElementToAppear(CompanySearchFirstOption,20);
//        Thread.sleep(4000);
//        clickOnElement(CompanySearchFirstOption);
//    }
//
//    public void SelectAllThePeopleOnTheSearchResult() {
//        waitForVisibility(CheckBoxToSelectAllResultOnListPage, 20);
//        clickOnElement(CheckBoxToSelectAllResultOnListPage);
//    }
//
//    public void ClickOnActionsButton() throws InterruptedException {
//        Thread.sleep(3000);
//        waitForVisibility(ActionButton, 20);
//        clickOnElement(ActionButton);
//    }
//
//
//    public void ClickOnSaveToListFromFromTheShownList() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(SaveToListFunction);
//    }
//
//    public void ShouldSeeTheSavePeopleToListPopUp() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitForVisibility(SubmitButtonOnTheSavePeopleToListPopUp, 20);
//        assertDisplayed(SubmitButtonOnTheSavePeopleToListPopUp);
//    }
//
//    public void ClickOnNewListTab() {
//        clickOnElement(NewListTabOnSavePeopleToListPopUp);
//    }
//
//    public void TypeAListNameOnListNameField() {
//        ListNameFieldOnSavePeopleToListPopUp.sendKeys("Automation List added");
//    }
//
//    public void ClickOnSubmitButtonOnTheSavePeopleToListPopUp() {
//        clickOnElement(SubmitButtonOnTheSavePeopleToListPopUp);
//    }
//
//
//    public void ShouldSeeANotificationMassage() throws InterruptedException {
//        Thread.sleep(3000);
//        waitForVisibility(SuccessMessageAfterSavePeopleToList, 30);
//        assertDisplayed(SuccessMessageAfterSavePeopleToList);
//    }
//
//
//    public void ClickOnTheFirstPersonList() {
//        clickOnElement(ViewLinkOnTheFirstPersonList);
//    }
//
//    public void SelectAllTheRecordsFromPersonListPage() {
//        waitForVisibility(SelectAllResultFromPersonListPage, 20);
//        clickOnElement(SelectAllResultFromPersonListPage);
//    }
//
//    public void SelectRemoveFromListOption() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitForVisibility(RemoveFromListLink, 20);
//        clickOnElement(RemoveFromListLinkFromCompanyListPage);
//    }
//
//    public void SelectRemoveFromListOptionContact() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitForVisibility(RemoveFromListLink, 20);
//        clickOnElement(RemoveFromListLinkFromContactListPage);
//    }
//
//
//    public void ShouldSeeRemoveFromListPopUp() throws InterruptedException {
//        Thread.sleep(3000);
//        waitForElementToAppear(RemoveFromListPopUp,20);
//        assertDisplayed(RemoveFromListPopUp);
//    }
//
//    public void ClickOnRemoveFromListButton() throws InterruptedException {
//        Thread.sleep(3000);
//        clickOnElement(RemoveFromListButtonOnRemoveFromListPopUp);
//    }
//
//
//    public void ShouldSeeANotificationMassageForRemovingList() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitSeconds(30);
//        //assertDisplayed(SuccessMessageAfterRemovingFromList);
//        assertElementText(SuccessMessageAfterRemovingFromList, "Selected profiles have been removed from your list.");
//    }
//
//    public void ShouldSeeAMassageDisplayedOnThePage() {
//
//        // assertDisplayed(MessageAfterRemovingAllSelectedProfiles);
//        assertElementText(MessageAfterRemovingAllSelectedProfiles, "Your list is currently empty.");
//    }
//
//
//    public void ShouldBeRedirectToThePersonListsPageAfterViewing() {
//        waitForVisibility(DashboardUser, 30);
//        assertDisplayed(PersonListNameAfterViewing);
//    }
//
//    public void ClickOnCancelButton() {
//        waitSeconds(20);
//        clickOnElement(CancelButtonOnRemoveFromListPopUp);
//    }
//
//    public void ShouldSeeTheListResultIsNotDeleted() {
//        waitSeconds(20);
//        SelectAllResultFromPersonListPage.isSelected();
//    }
//
//    public void ClickOnXIconButton() {
//        clickOnElement(CloseIconOnRemoveFromListPopUp);
//    }
//
//    public void ShouldSeeAMessageNoRecordsHaveBeenSelected() {
//        waitSeconds(20);
//        assertElementText(MessageNoRecordsHaveBeenSelected, "No records have been selected!");
//    }
//
//
//    public void ClickOnActionsButtonDoubleClick() throws InterruptedException {
//        {
//            Thread.sleep(3000);
//            clickOnElement(ActionButton);
//        }
//    }
//
//    public void SelectClearSelectedFromDropDownList() {
//        clickOnElement(ClearSelectedLink);
//    }
//
//    public void ShouldSeeAllSelectedOptionsClearedAndNotSelected() {
//        //this was working for person list i changed it for company list // assertIfTrue((driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/main/section/div[3]/div[1]/table/thead/tr/th[1]/input")).isSelected()));
//        assertIfFalse((driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).isSelected()));
//
//    }
//
//    public void SelectDownloadFromActionList() {
//        waitSeconds(30);
//        //waitForVisibility(DownloadLinkFromActionList, 30);
//        clickOnElement(DownloadLinkFromActionList);
//    }
//
//    public void ShouldSeeAPopUpConfirmDownload() throws InterruptedException {
////        Thread.sleep(3000);
//        waitForElementToAppear(DownloadButtonOnTheDownloadConfirmationPopUp,20);
//        waitForVisibility(DownloadButtonOnTheDownloadConfirmationPopUp, 20);
//        assertDisplayed(DownloadButtonOnTheDownloadConfirmationPopUp);
//    }
//
//
//    public void LeaveTheCheckBoxBesideClearSelectedResultsAfterDownloadWithoutCheckingIt() {
//        assertIfFalse((driver.findElement(By.xpath("//div[@class=\"flex items-center justify-between mr-2\"]/input[@id=\"clearSelected\"]")).isSelected()));
//
//    }
//
//    public void ClickDownloadButton() {
//        clickOnElement(DownloadButtonOnTheDownloadConfirmationPopUp);
//    }
//
//    public void ShouldSeeANotificationMassageForDownload() throws InterruptedException {
////        Thread.sleep(3000);
//        waitForElementToAppear(ShownMessageAfterDownload,20);
//        assertElementText(ShownMessageAfterDownload, "Your download is being generated and will be sent to your email and available in your download center shortly.");
//    }
//
//
//    public void theSelectedListShouldBeStaySelected() {
//        waitForElementToAppear(SelectAllResultFromPersonListPage,20);
//        assertIfTrue(SelectAllResultFromPersonListPage.isSelected());
//    }
//
//
//    public void ClickCancelButton() {
//        clickOnElement(CancelButtonOnDownloadConfirmPopUp);
//    }
//
//    public void ClickCloseIconButton() {
//        clickOnElement(CancelIconOnDownloadConfirmPopUp);
//    }
//
//
//    public void ClickOnCheckBoxBesideClearSelectedResultsAfterDownload() {
//        ClearSelectedResultsAfterDownloadTheDownloadConfirmationPopUp.click();
//    }
//
//
//    public void ClickDownloadButtonWhenLinkIsDisabled() {
//        clickOnElement(DownloadLinkDisabled);
//    }
//
//
//    public void ShouldSeeAnErrorMessageAgainForDownloadFunction() {
//        waitForVisibility(MessageNoRecordsHaveBeenSelected, 20);
//        //waitSeconds(30);
//        assertDisplayed(MessageNoRecordsHaveBeenSelected);
//
//    }
//
//    public void ClickOnActionsButtonDoubleClickToCoClickOnDownloadLinkOnceItDisabled() throws InterruptedException {
//        clickOnElement(SelectAllResultFromPersonListPage);
//        clickOnElement(SelectAllResultFromPersonListPage);
//        clickOnElement(ActionButton);
//        Thread.sleep(3000);
//
//    }
//
//    public void ShouldSeeASuccessMessageForDeletingTheList() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitForVisibility(DeleteListMessage , 30);
//        assertElementText(DeleteListMessage, "Your list has been deleted!");
//    }
//
//    public void AmOnBisCredListsPageAndWantToAddNewCompanyList() throws InterruptedException {
//        Thread.sleep(3000);
//        // goToURL("https://dashboard.beta.biscred.net/lists");
//        clickOnElement(ListMainMenu);
//        Thread.sleep(3000);
//        clickOnElement(CompanyListsPage);
//    }
//
//    public void ClickOnNewCompanyList() throws InterruptedException {
//        Thread.sleep(3000);
//        waitForVisibility(NewCompanyList, 20);
//        clickOnElement(NewCompanyList);
//    }
//
//    public void ShouldBeRedirectToTheCompanyListsPage() {
//        waitForVisibility(DashboardUser, 20);
//        assertIfTrue(CompanyListsPage.isEnabled());
//    }
//
//    public void AddAValidCompanyListName() {
//        sendElementText(ListNameField, "Company List Automation Test");
//    }
//
//    public void AmOnBisCredListsPageAndWantToViewCompanyList() {
//        waitForVisibility(DashboardUser, 20);
//        assertIfTrue(CompanyListsPage.isEnabled());
//    }
//
//
//    public void ClickOnAnyCompanyList() {
//        clickOnElement(CloseIconOnCreateListPopUp);
//        clickOnElement(ViewLinkOnTheFirstCompanyList);
//    }
//
//    public void ShouldBeRedirectedToTheCompanyListPageDetails() throws InterruptedException {
//        Thread.sleep(3000);
//        assertIfTrue(CompanyListDetailsPage.isEnabled());
//    }
//
//
//    public void AmOnBisCredListsPageAndWantToEditCompanyList() {
//        waitForVisibility(DashboardUser, 20);
//        assertIfTrue(CompanyListsPage.isEnabled());
//    }
//
//    public void ShouldSeeTheCompanyListNameEdited() {
//        assertElementText(EditedCompanyListNameFirstRecord, "Company List Automation Edited");
//    }
//
//    public void EditAValidListForCompany() {
//        EditListNameField.clear();
//        sendElementText(EditListNameField, "Company List Automation Edited");
//    }
//
//    public void ClearTheNameInCompanyListField() {
//        EditListNameField.clear();
//    }
//
//    public void AmOnBisCredListsPageAndWantToDeleteCompanyList() {
//        waitForVisibility(DashboardUser, 20);
//        assertIfTrue(CompanyListsPage.isEnabled());
//    }
//
//    public void ShouldBeRedirectToTheCompanyListsPageAfterViewing() {
//        waitForVisibility(DashboardUser, 30);
//        assertDisplayed(CompanyListNameAfterViewing);
//    }
//
//    public void AmOnBisCredDashboardAndWantToSearchAboutACompany() throws InterruptedException {
//        Thread.sleep(3000);
//        waitForVisibility(DashboardUser, 20);
//        assertDisplayed(DashboardUser);
//        goToURL("https://dashboard.beta.biscred.net/");
//    }
//
//    public void SelectAllTheCompaniesOnTheSearchResult() throws InterruptedException {
////        Thread.sleep(3000);
//        waitForElementToAppear(CheckBoxToSelectAllResultOnListPage,20);
//        waitForVisibility(CheckBoxToSelectAllResultOnListPage, 70);
//        clickOnElement(CheckBoxToSelectAllResultOnListPage);
//    }
//
//    public void ClickOnTheFirstCompanyList() {
//        clickOnElement(ViewLinkOnTheFirstCompanyList);
//
//    }
//
//    public void SelectAllTheRecordsFromCompanyListPage() {
//        waitForVisibility(SelectAllResultFromCompanyListPage, 20);
//        clickOnElement(SelectAllResultFromCompanyListPage);
//    }
//
//    public void ClickOnViewAllCompaniesResultsLink() throws InterruptedException {
//        Thread.sleep(3000);
//        scrollDownToElement(ViewAllCompaniesFound);
//        //Double click on element
//        Actions act = new Actions(driver);
//        act.doubleClick(ViewAllCompaniesFound).perform();
//    }
//
//    public void ClickOnActionsButtonForCompany() throws InterruptedException {
//        waitForVisibility(ActionButtonOnCompanySearchResult, 20);
//        Thread.sleep(3000);
//        clickOnElement(ActionButtonOnCompanySearchResult);
//    }
//
//    public void ClickOnCompanyTab() throws InterruptedException {
//        Thread.sleep(3000);
//        // goToURL("https://dashboard.beta.biscred.net/lists");
//        clickOnElement(ListMainMenu);
//        Thread.sleep(3000);
//        clickOnElement(CompanyListsPage);
//    }
//
//    public void SelectDownloadFromActionListInTheCompanyListPage() {
//        waitSeconds(30);
//        clickOnElement(DownloadLinkFromActionListInCompanyList);
//    }
//
//    public void ShouldBeRedirectedToTheCompanyListPageDetailsAfterViewingACompany() throws InterruptedException {
////        Thread.sleep(3000);
//        waitForElementToAppear(CompanyListDetailsPageAfterViewing,20);
//        assertIfTrue(CompanyListDetailsPageAfterViewing.isEnabled());
//    }
//
//    public void selectAnyListFromExistingListDropDownList() {
//        clickOnElement(ExistingList);
//        selectFromUnOrderList(ExistingListDropDownList, 0);
//    }
//
//    public void SelectRemoveFromListOptionFromCompanyListPage() throws InterruptedException {
//        Thread.sleep(3000);
//        //waitForVisibility(RemoveFromListLink, 20);
//        clickOnElement(RemoveFromListLinkFromCompanyListPage);
//    }
//
//    public void ShouldSeeAllSelectedOptionsClearedAndNotSelectedInPersonListPage() {
//        assertIfFalse(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/main/section/div[3]/div[1]/table/thead/tr/th[1]/input")).isSelected());
//    }
//
//    public void clickOnPersonNameToShowProfilePanel() {
//        waitForElementToAppear(clickOnPersonNameToShowProfilePanel,20);
//        clickOnElement(clickOnPersonNameToShowProfilePanel);
//    }
//
//    public void iClickCancelsButton() {
//
//    }
//
//
//
//}
