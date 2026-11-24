package LogoutTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class LogoutTest extends BaseTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
       homePage
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        String validUsername
    }

    @Test
    public void userCanLogout() {


        loginPage.login("standard_user", "secret_sauce");

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),
                "User is not logged in!"
        );


        driver.findElement(By.id("react-burger-menu-btn")).click();


        driver.findElement(By.id("logout_sidebar_link")).click();


        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo.com"),
                "User was not redirected to login page!"
        );

        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed(),
                "Login button is not displayed!"
        );
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


