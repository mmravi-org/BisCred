package Pages.ContactDetailsPage;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ContactDetailsPagePO extends CommonPO {

    @FindBy(how = How.XPATH, using = "//div[@id=\"quick-search-input-container\"]")
    public WebElement SearchForaPersonOrCompanyField;

    @FindBy(how = How.XPATH, using = "//div[@class=\"flex flex-1 min-h-0 overflow-hidden contact-details-page\"]")
    public WebElement PersonDetailsPage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[1]/div/div[1]")
    public WebElement PersonNameOnTheTopOfThePage;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Person Details:')]")
    public WebElement PersonSearchResultsPage;

//html/body/div/div/div[1]/div/div[2]/div/div/div/div/div/ul/div[3]/div/text()
    @FindBy(how = How.XPATH, using = "//*[contains(text(),\"Testing Engineers\")]")
    public WebElement  FirstSearchResultOnThePersonDirectory;
//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[3]/div[1]

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[1]/div[1]/main[1]/section[1]/div[2]/div[1]/button[1]")
    public WebElement ColumnsButton;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"saved_to_list\")]")
    public WebElement ListCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"emails\")]")
    public WebElement EmailCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"phone_numbers\")]")
    public WebElement PhoneCheckbox;
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"job_title\")]")
    public WebElement JobTitleCheckbox;
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"seniority\")]")
    public WebElement SeniorityCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"asset_classes\")]")
    public WebElement AssetExperienceCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"city\")]")
    public WebElement CityCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"region\")]")
    public WebElement StateCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"linkedin\")]")
    public WebElement linkedinCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"company\")]")
    public WebElement CompanyCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"company_asset_classes\")]")
    public WebElement CompanyAssetExperienceCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"company_industries\")]")
    public WebElement CompanyIndustryCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"company_hq_city\")]")
    public WebElement CompanyHQCityCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"company_hq_state\")]")
    public WebElement CompanyHQStateCheckbox;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"name\"]")
    public WebElement NameColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"saved_to_list\"]")
    public WebElement ListColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"emails\"]")
    public WebElement EmailColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"phone_numbers\"]")
    public WebElement PhoneNumberColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"job_title\"]")
    public WebElement JobTitleColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"seniority\"]")
    public WebElement SeniorityColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"asset_classes\"]")
    public WebElement AssetExperienceColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"city\"]")
    public WebElement CityColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"region\"]")
    public WebElement StateColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"linkedin\"]")
    public WebElement LinkedInColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company\"]")
    public WebElement CompanyColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_asset_classes\"]")
    public WebElement CompanyAssetExperienceColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_industries\"]")
    public WebElement CompanyIndustryColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_hq_city\"]")
    public WebElement CompanyHQCityColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_hq_state\"]")
    public WebElement CompanyHQStateColumnInPersonSearchResult;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/aside/div/div/button")
    public WebElement CloseIconOnSearchPanel;


    @FindBy(how = How.XPATH, using = "//th[@data-key=\"saved_to_list\"]//following-sibling::div")
    public WebElement HideButtonOfListColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"emails\"]//following-sibling::div")
    public WebElement HideButtonOfEmailColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"phone_numbers\"]//following-sibling::div")
    public WebElement HideButtonOfPhoneColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"job_title\"]//following-sibling::div")
    public WebElement HideButtonOfJobTitleColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"seniority\"]//following-sibling::div")
    public WebElement HideButtonOfSeniorityColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"asset_classes\"]//following-sibling::div")
    public WebElement HideButtonOfAssetExperienceColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"city\"]//following-sibling::div")
    public WebElement HideButtonOfCityColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"region\"]//following-sibling::div")
    public WebElement HideButtonOfStateColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"linkedin\"]//following-sibling::div")
    public WebElement HideButtonOfLinkedinColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company\"]//following-sibling::div")
    public WebElement HideButtonOfCompanyColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_asset_classes\"]//following-sibling::div")
    public WebElement HideButtonOfCompanyAssetExperienceColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_industries\"]//following-sibling::div")
    public WebElement HideButtonOfCompanyIndustriesColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_hq_city\"]//following-sibling::div")
    public WebElement HideButtonOfCompanyHqCityColumn;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_hq_state\"]//following-sibling::div")
    public WebElement HideButtonOfCompanyHqStateColumn;

    @FindBy(how = How.XPATH, using = "//div[@class=\"block button-container\"]/button")
    public WebElement NewSearchButtonOnPersonDetailsPage;

    @FindBy(how = How.XPATH, using = "//div[@class=\"contextual-search\"]/label")
    public WebElement SearchForPersonOrCompanySection;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[1]/div[1]/main[1]/aside[1]/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]")
    public WebElement SavePerson;
    @FindBy(how = How.XPATH, using = "//*[@id=\"new-list\"]")
    public WebElement ListNameFieldOnSavePeopleToListPopUp;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = \"ml-2 h-4 text-xs text-gray-600 hover:text-red-700 cursor-pointer transition-all\"]")
    public WebElement SavedListIconOnPersonProfile;

    @FindBy(how = How.XPATH, using = "//button[text() =\" Cancel \"]")
    public WebElement CancelButtonOnSaveToListPopUp;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/button")
    public WebElement CancelIconOnSaveToListPopUp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"critera-search\"]/div[1]/main/aside/div/div/div/div[2]/div[4]/div[2]")
    public List<WebElement> DeleteButtonOnPersonProfileIconContainer;


    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = \"ml-2 h-4 text-xs text-gray-600 hover:text-red-700 cursor-pointer transition-all\"]")
    public WebElement DeleteButtonOnPersonProfileIcon;


    @FindBy(how = How.XPATH, using = "//p[text()=\" This Person is currently not saved to any of your lists. \"]")
    public WebElement SavedListsRemovedMessageOnPersonPanel;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement SuccessMessageForRemovingPersonFromList;


}
