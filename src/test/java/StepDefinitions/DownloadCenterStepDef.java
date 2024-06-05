package StepDefinitions;

import Pages.DownloadCenter.DownloadCenterLogic;
import Pages.Login.LoginLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class DownloadCenterStepDef {
    DownloadCenterLogic downloadcenterlogic = new DownloadCenterLogic();

    @And("I click on Download option")
    public void iClickOnDownloadOption() throws InterruptedException {
        downloadcenterlogic.ClickOnDownloadOption();
    }

    @Then("I should see a Confirm download popup")
    public void iShouldSeeAConfirmDownloadPopup() throws InterruptedException {
        downloadcenterlogic.ValidateConfirmDownloadPopup();
    }

    @And("I click on Download button")
    public void iClickOnDownloadButton() throws InterruptedException {
        downloadcenterlogic.ClickOnDownloadButton();
    }

    @And("I click on the checkbox for Clear selected results after download")
    public void iClickOnTheCheckboxForClearSelectedResultsAfterDownload() {
        downloadcenterlogic.ClickOnTheCheckboxForClearSelectedResultsAfterDownload();
    }

    @And("I should see the results is not selected")
    public void iShouldSeeTheResultsIsNotSelected() {
        downloadcenterlogic.validateTheResultsIsNotSelected();
    }

    @Then("I click on Download center on the top nav menu")
    public void iClickOnDownloadCenterOnTheTopNavMenu() {
        downloadcenterlogic.goToDownloadCenter();
    }

    @And("I should see the file attached with status {string}")
    public void iShouldSeeTheFileAttachedWithStatus(String status) throws InterruptedException {
        downloadcenterlogic.iShouldSeeTheFileAttachedWithStatus(status);
    }

    @And("I should see the results is still selected")
    public void iShouldSeeTheResultsIsStillSelected() {
        downloadcenterlogic.validateTheResultsIsSelected();
    }

    @Then("I should redirect to the search result page and no files downloaded")
    public void iShouldRedirectToTheSearchResultPageAndNoFilesDownloaded() throws InterruptedException {
        downloadcenterlogic.ValidatesearchResultPageAndNoFilesDownloaded();
    }

    @Given("I am on BisCred Download Center page")
    public void iAmOnBisCredDownloadCenterPage() {
        downloadcenterlogic.goToDownloadCenter();
    }

    @When("I click on any FILE NAME")
    public void iClickOnAnyFILENAME() throws InterruptedException {
        downloadcenterlogic.clickOnAnyFILENAME();

    }

    @Then("I should see a success massage for downloading again")
    public void iShouldSeeASuccessMassageForDownloadingAgain() {
    }

    @When("I click on any Expired File Name")
    public void iClickOnAnyExpiredFileName() throws InterruptedException {
        downloadcenterlogic.clickOnAnyExpiredFileName();
    }

    @Then("I should see the file is not clickable")
    public void iShouldSeeTheFileIsNotClickable() {
        downloadcenterlogic.validateExpiredFileIsNotClickable();

    }

    @Then("I should see the file is clickable")
    public void iShouldSeeTheFileIsClickable() {
        downloadcenterlogic.validateFileIsClickable();
    }

    @When("I click on the pagination arrow on the right bottom corner")
    public void iClickOnThePaginationArrowOnTheRightBottomCorner() {
        downloadcenterlogic.clickOnThePaginationArrowOnTheRightBottomCorner();
    }

    @Then("I should see the next page of the downloaded file")
    public void iShouldSeeTheNextPageOfTheDownloadedFile() throws InterruptedException {
        downloadcenterlogic.validateNextPageOfTheDownloadedFile();
    }

    @When("I click on the checkbox beside Send downloads directly to my email")
    public void iClickOnTheCheckboxBesideSendDownloadsDirectlyToMyEmail() {
        downloadcenterlogic.clickOnTheCheckboxBesideSendDownloadsDirectlyToMyEmail();
    }

    @And("I should see the file attached to the download center page with current date")
    public void iShouldSeeTheFileAttachedToTheDownloadCenterPageWithCurrentDate() {
        downloadcenterlogic.validateTheFileAttachedToTheDownloadCenterPageWithCurrentDate();
    }

    @And("I click on Close icon")
    public void iClickOnCloseIcon() throws InterruptedException {
        downloadcenterlogic.clickOnCloseIcon();
    }

    @Then("I should see success massages {string}")
    public void iShouldSeeSuccessMassages(String message) throws InterruptedException {
        downloadcenterlogic.validateMassageForUpdatePasswords(message);
    }
}
