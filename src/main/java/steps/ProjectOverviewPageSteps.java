package steps;

import baseEntities.BaseStep;
import core.BrowserService;
import pages.ProjectOverviewPage;
import steps.dialogs.ProjectDeletionConfirmationDialogPageSteps;

public class ProjectOverviewPageSteps extends BaseStep<ProjectOverviewPage> {

    public ProjectOverviewPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public ProjectOverviewPageSteps openPage() {
        return this;
    }

    public ProjectDeletionConfirmationDialogPageSteps deleteProject(String projectName) {
        this.page.getDeleteProject(projectName).click();
        return new ProjectDeletionConfirmationDialogPageSteps(browserService);
    }

    public EditProjectPageSteps editProject(String projectName) {
        this.page.getProjectFromList(projectName).click();
       return new EditProjectPageSteps(browserService);
    }


}
