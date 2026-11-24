package Pages;

import org.openqa.selenium.WebElement;

public class HomepagePage {
    webDriver driver;
WebElement praticeButton;

    public HomepagePage(webDriver driver) {
        this.driver = driver;
    }


    public WebElement getPraticeButton() {
        return driver.findElement(By.id ());
    }

    public void  clickOnPracticeButton(){
        praticeButton.click();
    }

}
