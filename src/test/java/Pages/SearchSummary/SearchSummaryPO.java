package Pages.SearchSummary;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SearchSummaryPO extends CommonPO {
    public SearchSummaryPO(){super();}

    @FindBy(how = How.XPATH, using = "//button[@type=\"button\" and @class=\"focus:ring-grey-500 absolute top-2 right-5 rounded bg-transparent text-charcoal-400 hover:text-black focus:ring-2\"]")
    public WebElement CloseIconOnSearchSummaryPanel;

    @FindBy(how = How.XPATH, using = "//*[@class=\"preview-container text-sm transition-opacity opacity-100\"]")
    public WebElement SearchResultsPanel;

    @FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[@id='criteria-search']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")
    public WebElement SearchPanelIcon;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Seniority')]")
    public WebElement SeniorityTap;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Location')]")
    public WebElement LocationTap;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Person Asset Experience')]")
    public WebElement PersonAssetExperienceTap;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company Industries')]")
    public WebElement CompanyIndustriesTab;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company Asset Experience')]")
    public WebElement CompanyAssetExperienceTab;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company Headquarters')]")
    public WebElement CompanyHeadquartersTab;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Company Regional Offices')]")
    public WebElement CompanyRegionalOfficesTab;

    @FindBy(how = How.XPATH, using = "//*[local-name()='svg' and @class = 'w-3 h-3 text-gray-600']")
    public List<WebElement> SettingsIcon;

    @FindBy(how = How.XPATH, using = "//*[starts-with(@id,\"headlessui-menu-items\")]")
    public WebElement SettingsDropDownList;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Copy Chart \"]")
    public WebElement  CopyChartButton;


}
