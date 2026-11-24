package java;

import java.time.Duration;

public class Waiters {
    public static void main(String[] args ) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://www.wordpress.com/");

        WebElement logIn = driver.findElement(By.linkText("Log in"));
        logIn.click();

        String validUsername = "";
        String validPassword = "";
        WebElement usernameField = driver.findElement(By.id("usernameOrEmail"));
        usernameField.clear();
        usernameField.sendKeys(validUsername);

        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();

        WebElement passwordField = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(validPassword);

        continueButton.click();

        wait.until(ExpectedConditions.urlContains("admin"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://"+validUsername+".wordpress.com/wp-admin/");

        WebElement profile = driver.findElement(By.linkText(validUsername));
        Assert.assertTrue(profile.isDisplayed());

        driver.quit();

    }
}
    }



}
