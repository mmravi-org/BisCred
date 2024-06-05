package Pages.QuickSearchIcon;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class QuickSearchIconPO extends CommonPO {
    public QuickSearchIconPO(){super();}

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-5 h-5 mr-1']")
    public WebElement QuickSearchIcon;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"headlessui-dialog-panel\")]")
    public WebElement QuickSearchIconPopUp;

    @FindBy(how = How.XPATH, using = "//div[@class=\"hidden sm:ml-6 sm:flex sm:items-center\"]")
    public WebElement QuickSearchIconPopUpTemp;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"headlessui-combobox-input\")]")
    public WebElement QuickSearchBarField;

    @FindBy(how = How.XPATH, using = "//body")
    public WebElement body;

    @FindBy(how = How.XPATH, using = "//div[@class=\"flex justify-between pb-1 mb-1 uppercase border-b border-gray-500\"]")
    public List<WebElement> RecentSearchTab;

    @FindBy(how = How.XPATH, using = "//div[@id=\"criteria-search\"]")
    public WebElement SearchResultsPage;






}
