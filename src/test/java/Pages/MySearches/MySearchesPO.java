package Pages.MySearches;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MySearchesPO extends CommonPO {
    public MySearchesPO(){
        super();
    }
    @FindBy(how = How.XPATH, using = "//div [@class=\"relative flex flex-col justify-between p-3 text-xs bg-white border border-b-4 rounded shadow cursor-pointer group border-gray border-b-primary-500 dark:border-charcoal-700 dark:bg-charcoal-500\"]")
    public WebElement RecentSearchField;

    @FindBy(how = How.XPATH, using = "//div [contains(text(),'Result')]")
    public WebElement MatchingRecentSearchResults;

    @FindBy(how = How.XPATH, using = "//div [contains(text(),'Person Search')]")
    public WebElement ValidateSearchDate;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Save Search \"]")
    public WebElement SavedSearchButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new-saved-search\"]")
    public WebElement SavedSearchName;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Submit \"]")
    public WebElement SubmitSavedSearchButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div[2]/div[1]/div/div/div[2]/span")
    public WebElement SavedSearchTab;

    @FindBy(how = How.XPATH, using = "//*[@id=\"extended-critera-search\"]/div[2]/div[2]/div[3]/div[1]")
    public WebElement SavedSearchBlock;


}
