package Pages;

import Base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text")
    public List<WebElement> sidebarButtons;

    //-------------------------------

    public void clickOnButton(String buttonName) throws InterruptedException {
        for (int i = 0; i < sidebarButtons.size(); i++) {
            if (sidebarButtons.get(i).getText().equals(buttonName)) {
                scrollToElement(sidebarButtons.get(i));
                sidebarButtons.get(i).click();
                break;
            }
        }
    }

}