package Pages.CompanyDetailsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class CompanyDetailsPageLogic extends CompanyDetailsPagePO {
    public CompanyDetailsPageLogic() {
        super();
    }

    public void SelectATheExactCompanyFromResult() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(ExactNameOnCompanyDirectory);
    }


    public void ClickOnValidateProfileIndexingLink() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(ValidateProfileIndexingLink);
    }

    public void ShouldSeeAMessage(String text) {
        waitForVisibility(SuccessMessageAfterClickingOnValidateProfileIndexingLink, 20);
        assertDisplayed(SuccessMessageAfterClickingOnValidateProfileIndexingLink);
    }


    public void ClickOnCompanyWebSite() throws InterruptedException {
        Thread.sleep(10000);
        waitForElementToAppear(CompanyURLOn10FederalProfile,20);
        clickOnElement(CompanyURLOn10FederalProfile);
        Thread.sleep(500);
    }


    public void ShouldBeRedirectedToTheCompanyProfile() throws InterruptedException {
        //VERIFY opening new tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        assertDisplayed(CompanyWebsiteOf10Federal);
        driver.switchTo().window(tabs.get(0));
    }

    public void ClickOnSelectionBoxBesideTheListsColumn() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(ListCheckbox);
        clickOnElement(CloseIconOnSearchPanel);

    }


    public void ShouldBeRedirectToTheSearchResultsPageOfCompany() throws InterruptedException {
        Thread.sleep(2000);
        assertDisplayed(CompanySearchResultsPage);
    }

    public boolean ShouldSeeTheListsColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        Thread.sleep(3000);
        int size=CompanyColumn.size();
        for(int i=2; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"saved_to_list\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnColumnsButtonOnCompanyDetailsPage() throws InterruptedException {
//        waitForVisibility(ColumnButtonOnCompanyDetailsPage, 50);
        waitForElementToAppear(ColumnButtonOnCompanyDetailsPage,50);
        clickOnElement(CloseIconOnSearchPanel);
        Thread.sleep(3000);
        clickOnElement(ColumnButtonOnCompanyDetailsPage);
        Thread.sleep(5000);
    }


    public void ClickOnSelectionBoxBesideTheListsColumnForCompany() throws InterruptedException {
         Thread.sleep(1000);
        clickOnElement(ListCheckbox);
    }

    public boolean ShouldSeeIndustryColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=3; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"industries\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }


    public void ClickOnSelectionBoxBesideIndustryColumnForCompany() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(ListCheckbox);
        Thread.sleep(3000);
        clickOnElement(IndustryCheckbox);

    }


    public void ClickOnSelectionBoxBesideAssetExperienceColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(IndustryCheckbox);
        clickOnElement(AssetExperienceCheckbox);
    }

    public boolean ShouldSeeAssetExperienceColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=4; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"asset_classes\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }


    public boolean ShouldSeePropertyCountColumnRemovedFromTheCompanyDetailsPage() throws InterruptedException {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=4; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"company_property_count\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesidePropertyCountColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(AssetExperienceCheckbox);
        clickOnElement(PropertyCountCheckbox);
    }

    public void ClickOnSelectionBoxBesideContactCountColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(PropertyCountCheckbox);
        clickOnElement(ContactCountCheckbox);
    }

    public boolean ShouldSeeContactCountColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=5; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"indexed_company_employment_size\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideHQCityColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ContactCountCheckbox);
        clickOnElement(HQCityCheckbox);
    }

    public boolean ShouldSeeHQCityColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=6; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"city\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideHQStateColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(HQCityCheckbox);
        clickOnElement(HQStateCheckbox);
    }

    public boolean ShouldSeeHQStateColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=7; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"region\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }

    }

    public void ClickOnSelectionBoxBesideCompanyLinkedInColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(HQStateCheckbox);
        clickOnElement(linkedinCheckbox);
    }

    public boolean ShouldSeeLinkedInColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateCheckbox.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=8; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"linkedin\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideWebSitesColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(linkedinCheckbox);
        clickOnElement(WebsiteCheckbox);
    }

    public boolean ShouldSeeWebSitesColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(PhoneNumberColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=9; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"company_urls\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesidePhoneColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(PhoneNumberCheckbox);
        clickOnElement(WebsiteCheckbox);
    }

    public boolean ShouldSeePhoneColumnRemovedFromTheCompanyDetailsPage() {
//        waitForVisibility(NameColumnInCompanySearchResult, 30);
//        assertIfTrue(NameColumnInCompanySearchResult.isDisplayed());
//        waitSeconds(30);
//        assertIfTrue(ListColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(IndustriesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(AssetClassesColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(CompanyPropertyCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(WebsiteColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(EmployeeCountColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQCityColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(HQStateColumnInCompanySearchResult.isDisplayed());
//        assertIfTrue(linkedinColumnInCompanySearchResult.isDisplayed());
        int size=CompanyColumn.size();
        for(int i=10; i<=size;i++){
            assertIfTrue(CompanyColumnName.get(i).isDisplayed());
        }
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"phone_numbers\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnTheHideLinkBesideListColumnOnCompanyDetailsPage() throws InterruptedException {
//        waitForVisibility(ListColumnInCompanySearchResult, 70);
//        clickOnElement(ListColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        goToElement(HideButtonOfListColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        int size= CompanyColumn.size();
        for(int i=1; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }


    }


    public void ClickOnHideLinkBesideTheIndustryColumnOnCompanyDetailsPage() throws InterruptedException {
//        waitForVisibility(IndustriesColumnInCompanySearchResult, 20);
//        clickOnElement(IndustriesColumnInCompanySearchResult);
        Thread.sleep(3000);
//        goToElement(HideButtonOfIndustryColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfIndustryColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
        int size= CompanyColumn.size();
        for(int i=2; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }


    public void ClickOnHideLinkBesideTheAssetExperienceColumn() throws InterruptedException {

//        waitForVisibility(AssetClassesColumnInCompanySearchResult, 20);
//        clickOnElement(AssetClassesColumnInCompanySearchResult);
        Thread.sleep(3000);
//        goToElement(HideButtonOfAssetExperienceColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfAssetExperienceColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(IndustryCheckbox);
        int size= CompanyColumn.size();
        for(int i=3; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }

    public void ClickOnHideLinkBesideThePropertyCountColumn() throws InterruptedException {
//way one:
//        Thread.sleep(3000);
//        waitForVisibility(CompanyPropertyCountColumnInCompanySearchResult, 20);
//        clickOnElement(CompanyPropertyCountColumnInCompanySearchResult);
        Thread.sleep(3000);
//        goToElement(HideButtonOfCompanyPropertyCountColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfCompanyPropertyCountColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(AssetExperienceCheckbox);

//second way

//        Thread.sleep(3500);
//        waitForVisibility(CloseIconOnSearchPanel, 20);
//        clickOnElement(CloseIconOnSearchPanel);
//        Thread.sleep(3500);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(CompanyPropertyCountColumnInCompanySearchResult);
//        Thread.sleep(3500);
//        clickOnElement(HideButtonOfCompanyPropertyCountColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(AssetExperienceCheckbox);

        int size= CompanyColumn.size();
        for(int i=3; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }


    public void ClickOnHideLinkBesideTheContactCountColumn() throws InterruptedException {

//        waitForVisibility(EmployeeCountColumnInCompanySearchResult, 20);
//        clickOnElement(EmployeeCountColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        goToElement(HideButtonOfCompanyEmployeeCountColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfCompanyEmployeeCountColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(PropertyCountCheckbox);

        //second way
//        Thread.sleep(3000);
//        waitForVisibility(CloseIconOnSearchPanel, 20);
//        clickOnElement(CloseIconOnSearchPanel);
        Thread.sleep(3000);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(AssetExperienceCheckbox);
//        //clickOnElement(PropertyCountCheckbox);
//        clickOnElement(EmployeeCountColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        clickOnElement(HideButtonOfCompanyEmployeeCountColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        //clickOnElement(ContactCountCheckbox);
        int size= CompanyColumn.size();
        for(int i=4; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }


    public void ClickOnHideLinkBesideTheHQCityColumn() throws InterruptedException {
//        waitForVisibility(HQCityColumnInCompanySearchResult, 20);
//        clickOnElement(HQCityColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        goToElement(HideButtonOfHQCityColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfHQCityColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ContactCountCheckbox);

        //second way
//        Thread.sleep(3000);
//        waitForVisibility(CloseIconOnSearchPanel, 20);
//        clickOnElement(CloseIconOnSearchPanel);
          Thread.sleep(3000);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        clickOnElement(HideButtonOfHQCityColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
        int size= CompanyColumn.size();
        for(int i=5; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }


    }

    public void ClickOnHideLinkBesideTheHQStateColumn() throws InterruptedException {

//        waitForVisibility(HQStateColumnInCompanySearchResult, 20);
//        clickOnElement(HQStateColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        goToElement(HideButtonOfHQStateColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfHQStateColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(HQCityCheckbox);

        //second way
//        Thread.sleep(3000);
//        waitForVisibility(CloseIconOnSearchPanel, 20);
//        clickOnElement(CloseIconOnSearchPanel);
          Thread.sleep(3000);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
//        clickOnElement(HQStateColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        clickOnElement(HideButtonOfHQStateColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
        int size= CompanyColumn.size();
        for(int i=6; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }

    public void ClickOnHideLinkBesideTheLinkedInColumn() throws InterruptedException {
//        waitForVisibility(linkedinColumnInCompanySearchResult, 20);
//        clickOnElement(linkedinColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        goToElement(HideButtonOfLinkedInColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfLinkedInColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(HQStateCheckbox);
//Second way
//        Thread.sleep(3000);
//        waitForVisibility(CloseIconOnSearchPanel, 20);
//        clickOnElement(CloseIconOnSearchPanel);
          Thread.sleep(3000);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
//        clickOnElement(HQStateCheckbox);
//        clickOnElement(linkedinColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        clickOnElement(HideButtonOfLinkedInColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
//        clickOnElement(HQStateCheckbox);
        int size= CompanyColumn.size();
        for(int i=7; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }

    public void ClickOnHideLinkBesideTheWebSitesColumn() throws InterruptedException {
//        waitForVisibility(WebsiteColumnInCompanySearchResult, 20);
//        clickOnElement(WebsiteColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        goToElement(HideButtonOfWebsiteColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfWebsiteColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(linkedinCheckbox);
//second way
//        Thread.sleep(3000);
//        waitForVisibility(CloseIconOnSearchPanel, 20);
//        clickOnElement(CloseIconOnSearchPanel);
          Thread.sleep(3000);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
//        clickOnElement(HQStateCheckbox);
//        clickOnElement(linkedinCheckbox);
//        clickOnElement(WebsiteColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        clickOnElement(HideButtonOfWebsiteColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
//        clickOnElement(HQStateCheckbox);
//        clickOnElement(WebsiteCheckbox);
        int size= CompanyColumn.size();
        for(int i=8; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }

    public void ClickOnHideLinkBesideThePhoneColumn() throws InterruptedException {

//        waitForVisibility(PhoneNumberColumnInCompanySearchResult, 20);
//        clickOnElement(PhoneNumberColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        goToElement(HideButtonOfPhoneColumnOnCompanyDetailsPage);
//        clickOnElement(HideButtonOfPhoneColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(WebsiteCheckbox);

        //second way
//        Thread.sleep(3000);
//        waitForVisibility(CloseIconOnSearchPanel, 20);
//        clickOnElement(CloseIconOnSearchPanel);
          Thread.sleep(3000);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
//        clickOnElement(HQStateCheckbox);
//        clickOnElement(linkedinCheckbox);
//        clickOnElement(WebsiteCheckbox);
//        clickOnElement(PhoneNumberColumnInCompanySearchResult);
//        Thread.sleep(3000);
//        clickOnElement(HideButtonOfPhoneColumnOnCompanyDetailsPage);
//        clickOnElement(ColumnButtonOnCompanyDetailsPage);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(ListCheckbox);
//        clickOnElement(IndustryCheckbox);
//        clickOnElement(PropertyCountCheckbox);
//        clickOnElement(ContactCountCheckbox);
//        clickOnElement(HQCityCheckbox);
//        clickOnElement(HQStateCheckbox);
//        clickOnElement(WebsiteCheckbox);
//        clickOnElement(linkedinCheckbox);
        int size= CompanyColumn.size();
        for(int i=9; i<=size; i++){
            clickOnElement(HideButtonOfListColumnOnCompanyDetailsPage);
        }
    }

    public void AmOnBisCredAdminDashboardAndWantToSearchAboutCompanyUsingQuickSearch() {
        goToURL("https://dashboard.beta.biscred.net");
    }

    public void ShouldSeeCompanyProfilePanel() throws InterruptedException {
        waitForVisibility(CloseIconOnSearchPanel, 20);
        assertDisplayed(CloseIconOnSearchPanel);
    }

    public void ClickOnSaveCompanyButtonInsideProfilePanel() throws InterruptedException {
        Thread.sleep(3000);
        swipeToElement(SaveCompanyButtonOnCompanyPanel);
        clickOnElement(SaveCompanyButtonOnCompanyPanel);
    }

    public void ShouldSeeAPopUpDisplayForSaveCompaniesToList() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementToAppear(SubmitButtonOnSaveCompaniesToList,20);
        assertDisplayed(SubmitButtonOnSaveCompaniesToList);
    }

    public void LeaveTheCheckboxOfClearSelectedResultsAfterSubmitNotSelected() {
        assertDisplayed(ClearSelectedResultsAfterSubmitOnCompanySaveToList);
    }

    public void ClickOnTheFirstCompanyInTheShownList() throws InterruptedException {
        waitForVisibility(FirstCompanyInTheCompanySearchResultPage, 20);
        Thread.sleep(3000);
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"))).doubleClick().build().perform();
        clickOnElement(FirstCompanyInTheCompanySearchResultPage);

    }

    public void ClickOnSavedList() {
        clickOnElement(SavedListOnCompanyListPage);
    }

    public void ShouldBeRedirectedToTheSaveListPage() {
        assertElementText(TitleOfCompanyListPageAfterAddingNewList, "Company List: Automation List added");
    }

    public void ClickOnTheCheckboxOfClearSelectedResultsAfterSubmitNotSelected() {
        clickOnElement(ClearSelectedResultsAfterSubmitOnCompanySaveToList);
    }

    public void CloseTheSummaryPanel() {
        clickOnElement(CloseIconOnSearchPanel);
    }

    public void ClickOnExistingListTab() {
        ExistingListTabOnSaveCompaniesToList.isEnabled();

    }

    public void SelectAnyListFromDropDownListOptions() throws InterruptedException {
        // waitForVisibility(CancelButtonOnSaveCompaniesToList, 20);
        Thread.sleep(3000);
        clickOnElement(SelectListFiledOnSaveCompaniesToList);
        clickOnElement(FirstOptionOnTheSaveCompaniesToList);
    }

    public void ClickOnCancelButtonOnSaveCompaniesToList() {
        clickOnElement(CancelButtonOnSaveCompaniesToList);
    }
    int size=SavedToListContainer.size();
    public void ClickOnDeleteIconBesideListNameOnProfilePanel() throws InterruptedException {
        //Thread.sleep(500);
        driver.navigate().refresh();
        clickOnElement(DeleteButtonOnPersonProfileIcon);
    }

    public void ShouldSeeTheCompanyNotSavedToNewList() throws InterruptedException {
//        Thread.sleep(3000);
//        scrollDownToElement(LabelOnCompanyProfileWhenThereIsNoSavedList);
////swipeToElement(LabelOnCompanyProfileWhenThereIsNoSavedList);
//        assertDisplayed(LabelOnCompanyProfileWhenThereIsNoSavedList);

//        clickOnElement(DeleteButtonOnPersonProfileIcon);
        for(int i=0; i<=size;i++){
            int sizeAfterDelete =SavedToListContainer.size();
            assertIfTrue(size==(sizeAfterDelete));
        }
    }
    public void iShouldSeeTheCompanyListNotChanged() throws InterruptedException {
      //  clickOnElement(DeleteButtonOnPersonProfileIcon);
        for(int i=0; i<=size;i++){
            int sizeAfterDelete =SavedToListContainer.size();
            assertIfFalse(size==(sizeAfterDelete));
        }
    }

    public void ClickOnCloseIconOnSaveCompaniesToList() {
        clickOnElement(CloseIconOnSaveCompaniesToList);

    }

    public void ShouldSeeANotificationMassageForRemovingList() throws InterruptedException {
        Thread.sleep(3000);
        // waitForVisibility(SuccessMessageAfterSavePeopleToList, 30);
        assertElementText(SuccessMessageAfterRemovingCompanyFromProfilePanel, "Company has been removed from list.");
        //assertDisplayed(SuccessMessageAfterSavePeopleToList);

    }

    public void ShouldSeeTheListNotDeleted() throws InterruptedException {
        Thread.sleep(3000);
        assertDisplayed(DeleteButtonOnPersonProfileIcon);

    }

    public void ClickOnCloseIconOnRemoveFromListPopUp() {
        clickOnElement(CancelButtonOnRemoveFromListPopup);
    }

    public void FillTheListNameFieldWithSpace() {
        sendElementText(ListNameFieldOnSaveCompaniesToListPopUp, "        ");
    }

    public void ShouldSeeANotificationMassageThereWasAProblemSavingToYourSearch() throws InterruptedException {
        Thread.sleep(3000);
        assertElementText(NotificationMessageAfterFillingInTheSavedSearchesWithSpaces, "There was a problem saving your search.");

    }

    public void ClickOnCopyUUIDIconAtTheBottomCornerInsideProfilePanel() throws InterruptedException {
        waitForVisibility(CloseIconOnSearchPanel, 20);
        swipeToElement(SaveCompanyButtonOnCompanyPanel);
        Thread.sleep(3000);
        clickOnElement(UUIDOnCompanyProfilePanel);
    }

    public void ShouldSeeSuccessMessageCompanyUUIDCopiedToClipboard() throws InterruptedException {
        Thread.sleep(1500);
        assertElementText(NotificationMessageAfterCopyTheUUID, "Company UUID copied to clipboard.");
    }

    public void ClickOnClearSelectedButton() {
        clickOnElement(ClearSelectedOptionFromActionsListOnCompanyDetailsPage);
    }

    public void ClickOnActionsButtonOnCompanyDetailsPage() {
        clickOnElement(ActionsButtonOnCompanyDetailsPage);
    }

    public void ShouldSeeANotificationMassageThereWasAProblemSavingToYourList() throws InterruptedException {
        Thread.sleep(1500);
        assertElementText(NotificationMessageAfterFillingInTheSavedSearchesWithSpaces, "There was a problem saving to your list.");
    }


    public void ShouldSeeOptionsForMatchingNamesForCompany() {
        waitForVisibility(SearchCompanyOptions,30);
        assertDisplayed(SearchCompanyOptions);

    }

    public void iClickOnNewSearch() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(NewSearch);
    }
}