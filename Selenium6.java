package java;

public class Selenium6 {
    import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.ArrayList;

    public class Selenium4 {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://demoqa.com/");

          List<WebElement> card = driver.findElement(By className("card-body"));
          for (int i = 0; i < cards.size() i++);

}
