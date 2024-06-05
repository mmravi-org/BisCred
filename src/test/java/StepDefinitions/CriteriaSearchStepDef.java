//package StepDefinitions;
//
//
//import Pages.CriteriaSearch.CriteriaSearchLogic;
//import Pages.QuickSearch.QuickSearchLogic;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class CriteriaSearchStepDef {
//    CriteriaSearchLogic criteriaSearchLogic = new CriteriaSearchLogic();
//
//    @When("I click on criteria Search")
//    public void iClickOnCriteriaSearch() {
//        criteriaSearchLogic.clickOnCriteriaTab();
//
//    }
//
//    @Then("I Select company in criteria search menu")
//    public void iSelectCompanyInCriteriaSearchMenu() throws InterruptedException {
//        criteriaSearchLogic.clickOnCompanyTab();
//    }
//
//    @And("I click the plus button")
//    public void iClickThePlusButton() {
//        criteriaSearchLogic.clickOnPlusSign();
//    }
//
//    @When("I Click search companies button")
//    public void iClickSearchCompaniesButton() {
//        criteriaSearchLogic.clickOnSearchCompanyButton();
//    }
//
//    @Then("I should be redirect to the search results page and see retains selected criteria")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsSelectedCriteria() throws InterruptedException {
//        criteriaSearchLogic.ValidateSearchResultsPage();
//    }
//
//    @When("I click the three dots beside the name")
//    public void iClickTheThreeDotsBesideTheName() {
//        criteriaSearchLogic.clickOnThreeDotsButton();
//    }
//
//    @And("I select exact checkbox")
//    public void iSelectExactCheckbox() {
//        criteriaSearchLogic.clickOnExactOption();
//    }
//
//    @And("I type  any Company name in Company Names field {string}")
//    public void iTypeAnyCompanyNameInCompanyNamesField(String text) {
//        criteriaSearchLogic.fillCompanyNameField(text);
//    }
//
//    @And("I should see Results exactly matched to the input contains {string}")
//    public void iShouldSeeResultsExactlyMatchedToTheInputContains(String text) {
//        criteriaSearchLogic.ValidateSearchResultsPageFirstOption(text);
//    }
//
//    @And("I click on Remove link")
//    public void iClickOnRemoveLink() {
//        criteriaSearchLogic.clickOnRemoveLink();
//    }
//
//    @Then("I should see the company name removed from criteria search")
//    public void iShouldSeeTheCompanyNameRemovedFromCriteriaSearch() throws InterruptedException {
//        criteriaSearchLogic.ValidateSearchIconAppear();
//    }
//
//    @When("I click on Reset button")
//    public void iClickOnResetButton() {
//        criteriaSearchLogic.clickOnResetButton();
//    }
//
//    @Then("I should see the search icon displayed")
//    public void iShouldSeeTheSearchIconDisplayed() throws InterruptedException {
//        criteriaSearchLogic.ValidateSearchIconAppear();
//    }
//
//    @And("I Select Private Equity from Company Industries")
//    public void iSelectPrivateEquityFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnOptionFromCompanyIndustries();
//    }
//
//    @Then("I should be redirect to the search results page and see retains selected criteria {string}")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsSelectedCriteria(String text) {
//        criteriaSearchLogic.ValidateCompanyIndustriesOption(text);
//
//    }
//
//    @And("I Select Real Estate Investment Firm from Company Industries")
//    public void iSelectRealEstateInvestmentFirmFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnSecondCompanyIndustries();
//    }
//
//    @And("I Select Real Estate Investment Trust from Company Industries")
//    public void iSelectRealEstateInvestmentTrustFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnThirdCompanyIndustries();
//    }
//
//    @And("I Select Developer from Company Industries")
//    public void iSelectDeveloperFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnFourthCompanyIndustries();
//    }
//
//    @And("I Select Operator from Company Industries")
//    public void iSelectOperatorFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnFifthCompanyIndustries();
//    }
//
//    @And("I Select Architect from Company Industries")
//    public void iSelectArchitectFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnSixthCompanyIndustries();
//    }
//
//    @And("I Select Engineering from Company Industries")
//    public void iSelectEngineeringFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnSeventhCompanyIndustries();
//    }
//
//    @And("I Select Interior Design from Company Industries")
//    public void iSelectInteriorDesignFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnEightCompanyIndustries();
//    }
//
//    @And("I Select General Contractor from Company Industries")
//    public void iSelectGeneralContractorFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnNineCompanyIndustries();
//    }
//
//    @And("I Select Property Management from Company Industries")
//    public void iSelectPropertyManagementFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnTenthCompanyIndustries();
//    }
//
//    @And("I Select Construction from Company Industries")
//    public void iSelectConstructionFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnElevenCompanyIndustries();
//    }
//
//    @And("I Select CRE Broker from Company Industries")
//    public void iSelectCREBrokerFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnTwelveCompanyIndustries();
//    }
//
//    @And("I Select Consulting-Beta from Company Industries")
//    public void iSelectConsultingBetaFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnThirteenCompanyIndustries();
//
//    }
//
//    @And("I Select Environmental Consulting-Beta from Company Industries")
//    public void iSelectEnvironmentalConsultingBetaFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnFourteenCompanyIndustries();
//    }
//
//    @And("I Select Landscaping-Beta from Company Industries")
//    public void iSelectLandscapingBetaFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnFifteenCompanyIndustries();
//    }
//
//    @And("I Select Law Firm and Legal Services-Beta from Company Industries")
//    public void iSelectLawFirmAndLegalServicesBetaFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnSixteenCompanyIndustries();
//    }
//
//    @And("I Select Lender from Company Industries")
//    public void iSelectLenderFromCompanyIndustries() throws InterruptedException {
//        criteriaSearchLogic.clickOnSeventeenCompanyIndustries();
//    }
//
//    @And("I Select Materials-Beta from Company Industries")
//    public void iSelectMaterialsBetaFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnEighteenCompanyIndustries();
//    }
//
//    @And("I Select PropTech-Beta from Company Industries")
//    public void iSelectPropTechBetaFromCompanyIndustries() {
//        criteriaSearchLogic.clickOnNineteenCompanyIndustries();
//    }
//
//    @And("I Select Title Insurance from Company Industries")
//    public void iSelectTitleInsuranceFromCompanyIndustries() throws InterruptedException {
//        criteriaSearchLogic.clickOnTwentyCompanyIndustries();
//    }
//
//    @When("I click the three dots beside the Company Industries")
//    public void iClickTheThreeDotsBesideTheCompanyIndustries() {
//        criteriaSearchLogic.clickOnThreeDots();
//    }
//
//    @And("I should see Company only the input industry {string}")
//    public void iShouldSeeCompanyOnlyTheInputIndustry(String text) {
//        criteriaSearchLogic.ValidateExactIndustry(text);
//    }
//
//    @And("I select Exclude checkbox")
//    public void iSelectExcludeCheckbox() {
//        criteriaSearchLogic.clickOnExclude();
//    }
//
//    @And("I should see Company not contain the input industry")
//    public void iShouldSeeCompanyNotContainTheInputIndustry() {
//        criteriaSearchLogic.ValidateExcludeIndustry();
//    }
//
//    @And("I should see the Company search button and people button is inactive")
//    public void iShouldSeeTheCompanySearchButtonAndPeopleButtonIsInactive() {
//        criteriaSearchLogic.ValidateCompanyAndContactButton();
//    }
//
//    @And("I Select Affordable Housing from Company Asset Experiences")
//    public void iSelectAffordableHousingFromCompanyAssetExperiences() {
//        criteriaSearchLogic.clickOnCompanyAssetExperiences();
//    }
//
//    @Then("I should be redirect to the search results page and see retains selected Company {string}")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsSelectedCompany(String text) {
//        criteriaSearchLogic.ValidateCompanyAssetExperiences(text);
//    }
//
//    @When("I click the three dots beside the Company Asset Experiences")
//    public void iClickTheThreeDotsBesideTheCompanyAssetExperiences() {
//        criteriaSearchLogic.clickOnThreeDots();
//    }
//
//    @And("I should see summary panel with the selected criteria result")
//    public void iShouldSeeSummaryPanelWithTheSelectedCriteriaResult() throws InterruptedException {
//        criteriaSearchLogic.ValidateSearchSummaryPanel();
//    }
//
//    @Then("I should be redirect to the search results page and Company should not contain the input asset")
//    public void iShouldBeRedirectToTheSearchResultsPageAndCompanyShouldNotContainTheInputAsset() {
//        criteriaSearchLogic.ValidateCompanyAssetExperiences();
//    }
//
//    @And("I click the plus sign beside Midwest")
//    public void iClickThePlusSignBesideMidwest() {
//        criteriaSearchLogic.clickOnStatePlusSign();
//    }
//
//    @And("I Select Illinois from Midwest from Company State")
//    public void iSelectIllinoisFromMidwestFromCompanyState() {
//        criteriaSearchLogic.clickOnStateFirstOption();
//    }
//
//    @And("I click on HQ Only toggle")
//    public void iClickOnHQOnlyToggle() {
//        criteriaSearchLogic.clickOnStateHQToggle();
//    }
//
//    @And("I click on the three dots beside Company State selected")
//    public void iClickOnTheThreeDotsBesideCompanyStateSelected() {
//        criteriaSearchLogic.clickOnThreeDots();
//    }
//
//    @And("I click on HQ Only and Exclude at the same time")
//    public void iClickOnHQOnlyAndExcludeAtTheSameTime() {
//        criteriaSearchLogic.clickOnStateHQAndExclude();
//
//    }
//
//    @Then("I should be redirect to the search results page and see retains Companies should not be headquarted in the selected state")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompaniesShouldNotBeHeadquartedInTheSelectedState() {
//        criteriaSearchLogic.ValidateHqStateResults();
//    }
//
//    @And("I type any city in the Company City field")
//    public void iTypeAnyCityInTheCompanyCityField() {
//        criteriaSearchLogic.TypeHeadQuarterCityInCityField();
//    }
//
//    @Then("I should be redirect to the search results page and see retains Company should be in the selected City")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyShouldBeInTheSelectedCity() {
//        criteriaSearchLogic.ValidateHqCityResults();
//    }
//
//    @And("I click on HQ Only toggle for City")
//    public void iClickOnHQOnlyToggleForCity() {
//        criteriaSearchLogic.clickOnHQToggle();
//    }
//
//    @Then("I should be redirect to the search results page and see retains Company should be headquartered in the selected City")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyShouldBeHeadquarteredInTheSelectedCity() {
//        criteriaSearchLogic.ValidateHqCityResults();
//    }
//
//    @And("I click on the three dots beside the Company City")
//    public void iClickOnTheThreeDotsBesideTheCompanyCity() {
//        criteriaSearchLogic.clickOnThreeDots();
//    }
//
//    @When("I select exclude")
//    public void iSelectExclude() {
//        criteriaSearchLogic.clickOnExclude();
//    }
//
//    @Then("I should be redirect to the search results page and see retains Company should not have any offices in the selected City HQ or Regional")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyShouldNotHaveAnyOfficesInTheSelectedCityHQOrRegional() {
//        criteriaSearchLogic.ValidateHqCityResults();
//    }
//
//    @Then("I should be redirect to the search results page and see retains City should match the input exactly")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCityShouldMatchTheInputExactly() {
//        criteriaSearchLogic.ValidateHqCityResults();
//    }
//
//    @When("I select exact")
//    public void iSelectExact() {
//        criteriaSearchLogic.clickOnExactOptionOnCity();
//    }
//
//    @When("I select HQ Only, Exact at the same time")
//    public void iSelectHQOnlyExactAtTheSameTime() {
//        criteriaSearchLogic.clickOnExactAndHQOptionOnCity();
//    }
//
//    @Then("I should be redirect to the search results page and see retains Company should be headquartered in exactly the inputted city")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyShouldBeHeadquarteredInExactlyTheInputtedCity() {
//        criteriaSearchLogic.ValidateHqCityResults();
//    }
//
//    @Then("I should be redirect to the search results page and see retains Company should not be headquarterd in inputted city")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyShouldNotBeHeadquarterdInInputtedCity() {
//        criteriaSearchLogic.ValidateHqCityResults();
//    }
//
//    @When("I select HQ only, exclude, Exact at the same time")
//    public void iSelectHQOnlyExcludeExactAtTheSameTime() {
//        criteriaSearchLogic.clickOnExactAndHQAndExcludeOptionOnCity();
//    }
//
//    @Then("I should be redirect to the search results page and see retains Company should not have be headquartered in exactly the selected city")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyShouldNotHaveBeHeadquarteredInExactlyTheSelectedCity() {
//        criteriaSearchLogic.ValidateHqCityResults();
//    }
//
//    @When("I select Remove link")
//    public void iSelectRemoveLink() {
//        criteriaSearchLogic.clickOnRemoveLinkOptionOnCity();
//    }
//
//    @And("I click on Exclude Saved Company Records toggle")
//    public void iClickOnExcludeSavedCompanyRecordsToggle() {
//        criteriaSearchLogic.clickOnExcludeSavedCompanyRecordsToggle();
//    }
//
//    @And("I click on x button")
//    public void iClickOnXButton() {
//        criteriaSearchLogic.clickOnXButtonExcludeSavedCompanyRecords();
//    }
//
//    @And("I select Minimum and maximum value Contacts")
//    public void iSelectMinimumAndMaximumValueContacts() {
//        criteriaSearchLogic.SelectValueFromSlideBar();
//    }
//
//    @And("I should see Property Count appear on the right search bar with correct min & max value as selected")
//    public void iShouldSeePropertyCountAppearOnTheRightSearchBarWithCorrectMinMaxValueAsSelected() {
//        criteriaSearchLogic.ValidateSlideBarResults();
//    }
//
//    @And("I should see Contact Count appear on the right search bar with correct min & max value as selected")
//    public void iShouldSeeContactCountAppearOnTheRightSearchBarWithCorrectMinMaxValueAsSelected() {
//        criteriaSearchLogic.ValidateSlideBarResults();
//    }
//    @And("I select Minimum value Contacts")
//    public void iSelectMinimumValueContacts() {
//        criteriaSearchLogic.SelectMinValueFromSlideBar();
//    }
//    @And("I select Minimum value Properties")
//    public void iSelectMinimumValueProperties() {
//        criteriaSearchLogic.SelectMinValueFromSlideBarProperty();
//    }
//
//    @And("I click on sort arrow")
//    public void iClickOnSortArrow() {
//        criteriaSearchLogic.clickOnSortArrow();
//    }
//
//    @Then("I should be redirect to the search results page and see retains company Contact count has the minimum value selected")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyContactCountHasTheMinimumValueSelected() {
//        criteriaSearchLogic.ValidateSortSlideBarMinimumValueResults();
//    }
//
//    @And("I Enter a minimum value inside the minimum field")
//    public void iEnterAMinimumValueInsideTheMinimumField() {
//        criteriaSearchLogic.TypeMinimumValueInMinField();
//    }
//
//    @And("I select Maximum value Contacts")
//    public void iSelectMaximumValueContacts() {
//        criteriaSearchLogic.SelectMaxValueFromSlideBar();
//    }
//
//    @And("I click on sort arrow twice")
//    public void iClickOnSortArrowTwice() {
//        criteriaSearchLogic.clickOnSortMaxValueArrow();
//    }
//
//    @And("I Enter a maximum value")
//    public void iEnterAMaximumValue() {
//        criteriaSearchLogic.TypeMaximumValueInMinField();
//    }
//
//    @And("I select Maximum value for property Contacts")
//    public void iSelectMaximumValueForPropertyContacts() {
//        criteriaSearchLogic.SelectMaxValueFromPropertyCountSlideBar();
//    }
//
//    @Then("I should be redirect to the search results page and see retains company Property count has the maximum value selected")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyPropertyCountHasTheMaximumValueSelected() {
//        criteriaSearchLogic.ValidateSortSlideBarMinimumValueResults();
//    }
//
//    @And("I Enter a maximum value to maximum field")
//    public void iEnterAMaximumValueToMaximumField() {
//        criteriaSearchLogic.TypeMaximumValueInMaxField();
//    }
//
//    @And("I Enter a Minimum value to the mininmum Contacts")
//    public void iEnterAMinimumValueToTheMininmumContacts() {
//        criteriaSearchLogic.TypeMinimumValueInMInField();
//    }
//
//    @When("I Click on clear button")
//    public void iClickOnClearButton() {
//        criteriaSearchLogic.clickOnClearButton();
//    }
//
//    @Then("I should see the Property Count appear on the right search bar is disappeared")
//    public void iShouldSeeThePropertyCountAppearOnTheRightSearchBarIsDisappeared() throws InterruptedException {
//        criteriaSearchLogic.ValidateSearchIconAppear();}
//
//    @When("I click on criteria Search again")
//    public void iClickOnCriteriaSearchAgain() {
//        criteriaSearchLogic.clickOnCriteriaTabagain();
//    }
//
//    @When("I click on New Search button")
//    public void iClickOnNewSearchButton() {
//        criteriaSearchLogic.clickOnNewSearchButton();
//    }
//
//    @Then("I should be redirected to the Criteria Search Tab")
//    public void iShouldBeRedirectedToTheCriteriaSearchTab() {
//        criteriaSearchLogic.ValidateCriteriaSearchTab();
//    }
//
//    @And("I should see notification {string}")
//    public void iShouldSeeNotification(String message) throws InterruptedException {
//        criteriaSearchLogic.ValidateNotificationMessage(message);
//    }
//
//    @And("I click the plus button in city Field")
//    public void iClickThePlusButtonInCityField() {
//        criteriaSearchLogic.clickOnPlusSignInCityField();
//    }
//
//    @Then("I Select Person in criteria search menu")
//    public void iSelectPersonInCriteriaSearchMenu() throws InterruptedException {
//        criteriaSearchLogic.clickOnPersonTab();
//    }
//
//    @And("I type  any People name in People Names field")
//    public void iTypeAnyPeopleNameInPeopleNamesField() {
//        criteriaSearchLogic.typeAnyPersonName();
//    }
//
//    @And("I click on the three dots")
//    public void iClickOnTheThreeDots() {
//        criteriaSearchLogic.clickOnThreeDotsForPerson();
//    }
//
//    @When("I Click search people button")
//    public void iClickSearchPeopleButton() {
//        criteriaSearchLogic.clickOnPeopleButton();
//    }
//
//
//    @And("I click the plus button in Person")
//    public void iClickThePlusButtonInPerson() {
//        criteriaSearchLogic.clickOnPeoplePlusButton();
//    }
//
//    @And("I select exact for Person")
//    public void iSelectExactForPerson() {
//        criteriaSearchLogic.clickOnPeopleExactOption();
//    }
//
//    @Then("I should be redirect to the search results page and Results should not have the input phrase in them")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldNotHaveTheInputPhraseInThem() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsNotContains();
//    }
//
//    @And("I select exclude for Person")
//    public void iSelectExcludeForPerson() {
//        criteriaSearchLogic.clickOnPeopleExcludeOption();
//    }
//
//    @Then("I should see the name value is disappeared")
//    public void iShouldSeeTheNameValueIsDisappeared() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @And("I select Remove link for Person")
//    public void iSelectRemoveLinkForPerson() {
//        criteriaSearchLogic.clickOnRemoveLinkForPeople();
//    }
//
//    @And("I type  any Job Titles in people Job Titles field")
//    public void iTypeAnyJobTitlesInPeopleJobTitlesField() {
//        criteriaSearchLogic.typeAnyJobTitlesInPeople();
//    }
//
//    @And("I click the plus button in job title")
//    public void iClickThePlusButtonInJobTitle() {
//        criteriaSearchLogic.clickOnPlusSignForJobTitles();
//    }
//
//    @And("I select exact in job title")
//    public void iSelectExactInJobTitle() {
//        criteriaSearchLogic.clickOnPlusSignForJobTitlesExact();
//    }
//
//    @Then("I should be redirect to the search results page and Results should be exactly matched to the input People name")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldBeExactlyMatchedToTheInputPeopleName() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResults();
//    }
//
//    @Then("I should be redirect to the search results page and Results should be exactly matched to the input Job Titles")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldBeExactlyMatchedToTheInputJobTitles() {
//        criteriaSearchLogic.ValidatePeopleJobTitlesSearchResults();
//    }
//
//    @And("I select exclude in job title")
//    public void iSelectExcludeInJobTitle() {
//        criteriaSearchLogic.clickOnExcludeJobTitles();
//    }
//
//    @And("I select Remove link in job title")
//    public void iSelectRemoveLinkInJobTitle() {
//        criteriaSearchLogic.clickOnRemoveLinkJobTitles();
//    }
//
//    @Then("I should see the People Job Title value is disappeared")
//    public void iShouldSeeThePeopleJobTitleValueIsDisappeared() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @And("I click the plus sign beside Executive")
//    public void iClickThePlusSignBesideExecutive() {
//        criteriaSearchLogic.clickOnPlusSignBesideExecutive();
//    }
//
//    @And("I select Chairman from Executive from People Senioritis")
//    public void iSelectChairmanFromExecutiveFromPeopleSenioritis() {
//        criteriaSearchLogic.clickOnFirstOptionExecutive();
//    }
//
//    @And("I should see the selected seniority in the right side panel")
//    public void iShouldSeeTheSelectedSeniorityInTheRightSidePanel() throws InterruptedException {
//        criteriaSearchLogic.ValidatePeopleSenioritySearchResults();
//    }
//
//    @Then("I should be redirect to the search results page and Results should be exactly matched to the input Seniority")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldBeExactlyMatchedToTheInputSeniority() {
//        criteriaSearchLogic.ValidatePeopleSeniorityResults();
//    }
//
//    @And("I select exact for Seniority")
//    public void iSelectExactForSeniority() {
//        criteriaSearchLogic.clickOnExactSeniority();
//    }
//
//    @Then("I should be redirect to the search results page and Results should be exactly matched to the input not contain senirity")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldBeExactlyMatchedToTheInputNotContainSenirity() {
//        criteriaSearchLogic.ValidatePeopleSenioritySearchResultsNotContains();
//    }
//
//    @And("I select Remove Link in Seniority")
//    public void iSelectRemoveLinkInSeniority() {
//        criteriaSearchLogic.clickOnRemoveLinkPeopleSeniority();
//    }
//
//    @Then("I should see the People Seniorities value is disappeared")
//    public void iShouldSeeThePeopleSenioritiesValueIsDisappeared() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @And("I select Affordable Housing from People Asset Experiences")
//    public void iSelectAffordableHousingFromPeopleAssetExperiences() {
//        criteriaSearchLogic.clickOnPeopleAssetExperiences();
//    }
//
//    @Then("I should be redirect to the search results page and People should be only the input asset")
//    public void iShouldBeRedirectToTheSearchResultsPageAndPeopleShouldBeOnlyTheInputAsset() {
//        criteriaSearchLogic.ValidatePeopleAssetExperiencesResults();
//    }
//
//    @Then("I should be redirect to the search results page and Results should not contain people with the selected seniority")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldNotContainPeopleWithTheSelectedSeniority() {
//        criteriaSearchLogic.ValidatePeopleAssetExperiencesResultsNotContains();
//    }
//
//    @When("I select Remove Link in Asset Experiences")
//    public void iSelectRemoveLinkInAssetExperiences() {
//        criteriaSearchLogic.clickOnPeopleAssetExperiencesRemoveLink();
//    }
//
//    @Then("I should see the Asset Experiences value is disappeared")
//    public void iShouldSeeTheAssetExperiencesValueIsDisappeared() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @And("I click on plus sign beside Midwest")
//    public void iClickOnPlusSignBesideMidwest() {
//        criteriaSearchLogic.clickOnPeopleStatesPlusSign();
//    }
//
//    @And("I select Illinois from  Midwest in people state")
//    public void iSelectIllinoisFromMidwestInPeopleState() {
//        criteriaSearchLogic.clickOnPeopleIllinoisState();
//    }
//
//    @And("I should see the selected state in the right side panel")
//    public void iShouldSeeTheSelectedStateInTheRightSidePanel() {
//        criteriaSearchLogic.ValidatePeopleIllinoisStateResults();
//    }
//
//    @Then("I should be redirect to the search results page and Results should contain people with the selected state exact")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldContainPeopleWithTheSelectedStateExact() {
//        criteriaSearchLogic.ValidatePeopleIllinoisStateResultsResults();
//    }
//
//    @And("I select exclude in people state")
//    public void iSelectExcludeInPeopleState() {
//        criteriaSearchLogic.clickOnPeopleIllinoisStateExclude();
//    }
//
//    @Then("I should be redirect to the search results page and Results should not contain people with the selected state")
//    public void iShouldBeRedirectToTheSearchResultsPageAndResultsShouldNotContainPeopleWithTheSelectedState() {
//        criteriaSearchLogic.ValidatePeopleIllinoisStateResultsResults();
//    }
//
//    @When("I select Remove Link in people state")
//    public void iSelectRemoveLinkInPeopleState() {
//        criteriaSearchLogic.clickOnPeopleIllinoisStateRemoveLink();
//    }
//
//    @Then("I should see the People State value is disappeared")
//    public void iShouldSeeThePeopleStateValueIsDisappeared() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @And("I type any city in People Cities")
//    public void iTypeAnyCityInPeopleCities() {
//        criteriaSearchLogic.typeAnyPeopleCitiesField();
//    }
//
//    @And("I click on plus sign")
//    public void iClickOnPlusSign() {
//        criteriaSearchLogic.clickOnPeopleCitiesPlusSign();
//    }
//
//    @And("I should see the selected city in the right side panel")
//    public void iShouldSeeTheSelectedCityInTheRightSidePanel() {
//        criteriaSearchLogic.ValidatePeopleCitiesResults();
//    }
//
//    @And("I select Exact in People Cities")
//    public void iSelectExactInPeopleCities() {
//        criteriaSearchLogic.clickOnPeopleCitiesExact();
//    }
//
//    @Then("I should be redirect to the search results page and City should match the input exactly")
//    public void iShouldBeRedirectToTheSearchResultsPageAndCityShouldMatchTheInputExactly() {
//        criteriaSearchLogic.ValidatePeopleCitiesExactResults();
//    }
//
//    @Then("I should be redirect to the search results page and People should not be based in the selected City")
//    public void iShouldBeRedirectToTheSearchResultsPageAndPeopleShouldNotBeBasedInTheSelectedCity() {
//        criteriaSearchLogic.ValidatePeopleCitiesResultNotContains();
//    }
//
//    @When("I select Remove Link in People Cities")
//    public void iSelectRemoveLinkInPeopleCities() {
//        criteriaSearchLogic.clickOnRemoveLinkPeopleCities();
//    }
//
//    @Then("I should see the People Cities value is disappeared")
//    public void iShouldSeeThePeopleCitiesValueIsDisappeared() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @And("I click on Exclude Saved People Records toggle")
//    public void iClickOnExcludeSavedPeopleRecordsToggle() {
//        criteriaSearchLogic.clickOnExcludeSavedPeopleRecordsToggle();
//    }
//
//    @When("I Click on X Icon")
//    public void iClickOnXIcon() {
//        criteriaSearchLogic.clickOnXIconExcludeSavedPeopleRecordsToggle();
//    }
//
//    @Then("I should see the People List value is disappeared")
//    public void iShouldSeeThePeopleListValueIsDisappeared() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @Then("I should see the company name remove from criteria search")
//    public void iShouldSeeTheCompanyNameRemoveFromCriteriaSearch() {
//        criteriaSearchLogic.ValidatePeopleNameSearchResultsDisappear();
//    }
//
//    @Then("I should be redirect to the search results page and see retains selected criteria city {string}")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsSelectedCriteriaCity(String text) {
//        criteriaSearchLogic.ValidatePeopleStatesExactResults(text);
//    }
//
//    @When("I select exclude city")
//    public void iSelectExcludeCity() {
//        criteriaSearchLogic.clickOnExcludeState();
//    }
//
//    @When("I select HQ Only city")
//    public void iSelectHQOnlyCity() {
//        criteriaSearchLogic.clickOnHQOnly();
//    }
//
//    @Then("I should be redirect to the search results page and see retains Companies should not be headquarted in the selected state {string}")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompaniesShouldNotBeHeadquartedInTheSelectedState(String text) {
//        criteriaSearchLogic.ValidatePeopleCitiesResultNotContainsState(text);
//    }
//
//    @Then("I should be redirect to the search results page and see retains Company should be in the selected City {string}")
//    public void iShouldBeRedirectToTheSearchResultsPageAndSeeRetainsCompanyShouldBeInTheSelectedCity(String text) {
//        criteriaSearchLogic.ValidatePeopleCitiesExactResults(text);
//    }
//
//    @When("I select exact for city")
//    public void iSelectExactForCity() {
//        criteriaSearchLogic.clickOnExactOptionInCity();
//    }
//
//
//
//    //##############   Keyword Functionality  ############################
//    @When("I click on Admin Menu")
//    public void iClickOnAdminMenu() throws InterruptedException {
//
//        criteriaSearchLogic.iClickOnAdminMenu();
//    }
//
//    @Then("I Select Feature Management from drop down list")
//    public void iSelectFeatureManagementFromDropDownList() throws InterruptedException {
//        criteriaSearchLogic.iClickOnAdminMenu();
//    }
//
//    @And("I click on Activate link for company-keyword-search-controls")
//    public void iClickOnActivateLinkForCompanyKeywordSearchControls() throws InterruptedException {
//        criteriaSearchLogic.clickOnActivateLinkForCompanyKeywordSearchControls();
//    }
//
//    @And("I click on Edit link")
//    public void iClickOnEditLink() throws InterruptedException {
//        criteriaSearchLogic.clickOnEditLink();
//    }
//
//    @Then("I should see Edit Feature Flags pop up")
//    public void iShouldSeeEditFeatureFlagsPopUp() throws InterruptedException {
//        criteriaSearchLogic.validateEditFeatureFlagsPopUp();
//    }
//
//    @And("I type any user name in Edit Feature Flags field {string}")
//    public void iTypeAnyUserNameInEditFeatureFlagsField(String text) throws InterruptedException {
//        criteriaSearchLogic.typeAnyUserNameInEditFeatureFlagsField(text);
//    }
//
//
//    @And("I should see the user is displaying in All Users section {string}")
//    public void iShouldSeeTheUserIsDisplayingInAllUsersSection(String text) throws InterruptedException {
//        criteriaSearchLogic.validateTheUserIsDisplayingInAllUsersSection(text);
//    }
//
//    @When("I click on the check box beside the user")
//    public void iClickOnTheCheckBoxBesideTheUser() {
//        criteriaSearchLogic.clickOnTheCheckBoxBesideTheUser();
//    }
//
//    @Then("I should see the user added to the Selected Users section {string}")
//    public void iShouldSeeTheUserAddedToTheSelectedUsersSection(String text) throws InterruptedException {
//        criteriaSearchLogic.validateTheUserAddedToTheSelectedUsersSection(text);
//    }
//
//    @And("I click Save button")
//    public void iClickSaveButton() throws InterruptedException {
//        criteriaSearchLogic.clickSaveButton();
//    }
//
//    @Then("I should see the A new free text field should be accessible on the criteria search page")
//    public void iShouldSeeTheANewFreeTextFieldShouldBeAccessibleOnTheCriteriaSearchPage() throws InterruptedException {
//        criteriaSearchLogic.validateTheANewFreeTextFieldShouldBeAccessibleOnTheCriteriaSearchPage();
//    }
//
//    @When("I click on Search menu")
//    public void iClickOnSearchMenu() {
//        criteriaSearchLogic.clickOnSearchMenu();
//    }
//
//    @Then("I should be redirected to the Feature Management page")
//    public void iShouldBeRedirectedToTheFeatureManagementPage() throws InterruptedException {
//        criteriaSearchLogic.validateRedirectedToTheFeatureManagementPage();
//    }
//
//    @When("I click on Edit link again")
//    public void iClickOnEditLinkAgain() throws InterruptedException {
//        criteriaSearchLogic.clickOnEditLink();
//    }
//
//    @And("I should see the user not added to the Selected Users section {string}")
//    public void iShouldSeeTheUserNotAddedToTheSelectedUsersSection(String text) {
//        criteriaSearchLogic.validateTheUserNotAddedToTheSelectedUsersSection(text);
//    }
//
//    @And("I leave the company keyword empty")
//    public void iLeaveTheCompanyKeywordEmpty() throws InterruptedException {
//        criteriaSearchLogic.leaveTheCompanyKeywordEmpty();
//    }
//
//    @Then("I should see the Company Keywords & Company Keywords Context is disabled")
//    public void iShouldSeeTheCompanyKeywordsCompanyKeywordsContextIsDisabled() {
//        criteriaSearchLogic.validateTheCompanyKeywordsCompanyKeywordsContextIsDisabled();
//    }
//
//    @Then("I should see the kewyword field is removed from criteria search page")
//    public void iShouldSeeTheKewywordFieldIsRemovedFromCriteriaSearchPage() {
//        criteriaSearchLogic.validateTheKewywordFieldIsRemovedFromCriteriaSearchPage();
//
//    }
//
//    @And("I click on Cancel button on Edit Feature popup")
//    public void iClickOnCancelButtonOnEditFeaturePopup() {
//        criteriaSearchLogic.clickOnCancelButtonOnEditFeaturePopup();
//    }
//
//    @And("I type in any word into Company Keyword field {string}")
//    public void iTypeInAnyWordIntoCompanyKeywordField(String text) throws InterruptedException {
//        criteriaSearchLogic.typeInAnyWordIntoCompanyKeywordField(text);
//    }
//
//    @Then("I should see the recent keywords searched should appear below the search bar {string}")
//    public void iShouldSeeTheRecentKeywordsSearchedShouldAppearBelowTheSearchBar(String text) throws InterruptedException {
//        criteriaSearchLogic.validateTheRecentKeywordsSearchedShouldAppearBelowTheSearchBar(text);
//    }
//
//    @And("I should see A new column Company Keywords should be added to the search results page contains the search keyword")
//    public void iShouldSeeANewColumnCompanyKeywordsShouldBeAddedToTheSearchResultsPageContainsTheSearchKeyword() throws InterruptedException {
//        criteriaSearchLogic.validateNewColumnCompanyKeywords();
//    }
//
//    @And("I should see A new column Company Keywords Context should be added to the search results page")
//    public void iShouldSeeANewColumnCompanyKeywordsContextShouldBeAddedToTheSearchResultsPage() throws InterruptedException {
//        criteriaSearchLogic.iShouldSeeANewColumnCompanyKeywordsContext();
//    }
//
//    @And("I click on selection box beside Company Keywords column")
//    public void iClickOnSelectionBoxBesideCompanyKeywordsColumn() throws InterruptedException {
//        criteriaSearchLogic.clickOnSelectionBoxBesideCompanyKeywordsColumn();
//    }
//
//    @And("I should see the Company Keywords column removed from the company details page")
//    public void iShouldSeeTheCompanyKeywordsColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
//        criteriaSearchLogic.ShouldSeeTheCompanyKeywordColumnRemovedFromTheCompanyDetailsPage();
//    }
//
//    @And("I click on selection box beside Company Keywords Context column")
//    public void iClickOnSelectionBoxBesideCompanyKeywordsContextColumn() throws InterruptedException {
//        criteriaSearchLogic.clickOnSelectionBoxBesideCompanyKeywordsContextColumn();
//    }
//
//    @And("I click on plus sign for Company Keyword field")
//    public void iClickOnPlusSignForCompanyKeywordField() throws InterruptedException {
//        criteriaSearchLogic.clickOnPlusSignForCompanyKeywordField();
//    }
//
//    @And("I should see the Company Keywords Context column removed from the company details page")
//    public void iShouldSeeTheCompanyKeywordsContextColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
//        criteriaSearchLogic.ShouldSeeTheCompanyKeywordContextColumnRemovedFromTheCompanyDetailsPage();
//    }
//
//    @And("I should see the Company Keywords removed from the company details page")
//    public void iShouldSeeTheCompanyKeywordsRemovedFromTheCompanyDetailsPage() throws InterruptedException {
//        criteriaSearchLogic.ShouldSeeTheCompanyKeywordColumnRemovedFromTheCompanyDetailsPage();
//    }
//
//    @And("I should see A new column Company Keywords should be added to the search results page contains the search keyword {string}")
//    public void iShouldSeeANewColumnCompanyKeywordsShouldBeAddedToTheSearchResultsPageContainsTheSearchKeyword(String text) throws InterruptedException {
//        criteriaSearchLogic.validateColumnCompanyKeywordsContainsTheSearchKeyword(text);
//    }
//
//    @And("I click on the keyword search under company Keywords Field")
//    public void iClickOnTheKeywordSearchUnderCompanyKeywordsField() throws InterruptedException {
//        criteriaSearchLogic.clickOnTheKeywordSearchUnderCompanyKeywordsField();
//    }
//
//    @When("I click on The hide link beside Company Keywords column on company details page")
//    public void iClickOnTheHideLinkBesideCompanyKeywordsColumnOnCompanyDetailsPage() throws InterruptedException {
//        criteriaSearchLogic.ClickOnTheHideLinkBesideCompanyKeywordColumnOnCompanyDetailsPage();
//    }
//
//    @When("I click on The hide link beside Company Keywords context column on company details page")
//    public void iClickOnTheHideLinkBesideCompanyKeywordsContextColumnOnCompanyDetailsPage() throws InterruptedException {
//        criteriaSearchLogic.ClickOnTheHideLinkBesideCompanyKeywordContextColumnOnCompanyDetailsPage();
//    }
//
//    @And("I click on any value in Company Keywords Context column")
//    public void iClickOnAnyValueInCompanyKeywordsContextColumn() throws InterruptedException {
//        criteriaSearchLogic.clickOnAnyValueInCompanyKeywordsContextColumn();
//    }
//
//    @Then("I should see Company Keywords Search Details pop up display")
//    public void iShouldSeeCompanyKeywordsSearchDetailsPopUpDisplay() throws InterruptedException {
//        criteriaSearchLogic.validateCompanyKeywordsSearchDetailsPopUpDisplay();
//    }
//
//    @And("I should see the keywords and their context for the selected company displayed")
//    public void iShouldSeeTheKeywordsAndTheirContextForTheSelectedCompanyDisplayed() throws InterruptedException {
//        criteriaSearchLogic.validateTheKeywordsAndTheirContextForTheSelectedCompanyDisplayed();
//    }
//
//    @When("I click on any Snippet Link")
//    public void iClickOnAnySnippetLink() throws InterruptedException {
//        criteriaSearchLogic.clickOnAnySnippetLink();
//    }
//
//    @Then("I should be redirect to the correct page")
//    public void iShouldBeRedirectToTheCorrectPage() {
//        criteriaSearchLogic.validateRedirectToTheCorrectPage();
//    }
//
//    @And("I should see the Keyword columns contains the keywords that were found without any empty value")
//    public void iShouldSeeTheKeywordColumnsContainsTheKeywordsThatWereFoundWithoutAnyEmptyValue() {
//        criteriaSearchLogic.validateNoEmptyValue();
//    }
//
//    @And("I should see the Keywords column are sorted by keyword")
//    public void iShouldSeeTheKeywordsColumnAreSortedByKeyword() {
//        criteriaSearchLogic.validateKeywordsColumnAreSortedByKeyword();
//    }
//
//    @When("I click on close button Pop Up")
//    public void iClickOnCloseButtonPopUp() throws InterruptedException {
//        criteriaSearchLogic.clickOnCloseButtonPopUp();
//    }
//
//    @And("I should see A new column Company Keywords should be added to the search results page contains the search keyword {string},{string},{string}")
//    public void iShouldSeeANewColumnCompanyKeywordsShouldBeAddedToTheSearchResultsPageContainsTheSearchKeyword(String text1, String text2, String text3) throws InterruptedException {
//        criteriaSearchLogic.validateColumnCompanyKeywordsContainsTheSearchKeywordsSeprated(text1,text2,text3);
//    }
//}
