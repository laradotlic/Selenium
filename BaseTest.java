package Base;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProfilePage;
import Pages.SidebarPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

public class BaseTest {

   
    public static WebDriver driver;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }


    public void scrollToElement(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1000);
    }



}