package Pages.SharedList;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


public class SharedListPO extends CommonPO {
    public SharedListPO(){super();}

    @FindBy(how = How.XPATH, using = "//*[@id=\"makePublic\"]")
    public WebElement MakePublicToggle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"search-shared-users\"]")
    public WebElement addUserIsPresent;


    @FindBy(how = How.XPATH, using = "//*[@id=\"search-shared-users\"]")
    public WebElement AddUsersList;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"addSharedUsers\")]")
    public List<WebElement> SharedUsersList;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'inline-block w-4 h-4 ml-1']")
    public WebElement SharedListIconSVG;

    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public WebElement EmailTextField;

    @FindBy(how = How.XPATH, using = "//*[@id='search-shared-users']")
    public WebElement enterName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    public WebElement PasswordTextBox;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Person \"]")
    public WebElement PersonTap;

    @FindBy(how = How.XPATH, using = "//div[@class=\"block ml-1 text-xs text-gray-700\"]")
    public WebElement CreatedByUser;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Duplicate \"]")
    public WebElement DuplicateAPubliclySharedList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new-list\"]")
    public WebElement ListNameFieldOnSavePeopleToListPopUp;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Cancel \"]")
    public WebElement CancelButton;

    @FindBy(how = How.XPATH, using = "//button[@type=\"button\" and @class=\"text-gray-400 hover:text-gray-500 focus:outline-none\"]")
    public WebElement clickOnCloseButton;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Duplicate \"]")
    public WebElement DuplicateLink;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Duplicate List\"]")
    public WebElement DuplicateListButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement validateDuplicateMassageDisplay;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Copy of ')]")
    public WebElement CopyOfTheSharedList;

    @FindBy(how = How.XPATH, using = "//td[@data-column-name=\"name\"]")
    public List<WebElement> SharedList;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Person List')]")
    public WebElement PersonListPage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company List')]")
    public WebElement CompanyListPage;

    @FindBy(how = How.XPATH, using = "//td[@data-column-name=\"name\"]")
    public WebElement PersonNotShared;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'inline-block w-3 h-3 ml-1 text-purple-400']")
    public List<WebElement> SharedListIconsSVG;

    @FindBy(how = How.XPATH, using = "//table[@class=\"min-w-full table-auto data-table select-none\"]")
    public List<WebElement> DuplicateTable;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Duplicate \"]")
    public List<WebElement> DuplicateLinks;

    @FindBy(how = How.XPATH, using = "//button[starts-with(@id, 'headlessui-menu-button')]")
    public WebElement  ProfileIcon;



}
