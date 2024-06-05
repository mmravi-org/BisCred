package Pages.UserManagement;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class UserManagementPO extends CommonPO {
    public UserManagementPO(){super();}

    @FindBy(how = How.XPATH, using = "//button[text()=\" Create User \"]")
    public WebElement  CreateNewUserButton;

    @FindBy(how = How.XPATH, using = "//h2[@class=\"text-lg font-medium leading-6\"]")
    public WebElement  CreateUserPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"name\"]")
    public WebElement  UserNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public WebElement  EmailField;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/main/div/section/div/div[1]/div[2]/div[4]/div/div/div[1]/input")
    public WebElement AccountsField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"multiselect-options\"]")
    public WebElement  AccountsOption;

    @FindBy(how = How.XPATH, using = "//div[@aria-placeholder='Select a Role...']")
    public WebElement  RoleField;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[1]/main/div/section/div/div[1]/div[2]/div[5]/div/div/div[2]/ul")
    public WebElement  RolesOption;

    @FindBy(how = How.XPATH, using = "//*[@id=\"active\"]")
    public List<WebElement>  CanDownloadToggle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"limit\"]")
    public WebElement  DownloadLimitField;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Create User \" and @type='submit']")
    public WebElement  CreateUserButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement  MassageForAddingNewUser;

    @FindBy(how = How.XPATH, using = "//*[@class=\"ml-4 text-sm font-medium text-charcoal-600 dark:text-slate-200\"]")
    public WebElement  ManageUsersPage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"col-span-4 p-2 text-sm italic text-blue-500 bg-blue-100 border border-blue-400 rounded\"]")
    public WebElement  TrailMassageForNoDownload;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-xs italic text-red-500 dark:text-red-300\"]")
    public WebElement  NameErrorMassageForAddingNewUser;

    @FindBy(how = How.XPATH, using = "//div[@class=\"relative w-full\"]/div//following::input[@id=\"user\"]")
    public WebElement  SearchAboutTheCreatedUser;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Edit \"]")
    public WebElement  EditLink;

    @FindBy(how = How.XPATH, using = "//input[@id=\"active\" and @type=\"checkbox\"]")
    public WebElement  InactiveInputCheckBox;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update User \" and @type='submit']")
    public WebElement  UpdateUserButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement  MassageForUpdateUser;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Inactive')]")
    public WebElement  InactiveText;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Inactive\"]")
    public WebElement  InactiveStatus;

    @FindBy(how = How.XPATH, using = "//div[@aria-placeholder='Select a limit cadence...']")
    public WebElement  DownloadLimitCadenceField;

    @FindBy(how = How.XPATH, using = "//li[@aria-label=\"Monthly\" and @id=\"multiselect-option-monthly\"]")
    public WebElement  DownloadLimitCadenceOption;

    @FindBy(how = How.XPATH, using = "//table[@class=\"min-w-full divide-y divide-gray-500 dark:divide-charcoal-700\"]//tr")
    public List<WebElement>  SearchResultsTable;

    @FindBy(how = How.XPATH, using = "//table//tr/td[1]")
    public WebElement  SearchResultsValue;

    @FindBy(how = How.XPATH, using = "//table//tr/td[2]")
    public WebElement  SearchResultsEmailValue;

    @FindBy(how = How.XPATH, using = "//table//tr/td[3]")
    public WebElement  SearchResultsAccountValue;

    @FindBy(how = How.XPATH, using = "//button[text()=\"Active\" and @type='button']")
    public WebElement  ActiveFilter;

    @FindBy(how = How.XPATH, using = "//table//tr/td[4]")
    public WebElement  SearchResultsActiveStatus;

    @FindBy(how = How.XPATH, using = "//button[text()=\"Inactive\" and @type='button']")
    public WebElement  InactiveFilter;

    @FindBy(how = How.XPATH, using = "//a//following::span[@class=\"relative inline-flex items-center px-4 py-2 border border-gray bg-white dark:bg-charcoal-800 text-sm text-black dark:border-charcoal-500 dark:text-warm-500 bg-charcoal-100 dark:bg-charcoal-400\"]")
    public WebElement  SecondPage;

    @FindBy(how = How.XPATH, using = "//a[text()=\" View \"]")
    public WebElement  ViewLink;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-2xl font-semibold text-charcoal-900 dark:text-slate-200\"]")
    public WebElement  ViewPage;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Downloads \"]")
    public WebElement  UserDownloadStatsInViewPage;

    @FindBy(how = How.XPATH, using = "//a[text()=\" Activity \"]")
    public WebElement  UserActivityInViewPage;

    @FindBy(how = How.XPATH, using = "//td [@class=\"bg-white px-3 py-6 italic\"]")
    public WebElement  FilesDownloadedByTheUser;

    @FindBy(how = How.XPATH, using = "//td [@class=\"bg-white px-3 py-6 italic\"]")
    public WebElement  UserActivity;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Active')]")
    public WebElement  ActiveStatus;

    @FindBy(how = How.XPATH, using = "//span[contains(., 'Edit User')]")
    public WebElement  EditUser;

    @FindBy(how = How.XPATH, using = "//input[@id=\"new_password\"]")
    public WebElement  PasswordField;

    @FindBy(how = How.XPATH, using = "//input[@id=\"new_password_confirmation\"]")
    public WebElement  ConfirmPasswordField;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Update Password \" and @type='submit']")
    public WebElement  UpdatePasswordButton;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement  MassageForUpdatePassword;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public List<WebElement>   MassageForUpdatePasswordDownload;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-xs italic text-red-500 dark:text-red-300\"]")
    public WebElement  MassageErrorPassword;

    @FindBy(how = How.XPATH, using = "//*[@class=\"text-sm font-medium text-red-500 dark:text-red-300\"]")
    public WebElement  MassageErrorPasswordNotification;

    @FindBy(how = How.XPATH, using = "//button[starts-with(@id, 'headlessui-menu-button')]")
    public WebElement  ProfileIcon;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Logout\"]")
    public WebElement  ProfileLogout;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Sign in \"]")
    public WebElement SignInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public WebElement EmailTextField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    public WebElement PasswordTextBox;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Downloads\"]")
    public WebElement DownloadCenter;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Admin\"]")
    public WebElement UserManagement;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Admin\"]")
    public WebElement Accounts;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Search\"]")
    public WebElement SearchNav;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Lists\"]")
    public WebElement ListsNav;

    @FindBy(how = How.XPATH, using = "//a[text()=\"Saved\"]")
    public WebElement SavedNav;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Export Activity Report \"]")
    public WebElement ExportActivityReportButton;















}
