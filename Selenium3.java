package Selenium;
import mport java.util.ArrayList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://bing.com/")

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[1]/textarea")).sendKeys("ITBootcamp");
        driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[1]/textarea")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/main/ol/li[1]/h2/a")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[1]/textarea")).sendKeys("ITBootcamp");
        driver.findElement(By.xpath("/html/body/div[1]/div/form/div[2]/div[1]/textarea")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/main/ol/li[1]/h2/a")).click();

        //Zadatak 3
        //Otvoriti bing pretrazivac, pretrazite 'Wikipedia'
        //otvorite wikipedia stranicu i na njoj uradite pretragu 'Nikola Tesla'
        driver.findElement(By.xpath( / html / body / fluent - design - system - provider / iv / div[1]common - search - box - edgenextcs - common - search - boxform / div / div / input)).
        click("search")["wkipadija"].type("Nikola Tesla");
    }
}

