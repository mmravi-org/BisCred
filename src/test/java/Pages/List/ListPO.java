package Pages.List;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ListPO extends CommonPO {

    public ListPO() {
        super();
    }

    @FindBy(how = How.XPATH, using = "//a[text()=\"Lists\"]")
    public WebElement ListMainMenu;

    @FindBy(how = How.XPATH, using = "//span[@class=\"capitalize\"]")
    public WebElement NewPersonList;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/h3")
    public WebElement PopUpCreateNewList;

    @FindBy(how = How.XPATH, using = "//input[@id=\"new-list-name\"]")
    public WebElement ListNameField;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/button")
    public WebElement SubmitButtonOnCreateNewList;

    // @FindBy(how = How.XPATH, using = "")
    //public WebElement ;

    @FindBy(how = How.XPATH, using = "//table[@class=\"min-w-full table-auto select-none data-table\"]/tbody/tr[1]//td[1]")
    public WebElement AddedListName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[1]/div/nav/a[1]")
    public WebElement PersonListTab;

    @FindBy(how = How.XPATH, using = " //*[@id=\"app\"]/div/div[1]/main/section/div[1]/div/div[1]")
    public WebElement PersonListNameAfterViewing;


    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[1]/div/nav/a[1]")
    public WebElement ErrorMessageForAddingEmptyList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[5]/div/a[1]")
    public WebElement ViewLinkOnTheFirstPersonList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[1]/div/div[1]")
    public WebElement PersonListDetailsPage;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/button")
    public WebElement CancelButtonOnCreateListPopUp;

    //*[@id="headlessui-dialog-panel-9"]/div[2]/div[2]/button

    @FindBy(how = How.XPATH, using = "(//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::*[name()='svg'][1]")
    public WebElement CloseIconOnCreateListPopUp;

    @FindBy(how = How.XPATH, using = "//a[2][@class=\"mx-2 underline hover:no-underline cursor-pointer\"]")
    public WebElement EditListLink;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/h3")
    public WebElement EditListPopUp;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement EditSuccessMessage;

    @FindBy(how = How.XPATH, using = "//input[@id='edit-list-name']")
    public WebElement EditListNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[1]")
    public WebElement EditedListNameFirstRecord;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div[1]/button")
    public WebElement SubmitButtonOnEditListPage;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/button")
    public WebElement CancelButtonOnEditListPopUp;

    @FindBy(how = How.XPATH, using = "(//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::*[name()='svg'][1]")
    public WebElement CancelIconOnEditListPopUp;

    @FindBy(how = How.XPATH, using = "//a[3][@class=\"mx-2 underline hover:no-underline cursor-pointer\"]")
    public WebElement DeleteListLink;

    @FindBy(how = How.XPATH, using = "//body/div[@id='headlessui-portal-root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]")
    public WebElement DeleteListConfirmationMessage;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Delete List\"]")
    public WebElement DeleteButtonOnDeletePopUp;

   // @FindBy(how = How.XPATH, using = "")
    //public WebElement SuccessMessageForDeletingTheList;


    @FindBy(how = How.XPATH, using = "//table[@class=\"min-w-full table-auto data-table select-none\"]//tbody//tr")
    public List<WebElement> CheckingAllListValues;


    @FindBy(how = How.XPATH, using = "//*[@id=\"headlessui-dialog-panel-9\"]/div[3]/div[2]/button")
    public WebElement CancelButtonOnDeletePopUp;

    @FindBy(how = How.XPATH, using = "(//*[normalize-space(text()) and normalize-space(.)='Close'])[1]/following::*[name()='svg'][1]")
    public WebElement CloseIconOnDeletePopUp;


    @FindBy(how = How.XPATH, using = "//a[text()=\" View \"]")
    public WebElement ViewListLink;


    @FindBy(how = How.XPATH, using = "//*[@id=\"quick-search-input\"]")
    public WebElement SearchForaPersonOrCompanyField;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div/div[2]/div/div/div/div/div/ul/div[5]")
    public WebElement CBRECompanyFromSearchResult;

    @FindBy(how = How.XPATH, using = "(//div[@id=\"companies-results\"]/following-sibling::*)[1]")
    public WebElement CompanySearchFirstOption;

    @FindBy(how = How.XPATH, using = "//*[@id=\"companies-results\"]")
    public WebElement CompanyDirectoryLabelInQuickSearch;

    @FindBy(how = How.XPATH, using = "//thead/tr[1]/th[1]/input[1]")
    public WebElement CheckBoxToSelectAllResultOnListPage;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[2]/button")
    public WebElement ActionButton;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Save to List\"]")
    public WebElement SaveToListFunction;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/h3")
    public WebElement SavePeopleToListPopUp;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[2]")
    public WebElement NewListTabOnSavePeopleToListPopUp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new-list\"]")
    public WebElement ListNameFieldOnSavePeopleToListPopUp;

    @FindBy(how = How.XPATH, using = "//button[@type=\"button\" and text() =\" Submit \"]")
    public WebElement SubmitButtonOnTheSavePeopleToListPopUp;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement SuccessMessageAfterSavePeopleToList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[3]/div[1]/table/thead/tr/th[1]/input")
    public WebElement SelectAllResultFromPersonListPage;
   // this path for the remove link but once the integration module is not added for the account : //*[@id="app"]/div/div[1]/main/section/div[2]/div[2]/div/p[2]
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[2]/div/p[3]")
    public WebElement RemoveFromListLink;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"headlessui-dialog-title\")]")
    public WebElement RemoveFromListPopUp;

    @FindBy(how = How.XPATH, using = "//button/span[text()=\"Remove from List\"]")
    public WebElement RemoveFromListButtonOnRemoveFromListPopUp;


