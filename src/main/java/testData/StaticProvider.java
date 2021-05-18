package testData;

//import enums.ProjectType;
import enums.ProjectType;
import enums.TestCaseFields.*;
import org.testng.annotations.DataProvider;

public class StaticProvider {
    private static final String ALPHABETIC_STRING = "MaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthTextMaxLengthText";
    private static String DATE_TIME_LENGTH_250 = "12345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789w";

    @DataProvider(name = "InvalidUserName")
    public static Object[][] loginWithInvalidUserNameData() {
        return new Object[][]{
                {"!@#$%^&*()_+-=`~[]{}|;':,./<>?", "QqtRK9elseEfAk6ilYcJ"},
                {"人人都爱喝可乐", "QqtRK9elseEfAk6ilYcJ"},
                {"<b>text</b>", "QqtRK9elseEfAk6ilYcJ"},
                {"SELECT * FROM USERS", "QqtRK9elseEfAk6ilYcJ"},
                {"javascript:alert(‘I have a bad news for you’);", "QqtRK9elseEfAk6ilYcJ"}
        };
    }

    @DataProvider(name = "InvalidPassword")
    public static Object[][] loginWithInvalidPassword() {
        return new Object[][]{
                {"atrostyanko+0401@gmail.com", "!@#$%^&*()_+-=`~[]{}|;':,./<>?"},
                {"atrostyanko+0401@gmail.com", "人人都爱喝可乐"},
                {"atrostyanko+0401@gmail.com", "<b>text</b>"},
                {"atrostyanko+0401@gmail.com", "SELECT * FROM USERS"},
                {"atrostyanko+0401@gmail.com", "javascript:alert(‘I have a bad news for you’);"}
        };
    }

    @DataProvider(name = "InvalidUserNameAndPassword")
    public static Object[][] loginWithInvalidUserNameAndPassword() {
        return new Object[][]{
                {"!@#$%^&*()_+-=`~[]{}|;':,./<>?", "!@#$%^&*()_+-=`~[]{}|;':,./<>?"},
                {"人人都爱喝可乐", "人人都爱喝可乐"},
                {"<b>text</b>", "<b>text</b>"},
                {"SELECT * FROM USERS", "SELECT * FROM USERS"},
                {"javascript:alert(‘I have a bad news for you’);", "javascript:alert(‘I have a bad news for you’);"}
        };
    }

    @DataProvider(name = "BlankPassword")
    public static Object[][] loginWithBlankPassword() {
        return new Object[][]{
                {"atrostyanko+0401@gmail.com", ""},
                {"atrostyanko+0401@gmail.com", "       "},
                {"!@#$%^&*()_+-=`~[]{}|;':,./<>?", ""},
                {"!@#$%^&*()_+-=`~[]{}|;':,./<>?", "       "},
                {"人人都爱喝可乐", ""},
                {"人人都爱喝可乐", "       "},
                {"<b>text</b>", ""},
                {"<b>text</b>", "       "},
                {"SELECT * FROM USERS", ""},
                {"SELECT * FROM USERS", "       "},
                {"javascript:alert(‘I have a bad news for you’);", ""},
                {"javascript:alert(‘I have a bad news for you’);", "       "}
        };
    }

    @DataProvider(name = "BlankUserName")
    public static Object[][] loginWithBlankUserName() {
        return new Object[][]{
                {"", "QqtRK9elseEfAk6ilYcJ"},
                {"       ", "QqtRK9elseEfAk6ilYcJ"},
                {"", "!@#$%^&*()_+-=`~[]{}|;':,./<>?"},
                {"      ", "!@#$%^&*()_+-=`~[]{}|;':,./<>?"},
                {"", "人人都爱喝可乐"},
                {"      ", "人人都爱喝可乐"},
                {"", "<b>text</b>"},
                {"      ", "<b>text</b>"},
                {"", "SELECT * FROM USERS"},
                {"      ", "SELECT * FROM USERS"},
                {"", "javascript:alert(‘I have a bad news for you’);"},
                {"       ", "javascript:alert(‘I have a bad news for you’);"}
        };
    }

    @DataProvider(name = "ProjectCreation")
    public static Object[][] createProject() {
        return new Object[][]{
                {"ATkachou " + ProjectType.SINGLE_FOR_ALL_CASES.toString(), "Announcement Message",
                        ProjectType.SINGLE_FOR_ALL_CASES},
                {"ATkachou " + ProjectType.SINGLE_FOR_WITH_BASELINE.toString(), "Announcement Message",
                        ProjectType.SINGLE_FOR_WITH_BASELINE},
                {"ATkachou " + ProjectType.MULTIPLE.toString(), "Announcement Message", ProjectType.MULTIPLE}
        };
    }

    @DataProvider(name = "ProjectCreationForTestCases")
    public static Object[][] createProjectForTestCases() {
        return new Object[][]{
                {"1ATkachou - Project For Test Cases", "Announcement Message",
                        ProjectType.SINGLE_FOR_ALL_CASES}
        };
    }

