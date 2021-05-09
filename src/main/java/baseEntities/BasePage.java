package baseEntities;

import core.BrowserService;
import core.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import utils.Waiter;

public abstract class BasePage {
    protected BrowserService browserService;
    protected WebDriver driver;
    protected final static String BASE_URL = new PropertyReader().getUrl();
    protected final String path;

    public BasePage(BrowserService browserService, String path) {
        this.browserService = browserService;
        this.driver = browserService.getDriver();
        this.path = path;

    }

    public void open() {
//        Do open
        this.driver.get(BASE_URL + path);
//        Make sure it's open
        try {
            this.browserService.getWaiter().waitForVisibility(getIndicatorThatPageOpenedElementLocator());
        } catch (TimeoutException e){
            throw new AssertionError("Page was not opened");
        }
    }

    protected abstract By getIndicatorThatPageOpenedElementLocator();

}
