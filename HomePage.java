package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BaseTest {

    // Page klase extenduju BaseTest
    public HomePage() {
        // Ne kreiramo konstruktor vec pozivamo PageFactory
        PageFactory.initElements(driver, this);
    }

    // Elemente trazimo preko anotacija
    @FindBy(className = "card-body")
    public List<WebElement> cards;

    //---------------------------

    public void clickOnCard(String cardName) throws InterruptedException {
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getText().equals(cardName)) {
                scrollToElement(cards.get(i));
                cards.get(i).click();
                break;
            }
        }
    }

}