    @DataProvider(name = "TestCaseCreation")
    public static Object[][] createTestCase() {
        int cnt = 0;

        return new Object[][]{
                {
                        (++cnt) + ". Default values",
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.OTHER,
                        PriorityType.MEDIUM,
                        "",
                        "",
                        AutomationType.NONE,
                        "",
                        "",
                        "",
                        "",
                        ""
                },
                {
                        (++cnt) + ". Long values in inputs " + ALPHABETIC_STRING,
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.OTHER,
                        PriorityType.MEDIUM,
                        "1h",
                        ALPHABETIC_STRING,
                        AutomationType.NONE,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        "",
                        ""
                },
                {
                        (++cnt) + ". " + TemplateType.TEST_CASE_TEXT + " and " + TestCaseType.ACCESSIBILITY + " and " +
                                PriorityType.CRITICAL + " and " + AutomationType.NONE,
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.ACCESSIBILITY,
                        PriorityType.CRITICAL,
                        DATE_TIME_LENGTH_250,
                        ALPHABETIC_STRING,
                        AutomationType.NONE,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        "",
                        ""
                },
                {
                        (++cnt) + ". " + TemplateType.EXPLORATORY_SESSION + " and " + TestCaseType.AUTOMATED + " and " +
                                PriorityType.MEDIUM + " and " + AutomationType.NONE,
                        SectionType.TEST_CASES,
                        TemplateType.EXPLORATORY_SESSION,
                        TestCaseType.AUTOMATED,
                        PriorityType.MEDIUM,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.NONE,
                        "",
                        "",
                        "",
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING
                },
                {
                        (++cnt) + ". " + TemplateType.TEST_CASE_TEXT + " and " + TestCaseType.COMPATIBILITY + " and " +
                                PriorityType.LOW + " and " + AutomationType.RANOREX,
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.COMPATIBILITY,
                        PriorityType.LOW,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.RANOREX,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        "",
                        ""
                },
                {
                        (++cnt) + ". " + TemplateType.EXPLORATORY_SESSION + " and " + TestCaseType.FUNCTIONAL + " and " +
                                PriorityType.HIGH + " and " + AutomationType.RANOREX,
                        SectionType.TEST_CASES,
                        TemplateType.EXPLORATORY_SESSION,
                        TestCaseType.FUNCTIONAL,
                        PriorityType.HIGH,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.RANOREX,
                        "",
                        "",
                        "",
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING
                },
                {
                        (++cnt) + ". " + TemplateType.TEST_CASE_TEXT + " and " + TestCaseType.OTHER + " and " +
                                PriorityType.MEDIUM + " and " + AutomationType.NONE,
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.OTHER,
                        PriorityType.MEDIUM,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.NONE,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        "",
                        ""
                },
                {
                        (++cnt) + ". " + TemplateType.EXPLORATORY_SESSION + " and " + TestCaseType.REGRESSION + " and " +
                                PriorityType.CRITICAL + " and " + AutomationType.NONE,
                        SectionType.TEST_CASES,
                        TemplateType.EXPLORATORY_SESSION,
                        TestCaseType.REGRESSION,
                        PriorityType.CRITICAL,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.NONE,
                        "",
                        "",
                        "",
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING
                },
                {
                        (++cnt) + ". " + TemplateType.TEST_CASE_TEXT + " and " + TestCaseType.SECURITY + " and " +
                                PriorityType.HIGH + " and " + AutomationType.RANOREX,
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.SECURITY,
                        PriorityType.HIGH,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.RANOREX,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        "",
                        ""
                },
                {
                        (++cnt) + ". " + TemplateType.EXPLORATORY_SESSION + " and " + TestCaseType.USABILITY + " and " +
                                PriorityType.LOW + " and " + AutomationType.RANOREX,
                        SectionType.TEST_CASES,
                        TemplateType.EXPLORATORY_SESSION,
                        TestCaseType.USABILITY,
                        PriorityType.LOW,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.RANOREX,
                        "",
                        "",
                        "",
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING
                },
                {
                        (++cnt) + ". " + TemplateType.TEST_CASE_TEXT + " and " + TestCaseType.ACCEPTANCE + " and " +
                                PriorityType.CRITICAL + " and " + AutomationType.NONE,
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.ACCEPTANCE,
                        PriorityType.CRITICAL,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.NONE,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        "",
                        ""
                },
                {
                        (++cnt) + ". " + TemplateType.EXPLORATORY_SESSION + " and " + TestCaseType.DESTRUCTIVE + " and " +
                                PriorityType.HIGH + " and " + AutomationType.RANOREX,
                        SectionType.TEST_CASES,
                        TemplateType.EXPLORATORY_SESSION,
                        TestCaseType.DESTRUCTIVE,
                        PriorityType.HIGH,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.RANOREX,
                        "",
                        "",
                        "",
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING
                },
                {
                        (++cnt) + ". " + TemplateType.TEST_CASE_TEXT + " and " + TestCaseType.PERFORMANCE + " and " +
                                PriorityType.MEDIUM + " and " + AutomationType.NONE,
                        SectionType.TEST_CASES,
                        TemplateType.TEST_CASE_TEXT,
                        TestCaseType.PERFORMANCE,
                        PriorityType.MEDIUM,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.NONE,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING,
                        "",
                        ""
                },
                {
                        (++cnt) + ". " + TemplateType.EXPLORATORY_SESSION + " and " + TestCaseType.SMOKE_AND_SANITY + " and " +
                                PriorityType.LOW + " and " + AutomationType.RANOREX,
                        SectionType.TEST_CASES,
                        TemplateType.EXPLORATORY_SESSION,
                        TestCaseType.SMOKE_AND_SANITY,
                        PriorityType.LOW,
                        "1d",
                        ALPHABETIC_STRING,
                        AutomationType.RANOREX,
                        "",
                        "",
                        "",
                        ALPHABETIC_STRING,
                        ALPHABETIC_STRING
                }
        };
    }
}
