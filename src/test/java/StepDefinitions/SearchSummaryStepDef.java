package StepDefinitions;

import Pages.SearchSummary.SearchSummaryLogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SearchSummaryStepDef {
    SearchSummaryLogic searchSummaryLogic = new SearchSummaryLogic();
    @When("I click on x icon on Search summary panel")
    public void iClickOnXIconOnSearchSummaryPanel() {
        searchSummaryLogic.clickOnXIconOnSearchSummaryPanel();
    }

    @Then("I should see the search summary panel closed")
    public void iShouldSeeTheSearchSummaryPanelClosed() {
        searchSummaryLogic.validateSearchSummaryPanelClosed();
    }

    @When("I click on the search summary icon on the left side panel")
    public void iClickOnTheSearchSummaryIconOnTheLeftSidePanel() {
        searchSummaryLogic.clickOnTheSearchSummaryIconOnTheLeftSidePanel();
    }

    @Then("I should see the search summary displaying again")
    public void iShouldSeeTheSearchSummaryDisplayingAgain() {
        searchSummaryLogic.ValidateCompanyResultsPanel();
    }

    @When("I click on minus icon on Search summary panel for Seniority tab")
    public void iClickOnMinusIconOnSearchSummaryPanelForSeniorityTab() {
        searchSummaryLogic.clickOnMinusIconOnSearchSummaryPanelForSeniorityTab();
    }

    @Then("I should see Seniority tab Collapsed")
    public void iShouldSeeSeniorityTabCollapsed() {
        searchSummaryLogic.validateSeniorityTabCollapsed();
    }

    @When("I click on minus icon on Search summary panel for Location tab")
    public void iClickOnMinusIconOnSearchSummaryPanelForLocationTab() {
        searchSummaryLogic.clickOnMinusIconOnSearchSummaryPanelForLocationTab();
    }

    @Then("I should see Location tab Collapsed")
    public void iShouldSeeLocationTabCollapsed() {
        searchSummaryLogic.validateLocationTabCollapsed();
    }

    @When("I click on minus icon on Search summary panel for Person Asset Experience tab")
    public void iClickOnMinusIconOnSearchSummaryPanelForPersonAssetExperienceTab() {
       searchSummaryLogic.clickOnMinusIconOnSearchSummaryPanelForPersonAssetExperienceTab();
    }

    @Then("I should see Person Asset Experience tab Collapsed")
    public void iShouldSeePersonAssetExperienceTabCollapsed() {
        searchSummaryLogic.validatePersonAssetExperienceTabCollapsed();
    }

    @When("I click on + icon on Search summary panel for Seniority tab")
    public void iClickOnIconOnSearchSummaryPanelForSeniorityTab() {
        searchSummaryLogic.clickOnPlusIconOnSearchSummaryPanelForSeniorityTab();
        
    }

    @Then("I should see Seniority tab Expanded and details display for Seniority results")
    public void iShouldSeeSeniorityTabExpandedAndDetailsDisplayForSeniorityResults() {
        searchSummaryLogic.validateSeniorityTabExpanded();

    }

    @When("I click on + icon on Search summary panel for Location tab")
    public void iClickOnIconOnSearchSummaryPanelForLocationTab() {
        searchSummaryLogic.clickOnMinusIconOnSearchSummaryPanelForLocationTab();
    }

    @Then("I should see Location tab Expanded and details display for location results")
    public void iShouldSeeLocationTabExpandedAndDetailsDisplayForLocationResults() {
        searchSummaryLogic.validateLocationTabExpanded();
    }

    @When("I click on + icon on Search summary panel for Person Asset Experience tab")
    public void iClickOnIconOnSearchSummaryPanelForPersonAssetExperienceTab() {
        searchSummaryLogic.clickOnIconOnSearchSummaryPanelForPersonAssetExperienceTab();
    }

    @Then("I should see Person Asset Experience tab Expanded and details display for Asset Experience results")
    public void iShouldSeePersonAssetExperienceTabExpandedAndDetailsDisplayForAssetExperienceResults() {
        searchSummaryLogic.validateAssetExperienceTapExpanded();
    }

    @When("I click on - icon on Search summary panel for Company Industries tab")
    public void iClickOnIconOnSearchSummaryPanelForCompanyIndustriesTab() throws InterruptedException {
        searchSummaryLogic.clickOnIconOnSearchSummaryPanelForCompanyIndustriesTab();
    }

    @Then("I should see Company Industries tab Collapsed")
    public void iShouldSeeCompanyIndustriesTabCollapsed() {
        searchSummaryLogic.validateCompanyIndustriesTabCollapsed();
    }

    @When("I click on - icon on Search summary panel for Company Asset Experience tab")
    public void iClickOnIconOnSearchSummaryPanelForCompanyAssetExperienceTab() throws InterruptedException {
        searchSummaryLogic.clickOnIconOnSearchSummaryPanelForCompanyAssetExperienceTab();
    }

    @Then("I should see Company Asset Experience tab Collapsed")
    public void iShouldSeeCompanyAssetExperienceTabCollapsed() {
        searchSummaryLogic.validateCompanyAssetExperienceTabCollapsed();
    }

    @When("I click on - icon on Search summary panel for Company Headquarters tab")
    public void iClickOnIconOnSearchSummaryPanelForCompanyHeadquartersTab() throws InterruptedException {
        searchSummaryLogic.clickOnIconOnSearchSummaryPanelForCompanyHeadquartersTab();
    }

    @Then("I should see Company Headquarters tab Collapsed")
    public void iShouldSeeCompanyHeadquartersTabCollapsed() {
        searchSummaryLogic.validateCompanyHeadquartersTabCollapsed();
    }

    @When("I click on - icon on Search summary panel for Company Regional Offices tab")
    public void iClickOnIconOnSearchSummaryPanelForCompanyRegionalOfficesTab() throws InterruptedException {
        searchSummaryLogic.clickOnIconOnSearchSummaryPanelForCompanyRegionalOfficesTab();
    }

    @Then("I should see Company Regional Offices tab Collapsed")
    public void iShouldSeeCompanyRegionalOfficesTabCollapsed() {
        searchSummaryLogic.validateCompanyRegionalOfficesTabCollapsed();
    }

    @When("I click on + icon on Search summary panel for Company Industries tab")
    public void iClickOnPlusIconOnSearchSummaryPanelForCompanyIndustriesTab() throws InterruptedException {
        searchSummaryLogic.clickOnPlusIconOnSearchSummaryPanelForCompanyIndustriesTab();
    }

    @Then("I should see Company Industries tab Expanded and the details display")
    public void iShouldSeeCompanyIndustriesTabExpandedAndTheDetailsDisplay() {
        searchSummaryLogic.validateCompanyIndustriesTabExpanded();
    }

    @When("I click on + icon on Search summary panel for Company Asset Experience tab")
    public void iClickOnPlusIconOnSearchSummaryPanelForCompanyAssetExperienceTab() throws InterruptedException {
        searchSummaryLogic.clickOnPlusIconOnSearchSummaryPanelForCompanyAssetExperienceTab();
    }

    @Then("I should see Company Asset Experience tab Expanded and the details display")
    public void iShouldSeeCompanyAssetExperienceTabExpandedAndTheDetailsDisplay() {
        searchSummaryLogic.validateCompanyAssetExperienceTabExpanded();
    }

    @When("I click on + icon on Search summary panel for Company Headquarters tab")
    public void clickOnPlusIconOnSearchSummaryPanelForCompanyHeadquartersTab() throws InterruptedException {
        searchSummaryLogic.clickOnPlusIconOnSearchSummaryPanelForCompanyHeadquartersTab();
    }

    @Then("I should see Company Headquarters tab Expanded and the details display")
    public void iShouldSeeCompanyHeadquartersTabExpandedAndTheDetailsDisplay() {
        searchSummaryLogic.validateCompanyHeadquartersTabExpanded();
    }

    @When("I click on + icon on Search summary panel for Company Regional Offices tab")
    public void iClickOnPlusIconOnSearchSummaryPanelForCompanyRegionalOfficesTab() throws InterruptedException {
        searchSummaryLogic.clickOnPlusIconOnSearchSummaryPanelForCompanyRegionalOfficesTab();
    }

    @Then("I should see Company Regional Offices tab Expanded and the details display")
    public void iShouldSeeCompanyRegionalOfficesTabExpandedAndTheDetailsDisplay() {
        searchSummaryLogic.validateCompanyRegionalOfficesTabExpanded();
    }

    @When("I click on Settings icon for Company Industries in Search summary panel")
    public void iClickOnSettingsIconForCompanyIndustriesInSearchSummaryPanel() throws InterruptedException {
        searchSummaryLogic.clickOnSettingsIconForCompanyIndustriesInSearchSummaryPanel();
    }

    @And("I should see a drop down list for charts")
    public void iShouldSeeADropDownListForCharts() throws InterruptedException {
        searchSummaryLogic.iShouldSeeADropDownListForCharts();
    }

    @And("I click on copy chart")
    public void iClickOnCopyChart() throws InterruptedException {
        searchSummaryLogic.clickOnCopyChart();
    }

    @When("I click on Settings icon for Company Asset Experience in Search summary panel")
    public void iClickOnSettingsIconForCompanyAssetExperienceInSearchSummaryPanel() throws InterruptedException {
        searchSummaryLogic.clickOnSettingsIconForCompanyAssetExperienceInSearchSummaryPanel();
    }

    @When("I click on Settings icon for Company Regional Offices in Search summary panel")
    public void iClickOnSettingsIconForCompanyRegionalOfficesInSearchSummaryPanel() throws InterruptedException {
        searchSummaryLogic.clickOnSettingsIconForCompanyRegionalOfficesInSearchSummaryPanel();
    }

    @When("I click on Settings icon for Company Headquarters In Search summary panel")
    public void iClickOnSettingsIconForCompanyHeadquartersInSearchSummaryPanel() throws InterruptedException {
        searchSummaryLogic.clickOnSettingsIconForCompanyHeadquartersInSearchSummaryPanel();
    }

    @When("I click on Settings icon for Seniority in Search summary panel")
    public void iClickOnSettingsIconForSeniorityInSearchSummaryPanel() throws InterruptedException {
        searchSummaryLogic.clickOnSettingsIconForSeniorityInSearchSummaryPanel();
    }

    @When("I click on Settings icon for Person Asset Experience in Search summary panel")
    public void iClickOnSettingsIconForPersonAssetExperienceInSearchSummaryPanel() throws InterruptedException {
        searchSummaryLogic.clickOnSettingsIconForPersonAssetExperienceInSearchSummaryPanel();
    }

    @When("I click on Settings icon for Location in Search summary panel")
    public void iClickOnSettingsIconForLocationInSearchSummaryPanel() throws InterruptedException {
        searchSummaryLogic.clickOnSettingsIconForLocationInSearchSummaryPanel();
    }
}
