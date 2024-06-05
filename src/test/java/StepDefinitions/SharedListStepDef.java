package StepDefinitions;

import Pages.Login.LoginLogic;
import Pages.SharedList.SharedListLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SharedListStepDef {
    SharedListLogic sharedListLogic = new SharedListLogic();

    @Given("I am on BisCred lists page and want to share my list")
    public void iAmOnBisCredListsPageAndWantToShareMyList() throws InterruptedException {
        sharedListLogic.goToListMainMenu();
    }

    @When("I click on the make public toggle")
    public void iClickOnTheMakePublicToggle() throws InterruptedException {
        sharedListLogic.clickOnTheMakePublicToggle();
    }

    @Then("I should see Add Users list")
    public void iShouldSeeAddUsersList() throws InterruptedException {
        sharedListLogic.shouldSeeAddUsersList();
    }

    @And("I select any user from the list")
    public void iSelectAnyUserFromTheList() throws InterruptedException {
        sharedListLogic.selectAnyUserFromTheList();
    }

    @And("I should see a shared mark beside the list name")
    public void iShouldSeeASharedMarkBesideTheListName() {
        sharedListLogic.shouldSeeASharedMarkBesideTheListName();
    }

    @When("I enter email and password for the person who shared list with him")
    public void iEnterEmailAndPasswordForThePersonWhoSharedListWithHim() {
        sharedListLogic.EnterAdminCredentials();
    }

    @When("I click on List menu on the top nav")
    public void iClickOnListMenuOnTheTopNav() throws InterruptedException {
        sharedListLogic.ClickOnListMainMenu();
    }

    @And("I click on person Tap")
    public void iClickOnPersonTap() {
        sharedListLogic.clickOnPersonTap();
    }

    @And("I should see the shared list appear on the list page")
    public void iShouldSeeTheSharedListAppearOnTheListPage() {
        sharedListLogic.shouldSeeASharedMarkBesideTheListName();
    }

    @And("I should see Created by user appear beside the list name")
    public void iShouldSeeCreatedByUserAppearBesideTheListName() {
        sharedListLogic.shouldSeeCreatedByUserAppearBesideTheListName();
    }

    @And("I should see Duplicate a publicly shared list into the current users account")
    public void iShouldSeeDuplicateAPubliclySharedListIntoTheCurrentUsersAccount() {
        sharedListLogic.shouldSeeDuplicateAPubliclySharedListIntoTheCurrentUsersAccount();
    }

    @And("I type any list name on List Name Field")
    public void iTypeAnyListNameOnListNameField() {
        sharedListLogic.TypeAListNameOnListNameField();
    }

    @And("I click on Cancel Button")
    public void iClickOnCancelButton() throws InterruptedException {
        sharedListLogic.iClickOnCancelButton();
    }

    @Then("I should see the list is not sharable")
    public void iShouldSeeTheListIsNotSharable() {
        sharedListLogic.shouldSeeTheListIsNotSharable();
    }

    @And("I click on close button")
    public void iClickOnCloseButton() throws InterruptedException {
        sharedListLogic.clickOnCloseButton();
    }

    @Then("I should not see a shared mark beside the list name")
    public void iShouldNotSeeASharedMarkBesideTheListName() {
        sharedListLogic.shouldNotSeeTheListIsNotSharable();
    }

    @When("I click on Duplicate link")
    public void iClickOnDuplicateLink() throws InterruptedException {
        sharedListLogic.iClickOnDuplicateLink();
    }

    @Then("I should See popup to Duplicate List")
    public void iShouldSeePopupToDuplicateList() throws InterruptedException {
        sharedListLogic.validatePopupToDuplicateList();
    }

    @When("I click on Duplicate List button")
    public void iClickOnDuplicateListButton() throws InterruptedException {
        sharedListLogic.iClickOnDuplicateListButton();
    }

    @Then("I should see Duplicate massage display")
    public void iShouldSeeDuplicateMassageDisplay() throws InterruptedException {
        sharedListLogic.validateDuplicateMassageDisplay();
    }

    @And("I should see a copy of the shared list added to the person list")
    public void iShouldSeeACopyOfTheSharedListAddedToThePersonList() throws InterruptedException {
        sharedListLogic.iShouldSeeACopyOfTheSharedListAddedToThePersonList();
    }

    @And("I should see No copy of the shared list added to the person list")
    public void iShouldSeeNoCopyOfTheSharedListAddedToThePersonList() {
        sharedListLogic.iShouldSeeNoCopyOfTheSharedListAddedToThePersonList();
    }

    @And("I should see the list not changed")
    public void iShouldSeeTheListNotChanged() {
        sharedListLogic.iShouldSeeTheListNotChanged();
    }

    @Then("I should be redirect to the person list page")
    public void iShouldBeRedirectToThePersonListPage() throws InterruptedException {
        sharedListLogic.validateRedirectToThePersonListPage();
    }

    @When("I Unchecked the make public toggle")
    public void iUncheckedTheMakePublicToggle() throws InterruptedException {
        sharedListLogic.uncheckTheMakePublicToggle();
    }

    @Then("I should see Add Users list disappeare")
    public void iShouldSeeAddUsersListDisappeare() throws InterruptedException {
        sharedListLogic.iShouldSeeAddUsersListDisappeare();
    }

    @And("I should see a shared mark beside the list name is removed")
    public void iShouldSeeASharedMarkBesideTheListNameIsRemoved() {
        sharedListLogic.iShouldSeeASharedMarkBesideTheListNameIsRemoved();
    }

    @And("I should see the shared list removed from the page")
    public void iShouldSeeTheSharedListRemovedFromThePage() {
        sharedListLogic.iShouldSeeTheSharedListRemovedFromThePage();
    }

    @Then("I should see the shared list is removed")
    public void iShouldSeeTheSharedListIsRemoved() {
        sharedListLogic.iShouldSeeTheSharedListIsRemoved();
    }

    @And("I should see No copy of the shared list added to the company list")
    public void iShouldSeeNoCopyOfTheSharedListAddedToTheCompanyList() {
        sharedListLogic.iShouldSeeNoCopyOfTheSharedListAddedToThePersonList();
    }

    @And("I should be redirect to the company list page")
    public void iShouldBeRedirectToTheCompanyListPage() throws InterruptedException {
        sharedListLogic.validateRedirectToTheCompanyListPage();
    }

    @When("I click on the profile Icon")
    public void iClickOnTheProfileIcon() throws InterruptedException {
        sharedListLogic.clickOnProfileIcon();

    }
}
