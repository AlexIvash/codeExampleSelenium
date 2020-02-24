package RegistrationPage;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static RegistrationPage.OnlineRegistrationPage.*;

public class OnlineRegistrationSimpleTest {


    @Test
    public void UncorrectSymbolsInCalendar(WebDriver driver){
        GetTheOnlineRegistrationPage(driver);
        Calendar(driver).equals("");
    }
    @Test
    public void WhiteSpacesInCalendar(WebDriver driver){
        GetTheOnlineRegistrationPage(driver);
        Calendar(driver).click();
        FillInCalendarField(driver, "2019-05-25");
        Calendar(driver).equals("");
    }
    @Test
    public void ProblemFieldPositiveTest(WebDriver driver) {
        GetTheOnlineRegistrationPage(driver);
        ProblemDescription(driver).click();
        FillInProblemDescription(driver,"");
        Calendar(driver).equals("");
    }
    @Test
    public void ProblemFieldTest(WebDriver driver) {
        ProblemDescription(driver).click();
        FillInProblemDescription(driver,"111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
       ProblemDescription(driver).equals("Нужно срочно всё протестировать");
    }
}