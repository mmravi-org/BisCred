package Pages.CriteriaSearch;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CriteriaSearchPO extends CommonPO {

    @FindBy(how = How.XPATH, using = "//*[@id=\"extended-critera-search\"]/div[1]/div/div[1]/nav/a[2]")
    public WebElement CriteriaSearchTab;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[1]/nav/a[2]")
    public WebElement CompanyInCriteriaSearchMenu;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement CompanyNameField;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement CompanyNamePlusSign;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Search Companies')]")
    public WebElement SearchCompanyButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]")
    public WebElement SearchResultsPage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"relative query-params-controls dropdown\"]")
    public WebElement ThreeDots;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"Exact\")]")
    public WebElement ExactOption;

    @FindBy(how = How.XPATH, using = "//tbody/tr[1]/td[2]")
    public WebElement FirstResultOption;

    @FindBy(how = How.XPATH, using = "//*[@id=\"extended-critera-search\"]/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement RemoveLink;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-16 h-16 mx-auto text-gray-500']")
    public WebElement SearchIconSVG;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Reset')]")
    public WebElement ResetButton;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"private-equity\")]")
    public WebElement OptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[4]")
    public List<WebElement> CompanyIndustriesOption;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"real-estate-investment-firm\")]")
    public WebElement SecondOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"real-estate-investment-trust-(reit)\")]")
    public WebElement ThirdOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"developer\")]")
    public WebElement FourthOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"operator\")]")
    public WebElement FifthOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"architect\")]")
    public WebElement SixthOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"engineering\")]")
    public WebElement SeventhOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"interior-design\")]")
    public WebElement EightOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"general-contractor\")]")
    public WebElement NineOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"property-management\")]")
    public WebElement TenthOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"construction\")]")
    public WebElement EleventhOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[3]/div[2]/div/div[12]/div[1]/div[2]")
    public WebElement TwelveOptionFromCompanyIndustriesPlusSign;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[12]/div[2]/div[1]/div[1]/div[1]/label[1]")
    public WebElement TwelveOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"consulting\")]")
    public WebElement ThirteenOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"environmental-consulting\")]")
    public WebElement FourteenOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"landscaping\")]")
    public WebElement FifteenOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"law-firm-and-legal-services\")]")
    public WebElement SixteenOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[13]/div[1]/div[2]/*[1]")
    public WebElement SevenTeenOptionFromCompanyIndustriesPlusSign;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[3]/div[2]/div/div[13]/div[2]/div[1]/div/div/label")
    public WebElement SevenTeenOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"materials\")]")
    public WebElement EighteenOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"proptech\")]")
    public WebElement NineteenOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"title-insurance\")]")
    public WebElement TwentyOptionFromCompanyIndustries;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-3 h-3 text-red-400 hover:text-red-700']")
    public WebElement ThreeDotsSVG;

    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[4]")
    public List<WebElement> ExactIndustry;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"Exclude\")]")
    public WebElement ExcludeIndustry;

    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[4]")
    public WebElement FirstIndustry;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Search Companies')]")
    public WebElement SearchCompaniesButton;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Search People')]")
    public WebElement SearchPeopleButton;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"affordable-housing\")]")
    public WebElement AffordableHousing;

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[2]/td[6]")
    public WebElement ExactAssetClasses;

    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]/div[1]/main/aside/div/div/div/div/div/div/div/div[1]")
    public WebElement SearchSummaryPanel;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-4 h-4']")
    public WebElement StateSignPlus;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/*[1]")
    public WebElement FirstStateOptionPlus;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[5]/div[2]/div/div[1]/div[2]/div[1]/div/div/label")
    public WebElement FirstStateOption;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[5]/div[1]/div[2]/div/div/button")
    public WebElement HQButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/label[2]/div/input")
    public WebElement ExcludeState;


    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/label[1]/div/input")
    public WebElement HQStateOption;

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/td[10]")
    public WebElement HQStateResult;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement HQCityField;

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/td[9]")
    public WebElement HqCityResults;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[6]/div[2]/div/div/div/div/div[2]/button")
    public WebElement HqCityPlusButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[5]/div[1]/div[2]/div/div/button")
    public WebElement HqCityToggleButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/label[2]/div/input")
    public WebElement ExactOptionCity;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/label[3]/div/input")
    public WebElement ExcludeOptionCity;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/label[1]/div/input")
    public WebElement HQOptionCity;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement RemoveLinkOption;

    @FindBy(how = How.XPATH, using = "//button[@id='headlessui-switch-11']")
    public WebElement ExcludeSavedCompanyRecordsToggle;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'inline-block w-3 h-3 text-red-500 cursor-pointer']")
    public WebElement XButtonIcon;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[8]/div[2]/div/div[1]/div/div/div[2]/div/div[1]")
    public WebElement SliderContactLine;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[9]/div[2]/div/div[1]/div/div/div[2]/div/div[1]")
    public WebElement SliderPropertyLine;
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li/ul/div/div/div[1]")
    public WebElement SliderContactResults;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-5 h-5']")
    public WebElement SortArrow;

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/td[8]")
    public WebElement ContactCountResult;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    public WebElement MinValueField;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]")
    public WebElement SearchField;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]")
    public WebElement MaxValueField;

    @FindBy(how = How.XPATH, using = "(/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[8]/div[2]/div/div[1]/div/div/div[1]/div)[1]")
    public WebElement SliderPropertyCountLine;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[8]/div[2]/div/div[2]/div[3]/div[2]/input")
    public WebElement MaxValueFieldPropertyCount;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[8]/div[2]/div/div[2]/div[1]/div[2]/input")
    public WebElement MinValueFieldPropertyCount;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='extended-critera-search']/div[1]/div[1]/div[3]/div[2]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[2]/div[1]/div[3]")
    public WebElement ClearButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[1]/ul/li[1]/ul/div")
    public WebElement CompanyCountSlideBar;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[1]/div[1]/div/div[3]/button")
    public WebElement NewSearchButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[6]/div[2]/div/div/div/div/div[2]/button")
    public WebElement PlusSignInCityField;

    @FindBy(how = How.XPATH, using = "//span[text()='Search must be at least 3 characters.']")
    public WebElement NotificationMessage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[1]/nav/a[3]")
    public WebElement PersonTab;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/input")
    public WebElement PersonField;

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/td[2]")
    public List<WebElement> PersonNameResults;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/button")
    public WebElement PlusSignInPersonField;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"Exact\")]")
    public WebElement ExactOptionInPerson;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/label[1]/div/input")
    public WebElement ExcludeOption;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[2]/td[2]")
    public WebElement ExcludeOptionInPerson;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-16 h-16 mx-auto text-gray-500']")
    public WebElement PersonNameField;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement PersonNameFieldRemove;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/input")
    public WebElement JobTitlesInPeople;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[2]/div[2]/div/div/div/div/div[2]/button")
    public WebElement JobTitlesInPeoplePlus;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/label[1]/div/input")
    public WebElement JobTitlesInExactOption;

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/td[6]")
    public WebElement JobTitlesInExactOptionResults;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"Exclude\")]")
    public WebElement JobTitlesExcludeOption;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement JobTitlesRemoveLinkOption;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]")
    public WebElement PlusSignBesideExecutive;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div/div/input")
    public WebElement FirstOptionOnExecutive;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div")
    public WebElement SeniorityOption;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[7]")
    public WebElement SeniorityResult;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"Exact\")]")
    public WebElement ExactSeniorityOption;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement SeniorityRemoveLink;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[4]/div[2]/div/div[1]/div/div/input")
    public WebElement PeopleAssetExperiences;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[8]")
    public WebElement PeopleAssetExperiencesResults;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement AssetExperiencesRemoveLink;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[5]/div[2]/div/div[1]/div[1]/div[2]")
    public WebElement PlusSignBesideMidwest;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[5]/div[2]/div/div[1]/div[2]/div[1]/div/div/input")
    public WebElement illinoisIllinoisState;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]")
    public WebElement illinoisIllinoisStateOption;

    @FindBy(how = How.XPATH, using = "//table/tbody/tr[1]/td[10]")
    public WebElement illinoisIllinoisStateResults;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"Exclude\")]")
    public WebElement illinoisIllinoisStateExclude;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement illinoisIllinoisRemoveLink;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[6]/div[2]/div/div/div/div/div[1]/input")
    public WebElement PeopleCitiesField;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[6]/div[2]/div/div/div/div/div[2]/button")
    public WebElement PeopleCitiesPlusSign;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]")
    public WebElement PeopleCitiesResults;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"Exact\")]")
    public WebElement PeopleCitiesExact;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[9]")
    public WebElement PeopleCitiesResult;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/div/div/div[1]/div/div[2]/div/div[2]/ul/li/ul/div/div/div[1]/div[2]/div/div[2]/a")
    public WebElement RemoveLinkPeopleCities;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[2]/div[7]/div[2]/div/div/button")
    public WebElement ExcludeSavedPeopleRecordsToggle;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'inline-block w-3 h-3 text-red-500 cursor-pointer']")
    public WebElement XIconExcludeSavedPeopleRecordsToggle;


    //##############   Keyword Functionality  ############################
    @FindBy(how = How.XPATH, using = "//tr[1]/td[2]/div/span")
    public WebElement KeywordStatus;

    @FindBy(how = How.XPATH, using = "//tr[1]/td[3]/a[@class=\"cursor-pointer hover:underline\"]")
    public WebElement ActivateLink;

    @FindBy(how = How.XPATH, using = "//tr[1]/td[3]/a[@class=\"cursor-pointer hover:underline\"]")
    public WebElement DeactivateLink;

    @FindBy(how = How.XPATH, using = "//tr[1]/td[3]/a[text()=\" Edit \"]")
    public WebElement EditLink;

    @FindBy(how = How.XPATH, using = "//h4[text()=\"Edit Feature Flags\"]")
    public WebElement EditFeatureFlagsPopUp;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div/input")
    public WebElement EditFeatureFlagsField;

    @FindBy(how = How.XPATH, using = "//label[starts-with(@for,\"user\")]")
    public List<WebElement> UsersFeatureFlags;

    @FindBy(how = How.XPATH, using = "//input[starts-with(@id,\"user\")]")
    public WebElement UsersFeatureFlagsCheckBox;

    @FindBy(how = How.XPATH, using = "//button[text()=\"Cancel\"]")
    public WebElement CancelButton;

    @FindBy(how = How.XPATH, using = "//span[@class=\"inline-flex items-center px-2 py-0.5 rounded-full text-xs font-light bg-primary-300 text-primary-800\"]")
    public List<WebElement> SelectedUsersSection;

    @FindBy(how = How.XPATH, using = "//button[text()=\"Save\"]")
    public WebElement SaveButton;

    @FindBy(how = How.XPATH, using = "//div[text()=\"Company Keywords \"]")
    public WebElement CompanyKeywordsField;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Features\"]")
    public WebElement FeatureManagementPage;

    @FindBy(how = How.XPATH, using = "//label[text()=\"Company Keywords\"]")
    public WebElement CompanyKeywordsColumn;

    @FindBy(how = How.XPATH, using = "//label[text()=\"Company Keywords Context\"]")
    public WebElement CompanyKeywordsContextColumn;

    @FindBy(how = How.XPATH, using = "//input[@placeholder=\"Search against company websites...\"]")
    public WebElement CompanyKeywordsFields;

    @FindBy(how = How.XPATH, using = "//div[@class=\"font-bold truncate\"]")
    public WebElement CompanyKeywords;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Company Keywords\"]")
    public WebElement CompanyKeywordsColumns;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Company Keywords Context\"]")
    public WebElement CompanyKeywordsContextColumns;

    @FindBy(how = How.XPATH, using = "//*[@id=\"company_keywords_search\"]")
    public WebElement SelectionBoxBesideCompanyKeywordsColumn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"company_keywords_search_context\"]")
    public WebElement SelectionBoxBesideCompanyKeywordsContextColumn;

    @FindBy(how = How.XPATH, using = "//table/thead/tr[@class=\"divide-x divide-gray-500 dark:divide-charcoal-500\"]")
    public List<WebElement> CompanyColumn;
    @FindBy(how = How.XPATH, using = "//table/thead/tr/th")
    public List<WebElement> CompanyColumnName;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_keywords_search\"]//following-sibling::div[text()=\" hide \"]")
    public WebElement HideButtonOfKeywordCompanyColumnOnCompanyDetailsPage;

    @FindBy(how = How.XPATH, using = "//th[@data-key=\"company_keywords_search_context\"]//following-sibling::div")
    public WebElement HideButtonOfKeywordCompanyContextColumnOnCompanyDetailsPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"extended-critera-search\"]/div[1]/div/div[3]/div[2]/main/section/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div/div/div[2]/button")
    public WebElement PlusSignForCompanyKeywordField;

    @FindBy(how = How.XPATH, using = "//td[@data-column-name=\"company_keywords_search\"]")
    public List<WebElement> companyKeywordsSearch;

    @FindBy(how = How.XPATH, using = "//div[@class=\"inline-block badge cursor-pointer pill\"]/span")
    public List<WebElement> KeywordSearchUnderCompanyKeywordsField;

    @FindBy(how = How.XPATH, using = "//td/div/div[@class=\"truncate cursor-pointer text-md w-[30rem] hover:underline group-hover:text-white\"]")
    public List<WebElement> AnyValueInCompanyKeywordsContextColumn;

    @FindBy(how = How.XPATH, using = "//h4[@class=\"mb-0 text-2xl font-bold dark:text-slate-200\"]")
    public WebElement CompanyKeywordsSearchDetailsPopUp;

    @FindBy(how = How.XPATH, using = "//h4[@class=\"mb-0.5 font-bold text-midnight-800\"]")
    public WebElement CompanyKeywordsResultsInPopUp;

    @FindBy(how = How.XPATH, using = "//a[@class=\"inline-block mb-1 text-sm underline cursor-pointer text-primary-500\"]")
    public WebElement SnippetLink;

    @FindBy(how = How.XPATH, using = "//button[text()=\"Close\"]")
    public WebElement CloseButtonPopUp;



    public CriteriaSearchPO(){
        super();
    }
}
