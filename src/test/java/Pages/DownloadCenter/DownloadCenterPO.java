package Pages.DownloadCenter;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DownloadCenterPO extends CommonPO {
    public DownloadCenterPO(){super();}

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Download')]")
    public WebElement DownloadFunction;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div[2]/div/div/div[3]/div[1]/button/span[contains(text(),'Download')]")
    public WebElement DownloadButton;

    @FindBy(how = How.XPATH, using = "//input[@id=\"clearSelected\"]")
    public WebElement ClearSelectedOption;

    @FindBy(how = How.XPATH, using = "//thead/tr[1]/th[1]/input[1]")
    public WebElement CheckBoxToSelectAllResultOnListPage;

    @FindBy(how = How.XPATH, using = "//span[text()=\"In Progress...\"]")
    public WebElement DownloadStatus;

    @FindBy(how = How.XPATH, using ="//a[text()=\" Company \"]")
    public WebElement CompanySearchTap;

    @FindBy(how = How.XPATH, using ="//div[@class=\"flex flex-1 min-h-0 overflow-hidden company-details-page\"]")
    public WebElement CompanyDetailsPage;

    @FindBy(how = How.XPATH, using = "//*[@class=\"mt-1 text-sm text-black dark:text-slate-300\"]")
    public List<WebElement>   MassageForUpdatePasswordDownload;

    @FindBy(how = How.XPATH, using ="//table//tr/td[2]")
    public List<WebElement> FileName;

    @FindBy(how = How.XPATH, using ="//span[text()=\"Expired\"]")
    public WebElement ExpiredFile;

    @FindBy(how = How.XPATH, using ="//td[2]")
    public List<WebElement> FILENAMEColumn;

    @FindBy(how = How.XPATH, using ="//td/div/span[text()=\"Expired\"]")
    public List<WebElement> ExpiredFiles;

    @FindBy(how = How.XPATH, using ="//td/a[@class=\"cursor-pointer underline hover:no-underline\"]")
    public List<WebElement> FILENAME;

    @FindBy(how = How.XPATH, using = "//nav[@aria-label=\"Pagination\"]/a")
    public List<WebElement> ResultsPage;

    @FindBy(how = How.XPATH, using ="//span[contains(text(),'Next')]//following::*[@xmlns=\"http://www.w3.org/2000/svg\" and @class=\"h-5 w-5\"]")
    public WebElement NextArrowPagination;

    @FindBy(how = How.XPATH, using = "//input[@id=\"sendEmails\"]")
    public WebElement sendEmailsOption;

    @FindBy(how = How.XPATH, using = "//table//tr/td[2]")
    public WebElement attachedFileDownloaded;

    @FindBy(how = How.XPATH, using = "//button[@type=\"button\" and @class=\"text-gray-400 hover:text-gray-500 focus:outline-none\"]")
    public WebElement CloseIconOnDownloadPopUp;



}
