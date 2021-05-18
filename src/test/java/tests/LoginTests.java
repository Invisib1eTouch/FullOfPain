package tests;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import steps.LoginPageSteps;
import testData.*;

public class LoginTests extends BaseTest {

    @Test(dataProvider = "InvalidUserName", dataProviderClass = StaticProvider.class)
    public void loginWithInvalidUserName(String username, String password) {
        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);
        LoginPage loginPage = loginPageSteps
                .openPage()
                .loginWithIncorrectCredentials(username, password)
                .getPageInstance();
        Assert.assertEquals(loginPage.getErrorMessage().getText(), "Email/Login or Password is incorrect. Please try again.");
    }

    @Test(dependsOnMethods = {"loginWithInvalidUserName"},dataProvider = "InvalidPassword", dataProviderClass = StaticProvider.class)
    public void loginWithInvalidPassword(String username, String password) {
        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);
        LoginPage loginPage = loginPageSteps
                .openPage()
                .loginWithIncorrectCredentials(username, password)
                .getPageInstance();
        Assert.assertEquals(loginPage.getErrorMessage().getText(), "Email/Login or Password is incorrect. Please try again.");
    }

    @Test(dependsOnMethods = {"loginWithInvalidPassword"}, dataProvider = "InvalidUserNameAndPassword", dataProviderClass = StaticProvider.class)
    public void loginWithInvalidUserNameAndPassword(String username, String password) {
        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);
        LoginPage loginPage = loginPageSteps
                .openPage()
                .loginWithIncorrectCredentials(username, password)
                .getPageInstance();
        Assert.assertEquals(loginPage.getErrorMessage().getText(), "Email/Login or Password is incorrect. Please try again.");
    }

    @Test(dependsOnMethods = {"loginWithInvalidUserNameAndPassword"},dataProvider = "BlankUserName", dataProviderClass = StaticProvider.class)
    public void loginWithBlankUserName(String username, String password) {
        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);
        LoginPage loginPage = loginPageSteps
                .openPage()
                .loginWithIncorrectCredentials(username, password)
                .getPageInstance();
        Assert.assertEquals(loginPage.getBlankEmailFieldErrorMessage().getText(), "Email/Login is required.");
    }

    @Test(dependsOnMethods = {"loginWithBlankUserName"},dataProvider = "BlankPassword", dataProviderClass = StaticProvider.class)
    public void loginWithBlankPassword(String username, String password) {
        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);
        LoginPage loginPage = loginPageSteps
                .openPage()
                .loginWithIncorrectCredentials(username, password)
                .getPageInstance();
        Assert.assertEquals(loginPage.getBlankPasswordFieldErrorMessage().getText(), "Password is required.");
    }

    @Parameters({"userName", "userPassword"})
    @Test(dependsOnMethods = {"loginWithBlankPassword"})
    public void loginWithCorrectCredentials(@Optional("atrostyanko+0401@gmail.com") String username,
                                            @Optional("QqtRK9elseEfAk6ilYcJ") String password) {
        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);
        loginPageSteps
                .openPage()
                .loginWithIncorrectCredentials(username, password)
                .getPageInstance();

        Assert.assertEquals(browserService.getDriver().getTitle(), "All Projects - TestRail");
    }

}
