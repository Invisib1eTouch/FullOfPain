package pages.dialogs;

import baseEntities.BasePage;
import core.BrowserService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProjectDeletionConfirmationDialogPage extends BasePage {
    protected static final By confirmationCheckboxBy = By.xpath("//div[@class = 'dialog ui-dialog-content ui-widget-content']//child::input");
    protected static final By okButtonBy = By.xpath("//div[@class = 'dialog ui-dialog-content ui-widget-content']//child::a[contains(text(), 'OK')]");

    public ProjectDeletionConfirmationDialogPage(BrowserService browserService) {
        super(browserService, null);
    }

    @Override
    protected By getIndicatorThatPageOpenedElementLocator() {
        return confirmationCheckboxBy;
    }


    public WebElement getConfirmationCheckbox(){
        return driver.findElement(confirmationCheckboxBy);
    }

    public WebElement getOkButton(){
        return driver.findElement(okButtonBy);
    }

}
