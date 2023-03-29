package day_01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class D03_Exercise {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // ilk kutucuga 20 giriniz
       WebElement ilkkutucuk = driver.findElement(By.id("number1"));
       ilkkutucuk.sendKeys("20");
        // ikinci kutucuga 30 giriniz
        WebElement ikincikutucuk = driver.findElement(By.id("number2"));
        ikincikutucuk.sendKeys("30");
        // calculate'e tıklayınız
          WebElement calculate = driver.findElement(By.id("calculate"));
          calculate.click();
          Thread.sleep(3000);
        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.id("answer"));
        System.out.println("Toplama isleminin sonucu :"+ sonuc.getText());
        // sayfayi kapatiniz
        driver.close();
    }
}
