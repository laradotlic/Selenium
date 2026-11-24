package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practicePage {

    WebDriver driver;
    WebElement testLoginPageButton;

    public practicePage(WebDriver driver) {
        this.driver = driver;
    }

    public practicePage(WebElement driver) {
        this.driver = driver;
    }

    public void clickOnTestLoginButton(){
        testLoginPageButton.click();
    }
}
