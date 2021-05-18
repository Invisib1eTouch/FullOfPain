package tests;

import baseEntities.BaseTest;
import enums.ProjectType;
import models.Project;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.ProjectOverviewPage;
import steps.LoginPageSteps;
import testData.StaticProvider;

public class ProjectCRUD extends BaseTest {

    @Test(dataProvider = "ProjectCreation", dataProviderClass = StaticProvider.class)
    public void createProject(String projectName, String announcement, ProjectType projectType){
        Project project = new Project();
        project.setName(projectName);
        project.setAnnouncement(announcement);
        project.setShowAnnouncement(true);
        project.setProjectType(projectType);

        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);

        ProjectOverviewPage projectOverviewPage = loginPageSteps
                .openPage()
                .loginWithCorrectCredentials("atrostyanko+0401@gmail.com", "QqtRK9elseEfAk6ilYcJ")
                .addProject()
                .createProject(project)
                .getPageInstance();

        Assert.assertEquals(projectOverviewPage.getSuccessMessage(), "Successfully added the new project.");
    }

    @Test(dependsOnMethods = {"createProject"}, dataProvider = "ProjectCreation", dataProviderClass = StaticProvider.class)
    public void editProject(String projectName, String announcement, ProjectType projectType){
        Project project = new Project();
        project.setName(projectName + " Edited");
        project.setAnnouncement(announcement + " Edited");
        project.setShowAnnouncement(false);
        project.setProjectType(projectType);

        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);

        ProjectOverviewPage projectOverviewPage = loginPageSteps
                .openPage()
                .loginWithCorrectCredentials("atrostyanko+0401@gmail.com", "QqtRK9elseEfAk6ilYcJ")
                .proceedToAdministrationOverviewPageByButton()
                .openProjectOverviewPageByButton()
                .editProject(projectName)
                .editAndSaveProject(project)
                .getPageInstance();

        Assert.assertEquals(projectOverviewPage.getSuccessMessage(), "Successfully updated the project.");
    }

    @Test(dependsOnMethods = {"editProject"},dataProvider = "ProjectCreation", dataProviderClass = StaticProvider.class)
    public void deleteProject(String projectName, String announcement,
                              ProjectType projectType) {
        LoginPageSteps loginPageSteps = new LoginPageSteps(browserService);

        ProjectOverviewPage projectOverviewPage = loginPageSteps
                .openPage()
                .loginWithCorrectCredentials("atrostyanko+0401@gmail.com", "QqtRK9elseEfAk6ilYcJ")
                .proceedToAdministrationOverviewPageByButton()
                .openProjectOverviewPageByButton()
                .deleteProject(projectName)
                .confirmDeletion()
                .getPageInstance();

        Assert.assertEquals(projectOverviewPage.getSuccessMessage(), "Successfully deleted the project.");
    }

}
