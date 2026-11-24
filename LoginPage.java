package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest{

    WebDriver driver;

    WebElement usernameField;
    WebElement passwordField;
    WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        usernameField = driver.findElement(By.id("user-name"));
        passwordField = driver.findElement(By.id("password"));
        submitButton = driver.findElement(By.id("login-button"));
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void inputUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void login(String username, String password) {
        inputUsername(username);
        inputPassword(password);
        clickSubmitButton();
    }
}
