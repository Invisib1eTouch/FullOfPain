package pages;

import baseEntities.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProjectOverviewPage extends BasePage {
    protected static final By addProjectButtonBy = By.xpath("//a[contains(text(), 'Add Project')]");
    protected static final By successMessageBy = By.className("message-success");
    protected static final By projectListBy = By.xpath("//tr[contains(@class, 'hoverSensitive')]/child::td[not(@class = 'action')]/child::a");
    protected static final By dashboardTabBy = By.id("navigation-dashboard");

    public ProjectOverviewPage(BrowserService browserService) {
        super(browserService, "/admin/projects/overview");
    }

    @Override
    protected By getIndicatorThatPageOpenedElementLocator() {
        return addProjectButtonBy;
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessageBy).getText();
    }

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButtonBy);
    }

    public List<WebElement> getProjectList() {
        return driver.findElements(projectListBy);
    }

    public WebElement getDashBoardTab() {
        return driver.findElement(dashboardTabBy);
    }

    public WebElement getProjectFromList(String projectName) {
        return driver.findElement(By.xpath("//a[contains(text(), '" + projectName + "')]"));
    }

    public WebElement getDeleteProject(String projectName) {
        return driver.findElement(By.xpath("//a[contains(text(), '" + projectName + "')]/ancestor::tr/child::td/child::a[contains(@href, 'javascript:void(0)' )]"));
    }

}
