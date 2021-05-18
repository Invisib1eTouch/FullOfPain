package pages;

import baseEntities.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdministrationOverviewPage extends BasePage {
    protected static final By sideBarProjectButtonBy = By.id("navigation-sub-projects");

    public AdministrationOverviewPage(BrowserService browserService) {
        super(browserService, "/admin/overview");
    }

    @Override
    protected By getIndicatorThatPageOpenedElementLocator() {
        return sideBarProjectButtonBy;
    }

    public WebElement getSideDarProjectButton(){
        return browserService.getDriver().findElement(sideBarProjectButtonBy);
    }
}
