package RegistrationPage;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static RegistrationPage.OnlineRegistrationPage.*;
import static com.codeborne.selenide.Condition.value;
public class OnlineRegistrationScenarioTests {
    @Test
    public void RegistrationFillInPositive1(WebDriver driver) {

        GetTheOnlineRegistrationPage(driver);
        FillInPatientName(driver, "Test");
        FillInPatientLastName(driver, "Test");;
        FillInPhoneNumber(driver, "0681845213");
        Calendar(driver).clear();
        FillInCalendarField(driver,"2019-05-25");
        Calendar(driver).sendKeys(Keys.TAB);
        FillInProblemDescription(driver,"Нужно срочно всё протестировать");
        ProblemDescription(driver).equals(value("Нужно срочно всё протестировать"));
    }

    @Test
    public void RegistrationProblemDescriptionEmpty2(WebDriver driver) {
        GetTheOnlineRegistrationPage(driver);
        FillInPatientName(driver, "Test");
        FillInPatientLastName(driver, "Test");;
        FillInPhoneNumber(driver, "0681845213");
        Calendar(driver).clear();
        FillInCalendarField(driver,"2019-05-25");
        Calendar(driver).sendKeys(Keys.TAB);
    }
    @Test
    public void RegistrationProblemDescriptionTooLong(WebDriver driver) {
        //Given acceptance criteria that we can't send uniform with two much symbols
        //All the data according to positive conditions of TestCase except Problem Description

        GetTheOnlineRegistrationPage(driver);
        FillInPatientName(driver, "Test");
        FillInPatientLastName(driver, "Test");;
        FillInPhoneNumber(driver, "0681845213");
        Calendar(driver).clear();
        FillInCalendarField(driver,"2019-05-25");
        Calendar(driver).sendKeys(Keys.TAB);
        FillInProblemDescription(driver,"Нужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестироватьНужно срочно всё протестировать");
    }
}
