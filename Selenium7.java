package java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations;

import java.time.Duration;

public class Selenium7 {

    WebDriver driver;
    WebDriverWait wait;

    // Pokreće se jednom pre svih testova u ovoj klasi
    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Pokreće se pre svakog testa
    @BeforeMethod
    public void openAmazon() {

        driver.get("https://www.amazon.com");

        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("twotabsearchtextbox")
                )
        );

        searchBox.sendKeys("The Hobbit book");
        searchBox.submit();
    }
 @test
 list<WebElements>
    // Jedini test u zadatku
    @Test
    public void addBookToCart() {

        // Čekamo rezultate pretrage
        WebElement firstBook = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.cssSelector(
                                "div[data-component-type='s-search-result'] h2 a"
                        )
                )
        );

        // Asertacija 1: Provera da li je knjiga pronađena
        Assert.assertTrue(
                firstBook.isDisplayed(),
                "Knjiga nije pronađena!"
        );

        firstBook.click();

        // Čekamo dugme Add to Cart
        WebElement addToCart = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("add-to-cart-button")
                )
        );

        // Asertacija 2: Provera da li je dugme dostupno
        Assert.assertTrue(
                addToCart.isDisplayed(),
                "Dugme Add to Cart nije prikazano!"
        );

        addToCart.click();

        // Čekamo potvrdu da je proizvod dodat
        WebElement confirmation = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("NATC_SMART_WAGON_CONF_MSG_SUCCESS")
                )
        );

        // Asertacija 3: Provera uspešnog dodavanja
        Assert.assertTrue(
                confirmation.isDisplayed(),
                "Knjiga nije uspešno dodata u korpu!"
        );
    }

    // Pokreće se nakon svakog testa
    @AfterMethod
    public void afterTest() {

        System.out.println("Test je završen.");
    }

    // Pokreće se jednom nakon svih testova
    @AfterClass
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
    git add .
    git commit -m "Completed Selenium7 Amazon book test"
    git push
}


