package Pages.Login;

import Pages.Common.CommonPO;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPO extends CommonPO {

    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public WebElement EmailTextField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
    public WebElement PasswordTextBox;

    @FindBy(how = How.XPATH, using = "//button[text()=\" Sign in \"]")
    public WebElement SignInButton;

    public LoginPO(){
        super();
    }
}
