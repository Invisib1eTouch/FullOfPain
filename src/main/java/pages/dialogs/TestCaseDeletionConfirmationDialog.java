package pages.dialogs;

import baseEntities.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCaseDeletionConfirmationDialog extends BasePage {
    protected static final By markAsDeletedButtonBy = By.xpath("//a[contains(text(), 'Mark as Deleted')]");

    public TestCaseDeletionConfirmationDialog(BrowserService browserService) {
        super(browserService, null);
    }

    public WebElement getMarkAsDeletedButton(){
        return driver.findElement(markAsDeletedButtonBy);
    }

    @Override
    protected By getIndicatorThatPageOpenedElementLocator() {
        return markAsDeletedButtonBy;
    }
}