// full path in button RemoveFromListButtonOnRemoveFromListPopUp  /html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div[1]/button
    @FindBy(how = How.XPATH, using = "//p[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]/span")
    public WebElement SuccessMessageAfterRemovingFromList;
    //SuccessMessageAfterRemovingFromList xpath not the full path//span[contains(text(),'Selected profiles have been removed from your list')]
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[3]/div[1]/div/div/h4")
    public WebElement MessageAfterRemovingAllSelectedProfiles;
    //MessageAfterRemovingAllSelectedProfiles xpath not the full path//*[@id="app"]/div/div[1]/main/section/div[3]/div[1]/div/div/h4

    @FindBy(how = How.XPATH , using = "/html/body/div/div/nav/div/div/div[1]/div")
    public WebElement BiscredLogo;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]/button")
    public WebElement CancelButtonOnRemoveFromListPopUp;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/button")
    public WebElement CloseIconOnRemoveFromListPopUp;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'No records have been selected!')]")
    public WebElement MessageNoRecordsHaveBeenSelected;


    @FindBy(how = How.XPATH, using = "//*[text()=\"Clear Selected\"]")
    public WebElement ClearSelectedLink;

   // DownloadLinkFromActionList = /html/body/div/div/div[1]/main/section/div[2]/div[2]/div/p[1]
    // DownloadLinkFromActionList =/p[@class="cursor-pointer group"]//following::span[1]
    @FindBy(how = How.XPATH, using = "//p[@class=\"cursor-pointer group\"][2]//following-sibling::span")
    public WebElement DownloadLinkFromActionList;
    // these locators without having integration with the saleforce below the download locator with saleforce;//p[@class="cursor-pointer group"]/following::span
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[2]/div[2]/div/p[2]")
    public WebElement DownloadLinkDisabled;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div[1]/button")
    public WebElement DownloadButtonOnTheDownloadConfirmationPopUp;

    @FindBy(how = How.XPATH, using = "//div[@class=\"flex items-center justify-between mr-2\"]/input[@id=\"clearSelected\"]")
    public WebElement ClearSelectedResultsAfterDownloadTheDownloadConfirmationPopUp;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Cancel \"]")
    public WebElement CancelButtonOnDownloadConfirmPopUp;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement ShownMessageAfterDownload;


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/button")
    public WebElement CancelIconOnDownloadConfirmPopUp;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public WebElement DeleteListMessage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"create-list-button\"]/button")
    public WebElement NewCompanyList;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[1]/div/nav/a[2]")
    public WebElement CompanyListsPage;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company List: Automation List added')]")
    public WebElement CompanyListDetailsPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[2]/div[1]/table/tbody/tr[1]/td[5]/div/a[1]")
    public WebElement ViewLinkOnTheFirstCompanyList;

    @FindBy(how = How.XPATH, using = "//a[@class=\"underline cursor-pointer hover:no-underline\"]")
    public WebElement EditedCompanyListNameFirstRecord;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[1]/div/div[1]")
    public WebElement CompanyListNameAfterViewing;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[3]/div[1]/table/thead/tr/th[1]/input")
    public WebElement SelectAllResultFromCompanyListPage;
    //*[@id="app"]/div/div[1]/main/section/div[3]/div[1]/table/thead/tr/th[1]/input
    @FindBy(how = How.XPATH, using = "//span[@class='underline group-hover:no-underline'][1]/following::span[contains(., 'Companies')]")
    public WebElement ViewAllCompaniesFound;


    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/main/section/div[1]/div[2]/div[2]/button")
    public WebElement ActionButtonOnCompanySearchResult;



    @FindBy(how = How.XPATH, using = "//p[@class=\"cursor-pointer group\"][2]//following-sibling::span")
    public WebElement RemoveFromListLinkFromCompanyListPage;

    @FindBy(how = How.XPATH, using = "//p[@class=\"cursor-pointer group\"][3]//following-sibling::span")
    public WebElement RemoveFromListLinkFromContactListPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[2]/div[2]/div/p[1]/span")
    public WebElement DownloadLinkFromActionListInCompanyList;


    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company List: Company List Automation Test')]")
    public WebElement CompanyListDetailsPageAfterViewing;

      @FindBy(how = How.XPATH, using = "//div[@class=\"multiselect-wrapper\"]")
    public WebElement ExistingList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"multiselect-options\"]")
    public WebElement ExistingListDropDownList;

//    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[3]/div[1]/table/tbody/tr[8]/td[2]")
    @FindBy(how = How.XPATH, using = "(//span[@class='cursor-pointer preview-setter-toggle hover:underline'])[1]")
    public WebElement clickOnPersonNameToShowProfilePanel;


    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div[1]/main/section/div[3]/div[1]/table/tbody/tr[8]/td[2]")
    public WebElement cancleButton;

}
