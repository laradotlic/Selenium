package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
    WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public ProfilePage(WebElement loginMassage) {
        this.loginMassage = loginMassage;
    }

    WebElement loginMassage;
}
