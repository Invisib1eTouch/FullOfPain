package steps;

import baseEntities.BaseStep;
import core.BrowserService;
import models.Project;
import org.openqa.selenium.WebElement;
import pages.AddProjectPage;

public class AddProjectPageSteps extends BaseStep<AddProjectPage>{


    public AddProjectPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public BaseStep<AddProjectPage> openPage() {
        this.page.open();
        return this;
    }

    public ProjectOverviewPageSteps createProject(Project project){
        this.page.getName().sendKeys(project.getName());
        this.page.getAnnouncement().sendKeys(project.getAnnouncement());
        if (project.isShowAnnouncement()) {
            this.page.getIsShowAnnouncement().click();
        }

        switch (project.getProjectType()) {
            case SINGLE_FOR_ALL_CASES:
                for (WebElement types : this.page.getProjectTypes()) {
                    if (types.getAttribute("value").equals("1")) {
                        types.click();
                    }
                }
                break;
            case SINGLE_FOR_WITH_BASELINE:
                for (WebElement types : this.page.getProjectTypes()) {
                    if (types.getAttribute("value").equals("2")) {
                        types.click();
                    }
                }
                break;
            default:
                for (WebElement types : this.page.getProjectTypes()) {
                    if (types.getAttribute("value").equals("3")) {
                        types.click();
                    }
                }
                break;
        }

        this.page.getAddProjectButton().click();
        return new ProjectOverviewPageSteps(browserService);
    }

}
