package steps;

import baseEntities.BaseStep;
import core.BrowserService;
import models.Project;
import org.openqa.selenium.WebElement;
import pages.EditProjectPage;

public class EditProjectPageSteps extends BaseStep<EditProjectPage> {

    public EditProjectPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public EditProjectPageSteps openPage() {
        return this;
    }

    public ProjectOverviewPageSteps editAndSaveProject(Project project) {

        this.page.getName().clear();
        this.page.getName().sendKeys(project.getName());
        this.page.getAnnouncement().clear();
        this.page.getAnnouncement().sendKeys(project.getAnnouncement());
        if (!project.isShowAnnouncement()) {
            this.page.getIsShowAnnouncement().click();
        }
        switch (project.getProjectType()) {
            case SINGLE_FOR_ALL_CASES:
                for (WebElement types : this.page.getProjectTypes()) {
                    if (types.getAttribute("value").equals("2")) {
                        types.click();
                    }
                }
                break;
            case SINGLE_FOR_WITH_BASELINE:
                for (WebElement types : this.page.getProjectTypes()) {
                    if (types.getAttribute("value").equals("3")) {
                        types.click();
                    }
                }
                break;
            default:
                for (WebElement types : this.page.getProjectTypes()) {
                    if (types.getAttribute("value").equals("1")) {
                        types.click();
                    }
                }
                break;
        }
        this.page.getSaveProjectButton().click();
        return new ProjectOverviewPageSteps(browserService);
    }
}
