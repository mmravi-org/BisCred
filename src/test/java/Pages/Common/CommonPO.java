package Pages.Common;

import Base.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPO extends PageBase {
    @FindBy(how = How.XPATH, using =  "//*[local-name()='svg' and @class = 'w-48 text-primary-500 dark:text-white']")
    public WebElement DashboardUser;


    public CommonPO(){
        super();
    }
}
