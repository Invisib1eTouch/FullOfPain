package steps;

import baseEntities.BaseStep;
import core.BrowserService;
import pages.DashboardPage;

public class DashboardPageSteps extends BaseStep<DashboardPage> {

    public DashboardPageSteps(BrowserService browserService) {
        super(browserService);
    }

    @Override
    public DashboardPageSteps openPage() {
        this.page.open();
        return this;
    }

    public AddProjectPageSteps addProject(){
        this.page.getSideBarAddProjectButton().click();
        return new AddProjectPageSteps(browserService);
    }

    public AdministrationOverviewPageSteps proceedToAdministrationOverviewPageByButton(){
        this.page.getHeaderAdministrationButton().click();
        return new AdministrationOverviewPageSteps(browserService);
    }
}
