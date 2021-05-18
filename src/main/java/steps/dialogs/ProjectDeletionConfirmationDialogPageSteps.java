package steps.dialogs;

import baseEntities.BaseStep;
import core.BrowserService;
import pages.dialogs.ProjectDeletionConfirmationDialogPage;
import steps.ProjectOverviewPageSteps;

public class ProjectDeletionConfirmationDialogPageSteps extends BaseStep<ProjectDeletionConfirmationDialogPage> {

    public ProjectDeletionConfirmationDialogPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public ProjectDeletionConfirmationDialogPageSteps openPage() {
        return this;
    }

    public ProjectOverviewPageSteps confirmDeletion(){
        this.page.getConfirmationCheckbox().click();
        this.page.getOkButton().click();
        return new ProjectOverviewPageSteps(browserService);
    }
}
