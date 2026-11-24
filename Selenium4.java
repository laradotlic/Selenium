package Selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;


public class Selenium4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bing.com")

        WebElement searchBoxBing = driver.findElement(By.id("sb_form_q"));
        searchBoxBing.clear();
        searchBoxBing.sendKeys("Wikipedia -ai");

        Thread.sleep(3000);

        WebElement searchButtonBing = driver.findElement(By.id("sb_hp_go"));
        searchButtonBing.click();

        Thread.sleep(3000);

        WebElement wikipediaLink = driver.findElement(By.linkText("Wikipedia"));
        wikipediaLink.click();

        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listaTabova.get(1));

        Thread.sleep(3000);

        WebElement searchBoxWikipedia = driver.findElement(By.id("searchInput"));
        searchBoxWikipedia.clear();
        searchBoxWikipedia.sendKeys("Nikola Tesla");

        //WebElement searchButtonWikipedia = driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive"));
        WebElement searchButtonWikipedia = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButtonWikipedia.click();

        //-------------------------------------------

        Thread.sleep(3000);

        // Asertacije su obavezan deo testa, sluze nam da bismo proverili validnost programa
        // Najcesce proveravamo prisutnost nekog elementa ili poredjenje elementa sa ocekivanim rezultatom
        // Assert.assertTrue funkcija ocekuje da iskaz bude tacan, na primer ocekujemo da se element pojavi
        // Tokom asertacije u zagradi (u argumentu) pored webelementa dodajemo .isDisplayed() gde dobijamo boolean vrednost (true ili false) da li je element prisutan
        // Imajte u vidu da ako test padne na ovoj asertaciji, moze biti do cekanja
        // da jednostavno program krene u potragu pre nego sto se element pojavi

        // Assert.assertEquals proverava da li su dva prosledjena argumenta jednaka
        // Taj argument moze biti bilo koji tip podatka - String, int, double, float, boolean, ArrayList, nizovi itd.
        // Suprotno od toga imamo Assert.assertNotEquals gde proveravamo da li dva argumenta nisu jednaka
        // Tu cemo uglavnom proveravati stringove gde je na webelement potrebno dodati .getText() da bismo izvukli string

        // Assert.assertFalse je asertacija gde mi OCEKUJEMO da dobijemo vrednost false
        // To ne znaci da ocekujemo da test padne

        // Prvo cu da proverim da li je URL validan
        // Driver ce da dohvati trenutnu URL vrednost
        // Pa cu ja da upisem koja se vrednost ocekuje
        // I na kraju da uporedim te dve vrednosti
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://en.wikipedia.org/wiki/Nikola_Tesla";
        Assert.assertEquals(actualURL, expectedURL);

        // Isti pristup imam za vrednost naziva taba
        String actualTitle = driver.getTitle();
        String expectedTitle = "Nikola Tesla - Wikipedia"
        Assert.assertEquals(actualTitle, expectedTitle);

        // U ovom testu proveravam da li u naslovu stranice pise "Nikola Tesla"
        // Tu moram prvo da pronadjem webelement
        // Pa onda da izvucem text tog elementa
        // I onda da uporedim sa ocekivanim rezultatom
        WebElement pageHeading = driver.findElement(By.id("firstHeading"));
        String actualHeading = pageHeading.getText();
        String expectedHeading = "Nikola Tesla"
        Assert.assertEquals(actualHeading, expectedHeading);

        // U ovom testu proveravam da li je slika prisutna na stranici
        WebElement pageImage = driver.findElement(By.className("infobox-image"));
        Assert.assertTrue(pageImage.isDisplayed());

        // Ako hocu da proverim da li je BAS TA slika prisutna onda mogu da
        // izvucem vrednost nekog atributa sa slike
        // Taj atribut moze biti alternativni text, source ili resource linkovi
        // Odabrao sam da proverim po alternativnom textu i upisao sam sta ocekujem da pise
        String expectedAltText = "Head-and-shoulder photograph of a slender man with dark hair and moustache, dark suit and white-collar shirt";
        // Da bih mogao da izvucem alternativni text sa slike moram prvo da pronadjem
        // webelement koji sadrzi taj atribut
        // Posto ovaj webelement nema nijedan odgovarajuci lokator
        // biram da element nadjem preko njegovog parent elementa
        // Taj parent element vec imam u svom testu i to je pageImage
        // Sada zelim da pretrazim tag 'img' unutar samo tog parent elementa
        // Ne zelim da pretrazim na citavom html-u nego samo unutar tog parent elementa
        // Kada hocu da pretrazim lokator unutar lokatora, potrebno je samo da umesto
        // 'driver' napisem naziv parent elementa
        WebElement imageAlt = pageImage.findElement(By.tagName("img"));
        // Program ce ovde da trazi tag 'img' samo unutar jednog elementa, nece u celom html kodu
        String actualAltText = imageAlt.getAttribute("alt");
        Assert.assertEquals(actualAltText, expectedAltText);

        //Zadatak 4
//Na linku https://practicetestautomation.com/ otici do login stranice, uradite log in i dodajte asertacije
        WebElement practiceLink = driver.findElement(By.xpath(xpathExpacted "//*[@id=username]"));
                WebElement usernamefield = driver.findElement(By.id("//*[@id=sername"));
               username.sendKeys(keysToSend"Student");
                WebElement passwordfield = driver.findElement(By.id("type=password"));
                        password.KeysToSend("Password123");
                WebElementsubmitbottn=driver.findElement(By.id("//*[@id=submit]"));
                submitbottn.KeysToSend("id=submit");


    }
}