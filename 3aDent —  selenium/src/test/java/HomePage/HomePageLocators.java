package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//__________________________________________Here is a links to the pages of the HomePage___________________________________
public class HomePageLocators {
    public static WebElement element = null;
    public static String MainURL() {
        String HomePageURL = "https://www.3-adent.com.ua/";
        return HomePageURL;
    }
        //_____________________________________Here is a menu buttons of the HomePage_____________________________________________

    public static WebElement ProblemDescription(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Професійна гігієна']"));
        return element;
    }
    public static WebElement CariesTreatmentButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Лікування карієсу']"));
        return element;
    }
    public static WebElement ToothCanalTreatmentButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Лікування каналів']"));
        return element;
    }
    public static WebElement PeriodontologyButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Парадонтологія']"));
        return element;
    }
    public static WebElement AdultSurgeryButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Доросла хірургія']"));
        return element;
    }
    public static WebElement ImplantationButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Імплантація']"));
        return element;
    }
    public static WebElement OrthodonticsButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Ортодонтія']"));
        return element;
    }
    public static WebElement ChildSurgeryButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Дитячий хірургія']"));
        return element;
    }
    public static WebElement ProstheticsButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Протезування']"));
        return element;
    }
    public static WebElement ChildSurveyButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Дитячий прийом']"));
        return element;
    }
    public static WebElement SurgeryButton(WebDriver driver){
        element = driver.findElement(By.xpath("//a[text()='Доросла хірургія']"));
        return element;
    }
}
