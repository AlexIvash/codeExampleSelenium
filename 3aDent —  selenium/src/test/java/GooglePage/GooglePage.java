package GooglePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
   public static WebElement element;
    public static String Google(){
        String Google = "https://www.google.com.ua";
        return Google;
    }
    public static WebElement GoogleInput(WebDriver driver){
        element = driver.findElement(By.xpath("//input[contains(@name, 'q')]"));
        return element;
    }
    public static WebElement FindButton(WebDriver driver){
        element = driver.findElement(By.xpath("//input[contains(@name, 'btnK')]"));
        return element;
    }
    public static WebElement FirstValueURL(WebDriver driver){
        element = driver.findElement(By.xpath("//div[contains(@class, 's')]//span[contains(@class, 'st']"));
        return element;
    }
    public static WebElement FirstValue(WebDriver driver){
        element = driver.findElement(By.xpath("Стоматологічна клініка - найкращий сервіс, прийнятні ціни"));
        return element;
    }
    public static WebElement FirstLink(WebDriver driver){
        element = driver.findElement(By.xpath("//h3[text()='Стоматологічна клініка | Головна | 3-adent.com.ua']"));
        return element;
    }
//    ____________________________________________________________________Here is  a useful voids_______________________________________________
    public static void FillInGoogleInput(WebDriver driver, String input){
        element = GoogleInput(driver);
        element.sendKeys(input);
    }
}
