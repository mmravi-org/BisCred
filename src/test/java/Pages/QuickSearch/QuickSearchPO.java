package Pages.QuickSearch;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class QuickSearchPO extends CommonPO {

    @FindBy(how = How.XPATH, using = "//input[@id=\"quick-search-input\" and @type='text' and @placeholder='Enter a Company or Person name here...']")
    public WebElement SearchTextField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"headlessui-combobox-option-20\"]")
    public WebElement quickSearchInputContainer;
    @FindBy(how = How.XPATH, using = "//*[@id=\"headlessui-combobox-option-20\"]")
    public WebElement CompanySearchInputContainer;

    @FindBy(how = How.XPATH, using = "//*[@id=\"persons-results\"]")
    public WebElement SearchOptions;
    @FindBy(how = How.XPATH, using = "//*[@id=\"companies-results\"]")
    public WebElement SearchCompanyOptions;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[2]/div/div/div/div/div/ul/div[2]")
    public WebElement SearchOptionOne;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Company \"]")
    public WebElement CompaniesSearchResultPage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"flex flex-1 min-h-0 overflow-hidden company-details-page\"]")
    public WebElement CompanySearchResultPage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[3]/table/tbody/tr/td[1]")
    public List<WebElement> PersonSearchResults;

    @FindBy(how = How.XPATH, using ="//a[text()=\" Company \"]")
    public WebElement CompanySearchTap;

    @FindBy(how = How.XPATH, using ="/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[2]")
    public List<WebElement> CompanySearchResults;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Person Details:')]")
    public WebElement  PersonSearchResultsPage;

    @FindBy(how = How.XPATH, using ="//a[text()=\" Person \"]")
    public WebElement  PersonSearchResultTap;

    @FindBy(how = How.XPATH, using = "//span[@class=\"font-bold cursor-pointer hover:text-primary-500 dark:hover:text-primary-400 hover:underline\"]")
    public List<WebElement>  SearchResultsPage;
    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[2]")
    public List<WebElement> AllPersonSearchResults;

    @FindBy(how = How.XPATH, using = "//*[@class=\"preview-container text-sm transition-opacity opacity-100\"]")
    public WebElement SearchResultsPanel;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'People found')]")
    public WebElement SearchAllResults;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Companies found')]")
    public WebElement SearchAllCompanyResults;

    @FindBy(how = How.XPATH, using = "//span[@class=\"cursor-pointer preview-setter-toggle hover:underline\"]")
    public WebElement FirstOptionOnAllSearch;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-5 h-5']")
    public WebElement SortArrow;

    @FindBy(how = How.XPATH, using = "//span[@class=\"cursor-pointer preview-setter-toggle hover:underline\"]")
    public WebElement ResultsSortedAlphabitaclly;

    @FindBy(how = How.XPATH, using = "//button[text()=\" New Search \"]")
    public WebElement NewSearchButton;

    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
    public WebElement SelectOptionBox;


    @FindBy(how = How.XPATH, using = "//*[@class=\"flex items-center justify-between w-full h-10 px-4 py-2 text-xs bg-white border border-t-0 border-gray dark:bg-charcoal-900 dark:border-charcoal-800\"]")
    public WebElement SelectionOptionsOnFooter;

    public QuickSearchPO(){
        super();
    }
}
