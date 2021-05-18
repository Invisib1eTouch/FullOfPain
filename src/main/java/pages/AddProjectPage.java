package pages;

import baseEntities.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddProjectPage extends BasePage {
    protected static final By nameBy = By.id("name");
    protected static final By announcementBy = By.id("announcement");
    protected static final By isShowAnnouncementBy = By.id("show_announcement");
    protected static final By projectTypesBy = By.cssSelector("[name = suite_mode]");
    protected static final By addProjectButtonBy = By.id("accept");


    public AddProjectPage(BrowserService browserService) {
        super(browserService, "/admin/projects/add/1");
    }

    @Override
    protected By getIndicatorThatPageOpenedElementLocator() {
        return addProjectButtonBy;
    }

    public WebElement getName() {
        return driver.findElement(nameBy);
    }

    public WebElement getAnnouncement() {
        return driver.findElement(announcementBy);
    }

    public WebElement getIsShowAnnouncement() {
        return driver.findElement(isShowAnnouncementBy);
    }

    public List<WebElement> getProjectTypes() {
        return driver.findElements(projectTypesBy);
    }

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButtonBy);
    }
}
