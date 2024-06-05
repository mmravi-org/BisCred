package Pages.Accounts;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AccountsPO extends CommonPO {

    @FindBy(how = How.XPATH, using = "//button[contains(., 'Create Account')]")
    public WebElement CreateAccountButton;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Accounts')]")
    public WebElement AccountManagementPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
    public WebElement AccountNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"company\"]")
    public WebElement CompanyNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"seats\"]")
    public WebElement NumberOfSeatsField;

    @FindBy(how = How.XPATH, using = "//button[contains(., 'Create Account') and @type='submit']")
    public WebElement CreateAccountButtonInsideAccountPage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement SuccessMessageForAddingNewAccount;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Create Account')]")
    public WebElement AccountPage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-xs italic text-red-500 dark:text-red-300\"]")
    public WebElement  MassageErrorName;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'The company field is required.')]")
    public WebElement  MassageErrorCompanyName;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'The seats field is required.')]")
    public WebElement  MassageErrorNumberOfSeats;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-2xl font-semibold\"]")
    public WebElement AccountDetailsPage;

    @FindBy(how = How.XPATH, using = "//input[@id=\"active\" and @type=\"checkbox\"]")
    public WebElement AccountActiveCheckBox;

    @FindBy(how = How.XPATH, using = "//input[@id=\"account\" and @placeholder=\"Search by Account name\"]")
    public WebElement AccountSearchBar;
    @FindBy(how = How.XPATH, using = "//table//tr/td[1]")
    public WebElement  AccountNameResult;

    @FindBy(how = How.XPATH, using = "//table//tr/td[3]")
    public WebElement  AccountSearchResultsStatus;

    @FindBy(how = How.XPATH, using = "//table//tr/td[1]")
    public WebElement  UsersAccountResult;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Edit \"]")
    public WebElement  EditLink;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Edit Account')]")
    public WebElement EditAccountPage;

    @FindBy(how = How.XPATH, using = "//button[contains(., ' Update Account ') and @type='submit']")
    public WebElement UpdateAccountButton;

    @FindBy(how = How.XPATH, using = "//button[text()=\"All\" and @type='button']")
    public WebElement  AllFilter;

    @FindBy(how = How.XPATH, using = "//table[@class=\"min-w-full divide-y divide-gray-500 dark:divide-charcoal-700\"]//tr")
    public List<WebElement> SearchResultsTable;

    @FindBy(how = How.XPATH, using = "//table//tr/td[1]")
    public List<WebElement> nameList;

    @FindBy(how = How.XPATH, using = "//table//tr/td[2]")
    public List<WebElement> CompanynameList;

    @FindBy(how = How.XPATH, using = "//table//tr/td[3]")
    public List<WebElement> StatusesList;

    @FindBy(how = How.XPATH, using = "//table//tr/td[4]")
    public List<WebElement> SeatsList;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-5 h-5']")
    public List<WebElement> SortArrow;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Active')]")
    public WebElement ActiveStatus;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Inactive')]")
    public WebElement InactiveStatus;
    public AccountsPO(){
        super();
    }
}
