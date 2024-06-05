package Pages.CompanyDetailsPage;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CompanyDetailsPagePO extends CommonPO {

    @FindBy(how = How.XPATH, using = "//*[contains(text(), \"10 Federal\")] ")
    public WebElement ExactNameOnCompanyDirectory;

    @FindBy(how = How.XPATH, using = "//button[@class=\"underline flex hover:no-underline\"]")
    public WebElement ValidateProfileIndexingLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[2]/div/div/div/div/div/div[2]/p[2]/span")
    public WebElement SuccessMessageAfterClickingOnValidateProfileIndexingLink;
    // full : /div/div/div/div/div[2]/p[2]/span

    @FindBy(how = How.XPATH, using = "//a[@href=\"https://bisreach.beta.biscred.net/dashboard/find/profile?type=company&value=98984f8a-caee-4454-aaef-3496ac370fd1\"]")
    public WebElement ViewingBisreachProfileLink;

    @FindBy(how = How.XPATH, using = "//div[@class=\"mx-auto flex max-w-7xl justify-between text-center px-4\"]/h2")
    public WebElement HeaderOfCompanyOnBisreachProfile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/aside/div/div/button")
    public WebElement CloseIconOnSearchPanel;

    @FindBy(how = How.XPATH, using = "//p[@class=\"break-all\"]")
    public WebElement CompanyURLOn10FederalProfile;

    @FindBy(how = How.XPATH, using = "//div[@class=\"container\"]/div/div/a/picture")
    public WebElement CompanyWebsiteOf10Federal;


    //*[starts-with(@id,"lists-saved_to_list")]
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"job-title-job_title\")]")
    public WebElement JobTitleCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"saved_to_list\")]")
    public WebElement ListCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"industries\")]")
    public WebElement IndustryCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"asset_classes\")]")
    public WebElement AssetExperienceCheckbox;
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"company_property_count\")]")
    public WebElement PropertyCountCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"indexed_company_employment_size\")]")
    public WebElement ContactCountCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"phone_numbers\")]")
    public WebElement PhoneNumberCheckbox;
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"city\")]")
    public WebElement HQCityCheckbox;
    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"region\")]")
    public WebElement HQStateCheckbox;


    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"linkedin\")]")
    public WebElement linkedinCheckbox;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"company_urls\")]")
    public WebElement WebsiteCheckbox;
    @FindBy(how = How.XPATH, using ="/html/body/div/div/div[1]/main/aside/div/div/div/div[1]/div[1]/div[2]/p[1]")
    public WebElement CompanySearchResultsPage;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"name\"]")
    public WebElement NameColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"name\"]/following::span[text()=\"Lists\"]")
    public WebElement ListColumnInCompanySearchResult;

    //th[@data-key="saved_to_list"]
    @FindBy(how = How.XPATH, using = "//th[@data-key=\"industries\"]")
    public WebElement IndustriesColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"asset_classes\"]")
    public WebElement AssetClassesColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_property_count\"]")
    public WebElement CompanyPropertyCountColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"indexed_company_employment_size\"]")
    public WebElement EmployeeCountColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"phone_numbers\"]")
    public WebElement PhoneNumberColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"city\"]")
    public WebElement HQCityColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"region\"]")
    public WebElement HQStateColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"linkedin\"]")
    public WebElement linkedinColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_urls\"]")
    public WebElement WebsiteColumnInCompanySearchResult;

    @FindBy(how = How.XPATH, using = "//span[@class='underline group-hover:no-underline'][1]/following::span[contains(., 'View all Companies found')]")
    public WebElement ViewAllCCompaniesFound;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Actions \"]")
    public WebElement ActionsButtonOnCompanyDetailsPage;
    @FindBy(how = How.XPATH, using = "//button[text()=\" Columns \"]")
    public WebElement ColumnButtonOnCompanyDetailsPage;

    // @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]")
    // public WebElement WhiteSpaceBesideActionButton;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"saved_to_list\"]//following-sibling::div")
    public WebElement HideButtonOfListColumnOnCompanyDetailsPage;
    @FindBy(how = How.XPATH, using = "//th[@data-key=\"industries\"]//following-sibling::div")
    public WebElement HideButtonOfIndustryColumnOnCompanyDetailsPage;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"asset_classes\"]//following-sibling::div")
    public WebElement HideButtonOfAssetExperienceColumnOnCompanyDetailsPage;


    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_property_count\"]//following-sibling::div")
    public WebElement HideButtonOfCompanyPropertyCountColumnOnCompanyDetailsPage;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"indexed_company_employment_size\"]//following-sibling::div")
    public WebElement HideButtonOfCompanyEmployeeCountColumnOnCompanyDetailsPage;


    @FindBy(how = How.XPATH, using = "//th[@data-key=\"city\"]//following-sibling::div")
    public WebElement HideButtonOfHQCityColumnOnCompanyDetailsPage;
    @FindBy(how = How.XPATH, using = "//th[@data-key=\"region\"]//following-sibling::div")
    public WebElement HideButtonOfHQStateColumnOnCompanyDetailsPage;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"linkedin\"]//following-sibling::div")
    public WebElement HideButtonOfLinkedInColumnOnCompanyDetailsPage;
    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_urls\"]//following-sibling::div")
    public WebElement HideButtonOfWebsiteColumnOnCompanyDetailsPage;
    @FindBy(how = How.XPATH, using = "//th[@data-key=\"phone_numbers\"]//following-sibling::div")
    public WebElement HideButtonOfPhoneColumnOnCompanyDetailsPage;
    //*[@id="critera-search"]/div[1]/main/aside/div/div/div/div[2]/div[8]/div[3]/button
    @FindBy(how = How.XPATH, using = "//button[text()=\" Save Company \"]")
    public WebElement SaveCompanyButtonOnCompanyPanel;
    //div[@class="button-container block w-full mt-4"]//button[@type="button" ]

    @FindBy(how = How.XPATH, using = "//*[@id=\"headlessui-dialog-title-52\"]")
    public WebElement SaveCompaniesToListPopUp;

    @FindBy(how = How.XPATH, using = "//*[text()=\"Clear selected results after submit.\"]")
    public WebElement ClearSelectedResultsAfterSubmitOnCompanySaveToList;
    //tr[2]//following-sibling::td[@data-column-name="name"]
    @FindBy(how = How.XPATH, using = "//span[@class=\"cursor-pointer preview-setter-toggle hover:underline\"]")
    public WebElement FirstCompanyInTheCompanySearchResultPage;
    //table/tbody/tr[1]/td[2]
    @FindBy(how = How.XPATH, using = "//button[text()=\" Submit \"]")
    public WebElement SubmitButtonOnSaveCompaniesToList;
    @FindBy(how = How.XPATH, using = "//*[text()=\"Automation List added\"]")
    public WebElement SavedListOnCompanyListPage;

    @FindBy(how = How.XPATH, using = "//div[@class=\"flex justify-between py-2\"]//*[text()=\"Company List: Automation List added\"]")
    public WebElement TitleOfCompanyListPageAfterAddingNewList;

    @FindBy(how = How.XPATH, using = "//*[text()=\" Existing Lists \"]")
    public WebElement  ExistingListTabOnSaveCompaniesToList ;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[1]")
    public WebElement  SelectListFiledOnSaveCompaniesToList ;

    @FindBy(how = How.XPATH, using = "//ul[@class=\"flex flex-col p-0 m-0 list-none\"]//li[1]")
    public WebElement  FirstOptionOnTheSaveCompaniesToList ;

    @FindBy(how = How.XPATH, using = "//*[text()=\" Cancel \"]")
    public WebElement  CancelButtonOnSaveCompaniesToList ;

    @FindBy(how = How.XPATH, using = "//*[text()=\" This Company is currently not saved to any of your lists. \"]")
    public WebElement  LabelOnCompanyProfileWhenThereIsNoSavedList ;

    @FindBy(how = How.XPATH, using = "//*[@xmlns=\"http://www.w3.org/2000/svg\" and @class = 'w-4 h-4' and @fill=\"none\"]")
    public WebElement  CloseIconOnSaveCompaniesToList;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement  SuccessMessageAfterRemovingCompanyFromProfilePanel ;

    @FindBy(how = How.XPATH, using = "//*[text()=\" Cancel \"]")
    public WebElement  CancelButtonOnRemoveFromListPopup ;


    @FindBy(how = How.XPATH, using = "//*[@xmlns=\"http://www.w3.org/2000/svg\" and @class=\"ml-2 h-4 text-xs text-gray-600 hover:text-red-700 cursor-pointer transition-all\"]")
    public WebElement DeleteButtonOnPersonProfileIcon;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new-list\"]")
    public WebElement ListNameFieldOnSaveCompaniesToListPopUp;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement NotificationMessageAfterFillingInTheSavedSearchesWithSpaces;


    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'inline-block w-4 h-4 align-text-top transition-colors cursor-pointer text-charcoal-200 hover:text-charcoal-400']")
    public WebElement UUIDOnCompanyProfilePanel;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement NotificationMessageAfterCopyTheUUID;

    @FindBy(how = How.XPATH, using = "//*[text()=\"Clear Selected\"]")
    public WebElement ClearSelectedOptionFromActionsListOnCompanyDetailsPage;
    @FindBy(how = How.XPATH, using = "//*[@id=\"companies-results\"]")
    public WebElement SearchCompanyOptions;

    @FindBy(how = How.XPATH, using = "//table/thead/tr[@class=\"divide-x divide-gray-500 dark:divide-charcoal-500\"]")
    public List<WebElement> CompanyColumn;

    @FindBy(how = How.XPATH, using = "//table/thead/tr/th")
    public List<WebElement> CompanyColumnName;

    @FindBy(how = How.XPATH, using = "//*[text()=\" New Search \"]")
    public WebElement NewSearch;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Saved Lists\"]//following::div [@class=\"pl-2\"]")
    public List<WebElement> SavedToListContainer;



}