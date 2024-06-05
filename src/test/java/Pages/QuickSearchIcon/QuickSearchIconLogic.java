package Pages.QuickSearchIcon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class QuickSearchIconLogic extends QuickSearchIconPO{
    public QuickSearchIconLogic(){super();}

    public void iAmOnBisCredListPageAndWantToSearchAboutCompanyUsingQuickSearchIcon() {
        goToURL("https://dashboard.beta.biscred.net/lists");
    }

    public void clickOnSearchIconOnTopNavMenu() throws InterruptedException {
        Thread.sleep(3000);
        waitForElementToAppear(QuickSearchIcon,20);
        clickOnElement(QuickSearchIcon);
    }

    public void validateSeeASearchIconPopUpDisplay() throws InterruptedException {
//        Thread.sleep(1000);
        waitForElementToAppear(QuickSearchIconPopUp,20);
        assertDisplayed(QuickSearchIconPopUp);
    }

    public void iTypeAnyCompanyNameIntoQuickSearchBar() throws InterruptedException {
        clickOnElement(QuickSearchBarField);
        Thread.sleep(2000);
        sendElementText(QuickSearchBarField,"cbre");
    }

    public void iTypeAnyContactNameIntoQuickSearchBar() {
        clickOnElement(QuickSearchBarField);
        sendElementText(QuickSearchBarField,"Andrew");
    }

    public void iClickOnCtrlKKeysAtTheSameTime() throws InterruptedException {
        String openQuickSearchIcon = Keys.chord(Keys.CONTROL, "k");
        Thread.sleep(2000);
        body.sendKeys(openQuickSearchIcon);
    }

    public void validateSearchPopUpClosed() throws InterruptedException {
        Thread.sleep(5000);
//        waitForElementToAppear(QuickSearchIconPopUp,20);
//        assertIfTrue(!QuickSearchIconPopUp.getSize().equals(0));
        assertDisplayed(QuickSearchIconPopUpTemp);
    }

    public void clickOnEscKKeys() {
        String openQuickSearchIcon = Keys.chord(Keys.ESCAPE);
        body.sendKeys(openQuickSearchIcon);
    }

    public void clickAnywhereOutsideTheModule() {
        Actions action = new Actions(driver);
       action.moveByOffset(0, 0).click().build().perform();
    }

    public void clickOnRecentSearchTab() {
        clickOnElement(RecentSearchTab.get(0));
    }

    public void validateRedirectToTheSearchResultsPage() throws InterruptedException {
      Thread.sleep(2000);
        assertDisplayed(SearchResultsPage);
    }
}
