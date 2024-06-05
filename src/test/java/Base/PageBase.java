package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class PageBase {

    public WebDriver driver;

    public PageBase() {
        this.driver = Hooks.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void goToURL(String url) {
        driver.get(url);
    }

    public void waitSeconds(long timeInSeconds){
        driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
    }


    public void waitForVisibility(WebElement webElement, int seconds) {
        Duration durationInSeconds = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, durationInSeconds);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public By getByFromElement(WebElement webElement) {

        By by;
        String[] selectorWithValue = (webElement.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + "")).split(":");

        String selector = selectorWithValue[0].trim();
        String value = selectorWithValue[1].trim();

        switch (selector) {
            case "id":
                by = By.id(value);
                break;
            case "className":
                by = By.className(value);
                break;
            case "tagName":
                by = By.tagName(value);
                break;
            case "xpath":
                by = By.xpath(value);
                break;
            case "cssSelector":
                by = By.cssSelector(value);
                break;
            case "linkText":
                by = By.linkText(value);
                break;
            case "name":
                by = By.name(value);
                break;
            case "partialLinkText":
                by = By.partialLinkText(value);
                break;
            default:
                throw new IllegalStateException("locator : " + selector + " not found!!!");
        }
        return by;
    }

    public void waitForUnVisibility(WebElement webElement, int seconds) {
        Duration durationInSeconds = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, durationInSeconds);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public void assertDisplayed(WebElement webElement) {
        Assert.assertTrue(webElement.isDisplayed());
    }

    public void assertNotDisplayed(WebElement webElement) {
        Assert.assertFalse(webElement.isDisplayed());
    }

    public void clickOnElement(WebElement webElement) {
        webElement.click();
    }

    public String getElementText(WebElement webElement) {
        return webElement.getText();
    }

    public void assertElementText(WebElement webElement,String text){Assert.assertEquals(webElement.getText(),text);}

    public void assertElementContainsText(List<WebElement> webElements,String text){
        int size = webElements.size();
        for (int i=0;i<size;i++){
            Assert.assertTrue(webElements.get(i).getText().contains(text));
        }
    }

    public void assertElementContainsSomeText(WebElement elements, String expectedText) {
        String[] words = expectedText.split("\\s+");
        String actualText = elements.getText();

        boolean containsWord = false;
        for (String word : words) {
            if (actualText.contains(word)) {
                containsWord = true;
                break;
            }
        }

        Assert.assertTrue(containsWord, actualText );
    }



    public void sendElementText(WebElement webElement, String text) {
        webElement.sendKeys(text);
    }

    public void selectFromDropdownWithValue(WebElement webElement, String value) {
        Select select = new Select(webElement);
        select.selectByValue(value);
    }
    public  void selectFromUnOrderList(WebElement webElement, int index) {
        // Locate all the list items within the ul dropdown list
        List<WebElement> options = webElement.findElements(By.tagName("li"));

        // Check if the index is within the bounds
        if (index >= 0 && index < options.size()) {
            WebElement desiredOption = options.get(index);
            desiredOption.click(); // Click the desired option
        } else {
            System.out.println("Invalid index provided!");
        }
    }

    public void selectFromDropdownWithIndex(WebElement webElement, int index) {
        Select select = new Select(webElement);
        select.selectByIndex(index);
    }

    public void goToElement(WebElement webElement) {
        Actions actions = new Actions(driver);
        actions.scrollToElement(webElement);
    }

    public void scrollDownToElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", webElement);
    }

    public void scrollDownToEndOfScreen() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void scrollUpToElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'start' });", webElement);
    }

    public void scrollUpToStartOfScreen() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
    }

    public void swipeToElement(WebElement webElement) {
        Point location = webElement.getLocation();
        int x = location.getX();
        int y = location.getY();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(" + x + ", " + y + ");");
    }

    public Boolean elementEnabled(WebElement webElement)
    {
        return webElement.isEnabled();
    }

    public void assertIfTrue(Boolean bool)
    {
        Assert.assertTrue(bool);
    }
    public void assertIfFalse(Boolean bool)
    {
        Assert.assertFalse(bool);
    }

    public void waitForElementToAppear(WebElement webElement, int durationInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(durationInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
