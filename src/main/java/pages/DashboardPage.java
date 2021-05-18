package pages;

import baseEntities.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    protected static final By sideBarAddProjectButtonBy = By.id("sidebar-projects-add");
    protected static final By headerAdministrationButtonBy = By.id("navigation-admin");

    public DashboardPage(BrowserService browserService) {
        super(browserService, "/dashboard");
    }

    @Override
    protected By getIndicatorThatPageOpenedElementLocator() {
        return sideBarAddProjectButtonBy;
    }

    public WebElement getSideBarAddProjectButton() {
        return driver.findElement(sideBarAddProjectButtonBy);
    }

    public WebElement getHeaderAdministrationButton() {
        return driver.findElement(headerAdministrationButtonBy);
    }
}
