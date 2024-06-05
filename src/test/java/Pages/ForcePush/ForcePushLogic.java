package Pages.ForcePush;

import Enums.Users;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

import static helpers.helpers.createTimeStamp;
import static helpers.helpers.getRegValue;

public class ForcePushLogic extends ForcePushPO{
    public ForcePushLogic(){super();}
    Actions action = new Actions(driver);
    public void iAmOnBisreachAdminDashboardAndWantToAddANewContact() {
        goToURL("https://bisreach.beta.biscred.net/katalon");
    }

    public void alternativeLogin() throws InterruptedException {
        Thread.sleep(2000);
        sendElementText(alternativeLoginMail,Users.Bisreach_Users.Bisreach_Admin_Email.value);
        sendElementText(alternativeLoginPassword, Users.Bisreach_Users.Katalon_Password.value);
        clickOnElement(alternativeLoginSignInButton);
        waitForVisibility(BisReachDashboardUser,30);
        assertDisplayed(BisReachDashboardUser);
        Thread.sleep(2000);
    }

    public void validateAddContactPopupAppears(){
        waitForVisibility(createContactButton,5);
        assertDisplayed(createContactButton);
    }
    static String timeStamp = createTimeStamp();

    public static String createContactGivenName() {
        return "regression Given Name"+getRegValue();
    }
    public static String CompanyName() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public static String createContactFamilyName() {
        return "regression Family Name"+getRegValue();
    }

    public static String createContactCompany() {
        return "regression Company for contact "+CompanyName();
    }

    public static String createContactPersonalEmail() {
        String timeStamp = createTimeStamp();
        return timeStamp+CompanyName()+"@gmail.com";
    }
    public static String createContactNonPersonalEmail(){
        return timeStamp+CompanyName()+"@bisnow.com";
    }

    public static String createContactLinkedIn() {
        String linkedInURL = "https://linkedin.com/in/";
        return linkedInURL+timeStamp+createContactGivenName().replace(" ","")+createContactFamilyName().replace(" ","");
    }

    public void validateContactCreation(){
        waitForVisibility(contactCreatedSuccessMessage,40);
        assertDisplayed(contactCreatedSuccessMessage);
    }

    public void addingContactRequiredFields(){
        sendElementText(givenNameField,createContactGivenName());
        sendElementText(familyNameField,createContactFamilyName());
        sendElementText(emailField,createContactNonPersonalEmail());
        sendElementText(companyField,createContactCompany());
        waitSeconds(20);
        waitForVisibility(contactCompanyEntered,10);
        selectFromUnOrderList(contactCompanyEntered,0);
    }

    public void iClickOnCreateContactButton() {
        clickOnElement(createContactButton);
    }

    public void validateLandingOnContactPage(){
        waitForVisibility(contactPageName,70);
        assertDisplayed(contactPageName);
    }

