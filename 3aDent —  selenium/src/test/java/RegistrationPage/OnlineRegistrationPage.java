package RegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlineRegistrationPage {
    public static WebElement element = null;
    //________________________________________________________Send Keys Voids______________________________________________________________________
    public static void FillInPatientName(WebDriver driver, String Test){
        element = PatientName(driver);
        element.sendKeys(Test);
    }
    public static void FillInPatientLastName(WebDriver driver, String Test){
        element = PatientLastName(driver);
        element.sendKeys(Test);
    }
    public static void FillInPhoneNumber(WebDriver driver, String PhoneNumber){
        element = PhoneNumber(driver);
        element.sendKeys(PhoneNumber);
    }
    public static void FillInCalendarField(WebDriver driver, String Date){
        element = Calendar(driver);
        element.sendKeys(Date);
    }
    public static void FillInProblemDescription(WebDriver driver, String Problem){
        element = ProblemDescription(driver);
        element.sendKeys(Problem);
    }




        //________________________________________________________Buttons to transfer to the register form_________________________________________
        public static WebElement OnlineRegistrationButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Online запис']"));
        return element;
    }
    public static WebElement OnlineRegistrationButton2(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Записатись на прийом']"));
        return element;
    }
    public static void GetTheOnlineRegistrationPage(WebDriver driver){
        driver.get("https://www.3-adent.com.ua/online-zapise/reservuvati/");
    }

    //_________________________________________________________Here is a fields for the online registration___________________________________
    public static WebElement PatientName(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='id_name']"));
        return element;
    }
    public static WebElement PatientLastName(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='id_prizv']"));
        return element;
    }
    public static WebElement PhoneNumber(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='id_tel']"));
        return element;
    }
    public static WebElement Calendar(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='form_date_picker']"));
        return element;
    }
    public static WebElement ProblemDescription(WebDriver driver){
        element = driver.findElement(By.xpath("//textarea[@id='id_problem']"));
        return element;
    }

 }