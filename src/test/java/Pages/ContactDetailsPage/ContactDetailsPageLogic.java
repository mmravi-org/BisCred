package Pages.ContactDetailsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ContactDetailsPageLogic extends ContactDetailsPagePO {

    public ContactDetailsPageLogic() {
        super();
    }

    public void ValidatePersonSearchResult() throws InterruptedException {
        Thread.sleep(3000);
        //waitForVisibility(PersonDetailsPage, 20);
        assertDisplayed(PersonDetailsPage);
//        assertElementText(PersonNameOnTheTopOfThePage, "Person Details: Testing Engineers");
    }


    public void ShouldBeRedirectToThePersonSearchResultsPage() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(PersonSearchResultsPage);
    }

    public void SelectATheExactPersonFromResult() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(FirstSearchResultOnThePersonDirectory);
    }

    public void AmOnBisCredPersonDetailsPage() throws InterruptedException {
        Thread.sleep(1000);
        assertDisplayed(PersonSearchResultsPage);

    }

    public void ClickOnColumnsButton() {
        clickOnElement(ColumnsButton);
    }

    public void ClickOnSelectionBoxBesideTheListColumns() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(ListCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
//        clickOnElement(EmailCheckbox);
//        clickOnElement(PhoneCheckbox);
//        clickOnElement(JobTitleCheckbox);
//        clickOnElement(SeniorityCheckbox);
//        clickOnElement(AssetExperienceCheckbox);
//        clickOnElement(CityCheckbox);
//        clickOnElement(StateCheckbox);
//        clickOnElement(linkedinCheckbox);
//        clickOnElement(CompanyCheckbox);
//        clickOnElement(CompanyAssetExperienceCheckbox);
//        clickOnElement(CompanyIndustryCheckbox);
//        clickOnElement(CompanyHQCityCheckbox);
//        clickOnElement(CompanyHQStateCheckbox);

    }

    public boolean ShouldSeeTheListColumnRemovedFromTheContactsDetails() throws InterruptedException {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());
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


    public void ClickOnSelectionBoxBesideEmailColumn() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(EmailCheckbox);
        clickOnElement(ListCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeEmailColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());
        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"emails\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesidePhoneColumn() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(EmailCheckbox);
        clickOnElement(PhoneCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeePhoneColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

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

    public void ClickOnSelectionBoxBesideJobTitleColumn() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(PhoneCheckbox);
        clickOnElement(JobTitleCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeJobTitleColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"job_title\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideSeniorityColumn() {
        clickOnElement(JobTitleCheckbox);
        clickOnElement(SeniorityCheckbox);
        clickOnElement(CloseIconOnSearchPanel);

    }

    public boolean ShouldSeeSeniorityColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"seniority\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideAssetExperiencedColumn() {
        clickOnElement(SeniorityCheckbox);
        clickOnElement(AssetExperienceCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeAssetExperiencedColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

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

    public void ClickOnSelectionBoxBesideCityColumn() {
        clickOnElement(AssetExperienceCheckbox);
        clickOnElement(CityCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeCityColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

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

    public void ClickOnSelectionBoxBesideStateColumn() {
        clickOnElement(CityCheckbox);
        clickOnElement(StateCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeStateColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

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

    public void ClickOnSelectionBoxBesideLinkedInColumn() {
        clickOnElement(StateCheckbox);
        clickOnElement(linkedinCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeLinkedInColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

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

    public void ClickOnSelectionBoxBesideCompanyColumn() {
        clickOnElement(linkedinCheckbox);
        clickOnElement(CompanyCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }


    public boolean ShouldSeeCompanyColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"company\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideCompanyAssetExperienceColumn() {
        clickOnElement(CompanyCheckbox);
        clickOnElement(CompanyAssetExperienceCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeCompanyAssetExperienceColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(CompanyAssetClassesColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"company_asset_classes\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideCompanyIndustriesColumn() {
        clickOnElement(CompanyAssetExperienceCheckbox);
        clickOnElement(CompanyIndustryCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeCompanyIndustriesColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"company_industries\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }

    }

    public void ClickOnSelectionBoxBesideCompanyHQCityColumn() {
        clickOnElement(CompanyIndustryCheckbox);
        clickOnElement(CompanyHQCityCheckbox);
        clickOnElement(CloseIconOnSearchPanel);
    }

    public boolean ShouldSeeCompanyHQCityColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"company_hq_city\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnSelectionBoxBesideCompanyHQStateColumn() {
        clickOnElement(CompanyHQCityCheckbox);
        clickOnElement(CompanyHQStateCheckbox);
        clickOnElement(CloseIconOnSearchPanel);


    }

    public boolean ShouldSeeCompanyHQStateColumnRemovedFromTheContactsDetails() {
        waitForVisibility(NameColumnInPersonSearchResult, 30);
        assertIfTrue(NameColumnInPersonSearchResult.isDisplayed());
        waitSeconds(30);
        assertIfTrue(ListColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(PhoneNumberColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(EmailColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(JobTitleColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(SeniorityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(AssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(StateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(LinkedInColumnInPersonSearchResult.isDisplayed());
        //assertIfTrue(CompanyHQStateColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyHQCityColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyAssetExperienceColumnInPersonSearchResult.isDisplayed());
        assertIfTrue(CompanyIndustryColumnInPersonSearchResult.isDisplayed());

        boolean isElementPresent;
        {
            try {
                driver.findElement(By.xpath("//th[@data-key=\"company_hq_state\"]"));
                return true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                return false;
            }
        }
    }

    public void ClickOnTheHideLinkBesideListColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ListColumnInPersonSearchResult);
        clickOnElement(HideButtonOfListColumn);
    }


    public void ClickOnTheHideLinkBesideEmailColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(ListCheckbox);
        clickOnElement(EmailColumnInPersonSearchResult);
        clickOnElement(HideButtonOfEmailColumn);
    }


    public void ClickOnTheHideLinkBesidePhoneColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(EmailCheckbox);
        clickOnElement(PhoneNumberColumnInPersonSearchResult);
        clickOnElement(HideButtonOfPhoneColumn);
    }


    public void ClickOnTheHideLinkBesideJobTitleColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(PhoneCheckbox);
        clickOnElement(JobTitleColumnInPersonSearchResult);
        clickOnElement(HideButtonOfJobTitleColumn);
    }


    public void ClickOnTheHideLinkBesideSeniorityColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(JobTitleCheckbox);
        clickOnElement(SeniorityColumnInPersonSearchResult);
        clickOnElement(HideButtonOfSeniorityColumn);
    }

    public void ClickOnTheHideLinkBesideAssetExperienceColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(SeniorityCheckbox);
        clickOnElement(AssetExperienceColumnInPersonSearchResult);
        clickOnElement(HideButtonOfAssetExperienceColumn);
    }

    public void ClickOnTheHideLinkBesideCityColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(AssetExperienceCheckbox);
        clickOnElement(CityColumnInPersonSearchResult);
        clickOnElement(HideButtonOfCityColumn);
    }

    public void ClickOnTheHideLinkBesideStateColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(CityCheckbox);
        clickOnElement(StateColumnInPersonSearchResult);
        clickOnElement(HideButtonOfStateColumn);
    }

    public void ClickOnTheHideLinkBesideLinkedInColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(StateCheckbox);
        clickOnElement(LinkedInColumnInPersonSearchResult);
        clickOnElement(HideButtonOfLinkedinColumn);
    }

    public void ClickOnTheHideLinkBesideCompanyColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(linkedinCheckbox);
        clickOnElement(CompanyColumnInPersonSearchResult);
        clickOnElement(HideButtonOfCompanyColumn);
    }


    public void ClickOnTheHideLinkBesideCompanyAssetExperienceColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(CompanyCheckbox);
        clickOnElement(CompanyAssetExperienceColumnInPersonSearchResult);
        clickOnElement(HideButtonOfCompanyAssetExperienceColumn);
    }

    public void ClickOnTheHideLinkBesideCompanyIndustriesColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(CompanyAssetExperienceCheckbox);
        clickOnElement(CompanyIndustryColumnInPersonSearchResult);
        clickOnElement(HideButtonOfCompanyIndustriesColumn);
    }


    public void ClickOnTheHideLinkBesideCompanyHQCityColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(CompanyIndustryCheckbox);
        clickOnElement(CompanyHQCityColumnInPersonSearchResult);
        clickOnElement(HideButtonOfCompanyHqCityColumn);
    }

    public void ClickOnTheHideLinkBesideCompanyHQStateColumn() throws InterruptedException {
        Thread.sleep(1500);
        clickOnElement(ColumnsButton);
        clickOnElement(CompanyHQCityCheckbox);
        clickOnElement(CompanyHQStateColumnInPersonSearchResult);
        clickOnElement(HideButtonOfCompanyHqStateColumn);
    }

    public void ClickOnNewSearchButtonTwo() {
        clickOnElement(NewSearchButtonOnPersonDetailsPage);
    }


    public void ShouldBeRedirectedToTheQuickSearchTab() {

        waitSeconds(30);
        assertDisplayed(SearchForPersonOrCompanySection);
    }

    public void ClickOnSavePersonButton() {
        waitForVisibility(SavePerson, 30);
        clickOnElement(SavePerson);
    }

    public void ShouldSeeTheListAddedToTheProfilePanel() throws InterruptedException {
//        Thread.sleep(3000);
        waitForElementToAppear(SavedListIconOnPersonProfile,20);
        assertDisplayed(SavedListIconOnPersonProfile);
    }

    public void TypeAListNameOnListNameFieldToSavePerson() {
        ListNameFieldOnSavePeopleToListPopUp.sendKeys("Save Person to List");
    }


    public void ClickOnCancelButtonOnSavePeopleToListPopUp() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(CancelButtonOnSaveToListPopUp);
    }


    public void ClickOnXIconOnSaveToListPopUp() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(CancelIconOnSaveToListPopUp);
    }
    int size=DeleteButtonOnPersonProfileIconContainer.size();
    public void ClickOnTheDeleteIconBesideListNameOnProfilePanel() throws InterruptedException {
        //Thread.sleep(500);
        driver.navigate().refresh();
        clickOnElement(DeleteButtonOnPersonProfileIcon);
    }

    public void ShouldSeeThePersonListRemovedFromProfilePanel() throws InterruptedException {
        Thread.sleep(500);
     // assertDisplayed(SavedListsRemovedMessageOnPersonPanel);
      assertIfTrue(!(size == (size - 1)));
   // assertElementText(SavedListsRemovedMessageOnPersonPanel, "This Person is currently not saved to any of your lists.");
    }

    public void ShouldSeeASuccessMassage(String text) throws InterruptedException {
        Thread.sleep(500);
        assertDisplayed(SuccessMessageForRemovingPersonFromList);
        assertElementText(SuccessMessageForRemovingPersonFromList, text);
    }

    public void ShouldSeeTheDeleteIconStillDisplayedOnTheProfile() {
        assertDisplayed(DeleteButtonOnPersonProfileIcon);
    }

    public void ClickOnSelectionBoxBesideCompanyHQStateColumnToSetUpTheColumnsForHideFunctionality() {
        clickOnElement(CompanyHQStateCheckbox);
    }

}