    public void iClickOnAddContactButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addContactButton);
    }

    public void iClickOnUpdateStatusButton() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(updateStatusButton);
    }

    public void validateStatusUpdatesPopup(){
        waitForVisibility(updateContactButton, 30);
        assertDisplayed(updateContactButton);
    }

    public void clickOnStatusDropDownMenu(){
        clickOnElement(StatusDropDownMenu);
    }

    public void clickOnInBisNowUniverse(){
        selectFromUnOrderList(StatusULDropDownMenu,0);
    }

    public void clickOnUpdateContactButton(){
        clickOnElement(updateContactButton);
    }

    public void validateStatusNotification(String message) throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(StatusNotification);
        assertElementText(StatusNotification,message);
    }

    public void validateStatusInBisNow(){
        assertDisplayed(StatusInBisnow);
    }

    public void clickOnAddAddressButton(){
        driver.navigate().refresh();
        clickOnElement(AddAddressButton);
    }

    public void validatePopUPAddAddress(){
        assertDisplayed(SaveAddressButton);
    }

    public void addPostalCodeField(String code){
        sendElementText(PostalCodeField, code);
    }

    public void validatePostalCode(){
        waitSeconds(5);
        assertDisplayed(ValidPostalCodeMark);
    }
    public void clickOnSaveAddressButton(){
        clickOnElement(SaveAddressButton);
    }

    public void validateCityAndStateAdded() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(StateAndCityAdded.get(0));
    }

    public void validateCityAndStateAddedMassage(String message){
        waitForVisibility(StateAndCityAddedMassage,90);
        assertDisplayed(StateAndCityAddedMassage);
        assertElementText(StateAndCityAddedMassage,message);
    }

    public void clickOnAddEmploymentButton(){
        clickOnElement(addEmploymentButton);
    }

    public void validateAddEmploymentPopUp(){
        waitSeconds(10);
        assertDisplayed(saveEmploymentButton);
    }

    public void selectCompanyEmploymentFromDropDownList(String company){
        clickOnElement(companyEmploymentField);
        sendElementText(companyEmploymentField,company);
        selectFromUnOrderList(companyEmploymentDropDownList,0);
    }

    public void addJobTitleField(String title){
        sendElementText(jobTitleField,title);
    }

    public void clickOnActiveToggleButton(){
        waitSeconds(20);
        clickOnElement(activeToggleButton);
    }

    public void clickOnPrimaryToggleButton(){
        waitSeconds(20);
        clickOnElement(primaryToggleButton);
    }

    public void selectJobClassificationFromDropDownList(){
        clickOnElement(JobClassificationField);
        selectFromUnOrderList(JobClassificationDropDownList,1);
    }

    public void selectJobAssetClassFromDropDownList(){
        clickOnElement(JobAssetField.get(1));
        clickOnElement(JobAssetFDropDownList.get(1));
    }

    public void selectJobEmailFromDropDownList(){
        clickOnElement(JobEmailField);
        selectFromUnOrderList(JobEmailFDropDownList,0);
    }

    public void clickOnSaveEmploymentButton(){
        clickOnElement(saveEmploymentButton);
    }

    public void validateEmploymentAdded(){
        assertDisplayed(employmentAdded);
    }

    public void validateEmploymentPrimaryAdded(){
        waitForVisibility(PrimaryEmploymentAdded,50);
        assertDisplayed(PrimaryEmploymentAdded);
        assertDisplayed(ActiveEmploymentAdded);
    }

    public void validateEmploymentPrimaryAddedMassage(String message){
        waitForVisibility(employmentAddedMassage,70);
        assertDisplayed(employmentAddedMassage);
        assertElementText(employmentAddedMassage,message);
    }
    public void clickOnDeleteLink() throws InterruptedException {
       Thread.sleep(1500);
       driver.navigate().refresh();
        clickOnElement(DeleteLink);

    }

    public void DeleteEmploymentPopUp(){
        waitForVisibility(deleteEmploymentButton,20);
        assertDisplayed(deleteEmploymentButton);
    }

    public void clickOnDeleteEmploymentButton(){
        waitSeconds(20);
        clickOnElement(deleteEmploymentButton);

    }

    public void ValidateEmploymentIsDeletedMassage(){
        waitForVisibility(employmentIsDeletedMassage,20);
        assertDisplayed(employmentIsDeletedMassage);
    }

    public void clickOnUpdateClassificationButton(){
        waitSeconds(5);
        clickOnElement(updateClassifications);
    }

    public void validateUpdateClassificationPopUp(){
        waitSeconds(10);
        assertDisplayed(updateContactClassificationButton);
    }

    public void selectClassificationFromDropDownList(){
        clickOnElement(classificationField);
        selectFromUnOrderList(classificationDropDownList,1);
    }

    public void clickOnxUpdateContactClassificationButton(){
        waitSeconds(5);
        clickOnElement(updateContactClassificationButton);
    }

    public void validateClassificationAdded(){
        waitSeconds(10);
        assertDisplayed(classificationAdded);
    }

    public void validateClassificationMassage(String message){
        waitForVisibility(classificationAddedMassage,10);
        assertDisplayed(classificationAddedMassage);
        assertElementText(classificationAddedMassage,message);
    }

    public void clickOnUpdateResearcherNoteButton(){
        waitSeconds(5);
        clickOnElement(updateResearcherNotesButton);
    }

    public void validateUpdateResearcherNotePopUp(){
        waitSeconds(10);
        assertDisplayed(updateResearcherNotesButton);
    }

    public void addResearcherNotesField(String note){
        clickOnElement(ResearcherNotesField);
        sendElementText(ResearcherNotesField,note);
    }

    public void clickOnResearchOutcome(){
        clickOnElement(ResearchOutcomeFiled);
        selectFromUnOrderList(ResearchOutcomeDropDownList,0);
    }

    public void clickOnUpdateResearcherNotesButton(){
        waitSeconds(5);
        clickOnElement(updateResearcherNoteButton);
    }

    public void validateResearcherNotesAdded(String message){
        waitForVisibility(researcherNotesAdded,40);
        assertDisplayed(researcherNotesAdded);
    }

    public void validateResearcherNotesAddedMassage(String message) throws InterruptedException {
       Thread.sleep(2000);
        assertDisplayed(researcherNotesAddedMassage);
        //assertElementText(researcherNotesAddedMassage,message);
    }

    public void clickOnSubmitForReadyForReviewButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(SubmitForReadyForReviewButton);
    }

    public void validateReadyForReviewStatus(String status) throws InterruptedException {
        Thread.sleep(500);
        assertElementText(ReadyForReviewStatus,status);
        assertDisplayed(ReadyForReviewStatus);}

    public void clickOnReviewContactButton() {
        clickOnElement(ReviewContactButton);
    }

    public void validateInReviewStatus(String status) {
        waitForVisibility(InReviewStatus, 20 );
        assertElementText(InReviewStatus,status);
        assertDisplayed(InReviewStatus);}

    public void clickOnForcePushButton() {
        clickOnElement(ForcePushButton);
    }

    public void clickOnApprovedContactButton() {
        clickOnElement(ApprovedContactButton);
    }

    public void validateDisplayingOfSuccessMessage(String message) throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(ContactHasBeenUpdatedAndGivenAStatusReadyForReviewMessage);
        assertElementText(ContactHasBeenUpdatedAndGivenAStatusReadyForReviewMessage,message);
    }

    public void validateDisplayingContactHasBeenApprovedMessage(String message) throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(ContactHasBeenApprovedMessage);
        assertElementText(ContactHasBeenApprovedMessage,message);
    }

    public void validateApprovedStatus(String status) throws InterruptedException {
        Thread.sleep(500);
        assertElementText(ApprovedStatus,status);
        assertDisplayed(ApprovedStatus);}

    public void validateForcePushMessage(String message) throws InterruptedException {
        Thread.sleep(2000);
        assertElementText(ForcePushMessage,message);
        assertDisplayed(ForcePushMessage);}

    public void goToDashboard() {
        goToURL("https://bisreach.beta.biscred.net/katalon");
    }

    public void clickOnAddCompanyButton() throws InterruptedException {
       Thread.sleep(2000);
        clickOnElement(addCompanyButton);
    }

    public void validateAddCompanyPopupAppear(){
        waitForVisibility(companyNameField,10);
        assertDisplayed(companyNameField);
    }
    static Random value= new Random();
    public static String createCompanyCommonName() {

        return CompanyName()+value.toString();
    }

    public static String createCompanyFullName() {
        return "regression Company Full Name"+timeStamp;
    }

    public static String createCompanyURL() {
        String companyDomain =CompanyName();
        return "https://"+companyDomain+"text.test";
    }

    public static String createCompanyValidURL() {
        String companyURL = "https://";
        return companyURL+CompanyName()+value.toString()+"test.test";
    }
    public void addCompanyWithAllFields(){
        sendElementText(companyNameField,createCompanyCommonName());
        sendElementText(legalNameField,createCompanyFullName());
        sendElementText(companyURLField,createCompanyURL());
        sendElementText(linkedinCompanyField,createContactLinkedIn());
    }

    public void clickOnCreateCompanyButton(){
        clickOnElement(createCompanyButton);
    }

    public void validateLandingOnCompanyPage(){
        waitForVisibility(companyPageName,70);
        assertDisplayed(companyPageName);
    }

    public void validateCompanyCreation(String message) throws InterruptedException {
      Thread.sleep(3000);
        assertDisplayed(companyCreatedSuccessMessage);
        assertElementText(companyCreatedSuccessMessage,message);
    }

    public void clickingOnUpdateStatusButtonOnCompanyProfile() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(UpdateStatusButtonOnCompanyProfile);
    }

    public void verifyingTheDisplayedOfUpdateCompanyStatusModal() {
        waitForVisibility(UpdateCompanyStatusPopup, 20);
        assertDisplayed(UpdateCompanyStatusButtonOnUpdateCompanyModal);
    }

    public void clickingOnUpdateCompanyStatusButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(UpdateCompanyStatusButtonOnUpdateCompanyModal);
    }

    public void verifyingCompanyStatusOnCompanyProfileIsEqualInBisnowUniverse() {
        assertElementText(InBisnowUniverseStatusOnCompanyProfile, "In the Bisnow Universe");
    }

    public void verifyingSuccessMessageAfterUpdateCompanyStatus(String message) throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(SuccessMessageForUpdatingCompanyStatus);
        assertElementText(SuccessMessageForUpdatingCompanyStatus,message);
    }

    public void verifyingMessageAtTheBottomOfThePageAfterSettingCompanyStatusAsInBisnowUniverse() {
        waitForVisibility(MessageThatDisplayedOnTheButtonOfThePageAfterSettingCompanyStatusAsInBinsowUniverse, 20);
        assertDisplayed(MessageThatDisplayedOnTheButtonOfThePageAfterSettingCompanyStatusAsInBinsowUniverse);
    }

    public void clickOnAddCompanyAddressButton(){
        driver.navigate().refresh();
        waitSeconds(20);
        clickOnElement(AddCompanyAddressButton);
    }

    public void validatePopUPAddCompanyAddress(){
        waitForVisibility(SaveCompanyAddressButton,20);
        assertDisplayed(SaveCompanyAddressButton);
    }

    public void addCompanyPostalCodeField(String code){
        sendElementText(CompanyPostalCodeField, code);
    }

    public void selectHeadQuarterTypeAddress(){
        clickOnElement(AddressTypeField);
        selectFromUnOrderList(AddressTypeDropDownList,0);
    }

    public void clickOnSaveCompanyAddressButton(){
        waitSeconds(5);
        clickOnElement(SaveCompanyAddressButton);
    }

    public void validateHeadQuarterAddress(){
        assertDisplayed(HeadQuarterAddress);
    }

    public void validateAddAddressMassage(String message){
        waitForVisibility(AddressAddedSuccessfullyMassage,20);
        assertDisplayed(AddressAddedSuccessfullyMassage);
        assertElementText(AddressAddedSuccessfullyMassage,message);
    }

    public void clickOnAddAssetClassButton(){
        clickOnElement(AddAssetClassButton);
    }

    public void validatePopUPAddAssetClass(){
        waitForVisibility(UpdateAssetClassButton,20);
        assertDisplayed(UpdateAssetClassButton);
    }

    public void selectAssetClassFromDropDownList(){
        clickOnElement(AssetClassField);
        selectFromUnOrderList(AssetClassDropDownList,0);
        selectFromUnOrderList(AssetClassDropDownList,1);
//        clickOnElement(AssetClassDropDownListFirst);
//        clickOnElement(AssetClassDropDownList);
      clickOnElement(CloseAssetClass);

    }

    public void clickOnUpdateAssetClassButton() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(UpdateAssetClassButton);
    }

    public void validateAssetClassAdded(){
        waitForVisibility(ValidateAssetClassAdded,20);
        assertDisplayed(ValidateAssetClassAdded);
    }

    public void validateAssetClassMassage(String message) throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(ValidateAssetClassAddedSuccessfullyMassage);
        assertElementText(ValidateAssetClassAddedSuccessfullyMassage,message);
    }

    public void validateAssetClassMassage() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(ValidateAssetClassAddedSuccessfullyMassage);
    }

    public void clickOnAddIndustryButton(){
        clickOnElement(AddIndustryButton);
    }

    public void validatePopUPAddIndustry(){
        waitForVisibility(AddIndustryButtonPopUp,20);
        assertDisplayed(AddIndustryButtonPopUp);
    }

    public void selectIndustryDropDownList(){
        clickOnElement(IndustryField);
        clickOnElement(IndustryDropDownListFirst);
        clickOnElement(IndustryDropDownList);
        clickOnElement(CloseAssetClass);
//        action.moveByOffset(624, 16).click().build().perform();
    }
    public void clickOnAddIndustryPopUpButton() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(AddIndustryButtonPopUp);
    }
    public void validateIndustryAdded(){
        assertDisplayed(ValidateIndustryAdded);
    }

    public void validateIndustryMassage(String message){
        waitForVisibility(ValidateIndustryAddedSuccessfullyMassage,20);
        assertDisplayed(ValidateIndustryAddedSuccessfullyMassage);
    }

    public void clickOnApprovedLink() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(ApprovedLink);
    }

    public void validateApprovedMassage() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(ValidateApprovedSuccessfullyMassage);
    }
    public void EnterAdminCredentialsSecond() throws InterruptedException {
        Thread.sleep(1000);
        waitForVisibility(EmailTextField,20);
        sendElementText(EmailTextField, Users.Admin_Email.value);
        Thread.sleep(1000);
        waitForVisibility(PasswordTextBox,20);
        sendElementText(PasswordTextBox,Users.Admin_Password.value);
    }
}
