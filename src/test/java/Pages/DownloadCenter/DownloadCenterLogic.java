package Pages.DownloadCenter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DownloadCenterLogic extends DownloadCenterPO{
   public DownloadCenterLogic(){super();}


   public void ClickOnDownloadOption() throws InterruptedException {
      Thread.sleep(1000);
      clickOnElement(DownloadFunction);
   }

   public void ValidateConfirmDownloadPopup() throws InterruptedException {
      Thread.sleep(1000);
      assertDisplayed(DownloadButton);
   }

   public void ClickOnDownloadButton() throws InterruptedException {
      Thread.sleep(2000);
      clickOnElement(DownloadButton);
   }

   public void ClickOnTheCheckboxForClearSelectedResultsAfterDownload() {
      clickOnElement(ClearSelectedOption);
   }

   public void validateTheResultsIsNotSelected() {
      assertIfFalse(CheckBoxToSelectAllResultOnListPage.isSelected());
   }

   public void goToDownloadCenter() {
      goToURL("https://dashboard.beta.biscred.net/download-center");
   }

   public void iShouldSeeTheFileAttachedWithStatus(String status) throws InterruptedException {
//      Thread.sleep(3000);
      waitForElementToAppear(DownloadStatus,20);
      assertDisplayed(DownloadStatus);
      assertElementText(DownloadStatus,"In Progress...");
   }

   public void validateTheResultsIsSelected() {
      assertIfTrue(CheckBoxToSelectAllResultOnListPage.isSelected());
   }

   public void ValidatePersonSearchsResultPage() throws InterruptedException {
      Thread.sleep(500);
      assertDisplayed(CompanySearchTap);
   }

   public void ValidatesearchResultPageAndNoFilesDownloaded() throws InterruptedException {
      Thread.sleep(500);
      assertDisplayed(CompanyDetailsPage);
   }

   public void clickOnAnyFILENAME() throws InterruptedException {
      Thread.sleep(3000);
      clickOnElement(FILENAME.get(0));
   }

   public void clickOnAnyExpiredFileName() throws InterruptedException {
      Thread.sleep(2000);
      int size = ResultsPage.size();
      goToURL("https://dashboard.beta.biscred.net/download-center?page="+size);
         for (WebElement fileNameElement : FILENAMEColumn) {
            if (fileNameElement.getText().contains("Expired")) {
               clickOnElement(ExpiredFile);
            }
         }
      }

   public static boolean isClickable(WebElement el, WebDriver driver)
   {
      try{
         WebDriverWait wait = new WebDriverWait(driver, (Duration.ofMinutes(10)));
         wait.until(ExpectedConditions.elementToBeClickable(el));
         return true;
      }
      catch (Exception e){
         return false;
      }
   }

   public void validateExpiredFileIsNotClickable(){
      waitForElementToAppear(ExpiredFile,20);
      assertIfTrue(isClickable(ExpiredFile,driver));
   }

   public void validateFileIsClickable(){
      assertIfTrue(isClickable(FileName.get(0),driver));
   }

   public void clickOnThePaginationArrowOnTheRightBottomCorner() {
      for (WebElement webElement : ResultsPage) {
         clickOnElement(webElement);
      }
   }

   public void validateNextPageOfTheDownloadedFile() throws InterruptedException {
      Thread.sleep(2000);
      String Url=driver.getCurrentUrl();
      assertIfTrue(Url.equals("https://dashboard.beta.biscred.net/download-center?page=2"));

   }

   public void clickOnTheCheckboxBesideSendDownloadsDirectlyToMyEmail() {
      clickOnElement(sendEmailsOption);
   }

   public void validateTheFileAttachedToTheDownloadCenterPageWithCurrentDate() {
      waitForVisibility(attachedFileDownloaded,20);
      assertDisplayed(attachedFileDownloaded);
   }

   public void clickOnCloseIcon() throws InterruptedException {
      Thread.sleep(500);
      clickOnElement(CloseIconOnDownloadPopUp);
   }
   public void validateMassageForUpdatePasswords(String text) throws InterruptedException {
      Thread.sleep(3000);
      assertElementContainsSomeText(MassageForUpdatePasswordDownload.get(0),text);
   }

}
