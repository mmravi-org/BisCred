package Pages.SavedSearches;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SavedSearchesPO extends CommonPO {
    public SavedSearchesPO(){super();}
    @FindBy(how = How.XPATH, using = "//button[text()=\" Save Search \"]")
    public WebElement SaveSearchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new-saved-search\"]")
    public WebElement SaveSearchNameField;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement SaveSearchSuccessfulMessage;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Edit \"]")
    public WebElement EditSaveSearchLink;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Submit \"]")
    public WebElement SubmitSaveSearchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-name\"]")
    public WebElement SaveSearchFieldName;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement EditSaveSearchSuccessfulMessage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"flex flex-col h-full bg-white dark:bg-charcoal-700\"]")
    public WebElement SaveSearchPage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[1]")
    public WebElement SaveSearchResults;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Cancel \"]")
    public WebElement CancelSaveSearchButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement EditSaveSearchErrorMessage;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Delete \"]")
    public WebElement DeleteSaveSearchLink;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div[1]/button")
    public WebElement DeleteSaveSearchButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement DeleteSaveSearchMessage;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Person \"]")
    public WebElement PersonTap;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[1]")
    public WebElement PersonSavedSearchResult;

    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]")
    public WebElement PersonSavedSearchPage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[1]/div[1]/nav")
    public WebElement PersonSavedSearchTap;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[4]")
    public WebElement PersonSavedSearchDateResult;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[5]")
    public WebElement PersonSavedSearchValue;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[6]/div/a[1]")
    public WebElement RunSearchSavedSearchLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"criteria-search\"]")
    public WebElement SearchResults;

    @FindBy(how = How.XPATH, using ="//a[text()=\" Company \"]")
    public WebElement CompanySavedSearchTap;

    @FindBy(how = How.XPATH, using ="//tbody/tr[1]/td[1]/a[1]")
    public WebElement CompanySavedSearchFirstOption;

    @FindBy(how = How.XPATH, using ="//a[text()=\" All \"]")
    public WebElement AllSavedSearchTap;

    @FindBy(how = How.XPATH, using ="//table/tbody/tr[1]/td[4]")
    public WebElement LastSearchedUpdate;


    @FindBy(how = How.XPATH, using = "//td/a[@class=\"mx-2 underline cursor-pointer hover:no-underline\"]")
    public List<WebElement> SavedSearchFirstOption;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div")
    public WebElement SavedSearchDate;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Cancel \"]")
    public WebElement CancelButton;



}
