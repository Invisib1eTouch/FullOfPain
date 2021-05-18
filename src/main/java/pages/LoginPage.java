package pages;

import baseEntities.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    // Locators
    private static final By emailInputBy = By.id("name");
    private static final By passInputBy = By.id("password");
    private static final By loginButtonBy = By.id("button_primary");
    private static final By errorLabelBy = By.className("error-text");
    private static final By fieldErrorBy = By.className("loginpage-message-image");
    protected static final By errorMessageBy = By.className("error-text");
    protected static final By blankEmailFieldErrorMessageBy = By.xpath("//*[contains(text(), 'Email/Login is required.')]");
    protected static final By blankPasswordFieldErrorMessageBy = By.xpath("//*[contains(text(), 'Password is required.')]");

    public LoginPage(BrowserService browserService) {
        super(browserService, "/auth/login");
    }

    @Override
    protected By getIndicatorThatPageOpenedElementLocator() {
        return loginButtonBy;
    }

    public WebElement getEmailInput() {
        return this.driver.findElement(emailInputBy);
    }

    public WebElement getPassInput() {
        return this.driver.findElement(passInputBy);
    }

    public WebElement getLoginBtn() {
        return this.driver.findElement(loginButtonBy);
    }

    public WebElement getErrorLabel() {
        return this.driver.findElement(errorLabelBy);
    }

    public WebElement getFieldError() {
        return this.driver.findElement(fieldErrorBy);
    }

    public WebElement getErrorMessage() {
        return driver.findElement(errorMessageBy);
    }

    public WebElement getBlankEmailFieldErrorMessage(){
        return driver.findElement(blankEmailFieldErrorMessageBy);
    }

    public WebElement getBlankPasswordFieldErrorMessage(){
        return driver.findElement(blankPasswordFieldErrorMessageBy);
    }

}
