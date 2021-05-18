package steps;

import baseEntities.BaseStep;
import core.BrowserService;
import pages.LoginPage;

public class LoginPageSteps extends BaseStep<LoginPage> {

    public LoginPageSteps(BrowserService browserService) {
        super(browserService);
    }

    public LoginPageSteps loginWithIncorrectCredentials(String login, String password){
        this.page.getEmailInput().sendKeys(login);
        this.page.getPassInput().sendKeys(password);
        this.page.getLoginBtn().click();
        return this;
    }

    public DashboardPageSteps loginWithCorrectCredentials(String login, String password){
        this.page.getEmailInput().sendKeys(login);
        this.page.getPassInput().sendKeys(password);
        this.page.getLoginBtn().click();
        return new DashboardPageSteps(this.browserService);
    }


    @Override
    public LoginPageSteps openPage() {
        this.page.open();
        return this;
    }
}
