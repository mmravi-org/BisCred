//package Pages.CriteriaSearch;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.slf4j.Logger;
//import org.testng.Assert;
//
//import static org.testng.Assert.assertFalse;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.stream.Collectors;
//
////import static org.junit.Assert.assertFalse;
////import static org.junit.Assert.assertTrue;
//
//public class CriteriaSearchLogic extends CriteriaSearchPO {
//    private Logger log;
//
//    public CriteriaSearchLogic() {
//        super();
//    }
//
//    public void goToDashboard() {
//        goToURL("https://dashboard.beta.biscred.net");
//    }
//
//    public  void clickOnCriteriaTab(){
//        waitSeconds(20);
//        clickOnElement(CriteriaSearchTab);
//    }
//
//    public  void clickOnCompanyTab() throws InterruptedException {
//        Thread.sleep(1000);
//        clickOnElement(CompanyInCriteriaSearchMenu);
//    }
//
//    public  void fillCompanyNameField(String text){
//        clickOnElement(CompanyNameField);
//        sendElementText(CompanyNameField,text);
//    }
//
//    public void clickOnPlusSign(){
//        clickOnElement(CompanyNamePlusSign);
//    }
//
//    public void clickOnSearchCompanyButton(){
//        clickOnElement(SearchCompanyButton);
//    }
//
//    public void ValidateSearchResultsPage() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(SearchResultsPage);
//        Assert.assertNotEquals(SearchResultsPage,"Grey");
//    }
//
//    public void clickOnThreeDotsButton(){
//        clickOnElement(ThreeDots);
//    }
//
//    public void clickOnExactOption(){
//        clickOnElement(ExactOption);
//    }
//
//    public void ValidateSearchResultsPageFirstOption(String text) {
//        waitForVisibility(FirstResultOption,30);
//        assertDisplayed(FirstResultOption);
//        //assertElementContainsText(FirstResultOption,text);
//        // assertElementText(FirstResultOption,text);
//    }
//
//    public void clickOnRemoveLink(){
//        clickOnElement(RemoveLink);
//    }
//
//    public void ValidateSearchIconAppear() throws InterruptedException {
//        // waitForVisibility(SearchIconSVG,20);
//        Thread.sleep(3000);
//        assertDisplayed(SearchIconSVG);
//    }
//
//    public void clickOnResetButton(){
//        clickOnElement(ResetButton);
//    }
//
//    public void clickOnOptionFromCompanyIndustries(){
//        clickOnElement(OptionFromCompanyIndustries);
//    }
//
//    public void ValidateCompanyIndustriesOption(String text) {
//        waitForVisibility(CompanyIndustriesOption.get(0),20);
//        assertDisplayed(CompanyIndustriesOption.get(0));
//        assertElementContainsText(CompanyIndustriesOption,text);
//
//    }
//    public void clickOnSecondCompanyIndustries(){
//        clickOnElement(SecondOptionFromCompanyIndustries);
//    }
//    public void clickOnThirdCompanyIndustries(){
//        clickOnElement(ThirdOptionFromCompanyIndustries);
//    }
//
//    public void clickOnFourthCompanyIndustries(){
//        clickOnElement(FourthOptionFromCompanyIndustries);
//    }
//
//    public void clickOnFifthCompanyIndustries(){
//        clickOnElement(FifthOptionFromCompanyIndustries);
//    }
//
//    public void clickOnSixthCompanyIndustries(){
//        clickOnElement(SixthOptionFromCompanyIndustries);
//    }
//
//    public void clickOnSeventhCompanyIndustries(){
//        clickOnElement(SeventhOptionFromCompanyIndustries);
//    }
//
//    public void clickOnEightCompanyIndustries(){
//        clickOnElement(EightOptionFromCompanyIndustries);
//    }
//
//    public void clickOnNineCompanyIndustries(){
//        clickOnElement(NineOptionFromCompanyIndustries);
//    }
//
//    public void clickOnTenthCompanyIndustries(){
//        clickOnElement(TenthOptionFromCompanyIndustries);
//    }
//
//    public void clickOnElevenCompanyIndustries(){
//        clickOnElement(EleventhOptionFromCompanyIndustries);
//    }
//
//    public void clickOnTwelveCompanyIndustries(){
//        clickOnElement(TwelveOptionFromCompanyIndustriesPlusSign);
//        clickOnElement(TwelveOptionFromCompanyIndustries);
//    }
//
//    public void clickOnThirteenCompanyIndustries(){
//        clickOnElement(ThirteenOptionFromCompanyIndustries);
//    }
//
//    public void clickOnFourteenCompanyIndustries(){
//        clickOnElement(FourteenOptionFromCompanyIndustries);
//    }
//
//    public void clickOnFifteenCompanyIndustries(){
//        clickOnElement(FifteenOptionFromCompanyIndustries);
//    }
//    public void clickOnSixteenCompanyIndustries(){
//        clickOnElement(SixteenOptionFromCompanyIndustries);
//    }
//
//    public void clickOnSeventeenCompanyIndustries() throws InterruptedException {
//        Thread.sleep(3000);
//        clickOnElement(SevenTeenOptionFromCompanyIndustriesPlusSign);
//        clickOnElement(SevenTeenOptionFromCompanyIndustries);
//    }
//
//    public void clickOnEighteenCompanyIndustries(){
//        clickOnElement(EighteenOptionFromCompanyIndustries);
//    }
//
//    public void clickOnNineteenCompanyIndustries(){
//        clickOnElement(NineteenOptionFromCompanyIndustries);
//    }
//
//    public void clickOnTwentyCompanyIndustries() throws InterruptedException {
//        Thread.sleep(3000);
//        clickOnElement(TwentyOptionFromCompanyIndustries);
//    }
//
//    public void clickOnThreeDots(){
//        clickOnElement(ThreeDotsSVG);
//    }
//
//    public void ValidateExactIndustry(String text) {
//        waitForVisibility(ExactIndustry.get(0),20);
//        assertDisplayed(ExactIndustry.get(0));
//        assertElementText(ExactIndustry.get(0),text);
//
//    }
//
//    public void clickOnExclude(){
//        clickOnElement(ExcludeIndustry);
//
//    }
//
//    public void clickOnExcludeState(){
//        clickOnElement(ExcludeState);
//
//    }
//    public void ValidateExcludeIndustry() {
//        waitForVisibility(FirstIndustry,10);
//        assertDisplayed(FirstIndustry);
//    }
//
//    public void ValidateCompanyAndContactButton() {
//        assertIfTrue(SearchCompaniesButton.isDisplayed());
//        assertIfTrue(SearchPeopleButton.isDisplayed());
//    }
//
//    public void clickOnCompanyAssetExperiences(){
//        clickOnElement(AffordableHousing);
//    }
//
//    public void ValidateCompanyAssetExperiences(String text) {
//        waitForVisibility(ExactAssetClasses,20);
//        assertDisplayed(ExactAssetClasses);
////        assertElementText(ExactAssetClasses,text);
//    }
//
//    public void ValidateSearchSummaryPanel() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(SearchSummaryPanel);
//    }
//
//    public void ValidateCompanyAssetExperiences() {
//        waitForVisibility(ExactAssetClasses,20);
//        assertDisplayed(ExactAssetClasses);
//    }
//    public void clickOnStatePlusSign(){
//        clickOnElement(StateSignPlus);
//    }
//
//    public void clickOnStateFirstOption(){
//        clickOnElement(FirstStateOptionPlus);
//        clickOnElement(FirstStateOption);
//    }
//
//    public void clickOnStateHQToggle(){
//        clickOnElement(HQButton);
//    }
//
//    public void clickOnStateHQAndExclude(){
//        clickOnElement(ExcludeIndustry);
//        clickOnElement(HQStateOption);
//    }
//
//    public void ValidateHqStateResults() {
//        waitForVisibility(HQStateResult,20);
//        assertDisplayed(HQStateResult);
//        Assert.assertNotEquals(PeopleCitiesResult,"Illinois");
//
//    }
//
//    public void TypeHeadQuarterCityInCityField() {
//
//        clickOnElement(HQCityField);
//        sendElementText(HQCityField,"New York");
//        clickOnElement(HqCityPlusButton);
//    }
//
//    public void ValidateHqCityResults() {
//        waitForVisibility(HqCityResults,20);
//        assertDisplayed(HqCityResults);
//    }
//    public void clickOnHQToggle(){
//        clickOnElement(HqCityToggleButton);
//    }
//
//    public void clickOnExactOptionOnCity(){
//        clickOnElement(ExactOptionCity);
//    }
//
//    public void clickOnExactAndHQOptionOnCity(){
//        clickOnElement(ExactOptionCity);
//        clickOnElement(HQOptionCity);
//    }
//
//    public void clickOnExactAndHQAndExcludeOptionOnCity(){
//        clickOnElement(ExactOptionCity);
//        clickOnElement(HQOptionCity);
//        clickOnElement(ExcludeOptionCity);
//    }
//
//    public void clickOnRemoveLinkOptionOnCity(){
//        clickOnElement(RemoveLinkOption);
//    }
//
//    public void clickOnExcludeSavedCompanyRecordsToggle(){
//        clickOnElement(ExcludeSavedCompanyRecordsToggle);
//    }
//
//    public void clickOnXButtonExcludeSavedCompanyRecords(){
//        clickOnElement(XButtonIcon);
//    }
//
//    public void SelectValueFromSlideBar(){
//        int x=10;
//        int width=SliderContactLine.getSize().getWidth();
//        Actions move = new Actions(driver);
//        move.moveToElement(SliderContactLine, ((width*x)/100), 0).click();
//        move.build().perform();
//    }
//
//    public void ValidateSlideBarResults() {
//        waitForVisibility(SliderContactResults,20);
//        assertDisplayed(SliderContactResults);
//    }
//
//    public void SelectMinValueFromSlideBar(){
//        Actions action = new Actions(driver);
//        action.clickAndHold(SliderContactLine);
//        action.moveByOffset(20, 0).release().build().perform();
//    }
//
//    public void SelectMinValueFromSlideBarProperty(){
//        Actions action = new Actions(driver);
//        action.clickAndHold(SliderPropertyLine);
//        action.moveByOffset(20, 0).release().build().perform();
//    }
//
//
//    public void clickOnSortArrow(){
//        clickOnElement(SortArrow);
//    }
//
//    public void ValidateSortSlideBarMinimumValueResults() {
//        waitForVisibility(ContactCountResult,20);
//        assertDisplayed(ContactCountResult);
//    }
//
//    public void TypeMinimumValueInMinField(){
//        clickOnElement(MinValueField);
//        sendElementText(MinValueField,"20");
//        clickOnElement(SearchField);
//    }
//
//    public void SelectMaxValueFromSlideBar(){
//        int x=5;
//        int width=SliderContactLine.getSize().getWidth();
//        Actions move = new Actions(driver);
//        move.moveToElement(SliderContactLine, ((width*x)/100), 0).click();
//        move.build().perform();
//    }
//
//    public void clickOnSortMaxValueArrow(){
//        clickOnElement(SortArrow);
//        clickOnElement(SortArrow);
//    }
//
//    public void TypeMaximumValueInMinField(){
//        clickOnElement(MaxValueField);
//        sendElementText(MaxValueField,"1800");
//        clickOnElement(SearchField);
//    }
//
//    public void SelectMaxValueFromPropertyCountSlideBar(){
//        int x=5;
//        int width=SliderPropertyCountLine.getSize().getWidth();
//        Actions move = new Actions(driver);
//        move.moveToElement(SliderPropertyCountLine, ((width*x)/100), 0).click();
//        move.build().perform();
//    }
//
//    public void TypeMaximumValueInMaxField(){
//        clickOnElement(MaxValueFieldPropertyCount);
//        sendElementText(MaxValueFieldPropertyCount,"1800");
//        clickOnElement(SearchField);
//    }
//
//    public void TypeMinimumValueInMInField(){
//        clickOnElement(MinValueFieldPropertyCount);
//        sendElementText(MinValueFieldPropertyCount,"20");
//        clickOnElement(SearchField);
//    }
//    public void clickOnClearButton(){
//        waitSeconds(20);
//        clickOnElement(ClearButton);
//    }
//
//    public void ValidateCompanyCountSlideBar() {
//        waitSeconds(20);
//        assertNotDisplayed(CompanyCountSlideBar);
//    }
//
//    public void clickOnCriteriaTabagain(){
//        driver.navigate().refresh();
//        clickOnElement(CriteriaSearchTab);
//    }
//
//    public void clickOnNewSearchButton(){
//        clickOnElement(NewSearchButton);
//    }
//    public void ValidateCriteriaSearchTab() {
//        assertIfTrue(CriteriaSearchTab.isEnabled());
//    }
//
//    public void clickOnPlusSignInCityField(){
//        clickOnElement(PlusSignInCityField);
//    }
//
//    public void ValidateNotificationMessage(String text) throws InterruptedException {
//        Thread.sleep(3000);
//        assertDisplayed(NotificationMessage);
//        assertElementText(NotificationMessage,text);
//    }
//
//    public void clickOnPersonTab() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(PersonTab);
//    }
//
//    public void typeAnyPersonName(){
//        clickOnElement(PersonField);
//        sendElementText(PersonField,"Andrew");
//    }
//
//    public void clickOnThreeDotsForPerson(){
//        clickOnElement(ThreeDotsSVG);
//    }
//
//    public void clickOnPeopleButton(){
//        clickOnElement(SearchPeopleButton);
//    }
//
//    public void ValidatePeopleNameSearchResults() {
//        waitForVisibility(PersonNameResults.get(0),20);
//        assertDisplayed(PersonNameResults.get(0));
//    }
//
//    public void clickOnPeoplePlusButton(){
//        clickOnElement(PlusSignInPersonField);
//    }
//
//    public void clickOnPeopleExactOption(){
//        clickOnElement(ExactOptionInPerson);
//    }
//
//    public void clickOnPeopleExcludeOption(){
//        clickOnElement(ExcludeOption);
//    }
//    public void ValidatePeopleNameSearchResultsNotContains() {
//        waitForVisibility(ExcludeOptionInPerson,20);
//        assertDisplayed(ExcludeOptionInPerson);
//        Assert.assertNotEquals(ExcludeOptionInPerson,"Andrew");
//    }
//
//    public void ValidatePeopleNameSearchResultsDisappear() {
//        waitSeconds(20);
//        assertDisplayed(PersonNameField);
//    }
//
//    public void clickOnRemoveLinkForPeople(){
//        clickOnElement(PersonNameFieldRemove);
//    }
//
//    public void typeAnyJobTitlesInPeople(){
//        clickOnElement(JobTitlesInPeople);
//        sendElementText(JobTitlesInPeople,"Manager");
//    }
//
//    public void clickOnPlusSignForJobTitles(){
//        clickOnElement(JobTitlesInPeoplePlus);
//    }
//
//    public void clickOnPlusSignForJobTitlesExact(){
//        clickOnElement(JobTitlesInExactOption);
//    }
//
//    public void ValidatePeopleJobTitlesSearchResults() {
//        waitForVisibility(JobTitlesInExactOptionResults,20);
//        assertDisplayed(JobTitlesInExactOptionResults);
//        assertElementText(JobTitlesInExactOptionResults,"Manager");
//    }
//
//    public void clickOnExcludeJobTitles(){
//        clickOnElement(JobTitlesExcludeOption);
//    }
//
//    public void clickOnRemoveLinkJobTitles(){
//        clickOnElement(JobTitlesRemoveLinkOption);
//    }
//
//    public void clickOnPlusSignBesideExecutive(){
//        clickOnElement(PlusSignBesideExecutive);
//    }
//
//    public void clickOnFirstOptionExecutive(){
//        clickOnElement(FirstOptionOnExecutive);
//    }
//
//    public void ValidatePeopleSenioritySearchResults() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(SeniorityOption);
//    }
//
//    public void ValidatePeopleSeniorityResults() {
//        waitForVisibility(SeniorityResult,20);
//        assertDisplayed(SeniorityResult);
//        assertElementText(SeniorityResult,"Chairman");
//    }
//
//    public void clickOnExactSeniority(){
//        clickOnElement(ExactSeniorityOption);
//    }
//
//    public void ValidatePeopleSenioritySearchResultsNotContains() {
//        waitForVisibility(SeniorityResult,20);
//        assertDisplayed(SeniorityResult);
//        Assert.assertNotEquals(SeniorityResult,"Chairman");
//    }
//
//    public void clickOnRemoveLinkPeopleSeniority(){
//        clickOnElement(SeniorityRemoveLink);
//    }
//
//    public void clickOnPeopleAssetExperiences(){
//        clickOnElement(PeopleAssetExperiences);
//    }
//
//    public void ValidatePeopleAssetExperiencesResults() {
//        waitForVisibility(PeopleAssetExperiencesResults,20);
//        assertDisplayed(PeopleAssetExperiencesResults);
//        assertElementText(PeopleAssetExperiencesResults,"Affordable Housing");
//    }
//
//    public void ValidatePeopleAssetExperiencesResultsNotContains() {
//        waitForVisibility(PeopleAssetExperiencesResults,20);
//        assertDisplayed(PeopleAssetExperiencesResults);
//        Assert.assertNotEquals(PeopleAssetExperiencesResults,"Affordable Housing");
//    }
//
//    public void clickOnPeopleAssetExperiencesRemoveLink(){
//        clickOnElement(AssetExperiencesRemoveLink);
//    }
//
//    public void clickOnPeopleStatesPlusSign(){
//        clickOnElement(PlusSignBesideMidwest);
//    }
//
//    public void clickOnPeopleIllinoisState(){
//        clickOnElement(illinoisIllinoisState);
//    }
//
//    public void ValidatePeopleIllinoisStateResults() {
//        waitForVisibility(illinoisIllinoisStateOption,20);
//        assertDisplayed(illinoisIllinoisStateOption);
//    }
//
//    public void ValidatePeopleIllinoisStateResultsResults() {
//        waitForVisibility(illinoisIllinoisStateResults,20);
//        assertDisplayed(illinoisIllinoisStateResults);
//        Assert.assertNotEquals(PeopleAssetExperiencesResults,"Illinois");
//    }
//
//    public void clickOnPeopleIllinoisStateExclude(){
//        clickOnElement(illinoisIllinoisStateExclude);
//    }
//
//    public void clickOnPeopleIllinoisStateRemoveLink(){
//        clickOnElement(illinoisIllinoisRemoveLink);
//    }
//
//    public void typeAnyPeopleCitiesField(){
//        clickOnElement(PeopleCitiesField);
//        sendElementText(PeopleCitiesField,"New York");
//    }
//
//    public void clickOnPeopleCitiesPlusSign(){
//        clickOnElement(PeopleCitiesPlusSign);
//    }
//
//    public void ValidatePeopleCitiesResults() {
//        waitForVisibility(PeopleCitiesResults,20);
//        assertDisplayed(PeopleCitiesResults);
//    }
//
//    public void clickOnPeopleCitiesExact(){
//        clickOnElement(PeopleCitiesExact);
//    }
//
//    public void ValidatePeopleCitiesExactResults() {
//        waitForVisibility(PeopleCitiesResult,20);
//        assertDisplayed(PeopleCitiesResult);
//        assertElementText(PeopleCitiesResult,"New York");
//    }
//
//    public void ValidatePeopleCitiesResultNotContains() {
//        waitForVisibility(PeopleCitiesResult,20);
//        assertDisplayed(PeopleCitiesResult);
//        Assert.assertNotEquals(PeopleCitiesResult,"New York");
//    }
//
//    public void clickOnRemoveLinkPeopleCities(){
//        clickOnElement(RemoveLinkPeopleCities);
//    }
//
//    public void clickOnExcludeSavedPeopleRecordsToggle(){
//        clickOnElement(ExcludeSavedPeopleRecordsToggle);
//    }
//
//    public void clickOnXIconExcludeSavedPeopleRecordsToggle(){
//        clickOnElement(XIconExcludeSavedPeopleRecordsToggle);
//    }
//
//    public void ValidatePeopleStatesExactResults(String text) {
//        waitForVisibility(HQStateResult,20);
//        assertDisplayed(HQStateResult);
//        assertElementText(HQStateResult,text);
//    }
//
//    public void clickOnHQOnly(){
//        clickOnElement(HQOptionCity);
//    }
//
//    public void ValidatePeopleCitiesResultNotContainsState(String text) {
//        waitForVisibility(HQStateResult,20);
//        assertDisplayed(HQStateResult);
//        Assert.assertNotEquals(HQStateResult,text);
//    }
//
//    public void ValidatePeopleCitiesExactResults(String text) {
//        waitForVisibility(PeopleCitiesResult,20);
//        assertDisplayed(PeopleCitiesResult);
//        assertElementText(PeopleCitiesResult,text);
//    }
//
//    public void clickOnExactOptionInCity(){
//        clickOnElement(ExactOptionCity);
//    }
//
//    //##############   Keyword Functionality  ############################
//    public void iClickOnAdminMenu() throws InterruptedException {
//        Thread.sleep(2000);
//        goToURL("https://dashboard.beta.biscred.net/management/features");
//    }
//
//    public void clickOnActivateLinkForCompanyKeywordSearchControls() throws InterruptedException {
//        Thread.sleep(3000);
//        if (KeywordStatus.getText().contains("Inactive")) {
//            clickOnElement(ActivateLink);
//        } else {
//            clickOnElement(DeactivateLink);
//            Thread.sleep(4000);
//            clickOnElement(ActivateLink);
//        }
//    }
//
//    public void clickOnEditLink() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(EditLink);
//    }
//
//    public void validateEditFeatureFlagsPopUp() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(EditFeatureFlagsPopUp);
//    }
//
//    public void typeAnyUserNameInEditFeatureFlagsField(String text) throws InterruptedException {
//        Thread.sleep(3000);
//        clickOnElement(EditFeatureFlagsField);
//        sendElementText(EditFeatureFlagsField, text);
//    }
//
//    public void validateTheUserIsDisplayingInAllUsersSection(String text) throws InterruptedException {
//        Thread.sleep(2000);
//        for (org.openqa.selenium.WebElement usersFeatureFlag : UsersFeatureFlags) {
//            assertElementText(usersFeatureFlag, text);
//        }
//    }
//
//    public void clickOnTheCheckBoxBesideTheUser() {
//     clickOnElement(UsersFeatureFlagsCheckBox);
//    }
//
//    public void validateTheUserAddedToTheSelectedUsersSection(String text) throws InterruptedException {
//        Thread.sleep(2000);
//        for (org.openqa.selenium.WebElement webElement : SelectedUsersSection) {
//            if(webElement.getText().contains(text)) {
//                assertDisplayed(SelectedUsersSection.get(0));
//            }
//        }
//    }
//
//    public void clickSaveButton() throws InterruptedException {
//        Thread.sleep(3000);
//        clickOnElement(SaveButton);
//    }
//
//    public void validateTheANewFreeTextFieldShouldBeAccessibleOnTheCriteriaSearchPage() throws InterruptedException {
//        Thread.sleep(3000);
//        assertDisplayed(CompanyKeywordsField);
//    }
//
//    public void clickOnSearchMenu() {
//        goToURL("https://dashboard.beta.biscred.net/");
//    }
//
//    public void validateRedirectedToTheFeatureManagementPage() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(FeatureManagementPage);
//
//    }
//
//    public void validateTheUserNotAddedToTheSelectedUsersSection(String text) {
//        for (org.openqa.selenium.WebElement webElement : SelectedUsersSection) {
//         assertIfFalse(webElement.getText().contains(text));
//        }
//    }
//
//    public void leaveTheCompanyKeywordEmpty() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(CompanyKeywordsFields);
//        sendElementText(CompanyKeywordsFields, "  ");
//    }
//
//    public void validateTheCompanyKeywordsCompanyKeywordsContextIsDisabled() {
//        assertIfTrue(CompanyKeywordsColumn.isEnabled());
//        assertIfTrue(CompanyKeywordsContextColumn.isEnabled());
//    }
//
//    public void validateTheKewywordFieldIsRemovedFromCriteriaSearchPage() {
//        try {
//            final boolean displayed = CompanyKeywordsField.isDisplayed();
//            assertFalse("Page header should not be displayed", displayed);
//            assertFalse(true);
//        } catch (final NoSuchElementException nsee) {
//            this.log.debug("Page header is not displayed :PASSED");
//        }
//        Assert.assertFalse(CompanyKeywordsField.isDisplayed());
//    }
//
//    public void clickOnCancelButtonOnEditFeaturePopup() {
//        clickOnElement(CancelButton);
//    }
//
//    public void typeInAnyWordIntoCompanyKeywordField(String text) throws InterruptedException {
//        Thread.sleep(3000);
//        clickOnElement(CompanyKeywordsFields);
//        sendElementText(CompanyKeywordsFields, text);
//    }
//
//    public void validateTheRecentKeywordsSearchedShouldAppearBelowTheSearchBar(String text) throws InterruptedException {
//        Thread.sleep(3000);
//        assertDisplayed(CompanyKeywords);
//        assertElementText(CompanyKeywords,text);
//    }
//
//    public void validateNewColumnCompanyKeywords() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(CompanyKeywordsColumns);
//    }
//
//    public void iShouldSeeANewColumnCompanyKeywordsContext() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(CompanyKeywordsContextColumns);
//    }
//
//    public void clickOnSelectionBoxBesideCompanyKeywordsColumn() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(SelectionBoxBesideCompanyKeywordsColumn);
//    }
//
//    public boolean ShouldSeeTheCompanyKeywordColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
//        Thread.sleep(3000);
//        int size=CompanyColumn.size();
//        for(int i=2; i<=size;i++){
//            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
//        }
//        boolean isElementPresent;
//        {
//            try {
//                driver.findElement(By.xpath("//th[@data-key=\"company_keywords_search\"]"));
//                return true;
//            } catch (org.openqa.selenium.NoSuchElementException e) {
//                return false;
//            }
//        }
//    }
//    public void clickOnSelectionBoxBesideCompanyKeywordsContextColumn() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(SelectionBoxBesideCompanyKeywordsContextColumn);
//    }
//
//    public void clickOnPlusSignForCompanyKeywordField() throws InterruptedException {
//        Thread.sleep(3000);
//        clickOnElement(PlusSignForCompanyKeywordField);
//    }
//
//    public boolean ShouldSeeTheCompanyKeywordContextColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
//        Thread.sleep(3000);
//        int size=CompanyColumn.size();
//        for(int i=2; i<=size;i++){
//            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
//        }
//        boolean isElementPresent;
//        {
//            try {
//                driver.findElement(By.xpath("//th[@data-key=\"company_keywords_search_context\"]"));
//                return true;
//            } catch (org.openqa.selenium.NoSuchElementException e) {
//                return false;
//            }
//        }
//    }
//
//    public void validateColumnCompanyKeywordsContainsTheSearchKeywordsSeprated(String text1,String text2,String text3) throws InterruptedException {
//        boolean found = false;
//        for (WebElement keywordsSearch : companyKeywordsSearch) {
//            if (text1.contains(keywordsSearch.getText()) ||
//                    text2.contains(keywordsSearch.getText()) ||
//                    text3.contains(keywordsSearch.getText())) {
//                found = true;
//                break;
//            }
//        }
//        assertTrue("At least one text should contain the text of companyKeywordsSearch", found);
//}
//
//
//    public void validateColumnCompanyKeywordsContainsTheSearchKeyword(String text) throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(CompanyKeywordsColumns);
//        for (WebElement keywordsSearch : companyKeywordsSearch) {
//           assertElementText(keywordsSearch, text);
//        }
//    }
//
//    public void clickOnTheKeywordSearchUnderCompanyKeywordsField() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(KeywordSearchUnderCompanyKeywordsField.get(0));
//    }
//
//    public void ClickOnTheHideLinkBesideCompanyKeywordColumnOnCompanyDetailsPage() throws InterruptedException {
////        waitForVisibility(ListColumnInCompanySearchResult, 70);
////        clickOnElement(ListColumnInCompanySearchResult);
////        Thread.sleep(3000);
////        goToElement(HideButtonOfListColumnOnCompanyDetailsPage);
////        clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
//        Thread.sleep(2000);
//        int size = CompanyColumn.size();
//        for (int i = 3; i <= size; i++) {
//            clickOnElement(HideButtonOfKeywordCompanyColumnOnCompanyDetailsPage);
//        }
//    }
//
//    public void ClickOnTheHideLinkBesideCompanyKeywordContextColumnOnCompanyDetailsPage() throws InterruptedException {
////        waitForVisibility(ListColumnInCompanySearchResult, 70);
////        clickOnElement(ListColumnInCompanySearchResult);
////        Thread.sleep(3000);
////        goToElement(HideButtonOfListColumnOnCompanyDetailsPage);
////        clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
//        Thread.sleep(3000);
//        int size = CompanyColumn.size();
//        for (int i = 3; i <= size; i++) {
//            clickOnElement(HideButtonOfKeywordCompanyContextColumnOnCompanyDetailsPage);
//        }
//    }
//    public void clickOnAnyValueInCompanyKeywordsContextColumn() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(AnyValueInCompanyKeywordsContextColumn.get(0));
//    }
//
//    public void validateCompanyKeywordsSearchDetailsPopUpDisplay() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(CompanyKeywordsSearchDetailsPopUp);
//    }
//
//    public void validateTheKeywordsAndTheirContextForTheSelectedCompanyDisplayed() throws InterruptedException {
//        Thread.sleep(2000);
//        assertDisplayed(CompanyKeywordsResultsInPopUp);
//    }
//
//    public void clickOnAnySnippetLink() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(SnippetLink);
//    }
//
//    public void validateRedirectToTheCorrectPage() {
//       String url= SnippetLink.getText();
//        String url2=driver.getCurrentUrl();
//        assertIfFalse(url2.contains(url));
//    }
//
//    public void validateNoEmptyValue() {
//        int size= companyKeywordsSearch.size();
//        for(int i=0;i<size;i++) {
//            assertIfFalse(companyKeywordsSearch.isEmpty());
//        }
//    }
//
//    public void validateKeywordsColumnAreSortedByKeyword() {
//        List<WebElement> nameList = companyKeywordsSearch;
//        List<String> names = nameList.stream()
//                .map(n -> n.getText())
//                .collect(Collectors.toList());
//        List<String> sortedNames = names;
//        Collections.sort(sortedNames);
//        boolean areSorted =  names.equals(sortedNames);
//        assertIfTrue(areSorted);
//    }
//
//    public void clickOnCloseButtonPopUp() throws InterruptedException {
//        Thread.sleep(2000);
//        clickOnElement(CloseButtonPopUp);
//    }
//
//}