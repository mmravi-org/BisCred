package Pages.SharedList;


import Enums.Users;
import org.testng.Assert;

import java.util.Random;

public class SharedListLogic extends SharedListPO {
    public SharedListLogic() {
        super();
    }

    public static String ListName() {
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

    public void goToListMainMenu() throws InterruptedException {

            goToURL("https://dashboard.beta.biscred.net/lists");
            Thread.sleep(1000);
        }

    public void clickOnTheMakePublicToggle() throws InterruptedException {
        try {
            Thread.sleep(2000);
            if (!addUserIsPresent.isDisplayed())
                clickOnElement(MakePublicToggle);

        }catch (Exception e){
            clickOnElement(MakePublicToggle);
        }
    }
    public void uncheckTheMakePublicToggle() throws InterruptedException {
        try {
            Thread.sleep(2000);
            if (addUserIsPresent.isDisplayed())
                clickOnElement(MakePublicToggle);

        }catch (Exception e){
            clickOnElement(MakePublicToggle);
        }
    }
    public void shouldSeeAddUsersList() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementToAppear(AddUsersList,20);
        assertDisplayed(AddUsersList);
    }

    public void selectAnyUserFromTheList() throws InterruptedException {
        Thread.sleep(1000);
        sendElementText(enterName, "test@cnn.com");
        clickOnElement(SharedUsersList.get(0));
//        clickOnElement(SharedUsersList.get(1));
    }
    public void shouldSeeASharedMarkBesideTheListName() {
        waitForVisibility(SharedListIconSVG,20);
        assertDisplayed(SharedListIconSVG);
    }
    public void EnterAdminCredentials(){
        waitForVisibility(EmailTextField,30);
        sendElementText(EmailTextField, "newuser@gmail.com");
        waitForVisibility(PasswordTextBox,30);
        sendElementText(PasswordTextBox,"newuser1234");
    }

    public void ClickOnListMainMenu() throws InterruptedException {
        goToURL("https://dashboard.beta.biscred.net/lists");
        }

    public void clickOnPersonTap() {
        clickOnElement(PersonTap);
    }

    public void shouldSeeCreatedByUserAppearBesideTheListName() {
        waitForVisibility(CreatedByUser,20);
        waitForElementToAppear(CreatedByUser,20);
        assertDisplayed(CreatedByUser);
    }

    public void shouldSeeDuplicateAPubliclySharedListIntoTheCurrentUsersAccount() {
        waitForVisibility(DuplicateAPubliclySharedList,20);
        assertDisplayed(DuplicateAPubliclySharedList);
    }

    public void TypeAListNameOnListNameField() {
        ListNameFieldOnSavePeopleToListPopUp.sendKeys(ListName());
    }
    public void iClickOnCancelButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CancelButton);
    }

    public void shouldSeeTheListIsNotSharable() {
        assertIfTrue(SharedListIconSVG.isDisplayed());
    }

    public void clickOnCloseButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickOnCloseButton);
    }

    public void shouldNotSeeTheListIsNotSharable() {
        assertIfTrue(SharedListIconSVG.isDisplayed());
    }

    public void iClickOnDuplicateLink() throws InterruptedException {
//        Thread.sleep(1500);
        waitForElementToAppear(DuplicateLink,20);
        clickOnElement(DuplicateLink);
    }

    public void validatePopupToDuplicateList() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(DuplicateListButton);
    }

    public void iClickOnDuplicateListButton() throws InterruptedException {
        clickOnElement(DuplicateListButton);
        Thread.sleep(4000);
    }

    public void validateDuplicateMassageDisplay() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(validateDuplicateMassageDisplay);
    }

    public void iShouldSeeACopyOfTheSharedListAddedToThePersonList() throws InterruptedException {
        Thread.sleep(1500);
        assertDisplayed(CopyOfTheSharedList);
    }

    public void iShouldSeeNoCopyOfTheSharedListAddedToThePersonList() {
       assertIfFalse(SharedList.contains("Copy"));
    }

    public void iShouldSeeTheListNotChanged() {
        assertDisplayed(SharedList.get(0));
    }

    public void validateRedirectToThePersonListPage() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(PersonListPage);
    }

    public void iShouldSeeAddUsersListDisappeare() throws InterruptedException {
        Thread.sleep(2000);
        assertIfFalse(MakePublicToggle.isSelected());
    }

    public void iShouldSeeASharedMarkBesideTheListNameIsRemoved() {
        assertDisplayed(PersonNotShared);
        assertIfTrue(SharedListIconsSVG.get(0).isDisplayed());
    }

    public void iShouldSeeTheSharedListRemovedFromThePage() {
        int size= DuplicateTable.size();
        for(int i=0; i<=size; i++){
            assertIfTrue(DuplicateLinks.get(i).isDisplayed());
        }
    }

    public void iShouldSeeTheSharedListIsRemoved() {
        assertDisplayed(CopyOfTheSharedList);
    }

    public void validateRedirectToTheCompanyListPage() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(CompanyListPage);
    }

    public void clickOnProfileIcon() throws InterruptedException {
        Thread.sleep(10000);
        clickOnElement(ProfileIcon);
    }
}
