package SeleniumDomaći;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class YouTube {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(10)
        );

        try {

            driver.navigate().to("https://www.youtube.com");

            WebElement searchField = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.name("search_query")
                    )
            );

            searchField.sendKeys(
                    "Sabaton To Hell and Back",
                    Keys.ENTER
            );

            wait.until(
                    ExpectedConditions.urlContains("results")
            );

            if (!driver.getCurrentUrl().contains("results")) {
                throw new AssertionError(
                        "YouTube rezultati pretrage nisu otvoreni!"
                );
            }

            System.out.println("Test je uspešno završen!");

        } finally {

            driver.quit();

        }
    }
}
