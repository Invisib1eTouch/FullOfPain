package steps;

import baseEntities.BaseStep;
import core.BrowserService;
import pages.AdministrationOverviewPage;

public class AdministrationOverviewPageSteps extends BaseStep<AdministrationOverviewPage> {

    public AdministrationOverviewPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public AdministrationOverviewPageSteps openPage() {
        return this;
    }

    public ProjectOverviewPageSteps openProjectOverviewPageByButton(){
        this.page.getSideDarProjectButton().click();
        return new ProjectOverviewPageSteps(browserService);
    }

}
