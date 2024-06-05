package Pages.Login;

import Enums.Users;

import java.io.IOException;

import static helpers.helpers.getRegressionEnvironment;


public class LoginLogic extends LoginPO{

    public LoginLogic(){
        super();
    }

    public void goToBisCredLogin() throws IOException, InterruptedException {
        String url = null;
        if (getRegressionEnvironment().equals("beta")) {
            Thread.sleep(1000);
            url = "https://dashboard.beta.biscred.net/";
        }
        else if (getRegressionEnvironment().equals("dev")) {
            url = "https://dashboard.dev.biscred.net/";
        }
        goToURL(url);
    }

    public void EnterAdminCredentials(){
        waitForVisibility(EmailTextField,30);
        sendElementText(EmailTextField, Users.Admin_Email.value);
        waitForVisibility(PasswordTextBox,30);
        sendElementText(PasswordTextBox,Users.Admin_Password.value);
    }



    public void clickOnSignInButton(){
        clickOnElement(SignInButton);
    }

    public void CheckAdminDashboardAppears(){
//        waitForVisibility(DashboardUser,30);
        waitForElementToAppear(DashboardUser,30);
        assertDisplayed(DashboardUser);
    }
}
