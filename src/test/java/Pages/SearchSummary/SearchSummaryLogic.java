package Pages.SearchSummary;

import org.openqa.selenium.interactions.Actions;

public class SearchSummaryLogic extends SearchSummaryPO {
    public SearchSummaryLogic() {
        super();
    }

    public void clickOnXIconOnSearchSummaryPanel() {
        clickOnElement(CloseIconOnSearchSummaryPanel);
    }

    public void validateSearchSummaryPanelClosed() {
        assertIfTrue(SearchResultsPanel.getSize().equals(0));

    }

    public void clickOnTheSearchSummaryIconOnTheLeftSidePanel() {
        clickOnElement(SearchPanelIcon);
    }

    public void ValidateCompanyResultsPanel() {
        waitForVisibility(SearchResultsPanel,20);
        assertDisplayed(SearchResultsPanel);
    }

    public void clickOnMinusIconOnSearchSummaryPanelForSeniorityTab() {
        clickOnElement(SeniorityTap);
    }

    public void validateSeniorityTabCollapsed() {
        String styleAttributeValue = SeniorityTap.getAttribute("style");
        assertIfFalse((styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnMinusIconOnSearchSummaryPanelForLocationTab() {
        clickOnElement(LocationTap);
    }

    public void validateLocationTabCollapsed() {
        String styleAttributeValue = LocationTap.getAttribute("style");
        assertIfFalse((styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnMinusIconOnSearchSummaryPanelForPersonAssetExperienceTab() {
        clickOnElement(PersonAssetExperienceTap);
    }

    public void validatePersonAssetExperienceTabCollapsed() {
        String styleAttributeValue = PersonAssetExperienceTap.getAttribute("style");
        assertIfFalse((styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnPlusIconOnSearchSummaryPanelForSeniorityTab() {
        clickOnElement(SeniorityTap);
    }

    public void validateSeniorityTabExpanded() {
        String styleAttributeValue = SeniorityTap.getAttribute("style");
        assertIfTrue(!(styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void validateLocationTabExpanded() {
        String styleAttributeValue = LocationTap.getAttribute("style");
        assertIfTrue(!(styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnIconOnSearchSummaryPanelForPersonAssetExperienceTab() {
        clickOnElement(PersonAssetExperienceTap);
    }

    public void validateAssetExperienceTapExpanded() {
        String styleAttributeValue = PersonAssetExperienceTap.getAttribute("style");
        assertIfTrue(!(styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnIconOnSearchSummaryPanelForCompanyIndustriesTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyIndustriesTab);
    }

    public void validateCompanyIndustriesTabCollapsed() {
        String styleAttributeValue = CompanyIndustriesTab.getAttribute("style");
        assertIfFalse((styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnIconOnSearchSummaryPanelForCompanyAssetExperienceTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyAssetExperienceTab);
    }
    public void validateCompanyAssetExperienceTabCollapsed() {
        String styleAttributeValue = CompanyAssetExperienceTab.getAttribute("style");
        assertIfFalse((styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnIconOnSearchSummaryPanelForCompanyHeadquartersTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyHeadquartersTab);
    }

    public void validateCompanyHeadquartersTabCollapsed() {
        String styleAttributeValue = CompanyHeadquartersTab.getAttribute("style");
        assertIfFalse((styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnIconOnSearchSummaryPanelForCompanyRegionalOfficesTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyRegionalOfficesTab);
    }

    public void validateCompanyRegionalOfficesTabCollapsed() {
        String styleAttributeValue = CompanyRegionalOfficesTab.getAttribute("style");
        assertIfFalse((styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnPlusIconOnSearchSummaryPanelForCompanyIndustriesTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyIndustriesTab);
    }

    public void validateCompanyIndustriesTabExpanded() {
        String styleAttributeValue = CompanyIndustriesTab.getAttribute("style");
        assertIfTrue(!(styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnPlusIconOnSearchSummaryPanelForCompanyAssetExperienceTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyAssetExperienceTab);
    }

    public void validateCompanyAssetExperienceTabExpanded() {
        String styleAttributeValue = CompanyAssetExperienceTab.getAttribute("style");
        assertIfTrue(!(styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnPlusIconOnSearchSummaryPanelForCompanyHeadquartersTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyHeadquartersTab);
    }

    public void validateCompanyHeadquartersTabExpanded() {
        String styleAttributeValue = CompanyHeadquartersTab.getAttribute("style");
        assertIfTrue(!(styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }

    public void clickOnPlusIconOnSearchSummaryPanelForCompanyRegionalOfficesTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(CompanyRegionalOfficesTab);
    }

    public void validateCompanyRegionalOfficesTabExpanded() {
        String styleAttributeValue = CompanyRegionalOfficesTab.getAttribute("style");
        assertIfTrue(!(styleAttributeValue != null && styleAttributeValue.contains("display: none;")));
    }
    public void clickOnSettingsIconForCompanyIndustriesInSearchSummaryPanel() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(SettingsIcon.get(0));
    }

    public void iShouldSeeADropDownListForCharts() throws InterruptedException {
      Thread.sleep(500);
        assertDisplayed(SettingsDropDownList);
    }
    public void clickOnCopyChart() throws InterruptedException {
        Thread.sleep(500);
        Actions act = new Actions(driver);
        act.doubleClick(CopyChartButton).perform();
    }

    public void clickOnSettingsIconForCompanyAssetExperienceInSearchSummaryPanel() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SettingsIcon.get(1));
    }

    public void clickOnSettingsIconForCompanyRegionalOfficesInSearchSummaryPanel() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SettingsIcon.get(2));
    }

    public void clickOnSettingsIconForCompanyHeadquartersInSearchSummaryPanel() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SettingsIcon.get(3));
    }

    public void clickOnSettingsIconForSeniorityInSearchSummaryPanel() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SettingsIcon.get(0));
    }

    public void clickOnSettingsIconForPersonAssetExperienceInSearchSummaryPanel() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SettingsIcon.get(1));
    }

    public void clickOnSettingsIconForLocationInSearchSummaryPanel() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(SettingsIcon.get(2));
    }
}
