package Selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Selenium2 {
    public static void main(String[] args) {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");

        // JavascriptExecutor nam pomaze da posaljemo skriptu koja ce uraditi neku akciju
        // koju ne mozemo uraditi 'jednostavnijim' koracima, kao sto je otvaranje tabova
        // ili kasnije kad budemo radili scroll na neki element koji nije u vidnom polju
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Mozemo da posaljemo bilo koju komandu kroz skriptu
        // Skripte mozete naci online sta sve mozete da koristite ali tokom
        // ovog kursa vam nece trebati mnogo opcija
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        // Obratite paznju kako pisete skripte jer ne postoji provera da li ste dobro ukucali skriptu
        // Ako pogresno napisete program ce izvrsiti tu skriptu i nece prijaviti gresku
        // Ceste greske su 'window.open' - bez zagrada
        // 'windows.open()' - mnozina umesto jednine
        // 'window open()' - razmak umesto tacke

        // Sad kad imam otvorene nove tabove hocu na njima da odem na neki odredjen URL
        // Ako posaljem komandu za odlazak na youtube primeticu da je driver
        // otvorio link u prvom tabu
        driver.navigate().to("https://www.youtube.com");

        // Razlog tome je sto 'fokus' drivera je i dalje na prvom tabu
        // U tom slucaju potrebno je da dohvatim ID svakog otvorenog taba
        // Da taj ID ubacim u neku listu i iz te Selenium6 da prosledim komandu
        // na koji tab zelim da promenim fokus drivera

        // Da bih dohvatio ID svakog otvorenog taba uradicu na sledeci nacin
        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());

        // Mogu da proverim kako ti tabovi izgledaju u listu
        // To su samo random stringovi koji nam nista ne znace dok ih ovako citamo
        // Oni se menjaju svaki put kada pokrenemo browser
        System.out.println("LISTA TABOVA: " + listaTabova);

        // Kad hocu da promenim fokus drivera radim na sledeci nacin
        driver.switchTo().window(listaTabova.get(1));
        // Posto je u pitanju lista koja u sebi sadrzi stringove PO INDEXIMA
        // To znaci da ce prvi tab koji smo otvorili pokretanjem programa (12. red)
        // imati index 0
        // Naredni tab ce imati index 1 ...

        driver.navigate().to("https://www.linkedin.com");

        driver.switchTo().window(listaTabova.get(2));

        driver.navigate().to("https://www.joberty.com");

        driver.switchTo().window(listaTabova.get(3));

        driver.navigate().to("https://www.google.com");

        // Tab mogu da zatvorim opcijom .close()
        driver.close();

        String[] urls = {
                "https://www.google.com",
                "https://www.github.com",
                "https://www.stackoverflow.com",
                "https://www.youtube.com",
                "https://www.reddit.com"
        };
        //ovo vam ubrzava da ne morate svaki put istu komadu da kucate
        // Razlika izmedju driver.quit() i driver.close()
        // je ta da ce quit da zatvori ceo prozor koliko god da ima otvorenih tabova
        // a close ce da zatvori samo jedan tab na kom se driver trenutno nalazi


        for(String element: listaTabova){
            if(!(element.equals(google))){
                driver.switchTo().window(element);
                driver.close();
            }
        }

        }
    }



