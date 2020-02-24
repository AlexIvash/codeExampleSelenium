package HomePage;

import com.codeborne.selenide.Configuration;
import org.junit.*;
import org.openqa.selenium.WebDriver;

import static GooglePage.GooglePage.*;
import static HomePage.HomePageLocators.*;
import static RegistrationPage.OnlineRegistrationPage.OnlineRegistrationButton;
import static RegistrationPage.OnlineRegistrationPage.OnlineRegistrationButton2;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.open;

public class HomePageLocatorsTest {

    @Before
    public void setUp() {
        System.out.println("I am going to be launched before every test");
       System.setProperty("webdriver.chrome.driver", "C:/Program Files/JetBrains/chromedriver.exe");
        Configuration.browser="chrome";
        Configuration.startMaximized=true;
        Configuration.pageLoadStrategy="normal";
    }
        @After
                public void TearDown(){
            System.out.println("I am going to be launched after every test");
    }
    @BeforeClass
    public static void setUpAll() {
        System.out.println("I am going to be launched before this one Class. But I should be a static");
    }
    @AfterClass
    public static void TearDownAll(){
        System.out.println("I am going to be launched after this one class. But I should be a static");
    }
//_______________________________________________Here is all the links for the pages_______________________________________________________________________
    public static void OpenMeHomePage(String HomePageURL) {
        open(HomePageURL);
        Configuration.holdBrowserOpen = true;
    }

//_____________________________________________Here is all the tests ______________________________________________________________________________________


    @Test
    public void GoogleFind(WebDriver driver, String Google, String FirstValue) {
        open(Google);
        FillInGoogleInput(driver, "3adent");
        FindButton(driver).click();
        FirstValueURL(driver).equals(value(FirstValue));
        FirstLink(driver).click();
    }
    @Test
    public void menuExists(WebDriver driver, String HomePageURL) {
        OpenMeHomePage(HomePageURL);
        CariesTreatmentButton(driver).isDisplayed();
        ToothCanalTreatmentButton(driver).isDisplayed();
        PeriodontologyButton(driver).isDisplayed();
        AdultSurgeryButton(driver).isDisplayed();
        ImplantationButton(driver).isDisplayed();
        OrthodonticsButton(driver).isDisplayed();
        ChildSurgeryButton(driver).isDisplayed();
        ProstheticsButton(driver).isDisplayed();
        ChildSurveyButton(driver).isDisplayed();
    }
    @Test
    public void SurgeryAssertions(WebDriver driver, String HomePageURL) {
        OpenMeHomePage(HomePageURL);
        SurgeryButton(driver).getText();
        SurgeryButton(driver).isDisplayed();
    }
    @Test
    public void ChildSurgeryAssertions(WebDriver driver, String HomePageURL) {
        OpenMeHomePage(HomePageURL);
        ChildSurgeryButton(driver).equals(value("Дитяча хірургія"));
    }
    @Test
    public void PassToRegistration(WebDriver driver, String HomePageURL) {
        //I am on the main 3aDent Page
        //We are going to get on the page of an online registration to the Doctor

        OpenMeHomePage(HomePageURL);

        OnlineRegistrationButton(driver).click();
        OnlineRegistrationButton2(driver).click();
}
}