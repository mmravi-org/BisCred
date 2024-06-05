package Pages.ForcePush;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ForcePushPO extends CommonPO {
    public ForcePushPO(){super();}
    @FindBy(how = How.ID, using = "email")
    public WebElement alternativeLoginMail;

    @FindBy(how = How.ID, using = "password")
    public WebElement alternativeLoginPassword;

    @FindBy(how = How.XPATH, using = "//*[text()=' Sign in ']")
    public WebElement alternativeLoginSignInButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Contact \"]")
    public WebElement addContactButton;

    @FindBy(how = How.XPATH, using = "//input[@id=\"given_name\"]")
    public WebElement givenNameField;
    @FindBy(how = How.XPATH,using = "//input[@id=\"family_name\"]")
    public WebElement familyNameField;
    @FindBy(how = How.XPATH, using = "//input[@id=\"email\"]")
    public WebElement emailField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"company\"]")
    public WebElement companyField;
    @FindBy(how = How.XPATH, using = "//input[@id=\"linkedin\"]")
    public WebElement linkedinContactField;
    @FindBy(how = How.XPATH, using = "//div[text()=\"The email field is required when linkedin is not present.\"]")
    public WebElement errorMessageForMissingEmail;
    @FindBy(how = How.XPATH, using = "//*[@id=\"company-multiselect-options\"]")
    public WebElement contactCompanyEntered;

    @FindBy(how = How.XPATH, using = "//*[@class=\"ml-4 text-sm font-medium text-gray-700\"]")
    public WebElement contactPageName;
    @FindBy(how = How.XPATH, using = " //*[@class=\"text-sm text-green-700\"]")
    public WebElement contactCreatedSuccessMessage;

    @FindBy(how = How.XPATH, using = "//p/div/button[2]")
    public WebElement createContactButton;

    @FindBy(how = How.XPATH, using = "//*[@class='font-sans antialiased bg-gray-50']")
    public WebElement BisReachDashboardUser;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Status \"]")
    public WebElement updateStatusButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Contact Status \"]")
    public WebElement updateContactButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"status\"]")
    public WebElement StatusDropDownMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"status-multiselect-options\"]")
    public WebElement StatusULDropDownMenu;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-gray-500 dark:text-slate-500\"]")
    public WebElement StatusNotification;

    @FindBy(how = How.XPATH, using = "//span[@class=\"inline-flex rounded px-2 text-xs font-bold leading-5 bg-bisnow-bright-orange text-white\"]")
    public WebElement StatusInBisnow;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Address \"]")
    public WebElement AddAddressButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Save Address \"]")
    public WebElement SaveAddressButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"postal_code\"]")
    public WebElement PostalCodeField;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'loading-spinner absolute float-right h-5 w-6 text-green-400 hover:text-green-400']")
    public WebElement ValidPostalCodeMark;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mb-2\"]")
    public List<WebElement> StateAndCityAdded;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-gray-500 dark:text-slate-500\"]")
    public WebElement StateAndCityAddedMassage;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Employment \"]")
    public WebElement addEmploymentButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Save Employment \"]")
    public WebElement saveEmploymentButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"company\"]")
    public WebElement companyEmploymentField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"company-multiselect-options\"]")
    public WebElement companyEmploymentDropDownList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"job_title\"]")
    public WebElement jobTitleField;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div[2]/p/div[1]/div[5]/div/div[1]/button")
    public WebElement activeToggleButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div[2]/p/div[1]/div[5]/div/div[2]/button")
    public WebElement primaryToggleButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"job_classification\"]")
    public WebElement JobClassificationField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"job_classification-multiselect-options\"]")
    public WebElement JobClassificationDropDownList;

    @FindBy(how = How.XPATH, using = "//input[@id=\"asset_classes\"]")
    public List<WebElement> JobAssetField;

    @FindBy(how = How.XPATH, using = "//li[@id=\"asset_classes-multiselect-option-1\"]")
    public List<WebElement> JobAssetFDropDownList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"emails\"]")
    public WebElement JobEmailField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"emails-multiselect-options\"]")
    public WebElement JobEmailFDropDownList;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mb-4 text-xs text-gray-600\"]")
    public WebElement employmentAdded;

    @FindBy(how = How.XPATH, using = "//*[@class=\"ml-3 inline-flex rounded bg-bisnow-orange px-2 text-xs font-bold leading-5 text-white\"]")
    public WebElement PrimaryEmploymentAdded;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page-content\"]/main/div/div[3]/dl/div[6]/dd/div[1]/div[1]/h3/span[1]")
    public WebElement ActiveEmploymentAdded;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement employmentAddedMassage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/main/div/div/main/div/div[3]/dl/div[7]/dd/div[1]/div/div[2]/a[2]")
    public WebElement  DeleteLink;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Delete Employment\"]")
    public WebElement deleteEmploymentButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement employmentIsDeletedMassage;


    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Classification \"]")
    public WebElement updateClassifications;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Contact Classification \"]")
    public WebElement updateContactClassificationButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"classifications\"]")
    public WebElement classificationField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"classifications-multiselect-options\"]")
    public WebElement classificationDropDownList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"page-content\"]/main/div/div[3]/dl/div[8]/dd")
    public WebElement classificationAdded;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement classificationAddedMassage;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Note \"]")
    public WebElement updateResearcherNotesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"notes\"]")
    public WebElement ResearcherNotesField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"researchOutcome\"]")
    public WebElement ResearchOutcomeFiled;

    @FindBy(how = How.XPATH, using = "//*[@id=\"researchOutcome-multiselect-options\"]")
    public WebElement ResearchOutcomeDropDownList;

    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\" and text()=\" Update Note \"]")
    public WebElement updateResearcherNoteButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement researcherNotesAdded;

    @FindBy(how = How.XPATH, using = "//*[@class=\"relative mb-8 border-green-400 bg-green-50 p-4\"]")
    public WebElement researcherNotesAddedMassage;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Submit for Ready for Review \"]")
    public WebElement SubmitForReadyForReviewButton;


    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement ReadyForReviewStatus;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Review Contact \"]")
    public WebElement ReviewContactButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"inline-flex rounded px-2 text-xs font-bold leading-5 bg-yellow-100 text-yellow-800 ml-2 align-middle\"]")
    public WebElement InReviewStatus;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Force Push \"]")
    public WebElement ForcePushButton;


    @FindBy(how = How.XPATH, using = "//button[text()=\" Approve Contact\"]")
    public WebElement ApprovedContactButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement ContactHasBeenUpdatedAndGivenAStatusReadyForReviewMessage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement ContactHasBeenApprovedMessage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"inline-flex rounded px-2 text-xs font-bold leading-5 bg-green-100 text-green-800\"]")
    public WebElement ApprovedStatus;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-gray-500 dark:text-slate-500\"]")
    public WebElement ForcePushMessage;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Company \"]")
    public WebElement addCompanyButton;

    @FindBy(how = How.XPATH, using = "//input[@id=\"name\"]")
    public WebElement companyNameField;

    @FindBy(how = How.XPATH, using = "//input[@id=\"legal_name\"]")
    public WebElement legalNameField;

    @FindBy(how = How.XPATH, using = "//input[@id=\"url\"]")
    public WebElement companyURLField;

    @FindBy(how = How.XPATH, using = "//input[@id=\"linkedin\"]")
    public WebElement linkedinCompanyField;

    @FindBy(how = How.XPATH, using = "//p/div/button[2]")
    public WebElement createCompanyButton;


    @FindBy(how = How.XPATH, using = "//*[@class=\"ml-4 text-sm font-medium text-gray-700\"]")
    public WebElement companyPageName;

    @FindBy(how = How.XPATH, using = "//*[@class='text-sm text-green-700']")
    public WebElement companyCreatedSuccessMessage;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Status \"]")
    public WebElement UpdateStatusButtonOnCompanyProfile;

    @FindBy(how = How.XPATH, using = "//div/h3[text()=\"Update Company Status\" and @id=\"modal-title\"]")
    public WebElement UpdateCompanyStatusPopup;

    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\" and text()=\" Update Company Status \"]")
    public WebElement UpdateCompanyStatusButtonOnUpdateCompanyModal;

    @FindBy(how = How.XPATH, using = "//span[text()=\"In the Bisnow Universe\"]")
    public WebElement InBisnowUniverseStatusOnCompanyProfile;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement SuccessMessageForUpdatingCompanyStatus;

    @FindBy(how = How.XPATH, using = "//*[@class=\"p-2 border-red-400 bg-red-50\"]")
    public WebElement MessageThatDisplayedOnTheButtonOfThePageAfterSettingCompanyStatusAsInBinsowUniverse;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Address \"]")
    public WebElement   AddCompanyAddressButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Save Address \"]")
    public WebElement   SaveCompanyAddressButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"postal_code\"]")
    public WebElement CompanyPostalCodeField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addressType\"]")
    public WebElement AddressTypeField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addressType-multiselect-options\"]")
    public WebElement AddressTypeDropDownList;

    @FindBy(how = How.XPATH, using = "//*[@class=\"flex mt-1 text-sm text-gray-900 sm:col-span-2 sm:mt-0\"]")
    public WebElement HeadQuarterAddress;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement AddressAddedSuccessfullyMassage;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Asset Class \"]")
    public WebElement AddAssetClassButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Asset Class \" and @type='submit']")
    public WebElement UpdateAssetClassButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"industry\"]")
    public WebElement AssetClassField;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"industry-multiselect-options\")]")
    public WebElement AssetClassDropDownList;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"industry-multiselect-option\")]//following::span[text()=\"Affordable Housing\"]a")
    public WebElement AssetClassDropDownListSecond;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"industry-multiselect-option\")]//following::span[text()=\"Communication\"]a")
    public WebElement AssetClassDropDownListFirst;

    @FindBy(how = How.XPATH, using = "//span[@class=\"multiselect-tag-remove-icon\"]")
    public WebElement CloseAssetClass;


    @FindBy(how = How.XPATH, using = "//*[@class=\"flex mt-1 text-sm text-gray-900 sm:col-span-2 sm:mt-0\"]")
    public WebElement ValidateAssetClassAdded;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement ValidateAssetClassAddedSuccessfullyMassage;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Industry \"]")
    public WebElement AddIndustryButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Add Industry \" and @type=\"submit\"]")
    public WebElement AddIndustryButtonPopUp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"asset_class\"]")
    public WebElement IndustryField;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"asset_class-multiselect-option\")]//following::span[text()=\"Interior Design\"]")
    public WebElement IndustryDropDownList;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"asset_class-multiselect-option\")]//following::span[text()=\"Architect\"]")
    public WebElement IndustryDropDownListFirst;

    @FindBy(how = How.XPATH, using = "//*[@class=\"flex mt-1 text-sm text-gray-900 sm:col-span-2 sm:mt-0\"]")
    public WebElement ValidateIndustryAdded;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement ValidateIndustryAddedSuccessfullyMassage;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Approve\"]")
    public WebElement  ApprovedLink;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm text-green-700\"]")
    public WebElement ValidateApprovedSuccessfullyMassage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public WebElement EmailTextField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    public WebElement PasswordTextBox;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Sign in \"]")
    public WebElement SignInButton;

}
